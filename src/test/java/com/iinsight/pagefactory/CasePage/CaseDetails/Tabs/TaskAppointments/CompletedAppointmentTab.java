package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletedAppointmentTab extends GenericWrappers {
    @FindBy(css="input#hist_app_task_search_text")
    public WebElement searchInput;
    @FindBy(css="[name='hist_app_task_button']")
    public WebElement byDropDown;
    @FindBy(id="hist_app_task_find")
    public WebElement findButton;
    @FindBy(id="small_fields_view_hist_app_task")
    public WebElement fieldEditButton;
    @FindBy(xpath="//div[@id='hist_app_task']//tr[1]//td[2]")
    public WebElement getTitleOfFirstRow;

}
