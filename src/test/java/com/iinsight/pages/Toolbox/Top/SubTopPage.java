package com.iinsight.pages.Toolbox.Top;

import com.iinsight.pagefactory.Toolbox.Top.SubTop;
import org.openqa.selenium.support.PageFactory;

public class SubTopPage extends SubTop {
    public SubTopPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isMyDashBoardTabVisible(){return isElementDisplayed(myDashBoardTab);}
    public boolean isRecentlyCompletedTabVisible(){return isElementDisplayed(recentlyCompletedTab);}
    public boolean isMonitorYourTeamTabVisible(){return isElementDisplayed(monitorYourTeamTab);}
    public boolean isOverdueTabVisible(){return isElementDisplayed(overdueTab);}
    public boolean isCancelModalVisible(){return isElementDisplayed(cancelModal);}
    public void clickMyDashBoardTab(){clickButtonWithOutScroll(myDashBoardTab);}
    public void clickRecentlyCompletedTab(){clickButtonWithOutScroll(recentlyCompletedTab);}
    public void clickMonitorYourTeamTab(){clickButtonWithOutScroll(monitorYourTeamTab);}
    public void clickOverdueTab(){clickButtonWithOutScroll(overdueTab);}
    public void clickCancelModal(){clickButtonWithOutScroll(cancelModal);}

}
