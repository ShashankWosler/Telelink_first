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
}
