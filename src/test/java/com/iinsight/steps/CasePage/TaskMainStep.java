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
        if(statusValue.equals("Completed")){
            setImplicit(60);
            clickCompletedTaskAppointmentTab();
            waitFor(2000);
            Assert.assertTrue(isSearchInputCompVisible());
            Assert.assertTrue(getTextAssignToOfCompFirstRow().contains(getUsername));
            Assert.assertTrue(getTextTitleOfCompFirstRow().contains(CaseTypeTestData.TaskTitle));
            Assert.assertTrue(getTextStatusOfCompFirstRow().contains(statusValue));
            Assert.assertTrue(getTextDateOfCompFirstRow().contains(getTodayDate()));

        } else if(statusValue.equals("New cost")){
            Assert.assertTrue(getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.FromTimeOneDigitHour));
            Assert.assertTrue(getEndTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.EndTimeOneDigitHour));
            Assert.assertTrue("E:"+getTaskFirstAmountOfTableText()+" A:"+CaseTypeTestData.Total,getTaskFirstAmountOfTableText().contains(CaseTypeTestData.Total));
        }
        else if(statusValue.equals("No Value")){
            setImplicit(60);
            Assert.assertTrue(isSearchInputTaskVisible());
            waitFor(2000);
            Assert.assertTrue(getTaskFirstOfTableText().contains("no results"));
        }
        else if(statusValue.equals("New cost Without Billing")){
            Assert.assertTrue(getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.FromTimeOneDigitHour));
            Assert.assertTrue(getEndTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.EndTimeOneDigitHour));

        } else if(statusValue.equals("All Day Event")){
            Assert.assertTrue(getStartTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.AllDayEventFromTime));
            Assert.assertTrue(getEndTimeFirstRowText().equalsIgnoreCase(CaseTypeTestData.AllDayEventEndTime));
        }
        else if(statusValue.equals("Multiple")){
            Assert.assertTrue(getFirstTaskAssignToOfTable().contains(CaseTypeTestData.OverlapAppointmentUsername));
        } else if(statusValue.equals("Recurrence")) {
            Assert.assertEquals(String.valueOf(taskRows.size()),String.valueOf(CaseTypeTestData.CheckBoxesList.size()));
        }else {
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
