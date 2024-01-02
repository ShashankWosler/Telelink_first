package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTaskPopUp extends GenericWrappers {
    @FindBy(xpath="//div[text()='Creating a new task']")
    public WebElement newTaskPopUpVisible;
    @FindBy(css="[name='tasks.task_title_button']")
    public WebElement titleDropDown;
    @FindBy(css="[id='tasks.assigned_to_dialog']")
    public WebElement assignToInput;
    @FindBy(css="[name='tasks.assigned_to_dialog_button']")
    public WebElement assignToDropDown;
    @FindBy(css="[id='tasks.created_by_dialog']")
    public WebElement createdByInput;
    @FindBy(css="[name='tasks.created_by_dialog_button']")
    public WebElement createdByDropDown;
    @FindBy(css="[id='tasks.task_due_date_dialog']")
    public WebElement dueDateInput;
    @FindBy(id="id_task_status")
    public WebElement statusDropDown;       //Select
    @FindBy(css="[id='tasks.task_priority_dialog']")
    public WebElement priorityDropDown;       //Select
    @FindBy(css="[name='tasks.case_number_dialog_button']")
    public WebElement caseDropDown;
    @FindBy(css="[id='tasks.case_number_dialog']")
    public WebElement caseInput;
    @FindBy(css="div[id='tasks.task_description_dialog']")
    public WebElement descriptionBox;
    @FindBy(id="case_reopen_1")
    public WebElement saveButton;
    @FindBy(id="case_reopen_2")
    public WebElement cancelButton;
    @FindBy(xpath="(//td[@id='name_column' and @title='Minor Task'])[1]//following-sibling::td[1]")
    public WebElement newEntryStatusFirstIndex;


}
