package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments.NewTaskPopUpPage;
import io.cucumber.java.en.And;

public class NewTaskPopUpSteps extends NewTaskPopUpPage {


    @And("Enter all the mandatory fields")
    public void enterAllTheMandatoryFields() {
        setImplicit(10);
        waitVisibilityOfElement(newTaskPopUpVisible);
        waitFor(2000);
        enterTitle();
        enterAssignedTo();
        enterCreatedBy();
    }

    @And("User Click on Save button")
    public void userClickOnSaveButton() {
        clickOnSaveButton();
    }
}
