package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskMain extends GenericWrappers {
    // C O M M O N
    @FindBy(id="cases_todo_new")
    public WebElement addNewTaskButton;
    @FindBy(id="cases_app_new")
    public WebElement addNewAppointmentButton;
    @FindBy(id="cases_todo_edit")
    public WebElement editButton;      // Disable
    @FindBy(id="cases_todo_delete")
    public WebElement deleteButton;    // Disable
    @FindBy(id="cases_todo_export")
    public WebElement exportButton;
    @FindBy(id="header_tasks_appointments")
    public WebElement taskAppointmentTab;
    @FindBy(id="header_history")
    public WebElement completedTaskAppointmentTab;


    // C O M P L E T E D    A P P O I N T M E N T    T A B
    @FindBy(css="input#hist_app_task_search_text")
    public WebElement compSearchInput;
    @FindBy(css="[name='hist_app_task_button']")
    public WebElement compByDropDown;
    @FindBy(id="hist_app_task_find")
    public WebElement compFindButton;
    @FindBy(id="small_fields_view_hist_app_task")
    public WebElement compFieldEditButton;
    @FindBy(xpath="//div[@id='hist_app_task']//tr[1]//td[2]")
    public WebElement compGetTitleOfFirstRow;
    @FindBy(xpath="//div[@id='hist_app_task']//tr[1]")
    public WebElement compGetFirstRow;
    @FindBy(xpath="//div[@id='hist_app_task']//tr[1]//td[3]")
    public WebElement compGetStatusOfFirstRow;
    @FindBy(xpath="//div[@id='hist_app_task']//tr[1]//td[4]")
    public WebElement compGetDateOfFirstRow;
    @FindBy(xpath="//div[@id='hist_app_task']//tr[1]//td[5]")
    public WebElement compGetAssignToOfFirstRow;

    // T A S K    A P P O I N T M E N T    T A B
    @FindBy(css="input#task_appoinment_search_text")
    public WebElement taskSearchInput;
    @FindBy(css="[name='task_appoinment_button']")
    public WebElement taskByDropDown;
    @FindBy(id="task_appoinment_find")
    public WebElement taskFindButton;
    @FindBy(id="small_fields_view_task_appoinment")
    public WebElement taskFieldEditButton;
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[1]")
    public WebElement taskFirstTitleOfTable;    //getAttribute "title"
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]/td")
    public WebElement taskFirstOfTableEmptyRow;
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]")
    public WebElement taskFirstOfTable;
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[2]")
    public WebElement taskFirstStatusOfTable;    //getAttribute "title"
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[4]")
    public WebElement taskFirstDateOfTable;    //getAttribute "title"
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[5]")
    public WebElement taskFirstAssignToOfTable;    //getAttribute "title"
    @FindBy(xpath="(//td[@title='The search criteria provided have returned no results'])[1]")
    public WebElement emptyRowTaskAppointment;
    @FindBy(xpath="(//td[@title='The search criteria provided have returned no results'])[2]")
    public WebElement emptyRowCompletedAppointment;
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[7]")
    public WebElement EndTimeFirstRow;      //getAttribute - title="04:21 pm"
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[6]")
    public WebElement StartTimeFirstRow;      //getAttribute - title="04:21 pm"
    @FindBy(xpath="//div[@id='task_appoinment']//tr[1]//td[14]")
    public WebElement taskFirstAmountOfTable;  //getAttribute - value=R2&nbsp;200,00
    // R E C U R R E N C E
    @FindBy(xpath="//div[@id='task_appoinment']//tr")
    public List<WebElement> taskRows;

    // D E L E T E    P O P - U P
    @FindBy(xpath="//div[text()='Delete Task']")
    public WebElement deletePopUp;
    @FindBy(id="contact_new_1")
    public WebElement OkButtonDeletePopUp;
    @FindBy(id="contact_new_2")
    public WebElement CancelButtonDeletePopUp;
    @FindBy(id="delete_task_commentary")
    public WebElement DescriptionButtonDeletePopUp;


}
