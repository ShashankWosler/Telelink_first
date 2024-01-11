package com.iinsight.pagefactory.Toolbox.Side.Finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailedTransactions extends Invoices {
    public EmailedTransactions(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id="emailed_invoices_check_all_button")
    public WebElement selectAllBtn;
    @FindBy(id="ifinance_emailed_invoice_send")
    public WebElement sendBtn;
    @FindBy(id="ifinance_emailed_invoice_send")
    public WebElement exportBtn;

    @FindBy(css="button[onclick='emailed_invoices_check_and_delete();']")
    public WebElement deleteBtn;
    @FindBy(id="emailed_invoices_list_search_text")
    public WebElement searchFieldEmailedField;
    @FindBy(css="img[name='emailed_invoices_list_button']")
    public WebElement searchByEmailedDropdown;
    @FindBy(id="emailed_invoices_list_find")
    public WebElement findEmailedBtn;
    @FindBy(id="small_fields_view_emailed_invoices_list")
    public WebElement fieldEditEmailedBtn;

}
