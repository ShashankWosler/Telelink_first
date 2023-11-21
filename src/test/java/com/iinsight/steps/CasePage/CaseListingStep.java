package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseListing.CaseListingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CaseListingStep extends CaseListingPage {

    @When("User click on +case button")
    public void userClickOnAddCaseButton(){ clickAddCaseButton();
    }
    @When("User select any case from the case list")
    public void userSelectAnyCaseFromTheCaseList(){
        setZoomLevel(0.8);
        getFirstRowFromTable();
    }

    @Then("User Verify the case is created and should be visible in case list {string}")
    public void userVerifyTheCaseIsCreatedAndShouldBeVisibleInCaseList(String caseType) {
        waitFor(4000);
        String keyToBeCreated = getText(caseNoteName);
        getID(caseType, keyToBeCreated);
    }

    @And("User Click on +Billing button")
    public void userClickOnBillingButton() {
        clickButtonWithOutScroll(addCaseBillingBtn);
        waitFor(3000);
    }
    @When("User click on search button from HomePage")
    public void userClickOnSearchButton(){
        Assert.assertTrue(isSearchButtonVisible());
        clickSearchButton();
    }
    @And("User verify the case type id {string}")
    public void userVerifyCaseIDFromHomePage(String caseType){
        waitFor(2000);
        switch(caseType){
            case "Company":
                Assert.assertEquals(getText(caseNoteName),getTestDatValue("CompanyCaseID"));
                break;
            case "Individual":
                Assert.assertEquals(getText(caseNoteName),getTestDatValue("IndividualCaseID"));
                break;
        }
    }

}
