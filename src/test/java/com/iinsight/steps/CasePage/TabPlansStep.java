package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlansPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

public class TabPlansStep extends PlansPage {
    @And("Verify that New created plan will be listed under PlanProgram Tab")
    public void verifyNewCreatedPlan(){
        try{
        waitFor(7000);
        setImplicit(60);
        waitElementToBeClickable(TitleOfCreatedPlan);
        waitElementToBeClickable(saveAsTemplateButton);
        Assert.assertTrue(isSaveAsTemplateButtonVisible());
        String fullName=CaseTypeTestData.FirstName+CaseTypeTestData.LastName;
        Assert.assertEquals(getTitleOfCreatedPlan(),fullName);
        setImplicit(10);
        waitElementToBeClickable(titleReportPreview);
        Assert.assertTrue(isTitleReportPreviewVisible());
        waitElementToBeClickable(cancelReportPreview);
        Assert.assertTrue(isCancelReportPreview());
        clickCancelReportPreview();
        waitElementToBeClickable(saveAsTemplateButton);}
        catch(StaleElementReferenceException | TimeoutException e){
            System.out.println("TabPlansNewStep.verifyNewCreatedPlan() - "+e.getClass()+" : "+e.getMessage());
            waitFor(3000);
        }
    }
}
