package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
    public WebElement accountFieldEditButton;
    @FindBy(css="input[id='transactions_list_search_text']")
    public WebElement searchInputTab;
    @FindBy(css="[name='transactions_list_button']")
    public WebElement byDropDownButton;
    @FindBy(id="transactions_list_find")
    public WebElement accountFindButton;
    @FindBy(xpath="(//td[@id=\"invoices.invoice_n_column\"])[1]")
    public WebElement get_Invoice_ID;
    @FindBy(xpath="(//td[@id='transactions.amount_column'])[1]")
    public WebElement getAmount;
    @FindBy(xpath="(//td[@id='transaction_types.description_column'])[1]")
    public WebElement getTypeText; //Payment Entry is Created in Accounts Tab
    @FindBy(xpath="(//div[@id='cases_accounts_form']//input)[2]")       //Total Invoices
    public WebElement getTotalInvoices; //GetAttribute "value" - R1,10
    @FindBy(xpath="(//div[@id='cases_accounts_form']//input)[3]")       //Total Adjustments
    public WebElement getTotalAdjustment;
    @FindBy(xpath="(//div[@id='cases_accounts_form']//input)[4]")       //Total Payments
    public WebElement getTotalPayments;
    @FindBy(xpath="(//div[@id='cases_accounts_form']//input)[5]")       //Total Refunds
    public WebElement getTotalRefunds;
    @FindBy(xpath="(//div[@id='cases_accounts_form']//input)[6]")       //Total Owning
    public WebElement getTotalOwning;
    @FindBy(xpath="(//td[@id='transactions.tr_code_column'])[1]")
    public WebElement transactionId;         //NAT121-P1 - getAttribute - "value"
    @FindBy(xpath="//div[@id='transactions_list']//tr[last()]")
    public WebElement transactionListLastRow;
    @FindBy(xpath="(//div[@id='transactions_list']//tr)[1]")
    public WebElement transactionListFirstRow;

    @FindBy(css = "td[title='Invoice']")
    public  List<WebElement> invoiceCount;
    @FindBy(css = "td[id='transaction_types.description_column']")
    public  List<WebElement> transactionsCount;

    //Top elements
    @FindBy(id="cases_account_details")
    public WebElement detailsButton;
    @FindBy(id="cases_account_print")
    public WebElement printButton;
    @FindBy(id="cases_account_print_copy")
    public WebElement printCopyButton;
    @FindBy(id="case_transaction_send_email")
    public WebElement sendEmailButton;
    @FindBy(id="cases_account_delete")
    public WebElement deleteButton;
    @FindBy(id="cases_account_void")
    public WebElement voidButton;
    @FindBy(id="cases_account_reverse")
    public WebElement reverseButton;




}
