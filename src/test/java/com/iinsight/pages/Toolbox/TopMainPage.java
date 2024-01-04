package com.iinsight.pages.Toolbox;

import com.iinsight.pagefactory.Toolbox.TopMain;
import org.openqa.selenium.support.PageFactory;

public class TopMainPage extends TopMain {
    public TopMainPage(){PageFactory.initElements(getDriver(), this);
    }

    public void clickSideBarMenu(){clickButtonWithOutScroll(openSideBar);
    }
    public boolean isSideBarMenuVisible(){return isElementDisplayed(openSideBar);
    }
    public boolean isLogoVisible(){return isElementDisplayed(logo);
    }
    public void clickWorkflowTask(){clickButtonWithOutScroll(workflow_task);
    }
    public void clickDownloadsReport(){
        waitElementToBeClickable(downloads_report);
        clickButtonWithOutScroll(downloads_report);
    }
    public void clickMessengerCenter(){clickButtonWithOutScroll(messenger_center);
    }
    public void clickTaskAppointments(){clickButtonWithOutScroll(task_appointments);
    }
    public void clickOptionsButton(){clickButtonWithOutScroll(options_btn);
    }
    public void clickHelpButton(){clickButtonWithOutScroll(help_btn);
    }
    public void clickLogOutButton(){clickButtonWithOutScroll(logout_btn);
    }
}
