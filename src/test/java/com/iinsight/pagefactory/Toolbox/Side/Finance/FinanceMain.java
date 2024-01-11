package com.iinsight.pagefactory.Toolbox.Side.Finance;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinanceMain extends GenericWrappers {
    public FinanceMain(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(css="img[name='company_button']")
    public WebElement businessDivisionDropdown;
    @FindBy(css="img[name='category_button']")
    public WebElement serviceContractDropdown;
    @FindBy(css="img[name='dates_button']")
    public WebElement dateRangeDropdown;
    @FindBy(css="img[name='transaction_button']")
    public WebElement transactionTypeDropdown;
    @FindBy(id="go_find_ifinance_payment_show_1")
    public WebElement goBtn;
    @FindBy(css="img[name='datefrom_button']")
    public WebElement fromDateDropdown;
    @FindBy(css="img[name='dateto_button']")
    public WebElement toDateDropdown;

    @FindBy(id="ifinance_all_tab")
    public WebElement allTransactionsTab;
    @FindBy(id="ifinance_invoices_tab")
    public WebElement invoiceTab;
    @FindBy(id="ifinance_costs_tab")
    public WebElement costsTab;
    @FindBy(id="ifinance_adjusted_costs_tab")
    public WebElement adjustedCostTab;
    @FindBy(id="ifinance_appointment_billing_tab")
    public WebElement appointmentTab;
    @FindBy(id="ifinance_integrations_tab")
    public WebElement financialIntegrationsTab;
    @FindBy(id="ifinance_emailed_invoices_tab")
    public WebElement emailedTransactionsTab;

}
