package com.iinsight.pagefactory.Toolbox.Side.Finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancialIntegrations extends Invoices {
    @FindBy(id="ifinance_integrations_list_search_text")
    public WebElement searchFieldIntegrationsField;
    @FindBy(css="img[name='ifinance_integrations_list_button']")
    public WebElement searchByIntegrationsDropdown;
    @FindBy(id="ifinance_integrations_list_find")
    public WebElement findIntegrationsBtn;
    @FindBy(id="small_fields_view_ifinance_integrations_list")
    public WebElement fieldEditIntegrationsBtn;
}
