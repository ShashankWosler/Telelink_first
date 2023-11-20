package com.iinsight.pagefactory.Toolbox.Top.MonitorYourTeam;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Messages extends GenericWrappers {
    @FindBy(id="select_teamleader")
    public WebElement selectAllBtn;
    @FindBy(css="div#tab_team_leader_reminder button:nth-child(3)")
    public WebElement markAsReadBtn;
    @FindBy(css="div#tab_team_leader_reminder button:nth-child(4)")
    public WebElement markAsUnreadBtn;
    @FindBy(css="div#tab_team_leader_reminder button:nth-child(5)")
    public WebElement deleteBtn;
    @FindBy(css="#case_notifications_t input")
    public WebElement firstCheckBox;
}
