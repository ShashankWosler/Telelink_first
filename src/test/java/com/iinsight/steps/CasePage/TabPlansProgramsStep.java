package com.iinsight.steps.CasePage;


import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlansProgramsMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class TabPlansProgramsStep extends PlansProgramsMainPage {
    @And("User click on Plans button from plans programs tab")
    public void userClickPlansButton(){
        Assert.assertTrue(isPlansTabVisible());
        clickPlansTab();
    }
    @And("User click on Plans New Button")
    public void userClickPlanNewButton(){
        clickNewButton();
    }
}
