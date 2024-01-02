package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.NewAppointment;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class NewAppointmentPage extends NewAppointment {
    public NewAppointmentPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public boolean dropDownDisplayed() {
        waitVisibilityOfElement(newAppointmentPopUp);
        return isElementDisplayed(newAppointmentPopUp);}

    // A D D       A P P O I N T M E N T
    public void insertTitleInput() {enterText(titleInput,CaseTypeTestData.Appointment_Title);}
    public void insertDateInputTab() {enterText(fromDateInputTab,getTodayDate());}
    public void insertToDateInputTab() {enterText(toDateInputTab,getTomorrowDate());}
    public void clickTimeZone() {clickButtonWithOutScroll(timeZone);}
    public void clickAllowOverlapCheckBox() {clickButtonWithOutScroll(allowOverlapCheckBox);}
    public void clickAllDayEventCheckBox() {clickButtonWithOutScroll(allDayEventCheckBox);}
    public void clickRecurrenceCheckBox() {clickButtonWithOutScroll(recurrenceCheckBox);}
    public void selectEmployee(){
        enterTextWithoutScroll(selectedEmployeeField, CaseTypeTestData.EmployeeName);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER);
    }
    public void clickAddAppClearButton() {clickButtonWithOutScroll(addAppClearButton);}
    public void clickAddAppRemoveButton() {clickButtonWithOutScroll(addAppRemoveButton);}
    public void clickAddAppSortButton() {clickButtonWithOutScroll(addAppSortButton);}
    public void clickCategoryDropDown() {clickButtonWithOutScroll(categoryDropDown);}
    public void clickStatusDropDown() {clickButtonWithOutScroll(statusDropDown);}
    public void clickIncludeClosedCheckBox() {clickButtonWithOutScroll(includeClosedCaseCheckBox);}
    public void clickZoomMeetCheckBox(){clickButtonWithOutScroll(zoomMeetCheckBox);}
    public void clickTeamMeetCheckBox() {clickButtonWithOutScroll(teamMeetCheckBox);}
    public void clickOfficeLocationDropDown(){clickButtonWithOutScroll(officeLocationDropDown);}
    public void clickSaveButton(){clickButtonWithOutScroll(saveButton);}

    // A S S O C I A T E       W I T H       A       B I L L I N G
    public void clickEmployeeDropDown(){clickButtonWithOutScroll(employeeDropDown);}




}
