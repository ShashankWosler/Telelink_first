package com.iinsight.pagefactory.Toolbox.Side.TimeSheets;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterButtons extends GenericWrappers {

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
    @FindBy(css="[id='ts.user']")
    public WebElement employeeInput;    //getAttribute "value"
    @FindBy(css="[name='ts.user_button']")
    public WebElement employeeDropDown;
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
    public WebElement toalBillingInput;

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
}
