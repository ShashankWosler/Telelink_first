package com.iinsight.pages.Toolbox.Side;

import com.iinsight.pagefactory.Toolbox.Side.Appointments;
import org.openqa.selenium.support.PageFactory;

public class AppointmentsPage extends Appointments {
    public AppointmentsPage(){
        PageFactory.initElements(getDriver(), this);
    }

    // L I S T I N G
    public String getToolTip1Text(){
        waitVisibilityOfElement(toolTip1Text);
        return getText(toolTip1Text);
    }
    public String getToolTip2Text(){
        waitVisibilityOfElement(toolTip2Text);
        return getText(toolTip2Text);
    }
    public boolean isAppointmentEventVisible(){
        waitVisibilityOfElement(appointmentEvent);
        return isElementDisplayed(appointmentEvent);
    }
    public boolean is2AppointmentEventVisible(){
        waitVisibilityOfElement(appointEvent2);
        return isElementDisplayed(appointEvent2);
    }
    public void hoverAppointmentEvent(){mouseOver(appointmentEvent);
    }
    public void clickAppointmentEvent(){clickButton(appointmentEvent,appointmentEvent);
    }
    public void hover2AppointmentEvent(){mouseOver(appointEvent2);
    }
    public void click2AppointmentEvent(){clickButton(appointEvent2,appointEvent2);
    }


    // C O M P A N Y        R E S O U R C E S
    public boolean isCompanyNewButton(){
        waitVisibilityOfElement(CompanyNewButton);
        return isElementDisplayed(CompanyNewButton);
    }

    // T O P    W R A P P E R - Common
    public void clickNewButton(){clickButtonWithOutScroll(NewButton);}
    public void clickExportButton(){clickButtonWithOutScroll(ExportButton);}
    public void clickFilterDropDown(){clickButtonWithOutScroll(FilterDropDown);}
    public void clickCalenderDropDown(){clickButtonWithOutScroll(CalenderDropDown);}

    // D A T E      S E C T I O N
    public void clickPreviousDate(){clickButtonWithOutScroll(PreviousDate);}
    public void clickNextDate(){clickButtonWithOutScroll(NextDate);}
    public String getAppointmentDateText(){return getText(AppointmentDate);}

    // C A L E N D E R      T O P       R I G H T
    public String getAppointmentCountsText(){return getText(appointmentCounts);}
    public void clickTodayButton(){clickButtonWithOutScroll(todayButton);}
    public void clickReloadButton(){clickButtonWithOutScroll(reloadButton);}
    public void clickShareButton(){clickButtonWithOutScroll(shareButton);}

    // F I L T E R      S E C T I O N       R I G H T       S I D E
    public void clickResourceTab(){clickButtonWithOutScroll(resourceTab);}
    public boolean isAppointmentsTabVisible(){
        waitVisibilityOfElement(appointmentsTab);
        return isElementDisplayed(appointmentsTab);}
    public void clickAppointmentsTab(){clickButtonWithOutScroll(appointmentsTab);}

    // A P P O I N T M E N T        T A B
    public void clickZoomInButton(){clickButtonWithOutScroll(zoomInButton);}
    public void clickZoomOutButton(){clickButtonWithOutScroll(zoomOutButton);}
    public void clickSaveViewButton(){clickButtonWithOutScroll(saveViewButton);}

    /** D R O P D O W N*/

    public void clickTeamDropDown(){clickButtonWithOutScroll(TeamDropDown);}
    public void clickEmployeeDropDown(){clickButtonWithOutScroll(EmployeeDropDown);}
    public void clickStatusDropDown(){clickButtonWithOutScroll(StatusDropDown);}
    public void clickCategoryDropDown(){clickButtonWithOutScroll(CategoryDropDown);}
    public void clickBillingStatusDropDown(){clickButtonWithOutScroll(BillingStatusDropDown);}
    public void clickRemoveFilterDropDown(){clickButtonWithOutScroll(RemoveFilterDropDown);}

    /** E M P L O Y E E      F U N C T I O N S */
    public void clickEmployeeSelectAll(){clickButtonWithOutScroll(EmployeeSelectAll);}
    public void clickEmployeeSelectNone(){clickButtonWithOutScroll(EmployeeSelectNone);}
    public void clickEmployeeSelectInvert(){clickButtonWithOutScroll(EmployeeSelectInvert);}
    public void clickEmployeeCancelIcon(){clickButtonWithOutScroll(EmployeeCancelIcon);}

    // C A L E N D E R
    public void clickSelectMonthDropDown(){clickButtonWithOutScroll(SelectMonthDropDown);}
    public void clickSelectYearDropDown(){clickButtonWithOutScroll(SelectYearDropDown);}

    // C O M P A N Y     R E S O U R C E S
    public void clickOfficeDropDown(){clickButtonWithOutScroll(officeDropDown);}

    // R I G H T    C L I C K       A P P O I N T M E N T       E V E N T

    public void rightClickAppointmentEvent(){mouseRightClick(appointmentEvent);}
    public void rightClickAppointmentEvent2(){mouseRightClick(appointEvent2);}
    public void rightClickAppointmentEvent1(){mouseRightClick(appointEvent1);}


    public void clickRightClickGoToCase(){
        waitElementToBeClickable(RightClickGoToCase);
        mouseOverClick(RightClickGoToCase);
    }
    public void clickRightGoToBilling(){
        waitElementToBeClickable(RightClickGoToBilling);
        mouseOverClick(RightClickGoToBilling);
    }
    public void clickRightClickEdit(){
        waitElementToBeClickable(RightClickEdit);
        mouseOverClick(RightClickEdit);
    }
    public void clickRightClickDelete(){
        waitElementToBeClickable(RightClickDelete);
        mouseOverClick(RightClickDelete);
    }
    public void clickRightClickAddToCalender(){
        waitElementToBeClickable(RightClickAddToCalender);
        mouseOverClick(RightClickAddToCalender);
    }

    // D E L E T E      A P P O I N T M E N T       P O P - U P
    public boolean isDeletePopUpVisible(){
        waitVisibilityOfElement(DeletePopUpVisible);
        return isElementDisplayed(DeletePopUpVisible);
    }
    public void clickOkButtonDeletePopUp(){clickButtonWithOutScroll(OkButtonDeletePopUp);
    }
    public void clickCancelButtonDeletePopUp(){clickButtonWithOutScroll(CancelButtonDeletePopUp);
    }

    //  T I M E     C E L L S
    public void clickTimeCell9AM(){clickButtonWithOutScroll(timeCells9AM);
    }
    public void clickTimeCell1PM(){clickButtonWithOutScroll(timeCells1PM);
    }
    public void clickTimeCell5PM(){clickButtonWithOutScroll(timeCells5PM);
    }
    public void clickTimeCell9PM(){clickButtonWithOutScroll(timeCells9PM);
    }

}
