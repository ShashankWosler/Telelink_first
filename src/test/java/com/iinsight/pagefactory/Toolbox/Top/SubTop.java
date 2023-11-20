package com.iinsight.pagefactory.Toolbox.Top;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubTop extends GenericWrappers {
    @FindBy(id="header_my_dashboard")
    public WebElement myDashBoardTab;
    @FindBy(id="header_recently_completed")
    public WebElement recentlyCompletedTab;
    @FindBy(id="header_monitor_your_team")
    public WebElement monitorYourTeamTab;
    @FindBy(id="header_my_overdue_accounts")
    public WebElement overdueTab;
    @FindBy(id="msg_ctr_close")
    public WebElement cancelModal;
}
