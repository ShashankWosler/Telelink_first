package com.iinsight.pages.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts.Accounts;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage extends Accounts {
    public AccountsPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void clickOnAddInvoiceButton(){
        clickButtonWithOutScroll(invoiceButton);
    }
    public void getInvoiceID(String invoice){
        waitFor(3000);
        String invoiceID = getAttributeValue(get_Invoice_ID , "title");
        System.out.println("Invoice ID ----------------- " +invoiceID);
        getID(invoice, invoiceID);
    }
    public void getAmount(String amount){
        waitFor(3000);
        String amountID = getAttributeValue(getAmount , "title");
        System.out.println("Default Amount From Accounts Table  ----------------- " +amountID);
        getID(amount, amountID);
    }
    public boolean isPaymentButtonVisible(){return isElementDisplayed(paymentButton);}
    public void isPaymentButtonClickable(){waitElementToBeClickable(paymentButton);}

    public void clickPaymentButton(){clickButtonWithOutScroll(paymentButton);}
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);}
    public void clickDeleteYesButton(){clickButtonWithOutScroll(deleteConfirmButton);}
    public void clickAdjustButton(){clickButtonWithOutScroll(adjustButton);}
    public void clickRefundButton(){clickButtonWithOutScroll(refundButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public void clickSearchInputTab(){clickButtonWithOutScroll(searchInputTab);}
    public void enterTextSearchInputTab(String caseID){enterText(searchInputTab,caseID);}
    public void clickByDropDownButton(){clickButtonWithOutScroll(byDropDownButton);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public String getTypePaymentText(){return getAttributeValue(getTypeText,"title");}
    public String getTextAmountOfInvoice(){return getAttributeValue(getAmount,"title");}

}
