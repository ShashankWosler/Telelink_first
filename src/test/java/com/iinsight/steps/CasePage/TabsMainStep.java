package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.TabsMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

public class TabsMainStep extends TabsMainPage {
    @And("User select Case Notes tab")
    public void userSelectCaseNotesTab(){
        try {
            setImplicit(10);
            waitFor(3000);
            Assert.assertTrue(isCaseNoteTabIsVisible());
            clickCaseNotesTab();
        }
        catch(StaleElementReferenceException e) {
            waitFor(2000);
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
    @And("User click on case tab")
    public void userClickOnCaseTabBillTo(){
        try {
            setImplicit(5);
            clickCaseTab();
        }
        catch(StaleElementReferenceException e) {
            clickCaseTab();
            System.out.println("TabsMainStep.userClickOnCaseTabBillTo() -->> StaleElementReferenceException: Clicked Element Again");
        }
    }
    @And("User select Costs tab")
    public void userSelectCostsTab() {
        try{
        setImplicit(20);
        waitElementToBeClickable(costs_tab);
        waitFor(5000);
        clickCostsTab();}
        catch(ElementClickInterceptedException | StaleElementReferenceException | TimeoutException e){
            System.out.println("TabsMainStep.userSelectCostsTab() - ElementClickInterceptedException: "+e.getMessage());
            waitFor(5000);
            clickCostsTab();
        }
    }

    @And("User Select Account Tab")
    public void userSelectAccountTab() {
        waitFor(5000);
        clickAccountsTab();}

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
    @And("User Select Tasks Appointments Tab")
    public void userClickTaskAppointmentTab() {
        try {
            waitFor(5000);
            Assert.assertTrue(isTaskAppointmentsTabVisible());
            clickTaskAppointmentsTab();
        }catch (StaleElementReferenceException | ElementClickInterceptedException e){
            System.out.println("TabsMainStep.userClickTaskAppointmentTab() - "+e.getClass());
            setImplicit(10);
            waitFor(2000);
            mouseOverClick(task_appointments_tab);
        }
    }
}
