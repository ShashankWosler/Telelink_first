package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlansPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class TabPlansStep extends PlansPage {
    @And("Verify that New created plan will be listed under PlanProgram Tab")
    public void verifyNewCreatedPlan(){
        waitVisibilityOfElement(saveAsTemplateButton);
        String getPlanPageTitle = getWindowTitle();
        waitFor(2000);
        SwitchToParentWindow(getPlanPageTitle);
        waitVisibilityOfElement(TitleOfCreatedPlan);
        Assert.assertTrue(isSaveAsTemplateButtonVisible());
        String fullName=CaseTypeTestData.FirstName+CaseTypeTestData.LastName;
        Assert.assertEquals(getTitleOfCreatedPlan(),fullName);
    }
}
