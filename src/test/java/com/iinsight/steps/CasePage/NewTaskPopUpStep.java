package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments.NewTaskPopUpPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.StaleElementReferenceException;

public class NewTaskPopUpStep extends NewTaskPopUpPage {
    @And("User Enter Mandatory Details in New Task PopUp with {string} {string}")
    public void enterDetailsNewTask(String statusValue, String priorityValue){
        try {
            waitFor(2000);
            Assert.assertTrue(isNewTaskPopUpVisible());
            Assert.assertTrue(isCancelButtonVisible());
            enterTitleInput();
            enterAssignTo();
            waitFor(2000);
            selectDropDownFromText(getUsername);
            waitFor(4000);
            enterCreatedBy();
            waitFor(2000);
            selectDropDownFromText(getUsername);
            waitFor(4000);
            enterDueDate();
            selectStatusFromDropdown(statusValue);
            waitFor(2000);
            selectPriorityFromDropdown(priorityValue);

            waitFor(2000);
            String actualUsername1 = getAttributeValue(assignToInput,"value");
            Assert.assertTrue("E: "+actualUsername1+" A: "+getUsername,actualUsername1.contains(getUsername));

            String actualUsername2 = getAttributeValue(createdByInput,"value");
            Assert.assertTrue("E: "+actualUsername2+" A: "+getUsername,actualUsername2.contains(getUsername));
            clickOnSaveButton();
            boolean flag = isElementDisplayed(addValuePopUp);
            if(flag){
                clickNoButtonAddPopUp();
            }else {System.out.println("NewTaskPopUpStep.enterDetailsNewTask() Skip AddValue PopUp");}
        }catch(InvalidElementStateException | StaleElementReferenceException e){
            System.out.println("NewTaskPopUpStep.enterDetailsNewTask() "+e.getMessage());
        }
    }
}
