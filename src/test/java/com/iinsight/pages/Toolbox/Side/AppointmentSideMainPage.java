package com.iinsight.pages.Toolbox.Side;

import com.iinsight.pagefactory.Toolbox.Side.AppointmentSideMain;
import com.iinsight.pagefactory.Toolbox.Side.SideMain;
import org.openqa.selenium.support.PageFactory;

public class AppointmentSideMainPage extends AppointmentSideMain {
    public AppointmentSideMainPage(){PageFactory.initElements(getDriver(), this);
    }

    public void selectEmployee() {
        clickButtonWithOutScroll(selectEmployee);
        waitElementToBeClickable(noneOption);
        clickButtonWithOutScroll(noneOption);
        selectDropDownFromText("Web Automation");
    }
}
