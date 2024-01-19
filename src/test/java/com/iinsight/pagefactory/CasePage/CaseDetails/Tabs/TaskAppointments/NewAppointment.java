package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewAppointment extends GenericWrappers {
    @FindBy(xpath="//div[text()='New Appointment Entry']")
    public WebElement newAppointmentPopUp;

    // A D D       A P P O I N T M E N T
    @FindBy(name = "appointment_name_button")
    public WebElement titleDropDown;
    @FindBy(id="appointment_name")
    public WebElement titleInput;
    @FindBy(id="appointment_start_date")
    public WebElement fromDateInputTab;
    @FindBy(name="appointment_start_date_button")
    public WebElement fromDateDropDown;
    @FindBy(id="appointment_finish_date")
    public WebElement toDateInputTab;
    @FindBy(name="appointment_finish_date_button")
    public WebElement toDateDropDown;
    @FindBy(id="appointment_finish_time")
    public WebElement endTime;
    @FindBy(id="appointment_start_time")
    public WebElement startTime;
    @FindBy(css="[name='appointment.time_zone_button']")
    public WebElement timeZone;
    @FindBy(css="img[name='can_overlap']")
    public WebElement allowOverlapCheckBox;
    @FindBy(css="img[name='all_day_event']")
    public WebElement allDayEventCheckBox;
    @FindBy(css="img[name='is_recurrence']")
    public WebElement recurrenceCheckBox;
    @FindBy(css = "div#employees_list div")
    public WebElement selectedEmployee;
    @FindBy(css="#employees_list div")
    public WebElement selectedEmployeeText;
    @FindBy(id = "employeelist")
    public WebElement employeeInputTab;
    @FindBy(css="[name='employeelist_button']")
    public WebElement employeeDropDownButton;
    @FindBy(xpath="//button[@class='btn btn-form' and text()='Clear']")
    public WebElement addAppClearButton;
    @FindBy(xpath="//button[@class='btn btn-form' and text()='Remove']")
    public WebElement addAppRemoveButton;
    @FindBy(xpath="//button[@class='btn btn-form' and text()='Sort']")
    public WebElement addAppSortButton;
    @FindBy(xpath="//div[@id='drop_down_multiselect']/child::div[last()]")
    public WebElement SelectClientNameFromDropDown;
    @FindBy(css="[id='appointment_category.list_id']")
    public WebElement categoryInput;
    @FindBy(css="[name='appointment_category.list_id.button']")
    public WebElement categoryDropDown;
    @FindBy(css="[name='appointment_state.list_id.button']")
    public WebElement statusDropDown;
    @FindBy(css="img[name='include_closed_cases']")
    public WebElement includeClosedCaseCheckBox;
    @FindBy(css="input#appointment_client")
    public WebElement getClientName;
    @FindBy(css="[name='meeting_url_type_zoom']")
    public WebElement zoomMeetCheckBox;
    @FindBy(css="[name='meeting_url_type_team']")
    public WebElement teamMeetCheckBox;
    @FindBy(css="[id='office_location.list_id']")
    public WebElement officeLocationInput;
    @FindBy(css="[name='office_location.list_id.button']")
    public WebElement officeLocationDropDown;
    @FindBy(css="[id='appointment.location_id']")
    public WebElement addressInput;
    @FindBy(className = "ql-editor.ql-blank")
    public WebElement descriptionInput;

    // G E T       R E S O U R C E S
    @FindBy(id="report_byemployee_4")
    public WebElement clearButton;

    // A S S O C I A T E       W I T H       A       B I L L I N G
    @FindBy(css="[name='users.name_button']")
    public WebElement employeeDropDown;
    @FindBy(css="[name='costs.team_button']")
    public WebElement teamDropDown;
    @FindBy(css="[name='costs.role_button']")
    public WebElement roleDropDown;
    @FindBy(css="[id='costs.billings.body']")
    public WebElement billingDropDown;      // Select By Visible Text
    @FindBy(css="[id='costs.details']")
    public WebElement detailsInputTab;
    @FindBy(css="[id='costs.description']")
    public WebElement descriptionInputTab;
    @FindBy(css="[id='costs.charge_code']")
    public WebElement codeInputTab;
    @FindBy(id="estimate")
    public WebElement linkedPlanCheckBox;
    @FindBy(id="total_owing")
    public WebElement totalOutstandingText;     //InnerText
    @FindBy(id="calendar_new_add")
    public WebElement saveButton;
    @FindBy(id="calendar_new_add_billing")
    public WebElement saveAddBillingButton;
    @FindBy(id="calendar_new_saveadd_case")
    public WebElement saveAddCaseButton;
    @FindBy(id="calendar_new_cancel")
    public WebElement cancelButton;
    @FindBy(xpath="//div[@class='warning_msg']")
    public WebElement errorMessage;

    // S A V E       B U T T O N       P O P - U P
    @FindBy(xpath="//div[text()='Add value to list']")
    public WebElement addValuePopUpVisible;
    @FindBy(id="list_check_ask4_1")
    public WebElement YesButtonAddValuePopUp;
    @FindBy(id="list_check_ask4_2")
    public WebElement NoButtonAddValuePopUp;
    @FindBy(id="list_check_ask4_3")
    public WebElement CancelButtonAddValuePopUp;
    @FindBy(css="div.warning_msg")
    public WebElement getRecurrenceOverlapError;

    // E D I T       P O P - U P

    // A D D       A P P O I N T M E N T
    @FindBy(id="appointment_id")
    public WebElement appointmentIDText;
    @FindBy(css="[id='appointment_state.list_id']")
    public WebElement statusInput;

    // E X I S T I N G       B I L L I N G S
    @FindBy(css="[name='appointment.cost_button']")
    public WebElement costDropDown;
    @FindBy(id="btn_appointment_link_new_cost")
    public WebElement linkButton;
    @FindBy(id="btn_appointment_cost_submit_or_draft")
    public WebElement submitDraftButton;
    @FindBy(id="btn_appointment_unlink_cost")
    public WebElement unlinkButton;

    //E D I T       R E C U R R E N T       L E V E L
    @FindBy(xpath="(//img[@name='iin_appt_current_event_flag'])[1]")
    public WebElement thisEventCheckBox;
    @FindBy(xpath="(//img[@name='iin_appt_following_events_flag'])[1]")
    public WebElement followingEventCheckBox;       //This and the following events
    @FindBy(xpath="(//img[@name='iin_appt_all_events_flag'])[1]")
    public WebElement allEventsCheckBox;             //All events in the entire series

    // E D I T      S A V E       B U T T O N S
    @FindBy(id="calendar_edit_add")
    public WebElement editSaveButton;
    @FindBy(id="calendar_edit_add_billing")
    public WebElement editSaveBillingButton;
    @FindBy(id="calendar_edit_delete")
    public WebElement editDeleteButton;
    @FindBy(id="calendar_edit_cancel")
    public WebElement editCancelButton;
    @FindBy(xpath="//div[@id='calendar_costs_list']//tr[1]//td[8]")
    public WebElement descriptionText;      // getAttributeValue - "title"

    // D E L E T E       P O P - U P
    @FindBy(xpath="//div[text()='Delete Appointment']")
    public WebElement deletePopUpVisible;
    @FindBy(id="contact_new_1")
    public WebElement deletePopUpOkButton;
    @FindBy(id="contact_new_2")
    public WebElement deletePopUpCancelButton;
    @FindBy(xpath="(//img[@name='iin_appt_current_event_flag'])[2]")
    public WebElement deleteThisEventCheckBox;
    @FindBy(xpath="(//img[@name='iin_appt_following_events_flag'])[2]")
    public WebElement deleteFollowingEventCheckBox;       //This and the following events
    @FindBy(xpath="(//img[@name='iin_appt_all_events_flag'])[2]")
    public WebElement deleteAllEventsCheckBox;             //All events in the entire series

    // R E C U R R E N C E      L O C A T O R S
    @FindBy(id="recurrence-html-b")
    public WebElement recurrenceFields;     //isElementDisplayed

    // Recurrence Pattem
    @FindBy(id="recurr_frequency_day")
    public WebElement recDayCheckBox;
    @FindBy(id="recurr_frequency_week")
    public WebElement recWeeklyCheckBox;
    @FindBy(id="recurr_frequency_month")
    public WebElement recMonthlyCheckBox;
    @FindBy(id="recurr_frequency_year")
    public WebElement recYearCheckBox;

    //Recurrence Pattem - Respective Fields
    /** DAY */
    @FindBy(css="img[name='recurr_every_day']")
    public WebElement recEveryDayCheckBox;      //recDayCheckBox
    @FindBy(css="input[id='recurr_every_day.value']")
    public WebElement recEveryDayInput;         //recDayCheckBox - attribute = "value"
    @FindBy(css="img[name='recurr_every_week']")
    public WebElement recEveryWeekCheckBox;     //recDayCheckBox

    /** WEEKLY*/
    @FindBy(id="recurr_every_week")
    public WebElement recWeeklyInput;           //recWeeklyCheckBox - attribute = "value"

    /**WEEKLY_CheckBox_Weeks_Name*/
    @FindBy(id="recurr_every_week_saturday")
    public WebElement recWeeklySaturday;        //recWeeklyCheckBox - attribute = "value" [0,1] [UnCheck, Check]
    @FindBy(id="recurr_every_week_sunday")
    public WebElement recWeeklySunday;
    @FindBy(id="recurr_every_week_monday")
    public WebElement recWeeklyMonday;
    @FindBy(id="recurr_every_week_tuesday")
    public WebElement recWeeklyTuesday;
    @FindBy(id="recurr_every_week_wednesday")
    public WebElement recWeeklyWednesday;
    @FindBy(id="recurr_every_week_thursday")
    public WebElement recWeeklyThursday;
    @FindBy(id="recurr_every_week_friday")
    public WebElement recWeeklyFriday;
    @FindBy(xpath="//img[contains(@id,'recurr_every_week')]")
    public List<WebElement> recWeeklys;

    /**MONTHLY*/
    @FindBy(id="recurr_month_option_1")
    public WebElement recMonthlyDayInput1;      //recMonthlyCheckBox - Day "recMonthlyDayInput1" - getAttribute "value"
    @FindBy(id="recurr_month_every_month")
    public WebElement recMonthlyEveryMonthInput;      //recMonthlyCheckBox - of every "recMonthlyEveryMonthInput" months
    @FindBy(id="recurr_month_option_2")
    public WebElement recMonthlyWeekCheckBox;       // text() - The CheckBox
    @FindBy(css="img[name='recurr_month_position_day.button']")
    public WebElement recMonthlyWeekNumberDropDown;
    @FindBy(id="recurr_month_position_day")
    public WebElement recMonthlyWeekNumberInput;
    @FindBy(id="recurr_month_select_day")
    public WebElement recMonthlyDayInput2;  // text() - Weekdays Name - Monday
    @FindBy(css="img[name='recurr_month_select_day.button']")
    public WebElement recMonthlyWeekDaysDropDown;
    @FindBy(id="recurr_month_every_month_option_2")
    public WebElement recMonthlyDayInput3;  //recMonthlyCheckBox - text() of evry "recMonthlyDayInput2" Month- getAttribute "value"

    /**YEARLY*/
    @FindBy(id="recurr_year_every")
    public WebElement recYearlyEveryInput;  //getAttribute - "value"
    @FindBy(css="img[name='recurr_year_option_1']")
    public WebElement recYearlyOnCheckBox;
    @FindBy(css="img[name='recurr_year_option_2']")
    public WebElement recYearlyOnTheCheckBox;
    @FindBy(css="[name='recurr_year_option_1_on_month.button']")
    public WebElement recYearlyMonthDropDown;
    @FindBy(css="[name='recurr_year_option_2_position_day.button']")
    public WebElement recYearlyWeekCountDropDown;
    @FindBy(css="[name='recurr_year_option_2_select_day.button']")
    public WebElement recYearlyWeekNameDropDown;
    @FindBy(css="[name='recurr_year_option_2_on_month.button']")
    public WebElement recYearlyMonthDropDown2;  //On The
    @FindBy(id="recurr_year_option_1_on")
    public WebElement recYearlyOnDateInput;
    @FindBy(id="recurr_year_option_1_on_month")
    public WebElement recYearlyMonthInput1;
    @FindBy(id="recurr_year_option_2_position_day")
    public WebElement recYearlyWeekCountInput;
    @FindBy(id="recurr_year_option_2_select_day")
    public WebElement recYearlyWeekNameInput;
    @FindBy(id="recurr_year_option_2_on_month")
    public WebElement recYearlyMonthInput2;     //On The

    /** R E C U R  R E N C E __ R A N G E*/
    @FindBy(css="img[name='recurr_end_after']")
    public WebElement endAfterCheckBox;
    @FindBy(css="img[name='recurr_end_by']")
    public WebElement endByCheckBox;
    @FindBy(id="recurrence_start_date")
    public WebElement startDate;    //getAttribute = "value" - DD-MM-YYYY
    @FindBy(id="recurr_end_after_nro")
    public WebElement recurrenceCountInput;
    @FindBy(id="recurrence_end_by_date")
    public WebElement endDateInput;     //getAttribute = "value" - MM-DD-YYY : getAttribute = "value" - DD-MM-YYYY
    @FindBy(xpath="//div[@id='recurrence-html-c']//button")
    public WebElement showAppointmentButton;

    // S H O W      A P P O I N T M E N T      S E R V I C E S
    @FindBy(xpath="//div[contains(text(),'Show Appointment Series')]")
    public WebElement showAppointmentVisible;
    @FindBy(xpath="//table[@id='table_appointment_series']//tbody/tr/td[position() mod 3=0]")
    public List<WebElement> showAppointmentDates;
    @FindBy(xpath="//table[@id='table_appointment_series']//tbody/tr/td[position() mod 4=0]")
    public List<WebElement> showAppointmentDays;
    @FindBy(id="check_day")
    public List<WebElement> showAppointmentCheckBoxes;
    @FindBy(id="level4_form_close")
    public WebElement showAppointmentCloseButton;

    // A P P O I N T M E N T    O U T   O F     H O U R S   P O P - U P
    @FindBy(xpath="//div[@title='Appointment out of hours']//button[1]")
    public WebElement closeButton;
    @FindBy(xpath="//div[@title='Appointment out of hours']//button[2]")
    public WebElement hoursPopUpSaveButton;

}
