package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.InvoicePopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

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
        setImplicit(3);
       // Assert.assertTrue(isActiveCostIdIsVisible());
    }

    @And("User Click on Costs Selection Next button")
    public void userClickOnCostsSelectionNextButton() {
        clickNextButton2();
    }

    @And("User Click on Finish Button")
    public void userClickOnFinishButton() {
        setImplicit(3);
        clickPreviewInvoiceCheckBox();
        clickFinishButton();
    }


}
