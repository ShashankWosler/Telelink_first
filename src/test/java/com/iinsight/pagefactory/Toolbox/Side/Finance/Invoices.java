package com.iinsight.pagefactory.Toolbox.Side.Finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoices extends Costs {
    @FindBy(id="i_remit")
    public WebElement remittanceAmountField;
    @FindBy(id="i_total_balance")
    public WebElement amountLeftToApplyField;
    @FindBy(css="img[onclick='text_select_show_list_filter('payment_status')']")
    public WebElement paymentStatusDropdown;
    @FindBy(css="img[onclick='text_select_show_list_filter('payment_type')']")
    public WebElement chequeDropdown;
    @FindBy(id="ifinance_invoice_payment_btn")
    public WebElement paymentBtn;

    @FindBy(id="ifinance_invoices_details_1")
    public WebElement selectAllBtn;
    @FindBy(id="ifinance_invoices_details_2")
    public WebElement detailsBtn;
    @FindBy(id="ifinance_invoices_search_text")
    public WebElement searchInvoiceField;
    @FindBy(id="ifinance_invoices_find")
    public WebElement findInvoiceBtn;
    @FindBy(id="small_fields_view_ifinance_invoices")
    public WebElement fieldEditInvoiceBtn;

}
