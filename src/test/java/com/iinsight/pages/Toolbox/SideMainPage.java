package com.iinsight.pages.Toolbox;

import com.iinsight.pagefactory.Toolbox.SideMain;
import org.openqa.selenium.support.PageFactory;

public class SideMainPage extends SideMain {
    public SideMainPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isShowSideMenuVisible(){
        waitVisibilityOfElement(showSideMenu);
        return isElementDisplayed(showSideMenu);
    }
    public void clickShowSideMenu(){clickButtonWithOutScroll(showSideMenu);}
    public boolean isSideMenuVisible(){
        waitVisibilityOfElement(SideMenuVisible);
        return isElementDisplayed(SideMenuVisible);
    }
    public void clickCaseList(){clickButtonWithOutScroll(CaseList);}
    public void clickTimeSheets(){clickButtonWithOutScroll(TimeSheets);}
    public void clickAppointments(){clickButtonWithOutScroll(Appointments);}
    public void clickAdmins(){clickButtonWithOutScroll(Admins);}
    public void clickWorkFlow(){clickButtonWithOutScroll(WorkFlow);}
    public void clickFinance(){clickButtonWithOutScroll(Finance);}
    public void clickCharges(){clickButtonWithOutScroll(Charges);}
    public void clickCompanies(){clickButtonWithOutScroll(Companies);}
    public void clickReports(){clickButtonWithOutScroll(Reports);}
    public void clickTemplates(){clickButtonWithOutScroll(Templates);}
    public void clickExternalForms(){clickButtonWithOutScroll(ExternalForms);}
    public void clickUserLocation(){clickButtonWithOutScroll(UserLocation);}
    public void clickQuicklinks(){clickButtonWithOutScroll(Quicklinks);}

    //  A D M I N S     O P T I O N S
    public void clickAdminManageUser(){clickButtonWithOutScroll(AdminManageUser);}
    public void clickAdminManageTeams(){clickButtonWithOutScroll(AdminManageTeams);}
    public void clickAdminManageOffices(){clickButtonWithOutScroll(AdminManageOffices);}
    public void clickAdminManageRoles(){clickButtonWithOutScroll(AdminManageRoles);}
    public void clickAdminManageGroups(){clickButtonWithOutScroll(AdminManageGroups);}
    public void clickAdminManageFields(){clickButtonWithOutScroll(AdminManageFields);}
    public void clickAdminSystemLogs(){clickButtonWithOutScroll(AdminSystemLogs);}
    public void clickAdminArchivalDeletionCases(){clickButtonWithOutScroll(AdminArchivalDeletionCases);}
    public void clickAdminManageProfiles(){clickButtonWithOutScroll(AdminManageProfiles);}

    // W O R K F L O W S        O P T I O N S
    public void clickWorkflowWorkflows(){clickButtonWithOutScroll(WorkflowWorkflows);}
    public void clickWorkFlowNewWorkFlow(){clickButtonWithOutScroll(WorkFlowNewWorkFlow);}

    // C H A R G E S        O P T I O N S
    public void clickWorkFlowInternalExpenses(){clickButtonWithOutScroll(WorkFlowInternalExpenses);}
    public void clickWorkFlowServiceContracts(){clickButtonWithOutScroll(WorkFlowServiceContracts);}

    //  Q U I C K L I N K S     O P T I O N S

    public void clickQuicklinksPayment(){clickButtonWithOutScroll(QuicklinksPayment);}
    public void clickQuicklinksCase(){clickButtonWithOutScroll(QuicklinksCase);}
    public void clickQuicklinksInvoiceWizard(){clickButtonWithOutScroll(QuicklinksInvoiceWizard);}




}
