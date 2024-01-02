package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments.TaskMainPage;
import io.cucumber.java.en.And;

public class TaskMainSteps extends TaskMainPage {


    @And("User click on New Task button")
    public void userClickOnNewTaskButton() {
        waitFor(3000);
        waitVisibilityOfElement(addNewTaskButton);
        clickOnNewTaskButton();
    }

    @And("User click on New Appointment button")
    public void userClickOnNewAppointmentButton() {
        clickOnNewAppointmentButton();
    }
}

