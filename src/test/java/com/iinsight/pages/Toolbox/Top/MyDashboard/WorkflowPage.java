package com.iinsight.pages.Toolbox.Top.MyDashboard;

import com.iinsight.pagefactory.Toolbox.Top.MyDashboard.Workflow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkflowPage extends Workflow {
    public WorkflowPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isWorkflowTabVisible(){return isElementDisplayed(workflowTab);}
    public boolean isMessagesTabVisible(){return isElementDisplayed(messagesTab);}
    public boolean isHeaderTabVisible(){return isElementDisplayed(headerTab);}
    public boolean isTaskAppointmentsTabVisible(){return isElementDisplayed(taskAppointmentsTab);}
    public void clickWorkflowTab(){clickButtonWithOutScroll(workflowTab);}
    public void clickMessagesTab(){clickButtonWithOutScroll(messagesTab);}
    public void clickHeaderTab(){clickButtonWithOutScroll(headerTab);}
    public void clickTaskAppointmentsTab(){clickButtonWithOutScroll(taskAppointmentsTab);}

}
