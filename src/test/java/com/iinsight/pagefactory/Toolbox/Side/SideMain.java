package com.iinsight.pagefactory.Toolbox.Side;

import com.iinsight.utils.GenericWrappers;
import com.iinsight.pagefactory.CasePage.CaseListing.CaseListingMain;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMain extends GenericWrappers {
    public SideMain(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(id="accordion_caselist")
    public WebElement caseListSearch;
    @FindBy(css="div[toolbar_name='Timesheet'] div a")
    public WebElement timesheet;
    @FindBy(id="accordion_appointments")
    public WebElement appointment;

}
