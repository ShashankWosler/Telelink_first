package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.InvoicePopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

public class CreateInvoicePopUpStep extends InvoicePopUpPage {
    @And("User DeSelect the Checkbox from invoice filtering option")
    public void userDeSelectTheAndCheckboxFromInvoiceFilteringOption() {
        setImplicit(5);
        Assert.assertTrue(isInvoiceModalIsVisible());
        Assert.assertTrue(isCurrentCaseTabIsVisible());
        clickInvoiceIcon();
        clickMilestoneIcon();
    }
    @And("User Enter Description in Invoice Description box")
    public void userEnterDescriptionInInvoiceDescriptionBox() {
        enterDescription();
    }

    @And("User Click on Case Selection Next button")
    public void userClickOnCaseSelectionNextButton() {
        waitFor(4000);
        clickNextButton1();

    }

    @And("User Verify the Cost Selection tab")
    public void userVerifyTheCostSelectionTab() {
        try{
        setImplicit(3);
//        Assert.assertTrue(getDurationText().replaceAll(" ","").contains(CaseTypeTestData.Duration));
//        Assert.assertTrue(getChargeText().replaceAll(" ","").contains(CaseTypeTestData.Total));
        // Assert.assertTrue(isActiveCostIdIsVisible());
        }catch(TimeoutException e){
            waitFor(2000);
            System.out.println("CreateInvoicePopUpStep.userVerifyTheCostSelectionTab() - TimeoutException");
        }
    }

    @And("User Click on Costs Selection Next button")
    public void userClickOnCostsSelectionNextButton() {
        clickNextButton2();
    }

    @And("User Click on Finish Button From Invoice Popup {string} VAT")
    public void userClickOnFinishButtonInvoicePopUp(String vatValue) {
        switch(vatValue){
            case "With":
                Assert.assertTrue("E:"+getTotalTabText()+" A:"+CaseTypeTestData.Total,getTotalTabText().contains(CaseTypeTestData.Total));
                Assert.assertTrue("E:"+getAmountExVatTabText()+" A:"+CaseTypeTestData.SubTotal,getAmountExVatTabText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue("E:"+getVATAmountTabText()+" A:"+CaseTypeTestData.VAT,getVATAmountTabText().contains(CaseTypeTestData.VAT));
                CaseTypeTestData.InvoiceNumber = getInvoiceNumberTabText();
                break;
            case "Without":
                System.out.println(getTotalTabText()+" "+CaseTypeTestData.SubTotal);
                System.out.println(getAmountExVatTabText()+" "+CaseTypeTestData.SubTotal);
                System.out.println(getVATAmountTabText());
                Assert.assertTrue(getTotalTabText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue(getAmountExVatTabText().contains(CaseTypeTestData.SubTotal));
                CaseTypeTestData.InvoiceNumber = getInvoiceNumberTabText();
                break;
        }
        setImplicit(3);
        clickPreviewInvoiceCheckBox();
        clickFinishButton();
    }
    @And("User Click on Finish Button")
    public void userClickOnFinishButton() {
        setImplicit(3);
        clickPreviewInvoiceCheckBox();
        clickFinishButton();
    }


}
