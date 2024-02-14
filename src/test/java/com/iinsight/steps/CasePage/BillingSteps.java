package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseListing.BillingPage;
import io.cucumber.java.en.And;
import org.junit.Assert;


public class BillingSteps extends BillingPage {
    @And("User Select {string} from Select your invoice type dropdown")
    public void userSelectFromSelectYourInvoiceTypeDropdown(String arg0) {
        //clickOnInvoiceDropdown();
        setImplicit(60);
        waitFor(2000);
        SelectByVisibleText(invoice_dropdown_icon, arg0);
    }

    @And("User Select {string} Option from the Billing dropdown")
    public void userSelectOptionFromTheBillingDropdown(String arg0) {
        waitFor(2000);
        clickOnBillingDropdown();
        //Actions actions = new Actions(getDriver());
        //actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        waitFor(5000);
        SelectByVisibleText(billing_dropdown_icon, arg0);
        enterTextDurationTab();
        enterTextRateTab();
    }

    @And("User Select {string} Plan Option from the Billing dropdown")
    public void planTemplateBilling(String arg0) {
        waitFor(2000);
        clickOnBillingDropdown();
        waitFor(5000);
        SelectByVisibleText(billing_dropdown_icon, arg0);
        enterTextQuantityTab();
        enterTextRateTab();
    }
    @And("User Verify Selected Billing DropDown")
    public void verifyBillingDropDown(){
        enterTextDurationTab();
        enterTextRateTab();
        Assert.assertEquals(getDescriptionValue(),"TestAutoActivity");
        Assert.assertEquals(getCodeValue(),"CTP403");
    }

    @And("User Click on Submit button")
    public void userClickOnSubmitButton() {
        waitElementToBeClickable(submit_button);
        clickOnSubmitButton();
        setImplicit(10);
        if(isElementDisplayed(continue_yes_button)){
            waitElementToBeClickable(continue_yes_button);
            clickButtonWithOutScroll(continue_yes_button);
            waitFor(2000);
        }
        else {
           // clickButtonWithOutScroll(submit_button);
            System.out.println("Billing is created successfully");
        }
    }
    @And("User Verify the billable time rate form with zero values")
    public void userVerifyZeroAmountFromBillPopUp(){
        Assert.assertTrue(getSubtotal().contains("0,00"));
        Assert.assertTrue(getVAT().contains("0,00"));
        Assert.assertTrue(getTotal().contains("0,00"));
    }
    @And("User Verify The Updated Price {string} VAT")
    public void verifyUpdatedPriceWitVAT(String vatValue){
        Assert.assertTrue(isDescriptionInputVisible());
        clickDescriptionInput();
        waitFor(3000);

        switch(vatValue){
            case "With":
                System.out.println("subTotalStr: "+getSubtotal() +" "+CaseTypeTestData.SubTotal);
                System.out.println("vatStr: "+getVAT() +" "+CaseTypeTestData.VAT);
                System.out.println("totalStr: "+getTotal() +" "+CaseTypeTestData.Total);
                waitFor(2000);
                Assert.assertTrue(getSubtotal().replaceAll(" ","").contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue(getVAT().replaceAll(" ","").contains(CaseTypeTestData.VAT));
                Assert.assertTrue(getTotal().replaceAll(" ","").contains(CaseTypeTestData.Total));
                break;
            case "Without":
                Assert.assertTrue(isBillApplyVATCheckBoxVisible());
                clickBillApplyVATCheckBox();
                waitFor(2000);
                System.out.println("subTotalStr: "+getSubtotal() +" "+CaseTypeTestData.SubTotal);
                System.out.println("vatStr: "+getVAT() +" "+CaseTypeTestData.VAT);
                System.out.println("totalStr: "+getTotal() +" "+CaseTypeTestData.Total);
                Assert.assertTrue(getSubtotal().replaceAll(" ","").contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue(getVAT().replaceAll(" ","").contains("0"));
                Assert.assertTrue(getTotal().replaceAll(" ","").contains(CaseTypeTestData.SubTotal));
                break;
        }
    }
    @And("User Added Employee Expense {string} VAT From Billing PopUp")
    public void addEmployeeExpensePrice(String vatValue){
        Assert.assertTrue(isBillApplyVATCheckBoxVisible());
        //SelectByVisibleText(billing_dropdown_icon,"Total Sum: CTP403 : TestAutoActivity");
        mouseOverClick(consultantDurationInput);
        waitFor(2000);
        enterConsultantDurationInput();
        enterConsultantRateInput();
        clickConsultantSuperRateInput();
        Assert.assertTrue(getConsultantSubTotalInputText().contains(CaseTypeTestData.SubTotalS));
        clickConsultantApplyVatCheckBox(vatValue);
        switch (vatValue){
            case "With":
                waitFor(2000);
                Assert.assertTrue(getConsultantTotalInputText().contains(CaseTypeTestData.TotalS));
                Assert.assertTrue(getConsultantVatInputText().contains(CaseTypeTestData.VATS));
                break;
            case "Without":
                Assert.assertTrue(getConsultantTotalInputText().contains(CaseTypeTestData.SubTotalS));
                break;
        }
    }

}
