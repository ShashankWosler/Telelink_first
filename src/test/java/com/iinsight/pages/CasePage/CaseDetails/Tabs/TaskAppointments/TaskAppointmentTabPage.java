package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.TaskAppointmentTab;
import org.openqa.selenium.support.PageFactory;

public class TaskAppointmentTabPage extends TaskAppointmentTab {
    public TaskAppointmentTabPage(){
        PageFactory.initElements(getDriver(), this);
    }


}
