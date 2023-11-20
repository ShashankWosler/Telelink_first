package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseListing.CaseListingPage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

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
        getCaseName(caseType, keyToBeCreated);
    }
}
