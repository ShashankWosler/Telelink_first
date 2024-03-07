package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Goals.AddGoalProgressPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class AddGoalProgressStep extends AddGoalProgressPage {
    @And("User Enter Fields To {string} with {string} {string}")
    public void enterInputsForCreatingGoal(String popUpValue, String statusValue, String priorityValue){
        switch (popUpValue){
            case "Create Goal":
                Assert.assertTrue(isCreatePopUpVisible());
                enterTitle(CaseTypeTestData.TemplateLastName);
                enterAssignToInput();
                waitFor(2000);
                selectDropDownFromText(getUsername);
                enterText(descriptionText,"Test Automation - Goal");
                break;
            case "Edit":
                Assert.assertTrue(isEditPopUpVisible());
                break;
        }
        clickDueDateDropDown();
        clickLastDueDate();
        selectStatus(statusValue);
        selectPriority(priorityValue);
        clickSaveButton();
    }
    @And("User Enter Fields of Add Progress PopUp {string}")
    public void enterFieldsAddProgressPopUp(String statusValue){
        Assert.assertTrue(isAddProgressVisible());
        enterDescriptionInput();
//        if(statusValue.equalsIgnoreCase("Started"))
//            selectStatus("Completed");
//        else if (statusValue.equalsIgnoreCase("Completed"))
//            selectStatus("Started");
        selectStatus(statusValue);
        clickGoalDropDown(CaseTypeTestData.TemplateLastName);
        clickSaveButton();
    }
}
