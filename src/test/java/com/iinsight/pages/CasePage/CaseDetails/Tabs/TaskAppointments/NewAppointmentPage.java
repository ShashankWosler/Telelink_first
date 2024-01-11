package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.NewAppointment;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class NewAppointmentPage extends NewAppointment {
    public String ShowAppointmentEndDate = get6DaysLaterDate();
    public String ShowAppointmentEndDateDay = getDayOfWeek(ShowAppointmentEndDate);
    public int daysDiff = getDaysDifference(ShowAppointmentEndDate,getTodayDate());

    public NewAppointmentPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public boolean dropDownDisplayed() {
        waitVisibilityOfElement(newAppointmentPopUp);
        return isElementDisplayed(newAppointmentPopUp);}

    // A D D       A P P O I N T M E N T
    public void insertTitleInput() {enterText(titleInput,CaseTypeTestData.Appointment_Title);}
    public void insertDateInputTab() {enterText(fromDateInputTab,getTodayDate());}
    public void insertToDateInputTab() {enterText(toDateInputTab,getTodayDate());}
    public void enterStartTime(){
        //CaseTypeTestData.FromTime = getCurrentTime();
        //CaseTypeTestData.FromTimeOneDigitHour = getCurrentTimeOneHourDigit();
        enterText(startTime, CaseTypeTestData.FromTime);}
    public void enterEndTime(){
        //CaseTypeTestData.EndTime = get15TimeDifference();
        //CaseTypeTestData.EndTimeOneDigitHour = get15TimeDifferenceOneHourDigit();
        enterText(endTime, CaseTypeTestData.EndTime);}
    public void updateEnterStartTime(){
        enterText(startTime, CaseTypeTestData.UpdateFromTime);}
    public void updateEnterEndTime(){
        enterText(endTime, CaseTypeTestData.UpdateEndTime);}

    public void clickTimeZone() {clickButtonWithOutScroll(timeZone);}
    public void clickAllowOverlapCheckBox() {clickButtonWithOutScroll(allowOverlapCheckBox);}
    public void clickAllDayEventCheckBox() {clickButtonWithOutScroll(allDayEventCheckBox);}
    public void clickRecurrenceCheckBox() {clickButtonWithOutScroll(recurrenceCheckBox);}
    public boolean isSelectedEmployeeVisible(){
        waitVisibilityOfElement(selectedEmployee);
        return isElementDisplayed(selectedEmployee);}
    public void clickSelectedEmployee(){clickButtonWithOutScroll(selectedEmployee);}
    public String getValueSelectedEmployee(){ return getAttributeValue(selectedEmployee,"value");}
    public void enterEmployeeName(String username){enterTextAndClearAll(employeeInputTab,username);}
    public void clickEmployeeDropDownButton(){clickButtonWithOutScroll(employeeDropDownButton);}
    public void clickAddAppClearButton() {clickButtonWithOutScroll(addAppClearButton);}
    public void clickAddAppRemoveButton() {clickButtonWithOutScroll(addAppRemoveButton);}
    public void clickAddAppSortButton() {clickButtonWithOutScroll(addAppSortButton);}
    public void clickLastValueFromClientDropDown(){clickButtonWithOutScroll(SelectClientNameFromDropDown);}
    public String getCategoryInputText(){return getAttributeValue(categoryInput,"value");}
    public void clickCategoryDropDown() {clickButtonWithOutScroll(categoryDropDown);}
    public String getStatusInputText(){return getAttributeValue(statusInput,"value");}
    public void clickStatusDropDown() {clickButtonWithOutScroll(statusDropDown);}
    public void clickIncludeClosedCheckBox() {clickButtonWithOutScroll(includeClosedCaseCheckBox);}
    public void enterClientName(){enterText(getClientName,CaseTypeTestData.FirstName+" "+CaseTypeTestData.LastName);}
    public String getClientNameText(){return getAttributeValue(getClientName,"value");}
    public void clickZoomMeetCheckBox(){clickButtonWithOutScroll(zoomMeetCheckBox);}
    public void clickTeamMeetCheckBox() {clickButtonWithOutScroll(teamMeetCheckBox);}
    public String getOfficeLocationInput(){return getAttributeValue(officeLocationInput,"value");}
    public void clickOfficeLocationDropDown(){clickButtonWithOutScroll(officeLocationDropDown);}
    public boolean isAddressInput(){waitVisibilityOfElement(addressInput);
        return isElementDisplayed(addressInput);}
    public String getAutoGenerateAddress(){return getAttributeValue(addressInput,"value");}
    public void clickSaveAddBillingButton(){
        clickButtonWithOutScroll(saveAddBillingButton);
        try{interactAddValuePopUp();}catch (Exception e){System.out.println("clickSaveAddBillingButton.interactAddValuePopUp(): "+e.getClass()+" "+e.getMessage());}
    }
    public boolean isSaveAddCaseButtonVisible(){waitVisibilityOfElement(saveAddCaseButton);
        return isElementDisplayed(saveAddCaseButton);}
    public void clickSaveAddCaseButton(){
        clickButtonWithOutScroll(saveAddCaseButton);
        try{interactAddValuePopUp();}catch (Exception e){System.out.println("clickSaveAddCaseButton.interactAddValuePopUp(): "+e.getClass()+" "+e.getMessage());}
    }
    public void clickSaveButton(){clickButtonWithOutScroll(saveButton);}
    public boolean isSaveButtonVisible(){return isElementDisplayed(saveButton);}
    public boolean isCancelButtonVisible(){return isElementDisplayed(cancelButton);}
    public void clickCancelButton(){clickButtonWithOutScroll(cancelButton);}

    // E D I T      S A V E       B U T T O N S
    public void clickEditCancelButton(){clickButtonWithOutScroll(editCancelButton);}

    public void clickEditSaveButton(){clickButtonWithOutScroll(editSaveButton);}

    public boolean isSaveAddBillingButtonVisible(){return isElementDisplayed(saveAddBillingButton);}

    public boolean isCostMessageVisible(){
        return isElementDisplayed(errorMessage);}

    // A S S O C I A T E       W I T H       A       B I L L I N G
    public void clickEmployeeDropDown(){clickButtonWithOutScroll(employeeDropDown);}

    // S A V E       B U T T O N       P O P - U P
    public boolean isAddValuePopUpVisible(){
        waitVisibilityOfElement(addValuePopUpVisible);
        return isElementDisplayed(addValuePopUpVisible);
    }
    public void clickYesButtonAddValuePopUp(){clickButtonWithOutScroll(YesButtonAddValuePopUp);}
    public boolean isNoButtonAddValuePopUp(){
        return isElementDisplayed(NoButtonAddValuePopUp);
    }
    public boolean isCancelButtonAddValuePopUp(){
        return isElementDisplayed(CancelButtonAddValuePopUp);
    }
    public void interactAddValuePopUp(){
        boolean flag = false;
        flag = isAddValuePopUpVisible();
        if(flag){
            setImplicit(60);
            clickYesButtonAddValuePopUp();
        } else {System.out.println("NewAppointmentPage.interactAddValuePopUp() - No Add Value PopUp Shown");
        }
    }
    public boolean isRecurrenceOverlapErrorVisible(){
        return isElementDisplayed(getRecurrenceOverlapError);
    }
    // R E C U R R E N C E
    public boolean isRecurrenceFieldsVisible(){
        waitVisibilityOfElement(recurrenceFields);
        return isElementDisplayed(recurrenceFields);
    }

    // Recurrence Pattem
    public void clickRecDayCheckBox(){clickButtonWithOutScroll(recDayCheckBox);
    }
    public void clickRecWeeklyCheckBox(){clickButtonWithOutScroll(recWeeklyCheckBox);}
    public void clickRecMonthlyCheckBox(){clickButtonWithOutScroll(recMonthlyCheckBox);}
    public void clickRecYearCheckBox(){clickButtonWithOutScroll(recYearCheckBox);}

    //Recurrence Pattem - Respective Fields

    /** DAY */
    public void clickRecEveryDayCheckBox(){clickButtonWithOutScroll(recEveryDayCheckBox);}
    public String getRecEveryDayInputText(){return getAttributeValue(recEveryDayInput,"value");}
    public void clickRecEveryWeekCheckBox(){clickButtonWithOutScroll(recEveryWeekCheckBox);}

    /** WEEKLY*/
    public String getRecWeeklyInputText(){return getAttributeValue(recWeeklyInput,"value");}

    /**WEEKLY_CheckBox_Weeks_Name*/
    public void clickRecWeeklySaturday(){clickButtonWithOutScroll(recWeeklySaturday);}
    public void clickRecWeeklys(){
        for(WebElement e : recWeeklys){
            waitElementToBeClickable(e);
            clickButtonWithOutScroll(e);
        }
    }

    /**MONTHLY*/
    public String getRecMonthlyDayInput1Text(){return getAttributeValue(recMonthlyDayInput1,"value");}
    public String getRecMonthlyEveryMonthInputText(){return getAttributeValue(recMonthlyEveryMonthInput,"value");}
    public void clickRecMonthlyWeekCheckBox(){clickButtonWithOutScroll(recMonthlyWeekCheckBox);}
    public void clickRecMonthlyWeekNumberDropDown(){clickButtonWithOutScroll(recMonthlyWeekNumberDropDown);}
    public String getRecMonthlyWeekNumberInputText(){return getAttributeValue(recMonthlyWeekNumberInput,"value");}
    public String getRecMonthlyDayInput2Text(){return getAttributeValue(recMonthlyDayInput2,"value");}
    public void clickRecMonthlyWeekDaysDropDown(){clickButtonWithOutScroll(recMonthlyWeekDaysDropDown);}
    public String getRecMonthlyDayInput3Text(){return getAttributeValue(recMonthlyDayInput3,"value");}

    /**YEARLY*/
    public String getRecYearlyEveryInputText(){return getAttributeValue(recYearlyEveryInput,"value");}
    public void clickRecYearlyOnCheckBox(){clickButtonWithOutScroll(recYearlyOnCheckBox);}
    public void clickRecYearlyOnTheCheckBox(){clickButtonWithOutScroll(recYearlyOnTheCheckBox);}
    public void clickRecYearlyMonthDropDown(){clickButtonWithOutScroll(recYearlyMonthDropDown);}
    public void clickRecYearlyWeekCountDropDown(){clickButtonWithOutScroll(recYearlyWeekCountDropDown);}
    public void clickRecYearlyWeekNameDropDown(){clickButtonWithOutScroll(recYearlyWeekNameDropDown);}
    public void clickRecYearlyMonthDropDown2(){clickButtonWithOutScroll(recYearlyMonthDropDown2);}
    public String getRecYearlyOnDateInputText(){return getAttributeValue(recYearlyOnDateInput,"value");}
    public String getRecYearlyMonthInput1Text(){return getAttributeValue(recYearlyMonthInput1,"value");}
    public String getRecYearlyWeekCountInputText(){return getAttributeValue(recYearlyWeekCountInput,"value");}
    public String getRecYearlyWeekNameInputText(){return getAttributeValue(recYearlyWeekNameInput,"value");}
    public String getRecYearlyMonthInput2Text(){return getAttributeValue(recYearlyMonthInput2,"value");}

    /**R E C U R R E N C E __ R A N G E*/
    public void clickEndAfterCheckBox(){clickButtonWithOutScroll(endAfterCheckBox);}
    public void clickEndByCheckBox(){clickButtonWithOutScroll(endByCheckBox);}
    public void ClickShowAppointmentButton(){clickButtonWithOutScroll(showAppointmentButton);}
    public String getStartDateText(){return getAttributeValue(startDate,"value");}
    public String getEndDateText(){return getAttributeValue(endDateInput,"value");}
    public void enterEndDate(){enterText(endDateInput,ShowAppointmentEndDate);}

    // S H O W      A P P O I N T M E N T      S E R V I C E S
    public boolean isShowAppointmentVisible(){
        waitVisibilityOfElement(showAppointmentVisible);
        return isElementDisplayed(showAppointmentVisible);
    }
    public void getShowAppointmentDatesText(){
        for(WebElement e : showAppointmentDates){
            String date = getText(e);
            CaseTypeTestData.DatesList.add(date);
            System.out.println("getShowAppointmentDatesText: "+date);
        }
        Assert.assertEquals(ShowAppointmentEndDate,CaseTypeTestData.DatesList.get(CaseTypeTestData.DatesList.size()-1));
    }
    public void getShowAppointmentDaysText(){
        for(WebElement e : showAppointmentDays){
            String day = getText(e);
            CaseTypeTestData.DaysList.add(day);
            System.out.println("getShowAppointmentDaysText: "+day);
        }
        Assert.assertTrue(ShowAppointmentEndDateDay.equalsIgnoreCase(CaseTypeTestData.DaysList.get(CaseTypeTestData.DaysList.size()-1)));
    }
    public void clickShowAppointmentCheckBoxes(){
        int size = showAppointmentCheckBoxes.size();
        System.out.println("clickShowAppointmentCheckBoxes: "+size);
        for(int i=0;i<size;i++){
            if(i==size-1 || i==size-2){
                System.out.println("If Condition - Last And Second Last will Select Only");
                CaseTypeTestData.CheckBoxesList.add(i);
                continue;
            }else {clickButtonWithOutScroll(showAppointmentCheckBoxes.get(i));}
        }
    }
    public void clickShowAppointmentCloseButton(){clickButtonWithOutScroll(showAppointmentCloseButton);}
    public boolean DateInputTabDisable() {return !isElementEnabled(fromDateInputTab);}
    public boolean ToDateInputTabDisable() {return !isElementEnabled(toDateInputTab);}
}