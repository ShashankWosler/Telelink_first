package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Goals.GoalsMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class GoalsMainStep extends GoalsMainPage {
    @And("User Click on {string} From Goals Page")
    public void clickOnNewButton(String button){
        Assert.assertTrue(isNewButtonVisible());
        switch (button){
            case "+New Button":
                clickNewButton();
                break;
            case "Add Progress":
                clickAddProgressButton();
                break;
            case "Edit":
                clickEditButton();
                break;
            case "Delete":
                clickDeleteButton();
                break;
        }

    }
    @And("User Verify Goal Added in Goals Tab {string} {string}")
    public void verifyCreatedGoal(String statusValue, String priorityValue){
        waitFor(2000);
        Assert.assertTrue(isSearchInputVisible());
        Assert.assertEquals(getTitleText(), CaseTypeTestData.TemplateLastName);
        Assert.assertTrue(isPriorityIconVisible(priorityValue));
        Assert.assertEquals(getAttributeValue(getProgress,"max"),"100");
        Assert.assertTrue(getStatusText().equalsIgnoreCase(statusValue));
        if(statusValue.equalsIgnoreCase("Started"))
            Assert.assertEquals(getProgressText(),"0");
        else if(statusValue.equalsIgnoreCase("Completed"))
            Assert.assertEquals(getProgressText(),"100");
    }
    @And("User click on {string} tab")
    public void selectTabFromGoalsPage(String goalsTab){
        waitFor(2000);
        Assert.assertTrue(isGoalsTabVisible());
        switch (goalsTab){
            case "Goal Tracking":
                clickGoalTrackingTab();
                waitElementToBeClickable(goalTrackFieldEditButton);
                Assert.assertTrue(isElementDisplayed(goalTrackFieldEditButton));
//                Assert.assertTrue(isGetGoalTrackTitleVisible());
                break;
            case "Goals Tab":
                clickGoalsTab();
                waitElementToBeClickable(editButton);
                Assert.assertTrue(isElementDisplayed(editButton));
//                waitFor(2000);
//                Assert.assertTrue(isTitleVisible());
                break;
        }
    }
    @And("User Verify Progress Added")
    public void userVerifyAddedProgress(){
        waitElementToBeClickable(goalTrackSearchInput);
        Assert.assertTrue(isElementDisplayed(goalTrackSearchInput));
        Assert.assertEquals(getGoalTrackProgressText(),"Test Automation - Goal");
    }

    @And("User Delete {string}")
    public void clickDeleteButtonGoal(String buttonValue){
        switch (buttonValue){
            case "Goal Tracking":
                waitElementToBeClickable(goalTrackEditButton);
                Assert.assertTrue(isElementDisplayed(goalTrackEditButton));
                deleteAllProgress();
//                waitFor(2000);
//                Assert.assertTrue(isElementDisplayed(goalsTrackingEmptyRow));
                break;
            case "Goals":
                Assert.assertTrue(isNewButtonVisible());
                clickDeleteButton();
                Assert.assertTrue(isElementDisplayed(deleteOkButton));
                clickDeleteOkButton();
                waitElementToBeClickable(goalsEmptyRow);
                Assert.assertTrue(isElementDisplayed(goalsEmptyRow));
                break;
        }
    }

    @And("Verify Goal is Disabled")
    public void verifyGoalIsDisabled(){
        waitFor(2000);
        mouseOver(goalDisbaleIcon);
        Assert.assertEquals(getDisableGoal(),"Disabled");
    }
    @And("User Disable Goal")
    public void disableGoal(){
        Assert.assertTrue(isNewButtonVisible());
        clickDeleteButton();
        Assert.assertTrue(isElementDisplayed(deleteOkButton));
        clickDeleteOkButton();
        Assert.assertTrue(isUnableDeletePopUpVisible());
        clickDeleteOkButton();
    }
    @And("Verify Disable Button Is Not Visible")
    public void disableButtonIsNotVisible(){
        Assert.assertTrue(isNewButtonVisible());
        clickDeleteButton();
        Assert.assertTrue(isElementDisplayed(deleteOkButton));
        clickDeleteOkButton();
        Assert.assertTrue(isUnableDeletePopUpVisible());
        Assert.assertFalse(isElementDisplayed(goalDisbaleIcon));
    }
}
