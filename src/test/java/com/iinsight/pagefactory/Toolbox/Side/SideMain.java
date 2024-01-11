package com.iinsight.pagefactory.Toolbox.Side;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class SideMain extends GenericWrappers {
        @FindBy(id="btn_new_mneu")
        public WebElement showSideMenu;
        @FindBy(css="div#leftMenu")
        public WebElement SideMenuVisible;
        @FindBy(xpath="(//div[@id='accordion_caselist'])[3]")
        public WebElement CaseList;
        @FindBy(css="[toolbar_name='Timesheet']")
        public WebElement TimeSheets;
        @FindBy(id="accordion_appointments")
        public WebElement Appointments;
        @FindBy(css="[toolbar_name='userlinks']")
        public WebElement Admins;
        @FindBy(css="[toolbar_name='Workflow']")
        public WebElement WorkFlow;
        @FindBy(css="[toolbar_name='Finance']")
        public WebElement Finance;
        @FindBy(css="[toolbar_name='Charges']")
        public WebElement Charges;
        @FindBy(css="[toolbar_name='Company']")
        public WebElement Companies;
        @FindBy(css="[toolbar_name='Reports']")
        public WebElement Reports;
        @FindBy(css="[toolbar_name='Templates']")
        public WebElement Templates;
        @FindBy(css="[toolbar_name='External Forms']")
        public WebElement ExternalForms;
        @FindBy(css="[toolbar_name='ConsultantLocation']")
        public WebElement UserLocation;
        @FindBy(css="[toolbar_name='Quicklinks']")
        public WebElement Quicklinks;

        //  A D M I N S     O P T I O N S
        @FindBy(css="[toolbar_name='ManageUsers']")
        public WebElement AdminManageUser;
        @FindBy(css="[toolbar_name='ManageTeams']")
        public WebElement AdminManageTeams;
        @FindBy(css="[toolbar_name='ManageOffices']")
        public WebElement AdminManageOffices;
        @FindBy(css="[toolbar_name='ManageRoles']")
        public WebElement AdminManageRoles;
        @FindBy(css="[toolbar_name='ManageGroups']")
        public WebElement AdminManageGroups;
        @FindBy(css="[toolbar_name='ManageFields']")
        public WebElement AdminManageFields;
        @FindBy(css="[toolbar_name='SystemLogs']")
        public WebElement AdminSystemLogs;
        @FindBy(css="[toolbar_name='ArchivalDeletionCases']")
        public WebElement AdminArchivalDeletionCases;
        @FindBy(css="[toolbar_name='ManageProfiles']")
        public WebElement AdminManageProfiles;

        // W O R K F L O W S        O P T I O N S
        @FindBy(xpath="//div[@toolbar_name='Workflow']//a[2]")
        public WebElement WorkflowWorkflows;
        @FindBy(xpath="(//div[@toolbar_name='Workflow']//a[1])[2]")
        public WebElement WorkFlowNewWorkFlow;

        // C H A R G E S        O P T I O N S
        @FindBy(xpath="//div[@toolbar_name='Charges']//a[2]")
        public WebElement WorkFlowInternalExpenses;
        @FindBy(xpath="(//div[@toolbar_name='Charges']//a[1])[2]")
        public WebElement WorkFlowServiceContracts;

        //  Q U I C K L I N K S     O P T I O N S
        @FindBy(xpath="//div[@toolbar_name='Quicklinks']//a[2]")
        public WebElement QuicklinksPayment;
        @FindBy(xpath="//div[@toolbar_name='Quicklinks']//a[3]")
        public WebElement QuicklinksCase;
        @FindBy(xpath="(//div[@toolbar_name='Quicklinks']//a[1])[2]")
        public WebElement QuicklinksInvoiceWizard;

    }
