package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.TaskMain;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.PageFactory;

public class TaskMainPage extends TaskMain {
    public TaskMainPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void clickOnNewTaskButton(){

            waitElementToBeClickable(addNewTaskButton);
            clickButtonWithOutScroll(addNewTaskButton);
            waitFor(1000);
        clickButtonWithOutScroll(addNewTaskButton);

    }
    public void clickOnNewAppointmentButton(){
        clickButtonWithOutScroll(addNewAppointmentButton);
    }
    public void clickOnEditButton(){
        clickButtonWithOutScroll(editButton);
    }
    public void clickOnDeleteButton(){
        clickButtonWithOutScroll(deleteButton);
    }
    public void clickOnExportButton(){
        clickButtonWithOutScroll(exportButton);
    }

    public void clickOnTaskAppointmentTab(){
        clickButtonWithOutScroll(taskAppointmentTab);
    }
    public void clickOnCompletedTaskAppointmentTab(){
        clickButtonWithOutScroll(completedTaskAppointmentTab);
    }
}
