package com.iinsight.pagefactory.Toolbox.Side;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentSideMain extends GenericWrappers {
    public AppointmentSideMain(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(css="img[name='app_employees_button']")
    public WebElement selectEmployee;
    @FindBy(id="selects_none")
    public WebElement noneOption;
    @FindBy(css="div[class='b-sch-event-content']")
    public WebElement appointmentCalender;
}
