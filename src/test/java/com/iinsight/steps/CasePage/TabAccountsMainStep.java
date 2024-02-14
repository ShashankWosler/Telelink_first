package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts.AccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;

public class TabAccountsMainStep extends AccountsPage {
    @And("User Click on +Invoice Button")
    public void userClickOnInvoiceButton() {
        clickOnAddInvoiceButton();
    }

    @And("Verify {string} Id is Created and should be visible in the Case Account table")
    public void verifyInvoiceIdIsCreatedAndShouldBeVisibleInTheCaseAccountTable(String invoice) {
        waitFor(4000);
        getInvoiceID(invoice);
        getAmount("Amount");
    }
    @And("Verify {string} {string} Id is Created and should be visible in the Case Account table")
    public void getInvoiceIdForDifferentPlanTypeBillingType(String planType, String billingType){
        waitFor(4000);
        String ConcatenatedValue = planType.replaceAll(" ", "") + billingType.replaceAll(" ", "");
        getID(ConcatenatedValue+"Invoice",getMultipleInvoiceIdsOfDifferentPlans()); //Store Invoice ID
        //getID(ConcatenatedValue+"Amount",getMultipleAmountIdsOfDifferentPlans());   // Store Amount
    }

    @Then("Click On Payment Button from Accounts Tab")
    public void clickOnAccountTabPaymentButton(){
            //isPaymentButtonClickable();
            waitFor(10000);
            clickPaymentButton();

    }
    @Then("Verify {string} Amount is Created and should be visible in the Case Account table")
    public void verifyPaymentEntryIsCreated(String entryType){
        waitFor(2000);
        Assert.assertEquals(entryType,getTypePaymentText());
        String getAmountFromTable = getTextAmountOfInvoice().replace("R","").replace(",",".");
        Assert.assertEquals(getAmountFromTable, "-"+CaseTypeTestData.UpdatedPrice);
    }
    @And("User verify case account form with zero values")
    public void verifyZeroValuesOfCaseAccountForm(){
        mouseOver(getTotalInvoices);
        setImplicit(10);
        waitElementToBeClickable(getTotalInvoices);
        Assert.assertTrue("E:"+getTotalInvoiceText()+" A:0",getTotalInvoiceText().contains("0"));
        Assert.assertTrue("E:"+getTotalAdjustmentText()+" A:0",getTotalAdjustmentText().contains("0"));
        Assert.assertTrue("E:"+getTotalPaymentsText()+" A:0",getTotalPaymentsText().contains("0"));
        Assert.assertTrue("E:"+getTotalRefundsText()+" A:0",getTotalRefundsText().contains("0"));
        Assert.assertTrue("E:"+getTotalOwningText()+" A:0",getTotalOwningText().contains("0"));
    }
    @And("Verify Id is Created and should be visible in the Case Account table and Verify Amount {string} VAT")
    public void verifyInvoiceNumberFromTable(String vatValue){
        switch(vatValue){
            case "With":
                waitFor(4000);
                Assert.assertTrue("E:"+getAttributeValue(get_Invoice_ID , "title")+" A:"+CaseTypeTestData.InvoiceNumber, getAttributeValue(get_Invoice_ID , "title").contains(CaseTypeTestData.InvoiceNumber));
                String getAmountFormatted = getAttributeValue(getAmount , "title").replaceAll(" ","").replaceAll("[^0-9]","");
                Assert.assertTrue("E:"+getAmountFormatted+" A:"+CaseTypeTestData.Total, getAmountFormatted.contains(CaseTypeTestData.Total));
                mouseOver(getTotalInvoices);
                setImplicit(10);
                waitElementToBeClickable(getTotalInvoices);
                Assert.assertTrue("E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.Total,getTotalInvoiceText().contains(CaseTypeTestData.Total));
                Assert.assertTrue("E:"+getTotalAdjustmentText(),getTotalAdjustmentText().contains("0"));;
                Assert.assertTrue("E:"+getTotalPaymentsText(),getTotalPaymentsText().contains("0"));
                Assert.assertTrue("E:"+getTotalRefundsText(),getTotalRefundsText().contains("0"));
                Assert.assertTrue("E:"+getTotalOwningText()+" A:"+CaseTypeTestData.Total,getTotalOwningText().contains(CaseTypeTestData.Total));
                break;
            case "Without":
                waitFor(4000);
                Assert.assertTrue("E:"+getAttributeValue(get_Invoice_ID , "title")+" A:"+CaseTypeTestData.InvoiceNumber, getAttributeValue(get_Invoice_ID , "title").contains(CaseTypeTestData.InvoiceNumber));
                String getAmountFormatte = getAttributeValue(getAmount , "title").replaceAll(" ","").replaceAll("[^0-9]","");
                Assert.assertTrue("E:"+getAmountFormatte+" A:"+CaseTypeTestData.Total, getAmountFormatte.contains(CaseTypeTestData.SubTotal));
                mouseOver(getTotalInvoices);
                setImplicit(10);
                waitElementToBeClickable(getTotalInvoices);
                Assert.assertTrue("E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.SubTotal,getTotalInvoiceText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue("E:"+getTotalAdjustmentText(),getTotalAdjustmentText().contains("0"));;
                Assert.assertTrue("E:"+getTotalPaymentsText(),getTotalPaymentsText().contains("0"));
                Assert.assertTrue("E:"+getTotalRefundsText(),getTotalRefundsText().contains("0"));
                Assert.assertTrue("E:"+getTotalOwningText()+" A:"+CaseTypeTestData.SubTotal,getTotalOwningText().contains(CaseTypeTestData.SubTotal));
                break;
        }
    }
    @Then("Verify New {string} Amount is Created and should be visible in the Case Account table {string} VAT")
    public void verifyPaymentEntryIsCreatedNew(String entryType, String vatValue){
        waitFor(2000);
        Assert.assertEquals(entryType,getTypePaymentText());
        Assert.assertTrue("E:"+getTransactionIDText()+" A:"+CaseTypeTestData.InvoiceNumber+"-P",getTransactionIDText().contains(CaseTypeTestData.InvoiceNumber+"-P"));
        String getAmountFromTable = getTextAmountOfInvoice().replace("R","").replace(",","");
        Assert.assertTrue("E:"+getAmountFromTable+" A:-"+CaseTypeTestData.PaymentUpdatedAmount,getAmountFromTable.contains("-"+CaseTypeTestData.PaymentUpdatedAmount));
        mouseOver(getTotalInvoices);
        setImplicit(10);
        switch (vatValue){
            case "With":
                Assert.assertTrue("E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.Total,getTotalInvoiceText().contains(CaseTypeTestData.Total));
                Assert.assertTrue("E:"+getTotalOwningText()+" A:"+CaseTypeTestData.VATRemainingAmount,getTotalOwningText().contains(CaseTypeTestData.VATRemainingAmount));
                break;
            case "Without":
                Assert.assertTrue("E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.SubTotal,getTotalInvoiceText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue("E:"+getTotalOwningText()+" A:"+CaseTypeTestData.NOVATRemainingAmount,getTotalOwningText().contains(CaseTypeTestData.NOVATRemainingAmount));
                break;
        }
        Assert.assertTrue("E:"+getTotalAdjustmentText(),getTotalAdjustmentText().contains("0"));;
        Assert.assertTrue("E:"+getTotalPaymentsText()+" A:"+CaseTypeTestData.PaymentUpdatedAmount,getTotalPaymentsText().contains(CaseTypeTestData.PaymentUpdatedAmount));
        Assert.assertTrue("E:"+getTotalRefundsText(),getTotalRefundsText().contains("0"));
    }
    @And("User click on Adjust Button from Accounts Tab")
    public void userClickOnAdjustButton(){
        waitFor(2000);
        Assert.assertTrue(isElementDisplayed(transactionListLastRow));
        clickLastRowFromTable();
        waitVisibilityOfElement(paymentButton);
        Assert.assertTrue(isPaymentButtonVisible());
        clickAdjustButton();
    }

    @And("User Verify Adjust Id from Accounts Tab {string} VAT")
    public void userVerifyAmountAndIdFromAccountsTab(String vatValue){
        waitFor(3000);
        Assert.assertTrue("E:"+getTransactionIDText()+" A:"+CaseTypeTestData.AdjustId,getTransactionIDText().contains(CaseTypeTestData.AdjustId));
        mouseOver(getTotalInvoices);
        switch (vatValue){
            case "With":
                Assert.assertTrue("E: "+getAmountText()+" A:"+CaseTypeTestData.AdjustTotal,getAmountText().contains("-"+CaseTypeTestData.AdjustTotal));
                Assert.assertTrue("E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.Total,getTotalInvoiceText().contains(CaseTypeTestData.Total));
                Assert.assertTrue("E:"+getTotalOwningText()+" A:"+CaseTypeTestData.VATAdjustOwningAmount,getTotalOwningText().contains(CaseTypeTestData.VATAdjustOwningAmount));
                Assert.assertTrue("E:"+getTotalAdjustmentText()+" A:"+CaseTypeTestData.AdjustTotal,getTotalAdjustmentText().contains(CaseTypeTestData.AdjustTotal));
                break;
            case "Without":
                Assert.assertTrue("E: "+getAmountText()+" A:"+CaseTypeTestData.AdjustSubTotal,getAmountText().contains("-"+CaseTypeTestData.AdjustSubTotal));
                Assert.assertTrue("E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.SubTotal,getTotalInvoiceText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue("E:"+getTotalOwningText()+" A:"+CaseTypeTestData.NOVATAdjustOwningAmount,getTotalOwningText().contains(CaseTypeTestData.NOVATAdjustOwningAmount));
                Assert.assertTrue("E:"+getTotalAdjustmentText()+" A:"+CaseTypeTestData.AdjustSubTotal,getTotalAdjustmentText().contains(CaseTypeTestData.AdjustSubTotal));
                break;
        }
        Assert.assertTrue("E:"+getTotalPaymentsText()+" A:"+CaseTypeTestData.PaymentUpdatedAmount,getTotalPaymentsText().contains(CaseTypeTestData.PaymentUpdatedAmount));
        Assert.assertTrue("E:"+getTotalRefundsText(),getTotalRefundsText().contains("0"));
    }
    @And("User click on Refund Button from Accounts Tab")
    public void clickOnRefundButton(){
        try{
        waitFor(2000);
        Assert.assertTrue(isElementDisplayed(transactionListFirstRow));
        clickFirstRowFromTable();
        clickRefundButton();}
        catch(StaleElementReferenceException e){
            System.out.println("TabAccountsMain.clickOnRefundButton() - StaleElementReferenceException");
            waitFor(2000);
            clickRefundButton();
        }
    }
    @And("User Verify Refund Id from Accounts Tab {string} VAT")
    public void verifyRefundId(String vatValue){
        waitFor(3000);
        Assert.assertTrue("E:"+getTransactionIDText()+" A:"+CaseTypeTestData.InvoiceNumber+"-R",getTransactionIDText().contains(CaseTypeTestData.InvoiceNumber+"-R"));
        mouseOver(getTotalInvoices);
        switch (vatValue){
            case "With":
                Assert.assertTrue("getAmountText() E: "+getAmountText()+" A:"+CaseTypeTestData.AdjustAmount,getAmountText().contains(CaseTypeTestData.AdjustAmount));
                Assert.assertTrue("getTotalInvoiceText () E:"+getTotalInvoiceText()+" A:"+CaseTypeTestData.Total,getTotalInvoiceText().contains(CaseTypeTestData.Total));
                Assert.assertTrue("getTotalOwningText() E:"+getTotalOwningText()+" A:"+CaseTypeTestData.VATAdjustOwningAmountI+CaseTypeTestData.AdjustAmountI,getTotalOwningText().contains(String.valueOf(CaseTypeTestData.VATAdjustOwningAmountI+CaseTypeTestData.AdjustAmountI)));
                Assert.assertTrue("getTotalAdjustmentText() E:"+getTotalAdjustmentText()+" A:"+CaseTypeTestData.AdjustTotal,getTotalAdjustmentText().contains(CaseTypeTestData.AdjustTotal));
                break;
            case "Without":
                Assert.assertTrue("getAmountText() E : "+getAmountText()+" A:"+CaseTypeTestData.AdjustAmount,getAmountText().contains(CaseTypeTestData.AdjustAmount));
                Assert.assertTrue("getTotalInvoiceText() E :"+getTotalInvoiceText()+" A:"+CaseTypeTestData.SubTotal,getTotalInvoiceText().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue("getTotalOwningText() E:"+getTotalOwningText()+" A:"+CaseTypeTestData.NOVATAdjustOwningAmountI+CaseTypeTestData.AdjustAmountI,getTotalOwningText().contains(String.valueOf(CaseTypeTestData.NOVATAdjustOwningAmountI+CaseTypeTestData.AdjustAmountI)));
                Assert.assertTrue("getTotalAdjustmentText() E:"+getTotalAdjustmentText()+" A:"+CaseTypeTestData.AdjustSubTotal,getTotalAdjustmentText().contains(CaseTypeTestData.AdjustSubTotal));
                break;
        }
        Assert.assertTrue("E:"+getTotalPaymentsText()+" A: -"+CaseTypeTestData.PaymentUpdatedAmount,getTotalPaymentsText().contains("-"+CaseTypeTestData.PaymentUpdatedAmount));
        Assert.assertTrue("E:"+getTotalRefundsText(),getTotalRefundsText().contains(CaseTypeTestData.AdjustAmount));
    }

    @Then("Verify Button on Account Tab are Disabled")
    public void verifyButtonOnAccountTabAreDisabled() {
        Assert.assertEquals(getAttributeValue(detailsButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(sendEmailButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(deleteButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(voidButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(reverseButton,"disabled"),"true");

        Assert.assertEquals(getAttributeValue(invoiceButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(paymentButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(adjustButton,"disabled"),"true");
        Assert.assertEquals(getAttributeValue(refundButton,"disabled"),"true");
    }
}
