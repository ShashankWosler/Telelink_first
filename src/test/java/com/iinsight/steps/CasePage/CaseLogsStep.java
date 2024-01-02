package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.CaseLogsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CaseLogsStep extends CaseLogsPage {

    @And("User select Case Log tab")
    public void UserClickOnCaseLog(){
        clickCaseLogsTab();
    }
    @Then("Verify the newly created notes logs should be created on the case logs tab")
    public void verifyNewCaseLogIsAdded(){
        getFirstRowFromTable();
    }
    @And("User select any Case log from the list")
    public void selectCaseLogFromList(){
        clickFirstRowFromTable();
    }
    @And("User click on the Case Log Details button")
    public void userClickOnDetailButton(){
        clickDetailsButton();
    }

    @Then("Verify that Newly created billing ID of should be visible in Case logs")
    public void verifyThatNewlyCreatedBillingIDOfShouldBeVisibleInCaseLogs() {
        verifyBillingLog();
    }

    @Then("Verify that {string} Text is visible in Case Logs Tab")
    public void verifyThatTextIsVisibleInTitleColumnUnderCaseLogsTab(String arg0) {
        verifyCreatedCaseLog(arg0);
    }

    @Then("Verify that Case log is generated for the Newly created {string}")
    public void verifyThatCaseLogIsGeneratedForTheNewlyCreatedInvoice(String key) {
        verifyCaseLogs(key);

    }

    @Then("Verify that Newly created payment of billing ID of should be visible in Case logs")
    public void verifyLogOfPaymentAdded(){
        waitFor(3000);
        invoiceID = config.getString("InvoiceID").replaceAll("[^0-9]","");
        System.out.println("Invoice ID :"+invoiceID);
        System.out.println("Case Log - Payment Title: "+getAttributeValue(title_text,"title"));
        Assert.assertTrue(getAttributeValue(title_text,"title"),getAttributeValue(title_text, "title").contains(invoiceID));
    }

    @Then("Verify that Case log is generated for the {string} Admin Notes")
    public void verifyThatCaseLogIsGeneratedForTheAdminNotes(String arg0) {
        verifyCreatedCaseLog(arg0);
    }

    @Then("Verify that Case log is generated for the {string} Invoice")
    public void verifyThatCaseLogIsGeneratedForTheInvoice(String arg0) {
        verifyCreatedCaseLog(arg0);
    }

    @Then("Verify Newly Created Appointment should be visible in case logs")
    public void verifyNewlyCreatedAppointmentShouldBeVisibleInCaseLogs() {
        verifyCreatedCaseLog(CaseTypeTestData.Appointment_Title);
    }
}
