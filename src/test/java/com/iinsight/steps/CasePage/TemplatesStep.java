package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.TemplatesPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class TemplatesStep extends TemplatesPage {
    @And("Verify New created template will be listed under template tab")
    public void userClickAddedTemplate(){
        Assert.assertTrue(isSaveAsPlanButtonVisible());
        try{
        isFirstRowVisible();
        Assert.assertEquals(getTitleFirstRowText(), CaseTypeTestData.FirstName+CaseTypeTestData.LastName);
        } catch(Exception e){
            System.out.println("TemplatesStep.userClickAddedTemplate() - "+e.getClass()+" "+e.getMessage());
        }
    }
    @And("Verify New created template will be Deleted under template tab")
    public void verifyRecordIsDeleted(){
        Assert.assertTrue(getEmptyRowText().contains("no results"));
    }
}
