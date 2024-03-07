package com.iinsight.steps.CasePage;


import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlansProgramsMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.StaleElementReferenceException;

public class TabPlansProgramsStep extends PlansProgramsMainPage {
    @And("User click on Plans button from plans programs tab")
    public void userClickPlansButton(){
        Assert.assertTrue(isPlansTabVisible());
        clickPlansTab();
    }
    @And("User click on Plans New Button")
    public void userClickPlanNewButton(){
        try{
        clickNewButton();
        }catch(StaleElementReferenceException | InvalidElementStateException e){
            System.out.println("TabPlansProgramsStep.userClickPlanNewButton() -"+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            clickNewButton();
        }
    }
    @And("User click on Plan Details Button")
    public void getThePriceDetailTab(){
//        moveToCurrentPlanInputTab();
//        clickLastRow();
        clickDetailsButton();
    }

    @And("User click on Template Tab from plans programs tab")
    public void verifyTemplateRecordsFromTable(){
        clickTemplateTab();
    }

    @And("User click on Plans Delete Button")
    public void userClickPlanDeleteButton(){
        try{
            clickDeleteButton();
        }catch(StaleElementReferenceException | InvalidElementStateException e){
            System.out.println("TabPlansProgramsStep.userClickPlanNewButton() -"+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            clickDeleteButton();
        }
        boolean flag = false;
        flag = isPlanDeletePopUpVisible();
        try{
        if(flag){
            clickDeletePopUpOkButton();
        }} catch(Exception e){
            System.out.println("TabPlansProgramsStep.userClickPlanDeleteButton()- "+e.getClass()+" "+e.getMessage());
        }
    }
    @And("User Select Active Plan")
    public void scrollToActivePlan(){
        clickActivePlanRow();
        Assert.assertEquals(getCurrentActivePlanID(),getTestDataValue("TemplateID"));
    }

    @Then("Verify Button on Plan Program Tab are {string}")
    public void verifyButtonOnPlanProgramTabAreDisabled(String buttonType) {
        switch (buttonType) {
            case "Disabled":
                Assert.assertEquals(getAttributeValue(detailsButton, "disabled"), "true");
                Assert.assertEquals(getAttributeValue(newButton, "disabled"), "true");
                Assert.assertEquals(getAttributeValue(deleteButton, "disabled"), "true");
                Assert.assertEquals(getAttributeValue(currentButton, "disabled"), "true");
                break;
            case "Enabled":
                Assert.assertEquals(getAttributeValue(detailsButton, "disabled"), "false");
                Assert.assertEquals(getAttributeValue(newButton, "disabled"), "false");
                Assert.assertEquals(getAttributeValue(deleteButton, "disabled"), "false");
                Assert.assertEquals(getAttributeValue(currentButton, "disabled"), "false");
                break;
        }
    }

    @And("Verify Numbers of Plans added")
    public void verifyNumbersOfPlansAdded() {
        getPlansCount();
    }
}
