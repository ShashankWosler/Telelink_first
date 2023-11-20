package com.iinsight.pagefactory.Toolbox.Top.MonitorYourTeam;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamTask extends GenericWrappers {
    @FindBy(css="input#task_appo_team_search_text")
    public WebElement searchBtn;
    @FindBy(id="task_appo_team_search_field")
    public WebElement assignDropDown;
    @FindBy(id="task_appo_team_find")
    public WebElement findBtn;
    @FindBy(id="small_fields_view_task_appo_team")
    public WebElement fieldsEditBtn;
    @FindBy(id="new_task_team_message")
    public WebElement newTaskBtn;
    @FindBy(id="new_app_team_message")
    public WebElement newAppBtn;
    @FindBy(id="edit_task_app_team_message")
    public WebElement editBtn;
    @FindBy(id="del_task_app_team_message")
    public WebElement deleteBtn;
    @FindBy(id="exp_task_app_team_message")
    public WebElement exportBtn;


}
