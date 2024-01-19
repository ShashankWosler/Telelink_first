package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.Side.SideMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;

public class SideMainPageStep extends SideMainPage {
    @And("User Click on Menu Icon")
    public void clickMenuIcon(){
        waitFor(2000);
        Assert.assertTrue(isShowSideMenuVisible());
        clickShowSideMenu();
        setImplicit(60);
        Assert.assertTrue(isSideMenuVisible());
    }
    @And("User Click on Appointment Option")
    public void clickAppointmentOption(){
        try {
            clickAppointments();
        }catch(ElementClickInterceptedException e){
            System.out.println("SideMainPageStep.clickAppointmentOption()");
            setImplicit(20);
            clickAppointments();
        }
    }
    @And("User Click on Case List Option")
    public void clickCaseListOption(){
        clickCaseList();
    }
    @And("User Click on Timesheet Option")
    public void clickTimesheetOption(){
        try {
            clickTimeSheets();
        }catch(ElementClickInterceptedException e){
            System.out.println("SideMainPageStep.clickTimesheetOption()");
            setImplicit(20);
            clickTimeSheets();
        }
    }
}
