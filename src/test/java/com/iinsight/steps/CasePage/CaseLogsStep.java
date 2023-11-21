package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.CaseLogsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CaseLogsStep extends CaseLogsPage {

    @And("User select Case Log tab")
    public void UserClickOnCaseLog(){
        clickCaseLogsTab();
    }
    @Then("Verify the newly created notes logs should be created on the case logs tab")
    public void verifyNewCaseLogIsAdded(){
        getFirstRowFromTable();
    }
    @And("User select any Case log from the list")
    public void selectCaseLogFromList(){
        clickFirstRowFromTable();
    }
    @And("User click on the Case Log Details button")
    public void userClickOnDetailButton(){
        clickDetailsButton();
    }

    @Then("Verify that Newly created billing ID of should be visible in Case logs")
    public void verifyThatNewlyCreatedBillingIDOfShouldBeVisibleInCaseLogs() {
        verifyCaseLog();
    }
}
