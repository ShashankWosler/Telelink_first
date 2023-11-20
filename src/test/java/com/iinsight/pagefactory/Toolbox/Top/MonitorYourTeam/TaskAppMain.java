package com.iinsight.pagefactory.Toolbox.Top.MonitorYourTeam;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskAppMain extends GenericWrappers {
    @FindBy(id="header_team_todo")
    public WebElement headerTeam;
    @FindBy(id="header_team_leader_reminder")
    public WebElement messagesBtn;
    @FindBy(id="header_team_tasks")
    public WebElement teamTaskButton;
    @FindBy(id="header_team_hist")
    public WebElement completedTaskButton;

}
