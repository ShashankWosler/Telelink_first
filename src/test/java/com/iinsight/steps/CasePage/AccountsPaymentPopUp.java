package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.PaymentPopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException  ;
import org.openqa.selenium.TimeoutException;

public class AccountsPaymentPopUp extends PaymentPopUpPage {
    @And("Click on {string} CheckBox from Payment PopUp")
    public void clickOnInvoiceForCheckBox(String invoiceOf){
        setImplicit(5);
        Assert.assertTrue(isPaymentPopUpVisible());
        switch (invoiceOf){
            case "All Cases":
                clickAllCasesCheckBox();
                break;
            case "Current Case":
                clickCurrentCaseCheckBox();
                break;
            case "Select Case":
                clickSelectCaseCheckBox();
                break;
            case "Current Invoice":
                clickCurrentInvoiceCheckBox();
                break;
        }
    }

    @And("Select Payment Method from {string} Dropdown")
    public void selectPaymentMethod(String paymentMethod){
        System.out.println("selectPaymentMethod() "+getTextOfAmount());
        if(paymentMethod.contains("Cheque")){
            System.out.println(getDefaultPaymentTypeMethod());
        }
        else {
            clickPaymentTypeDropDown();
            selectDropDownFromText(paymentMethod);
            waitFor(1000);
        }
    }
    @And("Click on Next Button From Payment PopUp")
    public void clickOnNextButtonFromPopUp(){
        try{
        clickNextButton();}
        catch(TimeoutException | ElementNotInteractableException  e){
            System.out.println("AccountsPaymentPopUp.clickOnNextButtonFromPopUp() -"+e.getClass() +" "+e.getMessage());
        }
    }
    @And("User Edit the Amount From PopUp")
    public void clickOnEditAmountPopUp(){
        setImplicit(3);
        clickEditAmountButton();
         String getAmountFromConfig = config.getString("AmountID").replace("R", "").replace(",", ".");
        waitFor(3000);
        System.out.println("getAmountTextFromEditPopUp() :"+getAmountTextFromEditPopUp());
        System.out.println("getAmountFromConfig :"+getAmountFromConfig);
        isTextContain(getAmountTextFromEditPopUp(),getAmountFromConfig);
        enterUpdatedAmount();
        clickOkButton();
    }
    @And("Click on Finish Button from Payment PopUp")
    public void userCLickOnFinishButtonFromEditAmountPopUp(){
        waitFor(3000);
        Assert.assertTrue(isFinishButtonVisible());
        clickFinishButton();
    }
    @And("Verify fields of Payment Detail page from Payment PopUp")
    public void verifyPaymentPopUp1Elements(){
        System.out.println(getCaseIDText()+" "+CaseTypeTestData.CaseNumber);
        System.out.println(getInvoiceIDText()+" "+CaseTypeTestData.InvoiceNumber);

        Assert.assertTrue(getCaseIDText().contains(CaseTypeTestData.CaseNumber.replaceAll("[^0-9]","")));
        Assert.assertTrue(getInvoiceIDText().contains(CaseTypeTestData.InvoiceNumber));
    }
    @And("Verify fields of Payment Breakdown page from Payment PopUp {string} VAT")
    public void verifyPaymentPopUp2Elements(String vatValue){
        switch (vatValue){
            case "With":
                System.out.println(getTableOwningTabText()+" "+CaseTypeTestData.Total);
                Assert.assertTrue("E:"+getTableOwningTabText()+" A:"+CaseTypeTestData.Total,getTableOwningTabText().contains(CaseTypeTestData.Total));
                Assert.assertTrue(getTextFromPaymentTab().contains("0"));
                Assert.assertTrue(getTextFromBalanceTab().contains("0"));
                break;
            case "Without":
                System.out.println(getTableOwningTabText()+" "+CaseTypeTestData.SubTotal);
                Assert.assertTrue("E:"+getTableOwningTabText()+" A:"+CaseTypeTestData.SubTotal,getTableOwningTabText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue(getTextFromPaymentTab().contains("0"));
                Assert.assertTrue(getTextFromBalanceTab().contains("0"));
                break;
        }

    }
    @And("Verify Generated Amount in Edit Amount PopUp {string} VAT")
    public void verifyAmountFromEditPopUp(String vatValue){
        setImplicit(3);
        clickEditAmountButton();
        switch (vatValue){
            case "With":
                Assert.assertTrue("E:"+getAmountTextFromEditPopUp()+" A:"+CaseTypeTestData.Total,getAmountTextFromEditPopUp().contains(CaseTypeTestData.Total));
                break;
            case "Without":
                Assert.assertTrue("E:"+getAmountTextFromEditPopUp()+" A:"+CaseTypeTestData.SubTotal,getAmountTextFromEditPopUp().contains(CaseTypeTestData.SubTotal));
                break;
        }
        enterText(enterAmountInput, CaseTypeTestData.PaymentUpdatedAmount);
        waitFor(3000);
        clickOkButton();
        waitFor(2000);
        setImplicit(10);
        Assert.assertTrue(isClearAllButtonVisible());
        Assert.assertTrue("E:"+getTextFromPaymentTab()+" A:"+CaseTypeTestData.PaymentUpdatedAmount,getTextFromPaymentTab().contains(CaseTypeTestData.PaymentUpdatedAmount));
    }
}
