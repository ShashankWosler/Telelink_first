package com.iinsight.pagefactory.Toolbox.Side.Reports;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsListing extends GenericWrappers {

    // L I S T I N G
    @FindBy(css="[title='Employees Performance / KPI Reports']")
    public WebElement kpiReports;
    @FindBy(css = "[title='Billings by Case']")
    public WebElement kpiByCase;
    @FindBy(css = "[title='Billings by Employee']")
    public WebElement kpiByEmployee;
    @FindBy(css="[title='Billings by Employee (Grouped)']")
    public WebElement byEmployeeGrouped;

    // F I L T E R S
    @FindBy(css="div[class='tab-label form_text row-fluid']")
    public WebElement filterHeader;     //getText - To Get Value of Report Type: Billing By Case, Billing By Employee

    // P R O F I L E
    @FindBy(id="report_profile")
    public WebElement profileInput;
    @FindBy(css="[name='report_profile_button']")
    public WebElement profileDropDown;
    @FindBy(id="report_profile_0")
    public WebElement profileLoadButton;
    @FindBy(id="report_profile_1")
    public WebElement profileSaveButton;
    @FindBy(id="report_profile_2")
    public WebElement profileDefaultButton;
    @FindBy(id="report_profile_3")
    public WebElement profileDeleteButton;

    //  S E L E C T E D     E M P L O Y E E
    @FindBy(css="#employees_list div")
    public WebElement selectedEmployeeText;
    @FindBy(css = "div#employees_list div")
    public WebElement selectedEmployee;
    @FindBy(id="employeelist")
    public WebElement employeeInput;
    @FindBy(css="[name='employeelist_button']")
    public WebElement employeeDropDown;
    @FindBy(id="report_byemployee_1")
    public WebElement employeeClear;
    @FindBy(id="report_byemployee_2")
    public WebElement employeeRemove;
    @FindBy(id="report_byemployee_3")
    public WebElement employeeSort;
    @FindBy(css="[name='employee_all1']")
    public WebElement employeeAllCheckBox;

    // S E L E C T E D      T E A M S
    @FindBy(id="teamslist")
    public WebElement teamInput;
    @FindBy(css="[name='teamslist_button']")
    public WebElement teamDropDown;
    @FindBy(id="report_byteams_1")
    public WebElement teamClearButton;
    @FindBy(id="report_byteams_2")
    public WebElement teamRemoveButton;
    @FindBy(id="report_byteams_3")
    public WebElement teamsortButton;
    @FindBy(id="report_byteams_4")
    public WebElement teamEditButton;
    @FindBy(id="teams_all1")
    public WebElement teamAllCheckBox;

    // S E L E C T E D      B I L L     T O
    @FindBy(id="companylist")
    public WebElement billToInput;
    @FindBy(css="[name='companylist_button']")
    public WebElement billToDropDown;
    @FindBy(id="report_byemployee_1")
    public WebElement billToClear;
    @FindBy(id="report_byemployee_2")
    public WebElement billToRemove;
    @FindBy(id="report_byemployee_3")
    public WebElement billToSort;
    @FindBy(id="company_all1")
    public WebElement billToAllCheckBox;

    // D A T E S    R A N G E
    @FindBy(id="dates")
    public WebElement dateInput;
    @FindBy(css="[name='dates_button']")
    public WebElement dateDropDown;
    @FindBy(id="datefrom")
    public WebElement dateFromInput;
    @FindBy(css="[name='datefrom_button']")
    public WebElement dateFromDropDown;
    @FindBy(id="dateto")
    public WebElement dateToInput;
    @FindBy(css="[name='dateto_button']")
    public WebElement dateToDropDown;

    //  CHARGE CODE TYPE
    @FindBy(id="charge_code_type")
    public WebElement codeInput;
    @FindBy(css="[name='charge_code_type_button']")
    public WebElement codeDropDown;

    // BUSINESS DIVISION
    @FindBy(id="company")
    public WebElement busDivInput;
    @FindBy(css="[name='company_button']")
    public WebElement busDivDropDown;

    // C O M M O N
    @FindBy(id="selects_all")
    public WebElement filterSelectAll;
    @FindBy(id="selects_none")
    public WebElement filterSelectNone;
    @FindBy(id="selects_invert")
    public WebElement filterSelectInvert;
    @FindBy(css="div#selects span")
    public WebElement filterCrossButton;

    // SERVICE CONTRACT
    @FindBy(id="category")
    public WebElement serviceInput;
    @FindBy(css="[name='category_button']")
    public WebElement serviceDropDown;

    // BUILD & EXPORT BUTTON
    @FindBy(css="div.tab_button_area button")
    public WebElement exportButton;

}