package com.iinsight.steps.ToolBox;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.Toolbox.Side.AppointmentsPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public class AppointmentsPageStep extends AppointmentsPage {
    public String getUsername = globalUserName.replaceAll("@besoftware.biz","").replace("."," ");
    public int appointmentCount=0, appointmentLength=0;
    public String HardCodedName = getUsername;


    @And("User Select Filter Option From Appointment Page")
    public void addFilterAppointmentPage(){
        waitFor(2000);
        Assert.assertTrue(isAppointmentsTabVisible());
        clickEmployeeDropDown();
        clickEmployeeSelectNone();
        selectDropDownFromText(HardCodedName);
        waitFor(2000);
        clickEmployeeCancelIcon();
    }
    @And("User Verify Created Appointment is Shown")
    public void verifyCreatedAppointment(){
        try{
        setImplicit(60);
        waitFor(2000);
        setImplicit(20);
        hoverAppointmentEvent();
        Assert.assertTrue(isAppointmentEventVisible());
        Assert.assertTrue("E:"+getToolTip1Text()+" A:"+getTodayDateWithMonthText()+" "+ CaseTypeTestData.FromTimeOneDigitHour,
                getToolTip1Text().equalsIgnoreCase(getTodayDateWithMonthText()+" "+ CaseTypeTestData.FromTimeOneDigitHour));
        Assert.assertTrue("E:"+getToolTip2Text()+" A:"+getTodayDateWithMonthText()+" "+ CaseTypeTestData.EndTimeOneDigitHour,
                getToolTip2Text().equalsIgnoreCase(getTodayDateWithMonthText()+" "+ CaseTypeTestData.EndTimeOneDigitHour));
        Assert.assertEquals(getAppointmentDateText(),getTodayDate());
        System.out.println("AppointmentsPage.verifyCreatedAppointment() - getAppointmentCountsText(): "+getAppointmentCountsText());
        appointmentCount = Integer.parseInt(getAppointmentCountsText());
    }catch (TimeoutException | NoSuchElementException e){
            System.out.println("AppointmentsPageStep.verifyCreatedAppointment() -"+e.getClass()+" "+e.getMessage());
        }
    }
    @And("User Select Event Option {string}")
    public void clickOnDeleteOptionFromRightClick(String optionValue){
       rightClickAppointmentEvent();
        switch (optionValue){
            case "Delete":
                try {
                    clickRightClickDelete();
                    waitFor(2000);
                    setImplicit(60);
                    Assert.assertTrue(isDeletePopUpVisible());
                    clickOkButtonDeletePopUp();
                    waitFor(2000);
                    appointmentCount--;
                    Assert.assertEquals(getAppointmentCountsText(), String.valueOf(appointmentCount));
                }catch(TimeoutException e){System.out.println("AppointmentsPageStep.clickOnDeleteOptionFromRightClick() - TimeoutException: "+e.getMessage());}
                break;
            case "Edit":
                clickRightClickEdit();
                waitFor(2000);
                break;
            case "Billing":
                clickRightGoToBilling();
                break;
            case "Case":
                clickRightClickGoToCase();
                break;
            case "Calender":
                clickRightClickAddToCalender();
                break;
        }
    }
    @And("User Verify Multiple Created Appointment is Shown")
    public void verifyMultipleAppointmentEvents(){
        try{
            setImplicit(60);
            waitFor(2000);
            setImplicit(20);
            hover2AppointmentEvent();
            Assert.assertTrue(is2AppointmentEventVisible());
            Assert.assertTrue("E:"+getToolTip1Text()+" A:"+getTodayDateWithMonthText()+" "+ CaseTypeTestData.FromTimeOneDigitHour,
                    getToolTip1Text().equalsIgnoreCase(getTodayDateWithMonthText()+" "+ CaseTypeTestData.FromTimeOneDigitHour));
            Assert.assertTrue("E:"+getToolTip2Text()+" A:"+getTodayDateWithMonthText()+" "+ CaseTypeTestData.EndTimeOneDigitHour,
                    getToolTip2Text().equalsIgnoreCase(getTodayDateWithMonthText()+" "+ CaseTypeTestData.EndTimeOneDigitHour));
            Assert.assertEquals(getAppointmentDateText(),getTodayDate());
            System.out.println("AppointmentsPage.verifyCreatedAppointment() - getAppointmentCountsText(): "+getAppointmentCountsText());
            appointmentCount = Integer.parseInt(getAppointmentCountsText());
            appointmentLength = Integer.parseInt(getAppointmentCountsText());
        }catch (TimeoutException | NoSuchElementException e){
            System.out.println("AppointmentsPageStep.verifyCreatedAppointment() -"+e.getClass()+" "+e.getMessage());
        }
    }
    @And("User Click on +New Button from Appointment Page")
    public void clickNewButtonAppointmentPage(){
        waitFor(4000);
        clickNewButton();
    }
    @And("User Select Filter Option For Multiple Appointment")
    public void selctFilterMultipleAppointment(){
        waitFor(2000);
        Assert.assertTrue(isAppointmentsTabVisible());
        clickEmployeeDropDown();
        selectDropDownFromText(CaseTypeTestData.OverlapAppointmentUsername);
        waitFor(2000);
        clickEmployeeCancelIcon();
    }
    @And("User Select Event Option Multiple {string}")
    public void clickOnDeleteOptionFromRightClickMultiple(String optionValue){
        if (optionValue.equals("Delete")) {
            try {
                for(int i=1;i<=appointmentLength;i++){
                    if(i==1) {
                        rightClickAppointmentEvent1();
                    } else if(i==2){
                        rightClickAppointmentEvent2();}
                    clickRightClickDelete();
                    waitFor(2000);
                    setImplicit(60);
                    Assert.assertTrue(isDeletePopUpVisible());
                    clickOkButtonDeletePopUp();
                    waitFor(2000);
                    appointmentCount--;
                    Assert.assertEquals(getAppointmentCountsText(), String.valueOf(appointmentCount));
                } }catch (TimeoutException e) {
                    System.out.println("AppointmentsPageStep.clickOnDeleteOptionFromRightClick() - TimeoutException: " + e.getMessage());
                }}
        else if(optionValue.equals("Edit")){
            rightClickAppointmentEvent2();
            clickRightClickEdit();
            waitFor(2000);
        }
    }
    }
