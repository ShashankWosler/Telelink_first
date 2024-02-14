package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Case.CaseDetailsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TabCaseStep extends CaseDetailsPage {
    @Then("User verify the mandatory fields of case details form")
    public void userVerifyCaseForm(){
        Assert.assertTrue(isBillToCompanyNameIsVisible());
        Assert.assertEquals(getTextBillToCompanyName(), CaseTypeTestData.CompanyName);
        Assert.assertEquals(getTextBillToCompanyStatus(), CaseTypeTestData.CaseStatus);
    }

    @Then("Verify {string} is enabled")
    public void viewIsEnabled(String viewType){
        switch (viewType){
            case "Case Listing View":
                try{
                    Assert.assertEquals(getAttributeValue(bill_company_name,"disabled"),"true");
                } catch(Exception e){
                    System.out.println("viewIsEnabled() - Case Listing View: Listing View Enabled");
                }
                break;
            case "Case Details View":
                Assert.assertTrue(isBillToCompanyNameIsVisible());

        }
    }
}
