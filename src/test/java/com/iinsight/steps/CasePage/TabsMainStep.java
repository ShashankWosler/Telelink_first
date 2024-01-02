package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.TabsMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;

public class TabsMainStep extends TabsMainPage {
    @And("User select Case Notes tab")
    public void userSelectCaseNotesTab(){
        try {clickCaseNotesTab();
        }
        catch(StaleElementReferenceException e) {
            clickCaseNotesTab();
            System.out.println("TabsMainStep.userSelectCaseNotesTab() -->> StaleElementReferenceException: Clicked Element Again");
        }
    }
    @And("User Select Title Option from By DropDown")
    public void selectTitleOptionFromDropdown(){
        isFiveValueFromByDropDownDisplayed();
        SelectFiveValueFromByDropDown();
    }
    @And("User click on client tab")
    public void userClickOnClientTabStep(){
        Assert.assertTrue(isClientTabIsVisible());
        clickClientsTab();
    }
    @And("User select Costs tab")
    public void userSelectCostsTab() {
        clickCostsTab();
    }

    @And("User Select Account Tab")
    public void userSelectAccountTab() {
        clickAccountsTab();
    }
    @Then("User click on plans programs tab")
    public void userClickOnTabPlansPrograms() {
        try {
            waitFor(5000);
            Assert.assertTrue(isPlansProgramsTabIsVisible());
            clickPlansProgramsTab();
        }catch (StaleElementReferenceException e){
            System.out.println("TabsMainStep.userClickOnTabPlansPrograms() - "+e.getClass());
            setImplicit(10);
            mouseOverClick(plans_programs_tab);
        }
    }

    @And("User click on Task Appointments tab")
    public void userClickOnTaskAppointmentsTab() {
        clickTaskAppointmentsTab();
        waitFor(3000);
    }
}
