package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseListing.CaseListingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

public class CaseListingStep extends CaseListingPage {

    @When("User click on +case button")
    public void userClickOnAddCaseButton(){ clickAddCaseButton();
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
        System.out.println("AppointmentCaseID: "+getText(caseNoteName));
    }

    @And("User Click on +Billing button")
    public void userClickOnBillingButton() {
        waitFor(3000);
        clickButtonWithOutScroll(addCaseBillingBtn);
    }
    @When("User click on search button from HomePage")
    public void userClickOnSearchButton(){
        Assert.assertTrue(isSearchButtonVisible());
        if(!(getFilterInputText().equals("All cases"))){
            setImplicit(30);
            clickFilterDropDown();
            waitVisibilityOfElement(allCasesDropDownValue);
            waitElementToBeClickable(allCasesDropDownValue);
            waitFor(2000);
            selectDropDownFromText("All cases");
            Assert.assertEquals(getFilterInputText(),"All cases");
            waitFor(2000);
        }
        clickSearchButton();
    }
    @When("User Select Filter {string} from HomePage")
    public void userClickOnSearchButton(String filterValue){
        Assert.assertTrue(isSearchButtonVisible());
        if(!(getFilterInputText().equals(filterValue))){
            clickFilterDropDown();
            selectDropDownFromText(filterValue);
        }
        Assert.assertEquals(getFilterInputText(),filterValue);
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
            case "Regression":
                Assert.assertEquals(getText(caseNoteName),getTestDataValue("RegressionID"));
                break;
            case "Restore Archive - New Case":
                Assert.assertEquals(getText(caseNoteName),getTestDataValue("RestoreArchiveCreateNewCaseID"));
                break;
        }
        System.out.println();
    }

    @And("User click on ellipses and Select {string} Case")
    public void userClickOnEllipsesAndSelectOption(String ellipsesValue) {
        clickEllipsesIcon();
        switch (ellipsesValue){
            case "Delete":
                clickDropDownDeleteCaseValue();
                break;
            case "Archive":
                clickDropDownArchiveCaseValue();
                break;
            case "Restore Archived":
                clickRestoreArchiveBtn();
                break;
        }
    }

    @And("User click on {string} From Delete PopUp")
    public void userVerifyDeletePopUp(String button) {
        switch (button){
            case "Proceed Anyway":
                clickProceedAnywayDeleteBtn();
                enterPassword();
                clickDeleteCaseBtn();
                break;
            case "Cancel":
                clickArchiveCancelBtn();
                break;
            case "Cross Button":
                clickPopUpCrossBtn();
                break;
        }
    }

    @And("User click on {string} From Archive PopUp")
    public void userVerifyArchivePopUp(String button) {
        switch (button){
            case "Proceed Anyway":
                clickArchiveConfirmBtn();
                enterPassword();
                clickArchiveConfirmBtn();
                isArchiveTextVisible();
                break;
            case "Cancel":
                clickArchiveCancelBtn();
                break;
            case "Cross Button":
                clickPopUpCrossBtn();
                break;
        }
    }

    @And("User click on {string} From Restore Archive PopUp")
    public void userVerifyRestoreArchivePopUp(String button) {
        switch (button){
            case "Cancel":
                clickArchiveCancelBtn();
                break;
            case "Cross Button":
                clickPopUpCrossBtn();
                break;
            case "Create New Case":
                clickProceedAnywayDeleteBtn();      //Create New Case Button
                getID("RestoreArchiveCreateNewCase", getNewCreatedCaseID());
                clickArchiveCancelBtn();            // Ok Button
                waitFor(3000);
                break;
            case "Restore Archived Case":
                clickArchiveConfirmBtn();
                clickArchiveCancelBtn();            //Same Locator - OK Button
                break;
        }
    }

    @And("Verify No {string} Alert Message is Displayed")
    public void noMessageDisplay(String dateType){
        waitFor(3000);
        try{
            switch (dateType){
                case "Deletion":
                    Assert.assertFalse(isDeleteWarningVisible());
                    break;
                case "Archival":
                    Assert.assertFalse(isArchiveWarningVisible());
                    break;
            }}catch(TimeoutException e){
            System.out.println("CaseListingStep.noMessageDisplay() - "+dateType);
            System.out.println(e.getClass()+" "+e.getMessage());
        }
    }

    @And("Verify {string} Alert Message is Displayed")
    public void verifyAlertMessage(String alertType){
        waitFor(4000);
        switch (alertType){
            case "Deletion":
                Assert.assertTrue(isDeleteWarningVisible());
                break;
            case "Archive":
                Assert.assertTrue(isArchiveWarningVisible());
                break;
        }
    }
    @And("User Verify Case is Deleted")
    public void verifyDeletedCase(){
        Assert.assertTrue(isEmptySearchResultVisible());
    }

    @And("User Verify HomePage Billing Button is Disabled")
    public void verifyBillingButtonDisabled(){
        Assert.assertTrue(getAttributeValue(addCaseBillingBtn,"class").contains("disabled"));
    }
    @Then("User click on ellipses and verify {string} Case {string}")
    public void verifyEllipsesIcons(String button, String permission){
        clickEllipsesIcon();
        switch (button){
            case "Restore Archived":
                if(permission.contains("Disabled"))
                    Assert.assertTrue(getAttributeValue(restoreArchiveOption,"style").contains("not-allowed"));
                else
                    Assert.assertTrue(isElementEnabled(restoreArchiveBtn));
                break;
            case "Archive Case":
                if(permission.contains("Disabled"))
                    Assert.assertTrue(getAttributeValue(archivalOption,"style").contains("not-allowed"));
                else
                    Assert.assertTrue(isElementEnabled(dropDownValue3));
                break;

        }
    }

    @When("User {string} on case list")
    public void userClickCaseList(String buttonType){
        Assert.assertTrue(isSearchButtonVisible());
        switch (buttonType){
            case "double click":
                clickFirstRowFromTable();
                break;
            case "Case Details View":
                Assert.assertTrue(isClickListViewVisible());
                clickListDetailsView();
                break;
            case "Case Listing View":
                Assert.assertTrue(isClickListViewVisible());
                clickListView();
                break;
        }
    }
    @And("Verify case is opened in full screen mode")
    public void caseListFullScreen(){
        waitVisibilityOfElement(backButtonFullScreen);
        Assert.assertTrue(isBackButtonFullScreenVisible());
        try{
            Assert.assertTrue(isElementDisplayed(searchBtn));
        }catch (Exception e){
            System.out.println("CaseListingStep.caseListFullScreen() -"+e.getClass()+" "+e.getMessage());
        }
    }

    @Then("User click on Back Arrow Button")
    public void goBackToCaseListingPage(){
        waitElementToBeClickable(backButtonFullScreen);
        clickBackButtonFullScreen();
        waitFor(4000);
        waitElementToBeClickable(addCaseBtn);
        Assert.assertTrue(isElementDisplayed(addCaseBtn));
        Assert.assertTrue(isElementDisplayed(addCaseBillingBtn));
        Assert.assertTrue(isElementDisplayed(searchBtn));
        Assert.assertTrue(isElementDisplayed(fieldsEditBtn));
        Assert.assertTrue(isElementDisplayed(ellipsesIcon));
    }
}
