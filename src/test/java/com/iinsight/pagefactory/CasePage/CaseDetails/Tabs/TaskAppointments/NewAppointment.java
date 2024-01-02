package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(id = "employeelist")
    public WebElement selectedEmployeeField;
    @FindBy(id = "employeelist")
    public WebElement employeeInputTab;
    @FindBy(xpath="//button[@class='btn btn-form' and text()='Clear']")
    public WebElement addAppClearButton;
    @FindBy(xpath="//button[@class='btn btn-form' and text()='Remove']")
    public WebElement addAppRemoveButton;
    @FindBy(xpath="//button[@class='btn btn-form' and text()='Sort']")
    public WebElement addAppSortButton;
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
    @FindBy(css="[name='office_location.list_id.button']")
    public WebElement officeLocationDropDown;
    @FindBy(className = "ql-editor.ql-blank")
    public WebElement descriptionInput;

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
    @FindBy(id="calendar_new_cancel")
    public WebElement cancelButton;

    // S A V E       B U T T O N       P O P - U P
    @FindBy(xpath="//div[text()='Add value to list']")
    public WebElement addValuePopUpVisible;
    @FindBy(id="list_check_ask4_1")
    public WebElement YesButtonAddValuePopUp;
    @FindBy(id="list_check_ask4_2")
    public WebElement NoButtonAddValuePopUp;
    @FindBy(id="list_check_ask4_3")
    public WebElement CancelButtonAddValuePopUp;

    // E D I T       P O P - U P

    // A D D       A P P O I N T M E N T
    @FindBy(id="appointment_id")
    public WebElement appointmentIDText;
    @FindBy(css="[id='appointment_category.list_id']")
    public WebElement categoryInput;
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

    // S A V E       B U T T O N S
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

}
