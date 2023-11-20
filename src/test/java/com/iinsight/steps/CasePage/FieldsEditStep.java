package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.FieldsEditPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FieldsEditStep extends FieldsEditPage {
    @And("User select the required custom field on the enabled side")
    public void selectFieldFromEnabledSide(){
        Assert.assertTrue(isEnableButtonVisible());
        selectTitleFromEnableDropDown();
    }
    @And("User select the required custom field on the disabled side")
    public void selectFieldFromDisableSide(){
        Assert.assertTrue(isDisableButtonVisible());
        selectFirstIndexFromDisableDropDown();
    }
    @And("User Use the arrow key for the order of the position needed")
    public void shiftTitleToTop(){
        clickUpArrowButton();
    }
    @And("User click on the Disable button")
    public void userClickOnDisableButton(){
        clickDisableButton();
    }
    @And("User click on the Enable button")
    public void userClickOnEnableButton(){
        clickEnableButton();
    }
    @Then("User click on the Apply button")
    public void userClickOnApplyButton(){
        clickApplyButton();
    }
}
