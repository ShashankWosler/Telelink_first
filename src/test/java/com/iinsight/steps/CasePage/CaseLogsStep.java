package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote.CaseLogsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

public class CaseLogsStep extends CaseLogsPage {

    @And("User select Case Log tab")
    public void UserClickOnCaseLog(){
        try{
         waitFor(2000);
        //Assert.assertTrue(isCaseLogsTabVisible());
        clickCaseLogsTab();}
        catch(TimeoutException e){System.out.println();}
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

    @Then("Verify that Case log is generated for the Newly created Invoice")
    public void verifyThatCaseLogIsGeneratedForTheNewlyCreatedInvoice() {
        try{
        verifyInvoiceLog();}
        catch(TimeoutException e){
            clickCaseLogsTab();
            waitFor(2000);
            verifyInvoiceLog();
        }
    }
    @Then("Verify that Newly created payment of billing ID of should be visible in Case logs")
    public void verifyLogOfPaymentAdded(){
        waitFor(3000);
        invoiceID = config.getString("InvoiceID").replaceAll("[^0-9]","");
        System.out.println("Invoice ID :"+invoiceID);
        System.out.println("Case Log - Payment Title: "+getAttributeValue(title_text,"title"));
        Assert.assertTrue(getAttributeValue(title_text,"title").contains(invoiceID));
    }

    @Then("Verify that Newly created payment of billing ID {string} {string} of should be visible in Case logs")
    public void verifyMultiplePaymentIds(String planType, String billingType){
        waitFor(3000);
        String ConcatenatedValue = planType.replaceAll(" ", "") + billingType.replaceAll(" ", "");
        String multiplesIds = config.getString(ConcatenatedValue+"InvoiceID").replaceAll("[^0-9]","");
        System.out.println("Case Log - Payment Title: "+getAttributeValue(title_text,"title"));
        Assert.assertTrue(getAttributeValue(title_text,"title").contains(multiplesIds));
    }
    @Then("Verify that Case log is generated for the Newly created Invoice {string} {string}")
    public void verifyCaseLogOfInvoiceForMultiple(String planType, String billingType) {
        try {
            waitFor(5000);
            Assert.assertTrue(isElementDisplayed(title_text));
            String newInvoiceID = config.getString(planType+billingType+"InvoiceID");
            String str = newInvoiceID.replaceAll("[^0-9]", "");
            Assert.assertTrue(getAttributeValue(title_text, "title"), getAttributeValue(title_text, "title").contains(str));
        }catch (NullPointerException e){
            System.out.println("CaseLogsStep.verifyCaseLogOfInvoiceForMultiple() - NullPointerException");
        }
    }
    @Then("Verify that Case log is generated for the New created Invoice")
    public void verifyCaseLogOfNewInvoiceCreated(){
        waitFor(3000);
        System.out.println(getAttributeValue(title_text, "title")+" "+CaseTypeTestData.InvoiceNumber);
        Assert.assertTrue(getAttributeValue(title_text, "title").contains(CaseTypeTestData.InvoiceNumber));
    }
    @And("Verify that New created billing ID of should be visible in Case logs")
    public void verifyZeroCaseBillingIdFromCaseLog(){
        waitFor(3000);
        Assert.assertTrue(getAttributeValue(title_text, "title").contains(CaseTypeTestData.BillingNumber));
    }
    @Then("Verify that New created payment of billing ID of should be visible in Case logs")
    public void verifyNewCreatedBillingIdCaseLog(){
        waitFor(3000);
        Assert.assertTrue(getAttributeValue(title_text,"title").contains(CaseTypeTestData.InvoiceNumber));
    }
    @Then("Verify that {string} contains in Case Logs Tab")
    public void verifyNewAdjustTextInLog(String value){
        switch (value){
            case "New refund":
                String invoice = getAttributeValue(title_text, "title");
                Assert.assertTrue(invoice.contains(CaseTypeTestData.InvoiceNumber));
                break;
        }
        waitFor(3000);
        String actual = getAttributeValue(title_text, "title");
        System.out.println(actual);
        Assert.assertTrue(actual.contains(value));
    }
 @Then("Verify that {string} billing ID of should be visible in Case logs")
    public void verifyCaseLogAppointmentBilling(String verifyText){
     waitFor(3000);
     String value = verifyText.replaceAll(" ", "");
     String billingID = config.getString(value+"ID");
     System.out.println("Case Log - Billing ID: "+getAttributeValue(title_text,"title"));
     Assert.assertTrue(getAttributeValue(title_text,"title").contains(billingID));
 }

 @Then("Verify that {string} text should be visible in Case logs")
    public void verifyDeletedAppointmentLogs(String logValue){
     waitFor(3000);
     Assert.assertTrue(getAttributeValue(title_text,"title").contains(logValue));
 }
    @Then("Verify that {string} Recurrence appointment of should be visible in Case logs")
    public void verifyRecurrenceAppointmentLogs(String logValue){
        waitFor(3000);
        getRecurrenceCaseLog(logValue);
    }
}
