package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskMain extends GenericWrappers {
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
    @FindBy(xpath="//td[@id='name_column'][1]")
    public WebElement firstTitleOfTable;    //getAttribute "title"
}
