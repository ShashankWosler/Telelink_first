package com.iinsight.pages.Toolbox.Top.MonitorYourTeam;

import com.iinsight.pagefactory.Toolbox.Top.MonitorYourTeam.TaskAppMain;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskAppMainPage extends TaskAppMain {
    public TaskAppMainPage(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id="header_team_todo")
    public WebElement headerTeam;
    @FindBy(id="header_team_leader_reminder")
    public WebElement messagesBtn;
    @FindBy(id="header_team_tasks")
    public WebElement teamTaskButton;
    @FindBy(id="header_team_hist")
    public WebElement completedTaskButton;

}
