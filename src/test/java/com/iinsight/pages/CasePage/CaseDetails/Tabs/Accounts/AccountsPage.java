package com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts.Accounts;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage extends Accounts {
    public AccountsPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnAddInvoiceButton(){
        try{
        clickButtonWithOutScroll(invoiceButton);}
        catch(StaleElementReferenceException e){
            System.out.println("AccountsPage().clickOnAddInvoiceButton - "+e.getMessage());
            waitFor(3000);
            clickButtonWithOutScroll(invoiceButton);
        }
    }
    public void getInvoiceID(String invoice){
        waitFor(3000);
        String invoiceID = getAttributeValue(get_Invoice_ID , "title");
        System.out.println("Invoice ID ----------------- " +invoiceID);
        getID(invoice, invoiceID);
    }

    public String getMultipleInvoiceIdsOfDifferentPlans(){
        waitFor(3000);
        return getAttributeValue(get_Invoice_ID , "title");
    }

    public void getAmount(String amount){
        waitFor(3000);
        String amountID = getAttributeValue(getAmount , "title");
        System.out.println("Default Amount From Accounts Table  ----------------- " +amountID);
        getID(amount, amountID);
    }
    public String getMultipleAmountIdsOfDifferentPlans(){
        waitFor(3000);
        return getAttributeValue(getAmount , "title").replaceAll("[^0-9,]","");
    }
    public boolean isPaymentButtonVisible(){return isElementDisplayed(paymentButton);}
    public void isPaymentButtonClickable(){waitElementToBeClickable(paymentButton);}

    public void clickPaymentButton(){clickButtonWithOutScroll(paymentButton);}
    public void clickAdjustButton(){
        waitElementToBeClickable(adjustButton);
        clickButtonWithOutScroll(adjustButton);}
    public void clickRefundButton(){
        waitElementToBeClickable(refundButton);
        clickButtonWithOutScroll(refundButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(accountFieldEditButton);}
    public void clickSearchInputTab(){clickButtonWithOutScroll(searchInputTab);}
    public void enterTextSearchInputTab(String caseID){enterText(searchInputTab,caseID);}
    public void clickByDropDownButton(){clickButtonWithOutScroll(byDropDownButton);}
    public void clickFindButton(){clickButtonWithOutScroll(accountFindButton);}
    public String getTypePaymentText(){return getAttributeValue(getTypeText,"title");}
    public String getTextAmountOfInvoice(){return getAttributeValue(getAmount,"title");}
    public String getTotalInvoiceText(){return getAttributeValue(getTotalInvoices,"value").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getTotalAdjustmentText(){return getAttributeValue(getTotalAdjustment,"value").replaceAll("[^0-9-,]","");}
    public String getTotalPaymentsText(){return getAttributeValue(getTotalPayments,"value").replace("R","");}
    public String getTotalRefundsText(){return getAttributeValue(getTotalRefunds,"value");}
    public String getTotalOwningText(){return getAttributeValue(getTotalOwning,"value").replaceAll(" ","").replaceAll("[^0-9]","");}
    public String getTransactionIDText(){return getAttributeValue(transactionId,"title");}
    public void clickLastRowFromTable(){
        waitElementToBeClickable(transactionListLastRow);
        clickButtonWithOutScroll(transactionListLastRow);
    }
    public void clickFirstRowFromTable(){
        waitElementToBeClickable(transactionListFirstRow);
        clickButtonWithOutScroll(transactionListFirstRow);
    }
    public String getAmountText(){return getAttributeValue(getAmount,"title").replace("R","").replaceAll("[^0-9-,]","");}
}
