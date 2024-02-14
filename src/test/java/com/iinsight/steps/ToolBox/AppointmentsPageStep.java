package com.iinsight.steps.ToolBox;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.Toolbox.Side.AppointmentsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;
import org.openqa.selenium.*;

public class AppointmentsPageStep extends AppointmentsPage {
    public String getUsername = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," "));
    public int appointmentCount, appointmentLength;
    public String ShowAppointmentEndDate = get6DaysLaterDate();
    //public int daysDiff = getDaysDifference(ShowAppointmentEndDate,getTodayDate());

    @Then("User Select Filter Option From Appointment Page")
    public void user_select_filter_option_from_appointment_page() {
        waitFor(2000);
        Assert.assertTrue(isAppointmentsTabVisible());
        clickEmployeeDropDown();
        clickEmployeeSelectNone();
        selectDropDownFromText(getUsername);
        waitFor(2000);
        clickEmployeeCancelIcon();
        // Top Wrapper - Filter Input
        Assert.assertTrue(isElementDisplayed(FilterInput));
        clickFilterDropDown();
        selectDropDownFromText("All appointments");
        Assert.assertEquals(getFilterInputText(),"All appointments");
        // Top Wrapper - Calender Input
        try{
        waitFor(4000);
        clickCalenderDropDown();
        waitFor(2000);
        selectDropDownFromText("Agenda");
        }catch(TimeoutException e){
            System.out.println("AppointmentPageStep.user_select_filter_option_from_appointment_page");
            selectDropDownFromText("Agenda");
        }
    }
    @And("User Verify Created Appointment is Shown {string}")
    public void
    verifyCreatedAppointment(String appointmentType){
        try{
            setImplicit(60);
            waitFor(2000);
            setImplicit(20);
            //clickAgendaDayRadio();
            if(appointmentType.equals("All Day event")){
                //clickNextDate();
                waitFor(2000);
            }
            hoverAgendaAppointmentEvent1();
            Assert.assertTrue(isAgendaAppointmentEvent1());

            if(appointmentType.equals("Common")){
                String expected = CaseTypeTestData.FromTime+" - "+ CaseTypeTestData.EndTime;
                Assert.assertEquals(getTextAgendaTime1(),expected);
                System.out.println("AppointmentsPage.verifyCreatedAppointment() - getAppointmentCountsText(): "+getAppointmentCountsText());
                appointmentCount = Integer.parseInt(getAppointmentCountsText());
            }
            else if(appointmentType.equals("All Day event")){
                Assert.assertEquals(getTextAgendaTime1(),"All day");
                mouseOver(todayButton);
                clickCalenderDropDown();
                selectDropDownFromText("Day/Employee");
                waitFor(2000);
                setImplicit(20);
                hoverAppointmentEvent();
                Assert.assertTrue(isAppointmentEventVisible());
                Assert.assertTrue("E:"+getToolTip1Text()+" A:"+getTodayDateWithMonthText()+" "+ CaseTypeTestData.AllDayEventBothOneDigitHour,
                        getToolTip1Text().equalsIgnoreCase(getTodayDateWithMonthText()+" "+ CaseTypeTestData.AllDayEventBothOneDigitHour));

                Assert.assertTrue("E:"+getToolTip2Text()+" A:"+getTomorrowDateWithMonthText()+" "+ CaseTypeTestData.AllDayEventBothOneDigitHour,
                        getToolTip2Text().equalsIgnoreCase(getTomorrowDateWithMonthText()+" "+ CaseTypeTestData.AllDayEventBothOneDigitHour));
                Assert.assertEquals(getAppointmentDateText(),getTodayDate());
                System.out.println("AppointmentsPage.verifyCreatedAppointment() - getAppointmentCountsText(): "+getAppointmentCountsText());
                appointmentCount = Integer.parseInt(getAppointmentCountsText());
            }
            else if(appointmentType.equals("Edit")){
                String expected = CaseTypeTestData.UpdateFromTime+" - "+ CaseTypeTestData.UpdateEndTime;
                Assert.assertEquals(getTextAgendaTime2(),expected);
            }
            if(!(appointmentType.equals("All Day event"))){
            Assert.assertEquals(getAppointmentDateText(),getTodayDate());}
        }catch (TimeoutException | NoSuchElementException e){
            System.out.println("AppointmentsPageStep.verifyCreatedAppointment() -"+e.getClass()+" "+e.getMessage());
        }
    }
    @And("User Select Event Option {string}")
    public void clickOnDeleteOptionFromRightClick(String optionValue){
        if(!(optionValue.equals("Verify Delete Multiple"))){
        rightClickAgenda1();}
        switch (optionValue){
            case "Delete":
                try {
                    rightAgendaDelete();
                    waitFor(2000);
                    setImplicit(60);
                    Assert.assertTrue(isDeletePopUpVisible());
                    clickOkButtonDeletePopUp();
                    waitFor(2000);
                    clickNextDate();
                    waitFor(1000);
                    clickPreviousDate();
                    waitFor(2000);
                    appointmentCount--;
                    Assert.assertEquals(getAppointmentCountsText(), String.valueOf(appointmentCount));
                }catch(TimeoutException e){System.out.println("AppointmentsPageStep.clickOnDeleteOptionFromRightClick() - TimeoutException: "+e.getMessage());}
                break;
            case "Edit":
                rightAgendaEdit();
                waitFor(2000);
                break;
            case "Case":
                rightAgendaGoToCase();
                break;
            case "Calender":
                rightAgendaCalender();
                break;
            case "Recurrence Delete":
                try{
                    rightAgendaDelete();
                    waitFor(2000);
                    setImplicit(60);
                    Assert.assertTrue(isDeletePopUpVisible());
                    clickAllEventsCheckBox();
                    clickOkButtonDeletePopUp();
                    waitFor(2000);
                    clickNextDate();
                    waitFor(2000);
                    clickPreviousDate();
                    waitFor(2000);
                    Assert.assertEquals(getAppointmentCountsText(), "0");
                }catch(TimeoutException | ElementClickInterceptedException e){
                    System.out.println("AppointmentsPageStep.clickOnRecurrenceDeleteOptionFromRightClick() +"+e.getClass()+" "+e.getMessage());
                }
                break;
            case "Verify Delete Multiple":
                Assert.assertTrue(isAppointmentEventVisible());
                rightClickAppointmentEvent();
                clickRightClickDelete();
                waitFor(2000);
                setImplicit(60);
                Assert.assertTrue(isDeletePopUpVisible());
                clickOkButtonDeletePopUp();
                waitFor(2000);
                appointmentCount--;
                Assert.assertEquals(getAppointmentCountsText(), String.valueOf(appointmentCount));
                clickCalenderDropDown();
                selectDropDownFromText("Agenda");
                Assert.assertEquals(getAppointmentCountsText(), String.valueOf(appointmentCount));
                break;
        }
    }
    @And("User Verify Multiple Created Appointment is Shown")
    public void verifyMultipleAppointmentEvents(){
        try{
            setImplicit(60);
            waitFor(2000);
            setImplicit(20);
            hoverAgendaAppointmentEvent2();
            String expected = CaseTypeTestData.FromTime+" - "+ CaseTypeTestData.EndTime;
            Assert.assertEquals(getTextAgendaTime2(),expected);
            System.out.println("AppointmentsPage.verifyCreatedAppointment() - getAppointmentCountsText(): "+getAppointmentCountsText());
            appointmentCount = Integer.parseInt(getAppointmentCountsText());
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
                        rightClickAgenda1();
                    } else if(i==2){
                        rightClickAgenda2();}
                    rightAgendaDelete();
                    waitFor(2000);
                    setImplicit(60);
                    Assert.assertTrue(isDeletePopUpVisible());
                    clickOkButtonDeletePopUp();
                    waitFor(2000);
                    appointmentCount--;
                }
                clickNextDate();
                waitFor(2000);
                clickPreviousDate();
                waitFor(2000);
                Assert.assertEquals(getAppointmentCountsText(), String.valueOf(appointmentCount));
            }catch (TimeoutException e) {
                System.out.println("AppointmentsPageStep.clickOnDeleteOptionFromRightClick() - TimeoutException: " + e.getMessage());
            }
        }
        else if(optionValue.equals("Edit")){
            rightClickAgenda2();
            rightAgendaEdit();
            waitFor(2000);
        }
    }
    @And("User Verify Created Recurrence Appointment is Shown")
    public void verifyRecurrenceAppointmentFromAppointmentPage(){
            setImplicit(60);
            waitFor(4000);
            String getAppointmentLastDate = CaseTypeTestData.DatesList.get(CaseTypeTestData.DatesList.size()-1);
            System.out.println("getAppointmentLastDate: "+getAppointmentLastDate);

            String getAppointmentSecondLastDate = CaseTypeTestData.DatesList.get(CaseTypeTestData.DatesList.size()-2);
            System.out.println("getAppointmentSecondLastDate: "+getAppointmentSecondLastDate);
            try{
            //for(int i=1; i<=CaseTypeTestData.DatesList.size();i++){
            int i =1;
            while(i!=0){
                if(getAppointmentDateText().equals(getAppointmentSecondLastDate) || getAppointmentDateText().equals(getAppointmentLastDate)){
                    setImplicit(60);
                    waitFor(4000);
                    hoverAgendaAppointmentEvent1();
                    Assert.assertTrue(isAgendaAppointmentEvent1());
                    String expected = CaseTypeTestData.FromTime+" - "+ CaseTypeTestData.EndTime;
                    Assert.assertEquals(getTextAgendaTime1(),expected);
                    if (getAppointmentDateText().equals(getAppointmentLastDate)) {
                        break;
                }}
                clickNextDate();
                waitFor(2000);
                i++;
            }
        }catch (Exception e){
            System.out.println("AppointmentsPageStep.verifyCreatedAppointment() -"+e.getClass()+" "+e.getMessage());
        }
    }
    @Then("user Scroll TO Appointment")
    public void user_scroll_to_appointment() {
        waitFor(5000);
        //overEventElementScrollVerify3();
        System.out.println(getCurrentTime());
    }
}
