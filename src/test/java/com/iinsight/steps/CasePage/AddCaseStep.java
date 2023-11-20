package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseListing.CaseTypes.AddCaseMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class AddCaseStep extends AddCaseMainPage {
    @And("User click on Business Division dropdown get {string} value from dropdown")
    public void userSelectBusinessDivision(String dropDownValue){
        Assert.assertTrue(isBusinessDivisionDropdownVisible());
        clickBusinessDivisionDropdown();
        selectDropDownFromText(dropDownValue);
    }
    @And("User click on Service Contract dropdown get {string} value from dropdown")
    public void userSelectServiceContract(String dropDownValue){
        waitFor(2000);
        Assert.assertTrue(isServiceContractDropdownVisible());
        clickServiceContractDropdown();
        selectDropDownFromText(dropDownValue);
    }
    @And("User select case type {string} to add")
    public void userFillCaseTypeForm(String dropDownValue){
        waitFor(2000);
        switch(dropDownValue){
            case "Company":
                waitFor(2000);
                Assert.assertTrue(isCompanyCheckboxVisible());
                clickCompanyCheckbox();
                break;
            case "Individual":
                waitFor(2000);
                Assert.assertTrue(isPersonCheckboxVisible());
                clickPersonCheckbox();
                break;
        }}
}
