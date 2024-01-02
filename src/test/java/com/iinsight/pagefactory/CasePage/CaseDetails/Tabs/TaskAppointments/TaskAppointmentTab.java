package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskAppointmentTab extends GenericWrappers {
    @FindBy(css="input#task_appoinment_search_text")
    public WebElement searchInput;
    @FindBy(css="[name='task_appoinment_button']")
    public WebElement byDropDown;
    @FindBy(id="task_appoinment_find")
    public WebElement findButton;
    @FindBy(id="small_fields_view_task_appoinment")
    public WebElement fieldEditButton;

}
