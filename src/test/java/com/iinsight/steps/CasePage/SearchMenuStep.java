package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import io.cucumber.java.en.And;

import com.iinsight.pages.CasePage.CaseListing.SearchMenuPage;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.InvalidElementStateException;

public class SearchMenuStep extends SearchMenuPage {
    @And("User select {string} from search criteria dropdown")
    public void userAddSearchCriteriaDropdown(String filterValue){
        waitFor(2000);
        clickDeleteButton();
        try{
            enterTextSearchMainTab(filterValue);}
        catch(InvalidElementStateException e){
            System.out.println("userAddSearchCriteriaDropdown.enterTextSearchMainTab() "+e.getClass());
            clickSearchCriteriaDropDown();}
        selectDropDownFromText(filterValue);
        waitFor(2000);
    }
    @And("User enter case type id {string}")
    public void userGetCaseTypeId(String caseType){
        switch(caseType){
            case "Company":
                enterTextSearchTab(getTestDataValue("CompanyID"));
                break;
            case "Individual":
                enterTextSearchTab(getTestDataValue("IndividualID"));
                break;
            case "Appointment Overlap":
                enterTextSearchTab(CaseTypeTestData.ClientName);
                break;
            case "Appointment":
                enterTextSearchTab(getTestDataValue("AppointmentCaseID"));
        }
    }
    @And("User click on search button from search popup")
    public void userClickOnPopUpSearchButton(){
        Assert.assertTrue(isSearchButtonIsVisible());
        clickSearchButton();
    }
    @When("User Select Newly Created {string}")
    public void userSelectNewlyCreatedCase(String filterValue) {
        userAddSearchCriteriaDropdown(filterValue);
        enterTextSearchTab(getTestDataValue("CompanyID"));
    }
}
