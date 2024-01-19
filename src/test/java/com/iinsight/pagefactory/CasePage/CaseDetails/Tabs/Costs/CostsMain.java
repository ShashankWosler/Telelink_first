package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Costs;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CostsMain extends GenericWrappers {
    @FindBy(xpath = "(//td[@id=\"record_id_column\"])[1]")
    public WebElement cost_ID;
    @FindBy(id = "table_header_col_new_2510")
    public WebElement Id_header;
    @FindBy(id = "cases_costs_delete")
    public WebElement deleteButton;
    @FindBy(css = "button[id='cases_costs_0']")
    public WebElement billingButton;
    @FindBy(id = "cases_costs_edit")
    public WebElement editButton;
    @FindBy(id = "cases_cost_select_all")
    public WebElement selectAllButton;
    @FindBy(id = "cases_cost_exclude_all")
    public WebElement excludeAllButton;
    @FindBy(id = "cases_costs_print")
    public WebElement printButton;
    @FindBy(css = "div[id='bulkcosts'] img")
    public WebElement bulkActionDropDown;
    @FindBy(css = "div[id='bulkcosts'] button")
    public WebElement bulkActionOkButton;
    @FindBy(css = "input#costs_list_search_text")
    public WebElement searchTab;
    @FindBy(css = "[name='costs_list_button']")
    public WebElement byDropDown;
    @FindBy(xpath = "//input[@id='costs_list_search_field']/following::button[1]")
    public WebElement findButton;
    @FindBy(css = "button[id='Small Fields View']")
    public WebElement fieldEditButton;
    @FindBy(css = "[name='cost_type_button']")
    public WebElement costTypeDropDown;
    @FindBy(xpath = "(//td[@id='costs.total_charge_column'])[1]")
    public WebElement chargeText;
    @FindBy(id = "total_costs_duration")
    public WebElement durationTab;      //getAttribute - "value"
    @FindBy(id = "total_costs_activity")
    public WebElement activityChargeTab;        //getAttribute - "value"
    @FindBy(id = "total_costs_charge")
    public WebElement totalCharge;      //getAttribute - "value"
    @FindBy(id = "total_costs_quantity")
    public WebElement quantity;     //getAttribute - "value" - initial: 0
    @FindBy(id = "total_costs_item")
    public WebElement itemCharge;        //getAttribute - "value" - initial - R0,00
    @FindBy(xpath = "//div[text()='Total of Activities']")
    public WebElement costForm;
    @FindBy(xpath = "//td[@id='costs.total_charge_column']")
    public List<WebElement> getChargedAmount;   //getAttribute - "title" : R2&nbsp;200,00
    @FindBy(xpath = "//div[@id='costs_list']//tr[1]")
    public WebElement firstRow;

    // A P P O I N T M E N T
    @FindBy(xpath = "//div[@id='costs_list']//tr[1]//i")
    public WebElement appointmentToolTip;    //getAttribute - data-tooltip = 18-12-2023 04:06 pm - Test Appointment Automation

}