package com.iinsight.pagefactory.Toolbox.Top.MyDashboard;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Workflow extends GenericWrappers {
    @FindBy(id="header_workflow")
    public WebElement workflowTab;
    @FindBy(id="header_messages")
    public WebElement messagesTab;
    @FindBy(id="header_report")
    public WebElement headerTab;
    @FindBy(id="header_TasksApp")
    public WebElement taskAppointmentsTab;

}
