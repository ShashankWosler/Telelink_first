package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PlanNew extends GenericWrappers {
    // New Plan Bases on Existing Based Template
    @FindBy(name="[name='estimate_summary.yes']")
    public WebElement YesCheckBox;
    @FindBy(name="[name='estimate_summary.no']")
    public WebElement NoCheckBox;
    @FindBy(css="[name='estimate_summary_template_button']")
    public WebElement selectTemplateDropDown;

    // Select Plan Type For Billing
    @FindBy(css="[name='type_of_plan_1_button']")
    public WebElement selectPlanDropDown1;
    @FindBy(css="[name='type_of_plan_2_button']")
    public WebElement selectPlanDropDown2;

    // D E T A I L S
    @FindBy(css="input[id='estimate_summary.title']")
    public WebElement titleInput;
    @FindBy(css="input[id='estimate_summary.plan_id']")
    public WebElement idInput;      // GetAttribute Value
    @FindBy(css="textarea[id='estimate_summary.notes']")
    public WebElement caseNoteInput;

    // G O A L S
    @FindBy(css="[name='estimate_summary.goal_button']")
    public WebElement employmentGoalDropDown;
    @FindBy(css="[name='estimate_summary.capacity_goal_button']")
    public WebElement workCapacityGoalDropDown;
    @FindBy(css="[name='workActivityGoalDropDown']")
    public WebElement workActivityGoalDropDown;

    // D A T E      R A N G E
    @FindBy(css="input[id='estimate_summary.start_date']")
    public WebElement startDate;
    @FindBy(css="input[id='estimate_summary.finish_date']")
    public WebElement finishDate;

    // P L A N      I S
    @FindBy(css="img[name='estimate_summary.is_draft']")
    public WebElement DraftCheckbox;
    @FindBy(css="img[name='estimate_summary.is_inactive']")
    public WebElement ScheduledCheckbox;
    @FindBy(css="img[name='estimate_summary.is_closed']")
    public WebElement ClosedCheckbox;
    @FindBy(css="img[name='estimate_summary.is_current']")
    public WebElement CurrentCheckbox;
    @FindBy(css="img[name='estimate_summary.auto_current']")
    public WebElement AutoActiveCheckBox;

    // L O C A T I O N
    @FindBy(css="img[name='estimate_summary.office_department_id_button']")
    public WebElement locationDropDown;

    // P L A N      T O T A L    V A L U E
    @FindBy(id="total_plans_total")
    public WebElement planTotalValue;   // GetAttribute By data-real_value : Only number 123
    @FindBy(id="total_plans_todate_total")
    public WebElement planTotalCostToDate;  // GetAttribute By value : R0.00
    @FindBy(id="amount_remaining_total")
    public WebElement amountRemaining;   // GetAttribute By data-real_value : Only number 123

    // F I L T E R
    @FindBy(css="input#estimate_edit_list_search_text")
    public WebElement searchInput;
    @FindBy(css="[name='estimate_edit_list_button']")
    public WebElement byDropDown;
    @FindBy(xpath="(//div[@class='table-search-bar']//child::button)[1]")
    public WebElement findButton;
    @FindBy(xpath="(//div[@class='table-search-bar']//child::button)[3]")
    public WebElement fieldEditButton;

    // Estimate Edit Table
    @FindBy(xpath="//button[contains(@class,'select_all')]")
    public List<WebElement> selectAllButtons;   //Same Locator For UnSelect
    @FindBy(className = "all_activity_item_total_")
    public List<WebElement> editAmountCheckBoxes;
    @FindBy(xpath="//label[@class='exgst_labels']/following-sibling::input[position() mod 2 = 1]")
    public List<WebElement> amountsInput;
    @FindBy(xpath="//td[@id='activity_item_column' and contains(text(), 'TestAutoItem')]//parent::tr/td[1]")
    public WebElement greenCheckBox;
    @FindBy(xpath="//td[@id='activity_item_column' and contains(text(), 'TestAutoItem')]//parent::tr/td[6]/input")
    public WebElement greenCheckBoxAmount;
    @FindBy(xpath="//td[@id='activity_item_column' and contains(text(), 'TestAutoActivity')]//parent::tr/td[1]")
    public WebElement blueCheckBox;
    @FindBy(xpath="//td[@id='activity_item_column' and contains(text(), 'TestAutoActivity')]//parent::tr/td[6]/input")
    public WebElement blueCheckBoxAmount;
    @FindBy(xpath="//img[contains(@src,'green')]//ancestor::tr[1]/td[1]")
    public WebElement greenCheckBoxFirstIndex;      //Catch
    @FindBy(xpath="//img[contains(@src,'green')]//ancestor::tr[1]/td[6]/input")
    public WebElement greenCheckBoxAmountFirstIndex;    // Catch
    @FindBy(xpath="(//img[contains(@src,'blue')]//ancestor::tr[1]/td[1])[1]")
    public WebElement blueCheckBoxFirstIndex;       //Catch
    @FindBy(xpath="(//img[contains(@src,'blue')]//ancestor::tr[1]/td[6]/input)[1]")
    public WebElement blueCheckBoxAmountFirstIndex;     //Catch
    @FindBy(xpath="//td[contains(text(),'TestAutoActivity')]//preceding::button[position() mod 2=1][2]")
    public WebElement blueCheckBoxSelectAllButton;      // Catch - TestAutoActivity (SelectAll Button)

    // CHARGE CODE BASED PLAN
    @FindBy(xpath="//label[contains(text(),'Charge code')]")
    public WebElement chargeCodeText;
    @FindBy(xpath="//label[contains(text(),'CTP402')]")
    public WebElement testActivityText;
    @FindBy(xpath="//label[contains(text(),'CTP503')]")
    public WebElement testItemText;

    // S A V E      B U T T O N
    @FindBy(id="addinvoice_3_next")
    public WebElement saveButton;
    @FindBy(className = "btn.btn-default.btn-cancel")
    public WebElement cancelButton;

    // C U R R E N T    P L A N     P O P   U P
    @FindBy(css="div#level4_form button:nth-child(1)")
    public WebElement currentPlanSaveButton;
    @FindBy(css="div#level4_form button:nth-child(2)")
    public WebElement currentPlanCancelButton;
    @FindBy(id="radio_concurrent")
    public WebElement concurentRadioButton;
    @FindBy(id="radio_current")
    public WebElement curentRadioButton;




}
