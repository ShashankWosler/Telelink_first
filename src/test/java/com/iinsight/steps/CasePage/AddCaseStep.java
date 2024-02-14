package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseListing.CaseTypes.AddCaseMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

import java.sql.Time;

public class AddCaseStep extends AddCaseMainPage {
    @And("User click on Business Division dropdown get {string} value from dropdown")
    public void userSelectBusinessDivision(String dropDownValue){
        try {
            Assert.assertTrue(isBusinessDivisionDropdownVisible());
            clickBusinessDivisionDropdown();
            selectDropDownFromText(dropDownValue);
            Assert.assertEquals(getBusinessDivisionInput(),dropDownValue);
            waitFor(2000);
        }catch(TimeoutException e){
            System.out.println("AddCaseStep.userSelectBusinessDivision() TimeoutException- "+e.getMessage());
        }
    }
    @And("User click on Service Contract dropdown get {string} value from dropdown")
    public void userSelectServiceContract(String dropDownValue){
        try {
            waitFor(2000);
            Assert.assertTrue(isServiceContractDropdownVisible());
            clickServiceContractDropdown();
            selectDropDownFromText(dropDownValue);
            Assert.assertEquals(getServiceContractInput(),dropDownValue);
        }catch(TimeoutException e){
            System.out.println("AddCaseStep.userSelectServiceContract() TimeoutException- "+e.getMessage());
        }
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
