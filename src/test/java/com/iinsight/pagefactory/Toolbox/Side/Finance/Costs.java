package com.iinsight.pagefactory.Toolbox.Side.Finance;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Costs extends FinanceMain {
    @FindBy(css="img[name='company_button']")
    public WebElement businessDivisionDropdown;
    @FindBy(css="img[name='category_button']")
    public WebElement serviceContractDropdown;
    @FindBy(css="img[name='dates_button']")
    public WebElement dateRangeDropdown;
    @FindBy(id="cost_type_button")
    public WebElement costTypeDropdown;
    @FindBy(id="appointment_cost")
    public WebElement appointmentCostDropdown;
    @FindBy(css="img[onclick=\"text_select_show_list_filter('charge_code_type')\"]")
    public WebElement chargeCodeTypeDropdown;

    @FindBy(id="ifinance_costs_new")
    public WebElement billingBtn;
    @FindBy(id="ifinance_costs_edit")
    public WebElement editBtn;
    @FindBy(id="ifinance_costs_delete")
    public WebElement deleteBtn;
    @FindBy(id="ifinance_costs_export")
    public WebElement exportBtn;
    @FindBy(id="ifinance_costs_search_text")
    public WebElement searchField;
    @FindBy(id="ifinance_costs_find")
    public WebElement findBtn;
    @FindBy(id="small_fields_view_ifinance_costs")
    public WebElement fieldEditBtn;


}
