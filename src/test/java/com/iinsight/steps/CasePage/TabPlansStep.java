package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlansPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

public class TabPlansStep extends PlansPage {
    @And("Verify that New created {string} plan will be listed under PlanProgram Tab")
    public void verifyNewCreatedPlan(String planType){
        try{
        waitFor(7000);
        setImplicit(60);
        waitElementToBeClickable(TitleOfCreatedPlan);
        waitElementToBeClickable(saveAsTemplateButton);
        Assert.assertTrue(isSaveAsTemplateButtonVisible());
        if(planType.equals("Common")) {
            String fullName = CaseTypeTestData.FirstName + CaseTypeTestData.LastName;
            Assert.assertEquals(getTitleOfCreatedPlan(), fullName);
        } else if (planType.contains("Template")){
            String fullName = CaseTypeTestData.FirstName + CaseTypeTestData.TemplateLastName;
            Assert.assertEquals(getTitleOfCreatedPlan(), fullName);
        }
        setImplicit(10);
        boolean flag = false;
        flag = isElementDisplayed(cancelReportPreview);
        try {
        if (flag) {
            waitElementToBeClickable(titleReportPreview);
            Assert.assertTrue(isTitleReportPreviewVisible());
            waitElementToBeClickable(cancelReportPreview);
            Assert.assertTrue(isCancelReportPreview());
            clickCancelReportPreview();
        }} catch (Exception e){
            System.out.println(e.getClass() + " ---- " + e.getMessage());
            waitFor(4000);
            System.out.println("---------------"+CaseTypeTestData.windowTitle);
            waitFor(5000);
            SwitchToParentWindow(CaseTypeTestData.windowTitle);
        }
        waitFor(6000);
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
    @And("User click Save As Template Button")
    public void clickSavTemplate(){
        waitElementToBeClickable(saveAsTemplateButton);
//        clickLastRow();
        clickSavesAsTemplateButton();
        boolean flag = false;
        try{
        flag = isCopyEstimatePopUpVisible();
        if(flag){
            clickCopyEstimateOkButton();
        }}catch(Exception e){
            System.out.println("TabPlansStep.clickSavTemplate() -"+e.getClass()+" "+e.getMessage());
        }
    }

}
