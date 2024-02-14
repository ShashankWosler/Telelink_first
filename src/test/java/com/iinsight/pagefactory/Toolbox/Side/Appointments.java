package com.iinsight.pagefactory.Toolbox.Side;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Appointments extends GenericWrappers {
    // L I S T I N G
    @FindBy(xpath="(//span[@class='b-sch-clock-text'])[1]")
    public WebElement toolTip1Text;
    @FindBy(xpath="(//span[@class='b-sch-clock-text'])[2]")
    public WebElement toolTip2Text;
    @FindBy(css="div[data-task-feature='event']")
    public WebElement appointmentEvent;
    @FindBy(xpath="(//div[@data-task-feature='event'])[1]")
    public WebElement appointEvent1;
    @FindBy(xpath="(//div[@data-task-feature='event'])[2]")
    public WebElement appointEvent2;
    @FindBy(id="b-scheduler-1-normalSubgrid")
    public WebElement grid;

//    @FindBy(xpath="//div[@data-header-feature='headerRow1']/div")
//    public List<WebElement> TimeList;
//    @FindBy(xpath="(//div[@data-item-index='1'])[1]")
//    public WebElement elems;

    // C O M P A N Y        R E S O U R C E S
    @FindBy(css="div#resource_button_wrapper button")
    public WebElement CompanyNewButton;


    // T O P    W R A P P E R - Common
    @FindBy(css="div#appointment_button_wrapper button:nth-child(1)")
    public WebElement NewButton;
    @FindBy(id="export_appointent")
    public WebElement ExportButton;
    @FindBy(css="[id='calendar_events.filter']")
    public WebElement FilterInput;      //getAttribute - "value"    - [ All appointments, My appointments ]
    @FindBy(css="[name='calendar_events.filter_button']")
    public WebElement FilterDropDown;
    @FindBy(id="calendar_view")
    public WebElement CalenderInput;
    @FindBy(css="[name='calendar_view_button']")
    public WebElement CalenderDropDown;

    // D A T E      S E C T I O N
    @FindBy(id="appointments_top_label")
    public WebElement AppointmentDate;
    @FindBy(css="#prev_date span")
    public WebElement PreviousDate;
    @FindBy(css="#next_date span")
    public WebElement NextDate;
    @FindBy(id="b-resourceheader-1")
    public WebElement employeeName;

    // C A L E N D E R      T O P       R I G H T
    @FindBy(css="div#events_count span")
    public WebElement appointmentCounts;        //getText() - Same For Company Resources
    @FindBy(id="Today")
    public WebElement todayButton;
    @FindBy(id="reload_appointent")
    public WebElement reloadButton;
    @FindBy(xpath="(//button[@id='calendar_integrations_btn'])[1]")
    public WebElement shareButton;
    @FindBy(xpath="(//button[@id='calendar_integrations_btn'])[2]")
    public WebElement instructionButton;

    // F I L T E R      S E C T I O N       R I G H T       S I D E
    @FindBy(id="btn_appointment_resource")
    public WebElement resourceTab;
    @FindBy(id="btn_appointment_api")
    public WebElement appointmentsTab;

    // A P P O I N T M E N T        T A B
    @FindBy(css="[title='Zoom In']")
    public WebElement zoomInButton;
    @FindBy(id="zoom_out")
    public WebElement zoomOutButton;
    @FindBy(id="[id='Fields View']")
    public WebElement saveViewButton;
    @FindBy(css="[data-ref='nextMonth']")
    public WebElement nextMonthButton;
    @FindBy(css="[data-ref='nextYear']")
    public WebElement nextYearButton;

    /** D R O P D O W N*/

    //[ All Teams, None, Administration, HR Team, Safety Team, Test 1A Team, Test Team]
    @FindBy(id="b-fieldtrigger-6")
    public WebElement TeamDropDown;
    @FindBy(css="[name='app_employees_button']")
    public WebElement EmployeeDropDown;

    //[Cancelled, Completed, Confirmed, Deleted, No Show, Not Confirmed, Rescheduled]
    @FindBy(id="b-fieldtrigger-7")
    public WebElement StatusDropDown;

    //[Appointment, Internal meeting, Offsite Visit, Task]
    @FindBy(id="b-fieldtrigger-8")
    public WebElement CategoryDropDown;

    //[No Linked Billing, Draft, Billed, Invoiced, Part Paid, Fully Paid, Case Accounts Outstanding]
    @FindBy(id="b-fieldtrigger-9")
    public WebElement BillingStatusDropDown;
    @FindBy(id="remove-filter")
    public WebElement RemoveFilterDropDown;

    /** E M P L O Y E E      F U N C T I O N S */
    @FindBy(id="selects_all")
    public WebElement EmployeeSelectAll;
    @FindBy(id="selects_none")
    public WebElement EmployeeSelectNone;
    @FindBy(id="selects_invert")
    public WebElement EmployeeSelectInvert;
    @FindBy(css="div#selects span")
    public WebElement EmployeeCancelIcon;

    // C A L E N D E R
    @FindBy(id="b-readonlycombo-5-input")
    public WebElement SelectMonthDropDown;
    @FindBy(id="b-readonlycombo-6-input")
    public WebElement SelectYearDropDown;


    // C O M P A N Y     R E S O U R C E S
    @FindBy(id="b-fieldtrigger-20")
    public WebElement officeDropDown;

    // R I G H T    C L I C K       A P P O I N T M E N T       E V E N T
    @FindBy(xpath="//div[@role='menuitem' and @data-item-index='1']")
    public WebElement RightClickGoToCase;
    @FindBy(xpath="//div[@role='menuitem' and @data-item-index='2']")
    public WebElement RightClickGoToBilling;
    @FindBy(xpath="//div[@role='menuitem' and @data-item-index='3']")
    public WebElement RightClickEdit;
    @FindBy(xpath="//div[@role='menuitem' and @data-item-index='4']")
    public WebElement RightClickDelete;
    @FindBy(xpath="//div[@role='menuitem' and @data-item-index='5']")
    public WebElement RightClickAddToCalender;

    // D E L E T E      A P P O I N T M E N T       P O P - U P
    @FindBy(xpath="//div[text()='Delete Appointment']")
    public WebElement DeletePopUpVisible;
    @FindBy(id="contact_new_1")
    public WebElement OkButtonDeletePopUp;
    @FindBy(id="contact_new_2")
    public WebElement CancelButtonDeletePopUp;

    // R E C U R R E N T    L E V E L
    @FindBy(css="[name='iin_appt_current_event_flag']")
    public WebElement eventCheckBox;
    @FindBy(css="[name='iin_appt_following_events_flag']")
    public WebElement followingCheckBox;
    @FindBy(css="[name='iin_appt_all_events_flag']")
    public WebElement allEventsCheckBox;

    //  T I M E     C E L L S
    @FindBy(xpath="//div[contains(@class,'b-sch') and @data-tick-index='4']")
    public WebElement timeCells9AM;
    @FindBy(xpath="//div[contains(@class,'b-sch') and @data-tick-index='8']")
    public WebElement timeCells1PM;
    @FindBy(xpath="//div[contains(@class,'b-sch') and @data-tick-index='12']")
    public WebElement timeCells5PM;
    @FindBy(xpath="//div[contains(@class,'b-sch') and @data-tick-index='16']")
    public WebElement timeCells9PM;

    //  C A L E N D E R     T Y P E - A G E N D A
    @FindBy(xpath = "(//div[@class='b-cal-event'])[1]")
    public WebElement agendaAppointmentEvent1;
    @FindBy(xpath = "(//div[@class='b-cal-event'])[2]")
    public WebElement agendaAppointmentEvent2;
    @FindBy(xpath="(//div[contains(@class,'event-time')])[1]")
    public WebElement agendaTime1;              // [02:30 - 02:45]     [09:00 - 23:00]
    @FindBy(xpath="(//div[contains(@class,'event-time')])[2]")
    public WebElement agendaTime2;
    @FindBy(css="label[for='agenda_day']")
    public WebElement agendaDayRadio;
    @FindBy(css="label[for='agenda_week']")
    public WebElement agendaWeekRadio;
    @FindBy(css="label[for='agenda_year']")
    public WebElement agendaYearRadio;
    @FindBy(css="label[for='agenda_month']")
    public WebElement agendaMonthRadio;
    @FindBy(xpath="(//div[contains(@id,'-normalSubgrid')])[1]")
    public WebElement empltyEvents;
    @FindBy(css="div#b-calendar-2-event-tip")
    public WebElement agendaEventToolTip;
    @FindBy(id="b-tool-10")
    public WebElement agendaToolTipCancelButton;

    // R I G H T    C L I C K
    @FindBy(css="[data-ref='goToCase']")
    public WebElement agendaRightGotoCase;
    @FindBy(css="[data-ref='eventEdit']")
    public WebElement agendaRightEdit;
    @FindBy(css="[data-ref='eventDelete']")
    public WebElement agendaRightDelete;
    @FindBy(css="[data-ref='eventaddToCalendar']")
    public WebElement agendaRightCalender;

}
