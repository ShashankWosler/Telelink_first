package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments.NewAppointmentPage;
import io.cucumber.java.en.And;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

public class NewAppointmentStep extends NewAppointmentPage {
    public String categoryValue = "Appointment", statusValue = "Confirmed", locationValue = "Mid Coast Office";
    public String getUsername = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," "));
    public String[] HardCodedName = getUsername.split(" ");
    public String[] OverlapName = CaseTypeTestData.OverlapAppointmentUsername.split(" ");

    @And("User Select {string} Checkbox From +New Appointment Page")
    public void selectCheckBoxFromAppointmentPage(String checkBoxValue){
        setImplicit(60);
        Assert.assertTrue(dropDownDisplayed());
        switch (checkBoxValue){
            case "Allow Overlap":
                clickAllowOverlapCheckBox();
                break;
            case "Recurrence":
                clickRecurrenceCheckBox();
                break;
            case "All Day Event":
                clickAllDayEventCheckBox();
                break;
        }
    }
    @And("User Enter all the mandatory fields for creating {string} appointment")
    public void enterAppointmentDetails(String appointmentType){
        waitFor(10000);
        try {
            setImplicit(60);
            Assert.assertTrue(dropDownDisplayed());
            insertTitleInput();
            if(appointmentType.equals("Recurrence")){
                System.out.println("Skip To Enter Date");
                DateInputTabDisable();
                ToDateInputTabDisable();
            } else if (appointmentType.equals("Non Recurrence")){
                insertDateInputTab();
                insertToDateInputTab();
            } else if(appointmentType.equals("All Day Event")){
                enterText(fromDateInputTab,getTomorrowDate());
                enterText(toDateInputTab,getTomorrowDate());
            }
            enterStartTime();
            enterEndTime();
            clickAddAppClearButton();
            Assert.assertEquals(getText(selectedEmployeeText),"0 employees selected");
            enterEmployeeName(HardCodedName[0]);
            enterTextAppend(employeeInputTab," "+HardCodedName[1]);
            selectDropDownFromText(HardCodedName[0]+" "+HardCodedName[1]);
        }catch(NoSuchElementException | TimeoutException | StaleElementReferenceException e){
            System.out.println("NewAppointmentStep.enterAppointmentDetails()1 - "+e.getClass()+" "+e.getMessage());
        }finally {
            try {
                waitFor(4000);
                if (!(getText(selectedEmployeeText).equals(HardCodedName[0] + " " + HardCodedName[1]))) {
                    selectDropDownFromText(HardCodedName[0] + " " + HardCodedName[1]);
                    waitFor(2000);
                    Assert.assertEquals(getText(selectedEmployeeText), HardCodedName[0] + " " + HardCodedName[1]);
                }
                clickSelectedEmployee();
                Assert.assertEquals(getText(selectedEmployeeText), HardCodedName[0] + " " + HardCodedName[1]);
                SelectByVisibleText(billingDropDown, "CTP403 : TestAutoActivity");
            } catch (NoSuchElementException e) {
                System.out.println("NewAppointmentStep.Biiling Exception- " + e.getMessage());
            } try{
            waitFor(2000);
            clickOfficeLocationDropDown();
            //waitFor(2000);
            selectDropDownFromText(locationValue);
            waitFor(2000);
            Assert.assertEquals(getOfficeLocationInput(), locationValue);
            isAddressInput();
            Assert.assertFalse(getAutoGenerateAddress().isEmpty());
            //waitFor(2000);
            clickCategoryDropDown();
            selectDropDownFromText(categoryValue);
            waitFor(2000);
            Assert.assertEquals(getCategoryInputText(), categoryValue);
            clickStatusDropDown();
            //waitFor(2000);
            selectDropDownFromText(statusValue);
            waitFor(2000);
            Assert.assertEquals(getStatusInputText(), statusValue);
            if (appointmentType.equals("All Day Event")) {
                enterClientName();
                waitFor(4000);
                try {
                    clickLastValueFromClientDropDown();
                } catch (StaleElementReferenceException e) {
                    System.out.println("NewAppointmentStep.enterMultipleAppointmentDetails- " + e.getMessage());
                    setImplicit(60);
                    waitFor(2000);
                    clickLastValueFromClientDropDown();
                }
                waitFor(2000);
            }
        }catch(Exception e){
                System.out.println("NewAppointmentStep.enterAppointmentDetails()2 - "+e.getClass()+" "+ e.getMessage());
                waitFor(2000);
                clickOfficeLocationDropDown();
                waitFor(2000);
            }}
    }
    @And("User Click on Add Billing Button from Appointment Entry PopUp")
    public void clickOnBillingButtonPopUp(){
        setImplicit(10);
        Assert.assertTrue(isSaveButtonVisible());
        Assert.assertTrue(isCancelButtonVisible());
        clickSaveAddBillingButton();
        try{
            boolean flag = false;
            flag = isCostMessageVisible();
            if(flag){
                Assert.assertTrue("NewAppointmentStep.clickOnBillingButton() - Cost Error Message Visible",isCostMessageVisible());
            }}catch(StaleElementReferenceException | TimeoutException e){
            System.out.println("NewAppointmentStep.clickOnBillingButton() - "+e.getClass()+" "+e.getMessage());
        }
        handleOutOfHourPopUp();
    }
    @And("User Click on Save Button from Appointment Entry PopUp")
    public void clickOnSaveButtonPopUp(){
        try{
            setImplicit(10);
            Assert.assertTrue(isSaveAddBillingButtonVisible());
            Assert.assertTrue(isCancelButtonVisible());
            clickSaveButton();
            boolean flag = false;
            flag = isCostMessageVisible();
            if(flag){
                Assert.assertTrue("NewAppointmentStep.clickOnBillingButton() - Cost Error Message Visible",isCostMessageVisible());
            }}catch(StaleElementReferenceException | TimeoutException | ElementClickInterceptedException e){
            System.out.println("NewAppointmentStep.clickOnSaveButtonPopUp() - "+e.getClass()+" "+e.getMessage());
        }
        try{
            boolean flag2 = false;
            flag2 = isRecurrenceOverlapErrorVisible();
            if(flag2){
                Assert.assertFalse("NewAppointmentStep.clickOnBillingButton() - Recurrence Overlap Error Message Visible",isRecurrenceOverlapErrorVisible());
            }}catch(StaleElementReferenceException | TimeoutException | ElementClickInterceptedException e){
            System.out.println("NewAppointmentStep.clickOnSaveButtonPopUp() - "+e.getClass()+" "+e.getMessage());
        } handleOutOfHourPopUp();

    }
    @And("User Click on Save Button from Edit Appointment Entry PopUp")
    public void saveEditAppointmentButton(){
        clickEditSaveButton();
        waitFor(4000);
        handleOutOfHourPopUp();
    }

    @And("User Enter all the mandatory fields for creating multiple appointment")
    public void enterMultipleAppointmentDetails(){
        try {
            setImplicit(60);
            Assert.assertTrue(dropDownDisplayed());
            insertTitleInput();
            insertDateInputTab();
            insertToDateInputTab();
            enterStartTime();
            enterEndTime();
            clickAddAppClearButton();
            waitFor(2000);
            enterEmployeeName(OverlapName[0]);
            enterTextAppend(employeeInputTab," "+OverlapName[1]);
            waitFor(2000);
            selectDropDownFromText(CaseTypeTestData.OverlapAppointmentUsername);
        }catch(NoSuchElementException | TimeoutException e){
            System.out.println("NewAppointmentStep.enterAppointmentDetails()1 - "+e.getClass()+" "+e.getMessage());
        }finally {
            try {
                waitFor(2000);
                clickSelectedEmployee();
                waitFor(2000);
                SelectByVisibleText(billingDropDown, "CTP403 : TestAutoActivity");
            }catch(Exception e){
                System.out.println("NewAppointmentStep.enterAppointmentDetails()2 - "+e.getClass()+" "+e.getMessage());
            }
            waitFor(2000);
            clickOfficeLocationDropDown();
            waitFor(2000);
            selectDropDownFromText(locationValue);
            waitFor(2000);
            Assert.assertEquals(getOfficeLocationInput(), locationValue);
            isAddressInput();
            Assert.assertFalse(getAutoGenerateAddress().isEmpty());
            //waitFor(2000);
            clickCategoryDropDown();
            selectDropDownFromText(categoryValue);
            waitFor(2000);
            Assert.assertEquals(getCategoryInputText(), categoryValue);
            clickStatusDropDown();
            //waitFor(2000);
            selectDropDownFromText(statusValue);
            waitFor(2000);
            Assert.assertEquals(getStatusInputText(), statusValue);
            enterClientName();
            waitFor(4000);
            try{
            clickLastValueFromClientDropDown();
            } catch(StaleElementReferenceException e){
                System.out.println("NewAppointmentStep.enterMultipleAppointmentDetails- "+e.getMessage());
                setImplicit(60);
                waitFor(2000);
                clickLastValueFromClientDropDown();
            }
            waitFor(2000);
        }}

    @And("User Verify Client Name of Appointment From Edit Appointment Popup")
    public void getClientNameFromEditAppointmentPage(){
        waitFor(2000);
        System.out.println(getClientNameText());
        CaseTypeTestData.ClientName = getClientNameText();
    }
    @And("User Update Time of Existing Appointment")
    public void updateTimeOfAppointment(){
        updateEnterStartTime();
        updateEnterEndTime();
    }
    @And("User Enter enter fields of {string} appointment")
    public void enterRecurrenceFields(String recurrenceField){
        setImplicit(60);
        Assert.assertTrue(isRecurrenceFieldsVisible());
        switch (recurrenceField){
            case "Day":
                clickRecDayCheckBox();
                clickRecEveryDayCheckBox();
                System.out.println("enterRecurrenceFields().getRecEveryDayInputText: "+getRecEveryDayInputText());
                break;
            case "Weekly":
                clickRecWeeklyCheckBox();
                clickRecWeeklys();
                break;
        }
        clickEndByCheckBox();
        enterEndDate();
        ClickShowAppointmentButton();
        setImplicit(60);
        Assert.assertTrue(isShowAppointmentVisible());
        getShowAppointmentDatesText();
        getShowAppointmentDaysText();
        clickShowAppointmentCheckBoxes();
        clickShowAppointmentCloseButton();
    }
}




