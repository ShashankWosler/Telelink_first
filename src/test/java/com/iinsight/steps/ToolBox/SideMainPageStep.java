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
    @And("User Click on Admins Option")
    public void clickAdminsOption(){
        try {
            clickAdmins();
        }catch(ElementClickInterceptedException e){
            System.out.println("SideMainPageStep.clickAdminsOption()");
            setImplicit(20);
            clickAdmins();
        }
    }
    @And("User Click on Admins {string} Option")
    public void clickAdminsOption(String options){
        waitFor(1000);
        switch (options){
            case "Manage User":
                waitVisibilityOfElement(AdminManageUser);
                clickAdminManageUser();
                break;
            case "Manage Teams":
                waitVisibilityOfElement(AdminManageTeams);
                clickAdminManageTeams();
                break;
            case "Manage Offices":
                waitVisibilityOfElement(AdminManageOffices);
                clickAdminManageOffices();
                break;
            case "Manage Roles":
                waitVisibilityOfElement(AdminManageRoles);
                clickAdminManageRoles();
                break;
            case "Manage Groups":
                waitVisibilityOfElement(AdminManageGroups);
                clickAdminManageGroups();
                break;
            case "Manage Fields":
                waitVisibilityOfElement(AdminManageFields);
                clickAdminManageFields();
                break;
            case "System Logs":
                waitVisibilityOfElement(AdminSystemLogs);
                clickAdminSystemLogs();
                break;
            case "Case Logs":
                waitVisibilityOfElement(AdminCaseLogs);
                clickAdminCaseLogs();
                break;
            case "Archived Deleted Case":
                waitVisibilityOfElement(AdminArchivalDeletionCases);
                clickAdminArchivalDeletionCases();
                break;
            case "Manage Profiles":
                waitVisibilityOfElement(AdminManageProfiles);
                clickAdminManageProfiles();
                break;
        }
    }
    @And("User Click on Reports Option")
    public void clickReportsOption(){
        try {
            clickReports();
        }catch(ElementClickInterceptedException e){
            System.out.println("SideMainPageStep.clickReportsOption()");
            setImplicit(20);
            clickReports();
        }
    }
}
