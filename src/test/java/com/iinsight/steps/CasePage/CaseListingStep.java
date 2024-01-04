package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
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
        getFirstRowFromTable();
    }

    @Then("User Verify the case is created and should be visible in case list {string}")
    public void userVerifyTheCaseIsCreatedAndShouldBeVisibleInCaseList(String caseType) {
        waitFor(4000);
        String keyToBeCreated = getText(caseNoteName);
        getID(caseType, keyToBeCreated);
    }
    @Then("User Verify the Zero case is created and should be visible in case list")
    public void getCaseIDOfZeroCase(){
        waitFor(4000);
        CaseTypeTestData.CaseNumber = getText(caseNoteName);
        System.out.println("CaseID: "+CaseTypeTestData.CaseNumber);
    }
    @And("User Verify the Appointment case is created and should be visible in case list")
    public void getAppointmentCaseNumber(){
        waitFor(4000);
        getID("AppointmentCase", getText(caseNoteName));
        System.out.println("CaseID: "+getText(caseNoteName));
    }

    @And("User Click on +Billing button")
    public void userClickOnBillingButton() {
        waitFor(3000);
        clickButtonWithOutScroll(addCaseBillingBtn);
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
                Assert.assertEquals(getText(caseNoteName),getTestDataValue("CompanyID"));
                break;
            case "Individual":
                Assert.assertEquals(getText(caseNoteName),getTestDataValue("IndividualID"));
                break;
            case "Appointment Overlap":
                Assert.assertEquals(getText(caseNoteName),CaseTypeTestData.ClientName.replaceAll(" ",""));
                break;
            case "Appointment":
                Assert.assertEquals(getText(caseNoteName),getTestDataValue("AppointmentCaseID"));
                break;
        }
        System.out.println();
    }

}
