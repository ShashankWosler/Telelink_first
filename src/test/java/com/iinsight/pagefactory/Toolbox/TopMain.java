package com.iinsight.pagefactory.Toolbox;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMain extends GenericWrappers {
    @FindBy(css="div.open")
    public WebElement openSideBar;
    @FindBy(id="iinsight-logo")
    public WebElement logo;
    @FindBy(id="main_welcome_sp")
    public WebElement userName;
    @FindBy(id="btn_new_mneu")
    public WebElement menuIcon;
    @FindBy(css=".nav.nav-pills li:nth-child(1)")
    public WebElement workflow_task;
    @FindBy(css=".nav.nav-pills li:nth-child(3)")
    public WebElement downloads_report;
    @FindBy(css=".nav.nav-pills li:nth-child(2)")
    public WebElement messenger_center;
    @FindBy(css=".nav.nav-pills li:nth-child(2)")
    public WebElement task_appointments;
    @FindBy(css="[toolbar_name='Options']")
    public WebElement options_btn;
    @FindBy(css="[toolbar_name='Help']")
    public WebElement help_btn;
    @FindBy(css="[toolbar_name='Logout']")
    public WebElement logout_btn;


}
