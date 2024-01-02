package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.PaymentPopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TimeoutException;

public class AccountsPaymentPopUp extends PaymentPopUpPage {
    public String paymentAmount;
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
        catch(TimeoutException | ElementNotVisibleException e){
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
}
