package com.iinsight.pagefactory.Toolbox.Top.MyDashboard;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskAppointments extends GenericWrappers {
    @FindBy(id="new_task_message")
    public WebElement newTaskBtn;
    @FindBy(id="new_app_message")
    public WebElement newAppointmentsBtn;
    @FindBy(id="edit_task_app_message")
    public WebElement editBtn;
    @FindBy(id="del_task_app_message")
    public WebElement taskAppDeleteBtn;
    @FindBy(id="exp_task_app_message")
    public WebElement exportBtn;
    @FindBy(id="input#task_appo_dash_search_text")
    public WebElement searchTab;
    @FindBy(id="header_my_tasks")
    public WebElement myTaskAppBtn;
    @FindBy(id="header_history")
    public WebElement completedTaskAppBtn;
    @FindBy(id="task_appo_dash_search_field")
    public WebElement assignDropDown;
    @FindBy(id="task_appo_dash_find")
    public WebElement findBtn;
    @FindBy(id="small_fields_view_task_appo_dash")
    public WebElement fieldsEditBtn;
    @FindBy(css="div#task_appo_dash tr:nth-child(1) td#assigned_to_column")
    public WebElement assignToColumn;
}
