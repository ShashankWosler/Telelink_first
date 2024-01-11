package com.iinsight.pagefactory.Toolbox.Side.TimeSheets;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityDetail extends GenericWrappers {
    @FindBy(xpath="//div[@id='_tab_level2a_form']/div[2]")
    public WebElement detailsTab;
    @FindBy(id="_tab_level2b_form_b")
    public WebElement employeeExpenseTab;

    /**  D E T A I L S __ T A B**/
    @FindBy(id="_tab_level2b_form_b")
    public WebElement employeeExpenseTb;
    @FindBy(css="button#time_sheet_edit_1:nth-child(2)")
    public WebElement saveAsDraftButton;
    @FindBy(css="button#time_sheet_edit_1:nth-child(1)")
    public WebElement submitButton;
    @FindBy(css="[id='costs.case']")
    public WebElement caseText;     //getAttribute "value" - Mr test (NAT2799)
    @FindBy(css="[id='costs.role']")
    public WebElement roleInput;    //getAttribute "value" - Mr test (NAT2799)
    @FindBy(css="[name='costs.role_button']")
    public WebElement roleDropDown;
    @FindBy(css="[id='costs.categories.body']")
    public WebElement serviceContract;  // Tag - Select
    @FindBy(css="[id='costs.billings.body']")
    public WebElement billing;      // Tag - Select
    @FindBy(css="[id='costs.description']")
    public WebElement descriptionInput;         // getAttribute "value"
    @FindBy(css="[id='costs.charge_code']")
    public WebElement codeInput;                // getAttribute "value"
    @FindBy(css="[id='costs.details']")
    public WebElement detailsInput;
    @FindBy(css="[name='estimate']")
    public WebElement linkedPlanCheckBox;
    @FindBy(css="[id='costs.kilometres']")
    public WebElement kilometresInput;
    @FindBy(id="radio_duration")
    public WebElement durationRadioButton;
    @FindBy(id="radio_units")
    public WebElement unitRadioButton;
    @FindBy(id="timeslot")
    public WebElement durationInput;        // getAttribute "value" - 02:00
    @FindBy(css="[id='costs.unit_charge']")
    public WebElement durationRateInput;    // getAttribute "value" - 40.00
    @FindBy(id="sub_total")
    public WebElement subTotalText;         //getAttribute "value"
    @FindBy(id="left")
    public WebElement durationLeftInput;    // getAttribute "value" 00:00
    @FindBy(css="[name='apply_gst']")
    public WebElement applyVatCheckBox;     //ByDefault Checked
    @FindBy(css="[id='costs.tax_amount']")
    public WebElement vatAmountText;        //getAttribute "value" 8.00
    @FindBy(id="total_remaining")
    public WebElement totalRemainingInput;
    @FindBy(css="[id='costs.total_charge']")
    public WebElement totalText;        //getAttribute "value" - 88.00
    @FindBy(css="[id='costs.reference_date']")
    public WebElement dueDateInput;     //getAttribute "value" -
    @FindBy(css="[name='costs.reference_date_button']")
    public WebElement dueDateDropDown;
    @FindBy(css="[id='costs.reference_time']")
    public WebElement timeInput;        // getAttribute "value" - 04:01 pm
    @FindBy(css="[id='users.name']")
    public WebElement employeeText;     //getAttribute "value"
    @FindBy(css="[id='costs.team']")
    public WebElement teamInput;        //getAttribute "value"
    @FindBy(css="[name='costs.team_button']")
    public WebElement teamDropDown;
    @FindBy(id="template_title_ts")
    public WebElement noteInput;
    @FindBy(css="[name='template_title_ts_button']")
    public WebElement noteDropDown;
}
