package com.iinsight.pages.Toolbox.Side;

import com.iinsight.pagefactory.Toolbox.Side.SideMain;
import org.openqa.selenium.support.PageFactory;

public class SideMainPage extends SideMain {
    public SideMainPage(){PageFactory.initElements(getDriver(), this);
    }

    public void clickOnAppointmentOption(){
        clickButtonWithOutScroll(appointment);
    }
}
