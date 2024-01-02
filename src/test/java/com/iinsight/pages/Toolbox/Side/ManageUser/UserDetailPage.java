package com.iinsight.pages.Toolbox.Side.ManageUser;

import com.iinsight.pagefactory.Toolbox.Side.SideMain;
import org.openqa.selenium.support.PageFactory;

public class UserDetailPage extends SideMain {
    public UserDetailPage(){PageFactory.initElements(getDriver(), this);
    }

    public void clickOnAppointmentOption(){
        clickButtonWithOutScroll(appointment);
    }
}
