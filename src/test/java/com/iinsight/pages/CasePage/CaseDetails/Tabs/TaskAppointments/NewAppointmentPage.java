package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.NewAppointment;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
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

    public void selectDropDownFromTextUIError (String dropDownvalue){
        String [] usernameArray = dropDownvalue.split(" ");
        System.out.println(usernameArray[0]);
        try {
            By elem = By.xpath("//div[@id='drop_down_multiselect']/child::div[contains(text(),"+'"'+usernameArray[0]+'"'+")]");
            waitFor(5000);
            getDriver().findElement(elem).click();
        }catch(TimeoutException | NoSuchElementException | StaleElementReferenceException e){
            System.out.println("selectDropDownFromTextUIError() [1] -"+e.getClass());
            waitFor(2000);
        }
            By actualToFind = By.xpath("//div[@id='drop_down_multiselect']/child::div[contains(text(),"+'"'+dropDownvalue+'"'+")]");
            waitFor(5000);
            getDriver().findElement(actualToFind).click();

    }
}
