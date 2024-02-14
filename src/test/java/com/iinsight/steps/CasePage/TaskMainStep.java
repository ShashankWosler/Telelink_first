package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments.TaskMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;

public class TaskMainStep extends TaskMainPage {
    public String getUsername = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," "));

    @And("User click on {string} Button")
    public void clickNewTask(String buttonValue){
        try{
            waitFor(2000);
            switch (buttonValue){
                case "New Task":
                    Assert.assertTrue(isNewTaskButtonVisible());
                    clickWithJS(addNewTaskButton);
                    break;
                case "New Appointment":
                    Assert.assertTrue(isNewAppointmentButtonVisible());
                    clickWithJS(addNewAppointmentButton);
                    break;
                case "Delete":
                    clickDeleteButton();
                    setImplicit(60);
                    waitFor(2000);
                    Assert.assertTrue(isDeletePopUpVisible());
                    enterDescriptionButtonDeletePopUp();
                    clickOkButtonDeletePopUp();
                    break;
                case "Edit":
                    Assert.assertTrue(isNewAppointmentButtonVisible());
                    clickButtonWithOutScroll(compGetAssignToOfFirstRow);
                    clickWithJS(editButton);
            } } catch(TimeoutException | ElementClickInterceptedException e){
            System.out.println("TaskMainStep.clickNewTask() - "+e.getClass());
        }
    }
    @Then("User Verify Task Added in Appointment List {string}")
    public void verifyTaskAdded(String statusValue){
        waitFor(2000);

        // Appointment Status is Completed and Verify From TaskAppointment Tab > Completed Tab (From Case List Page)
        if(statusValue.equals("Completed")){
            setImplicit(60);
            clickCompletedTaskAppointmentTab();
            waitFor(2000);
            Assert.assertTrue(isSearchInputCompVisible());
            Assert.assertTrue(getTextAssignToOfCompFirstRow().contains(getUsername));
            Assert.assertTrue(getFirstTaskTitleOfTable().contains(CaseTypeTestData.TaskTitle));
            Assert.assertTrue(getFirstTaskStatusOfTable().contains(statusValue));
            Assert.assertTrue(getFirstTaskDateOfTable().contains(getTodayDate()));

        // Verify Appointment with Billing - TaskAppointment Tab > Completed Tab (From Case List Page)
        } else if(statusValue.equals("New cost")){
            //Assert.assertTrue(getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.FromTimeOneDigitHour));
            Assert.assertTrue("E:"+getStartTimeFirstRowText()+" A:"+CaseTypeTestData.FromTimeOneDigitHour,getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.FromTimeOneDigitHour));
            Assert.assertTrue(getEndTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.EndTimeOneDigitHour));
            Assert.assertTrue("E:"+getTaskFirstAmountOfTableText()+" A:"+CaseTypeTestData.Total,getTaskFirstAmountOfTableText().contains(CaseTypeTestData.Total));
        }
        // Verify Appointment is Deleted - TaskAppointment Tab > Completed Tab (From Case List Page)
        else if(statusValue.equals("No Value")){
            setImplicit(60);
            Assert.assertTrue(isSearchInputTaskVisible());
            waitFor(2000);
            Assert.assertTrue(getTaskFirstOfTableText().contains("no results"));
        }
        // Verify Overlap Appointment - Without Billing : TaskAppointment Tab > Completed Tab (From Case List Page)
        else if(statusValue.equals("New cost Without Billing")){
            Assert.assertTrue(getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.FromTimeOneDigitHour));
            Assert.assertTrue(getEndTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.EndTimeOneDigitHour));
        }
        // Verify All Day Event Appointment - Without Billing : TaskAppointment Tab > Completed Tab (From Case List Page)
        else if(statusValue.equals("All Day Event")){
            Assert.assertTrue(getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.AllDayEventFromTime));
            Assert.assertTrue(getEndTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.AllDayEventEndTime));
        }
        // Verify Overlap Appointment and Normal Appointment - Without Billing : TaskAppointment Tab > Completed Tab (From Case List Page)
        else if(statusValue.equals("Multiple")){
            Assert.assertTrue(getFirstTaskAssignToOfTable().contains(CaseTypeTestData.OverlapAppointmentUsername));
        }
        // Verify Recurrence Appointments - Selected CheckBoxes is Stores in Var while Selecting Date From New Appointment PopUp - (Recurrence)
        else if(statusValue.equals("Recurrence")) {
            Assert.assertEquals(String.valueOf(taskRows.size()),String.valueOf(CaseTypeTestData.CheckBoxesList.size()));
        }
        // For Appointment New Task Test Case
        else {
            setImplicit(60);
            Assert.assertTrue(isSearchInputTaskVisible());
            waitFor(2000);
            Assert.assertTrue(getFirstTaskAssignToOfTable().contains(getUsername));
            Assert.assertTrue(getFirstTaskTitleOfTable().contains(CaseTypeTestData.TaskTitle));
            Assert.assertTrue(getFirstTaskStatusOfTable().contains(statusValue));
            Assert.assertTrue(getFirstTaskDateOfTable().contains(getTodayDate()));
        }
    }
    @And("User Select Created Task {string}")
    public void selectTask(String statusValue){
        setImplicit(60);
        waitFor(2000);
        if(statusValue.equals("Completed")){
            clickCompletedTaskAppointmentTab();
            waitFor(2000);
            clickCompGetFirstRow();
        } else {
            Assert.assertTrue(isSearchInputTaskVisible());
            waitFor(2000);
            clickTaskFirstOfTable();
        }
    }
    @And("User Verify Task Deleted in Appointment List {string}")
    public void rowDeletedFromTaskTab(String statusValue){
        setImplicit(60);
        if(statusValue.equals("Completed")) {
            waitFor(4000);
            waitElementToBeClickable(completedTaskAppointmentTab);
            clickCompletedTaskAppointmentTab();
            waitFor(2000);
            Assert.assertTrue(isFirstRowCompletedAppointmentVisible());
        }else{
            waitFor(4000);
            waitVisibilityOfElement(taskSearchInput);
            Assert.assertTrue(isSearchInputTaskVisible());
            waitFor(2000);
            Assert.assertTrue(isFirstRowTaskAppointmentVisible());
        }
    }

}
