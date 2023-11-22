package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Client.PersonalContactPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;

public class TabClientsStep extends PersonalContactPage {
    @Then("User verify the mandatory fields of client form of {string}")
    public void verifyClientsFields(String caseType) {
        try {
            switch (caseType) {
                case "Company":
                    Assert.assertEquals(getTextCompanyNameTab(), CaseTypeTestData.CompanyName);
                    Assert.assertEquals(getTextEmailTab(), CaseTypeTestData.Email);
                    Assert.assertEquals(getTextPhoneNumTab(), CaseTypeTestData.Phone);
                    break;
                case "Individual":
                    Assert.assertTrue(isTitleTabIsVisible());
                    Assert.assertEquals(getTextTitleTabText(), CaseTypeTestData.Title);
                    Assert.assertEquals(getTextFirstNameTab(), CaseTypeTestData.FirstName);
                    Assert.assertEquals(getTextLastNameTab(), CaseTypeTestData.LastName);
                    Assert.assertEquals(getTextEmailTab(), CaseTypeTestData.Email);
                    Assert.assertEquals(getTextPhoneNumTab(), CaseTypeTestData.Phone);
                    break;
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("TabClientsStep.verifyClientsFields() -" + e.getMessage());
        }
    }
}
