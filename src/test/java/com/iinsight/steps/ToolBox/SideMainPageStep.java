package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.SideMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

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
        clickAppointments();
    }
    @And("User Click on Case List Option")
    public void clickCaseListOption(){
        clickCaseList();
    }
}
