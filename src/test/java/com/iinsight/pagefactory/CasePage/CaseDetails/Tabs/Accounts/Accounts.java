package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accounts extends GenericWrappers {
    @FindBy(id="cases_account_invoice")
    public WebElement invoiceButton;
    @FindBy(id="cases_account_payment")
    public WebElement paymentButton;
    @FindBy(id="cases_account_adjust")
    public WebElement adjustButton;
    @FindBy(id="cases_account_refund")
    public WebElement refundButton;
    @FindBy(id="small_fields_view_transactions_list")
    public WebElement fieldEditButton;
    @FindBy(css="input[id='transactions_list_search_text']")
    public WebElement searchInputTab;
    @FindBy(css="[name='transactions_list_button']")
    public WebElement byDropDownButton;
    @FindBy(id="transactions_list_find")
    public WebElement findButton;
    @FindBy(xpath="(//td[@id=\"invoices.invoice_n_column\"])[1]")
    public WebElement get_Invoice_ID;


}