package com.iinsight.pagefactory.Toolbox.Side.TimeSheets;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TimeSheetsMain extends GenericWrappers {

    // H E A D E R S    B U T T O N S
    @FindBy(id="time_sheet_activity_new")
    public WebElement billingButton;
    @FindBy(id="time_sheet_group_billing")
    public WebElement groupBillingButton;
    @FindBy(id="time_sheet_expense_new")
    public WebElement internalExpenseButton;
    @FindBy(id="time_sheet_delete")
    public WebElement deleteButton;
    @FindBy(id="go_export")
    public WebElement exportButton;

    // D R O P D O W N S    T A B S
    // E M P L O Y E E      F I L T E R S       B U T T O N S
    @FindBy(css="[id='ts.user']")
    public WebElement employeeInput;    //getAttribute "value"
    @FindBy(css="[name='ts.user_button']")
    public WebElement employeeDropDown;
    @FindBy(id="selects_all")
    public WebElement employeeAllFilterButton;
    @FindBy(xpath="//div[@id='selects']/span")
    public WebElement employeeCancelButton;

    // M A I N      P A G E
    @FindBy(id="dates")
    public WebElement dateRangeInput;   //getAttribute "value"
    @FindBy(css="[name='dates_button']")
    public WebElement dateRangeDropDown;
    @FindBy(css="[id='ts.datefrom']")
    public WebElement fromInput;    //getAttribute "value" - DD-MM-YYYY
    @FindBy(css="[name='ts.datefrom_button']")
    public WebElement fromDropDown;
    @FindBy(css="[id='ts.date']")
    public WebElement toDateInput;
    @FindBy(css="[name='ts.date_button']")
    public WebElement toDateDropDown;

    // TOTAL OF ACTIVITY
    @FindBy(css="[id='ts.total_time']")
    public WebElement activityTimeInput;
    @FindBy(css="[id='ts.total_charge']")
    public WebElement activityChargeInput;
    @FindBy(css="[id='ts2.total_time']")
    public WebElement itemTotalNumberInput;
    @FindBy(css="[id='ts2.total_charge']")
    public WebElement itemChargeInput;
    @FindBy(css="[id='ts.total_employee_expense_']")
    public WebElement totalBillingInput;

    // TOTAL EMPLOYEE DURATION
    @FindBy(css="[id='ts.total_employee_durn']")
    public WebElement employeeDurationInput;
    @FindBy(css="[id='ts.total_employee_charge']")
    public WebElement employeeDurationChargeInput;
    @FindBy(css="[id='ts.total_employee_items']")
    public WebElement employeeItemsInput;
    @FindBy(css="[id='ts.total_employee_items_charge']")
    public WebElement employeeInputChargeInput;
    @FindBy(css="[id='ts.total_employee_expenses_totals']")
    public WebElement employeeTotalExpenseInput;

    // LISTING
    @FindBy(id="table-search-icon")
    public WebElement searchButton;
    @FindBy(css="[id='Fields View']")
    public WebElement fieldEditButton;
    @FindBy(id="cost_type")
    public WebElement costTypeInput;    //getAttribute "value"
    @FindBy(css="[name='cost_type_button']")
    public WebElement costTypeDropDown;
    @FindBy(css="[name='chk_internal_expenses']")
    public WebElement includeInternalExpenseCheckBox;
    @FindBy(css="div#time_sheet")
    public WebElement tableListing;     // isElementDisplayed
    @FindBy(xpath="//div[@id='time_sheet']//tr/td[2]")
    public WebElement tableCaseNumber;      //getAttribute "title"
    @FindBy(xpath="//div[@id='time_sheet']//tr/td[6]")
    public WebElement tableCharge;      //getAttribute "title" - R88,00
    @FindBy(xpath="//div[@id='time_sheet']//tr//td[position() mod 32 = 6]")
    public List<WebElement> getAmounts;

    // S E A R C H      S I D E     B A R
    @FindBy(css="div#time_sheet-table-vertical-search-area")
    public WebElement sideBar;      //isElementDisplayed
    @FindBy(css="input#time_sheet_search_text")
    public WebElement sideBarInput;     //getAttribute "value" : sendKeys
    @FindBy(css="[name='time_sheet_button']")
    public WebElement byDropDown;
    @FindBy(id="time_sheet_search_field")
    public WebElement byInput;  //getAttribute "value" :
    @FindBy(id="time_sheet_find")
    public WebElement sideBarSearchButton;

    @FindBy(css="[class='fa fa-lg fa-times right']")
    public WebElement cancelButton;
    @FindBy(css="span#time_sheet_search_icon")
    public WebElement backButton;
}
