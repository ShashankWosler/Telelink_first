package com.iinsight.pages.Toolbox.Side;

import com.iinsight.pagefactory.Toolbox.Side.Appointments;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
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
    public void hoverZoomInButton(){mouseOver(zoomInButton);
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
    public void clickEmployeeName(){clickButtonWithOutScroll(employeeName);}

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
    // R E C U R R E N T    L E V E L
    public void clickEventCheckBox(){clickButtonWithOutScroll(eventCheckBox);}
    public void clickFollowingCheckBox(){clickButtonWithOutScroll(followingCheckBox);}
    public void clickAllEventsCheckBox(){clickButtonWithOutScroll(allEventsCheckBox);}

    //  T I M E     C E L L S
    public void clickTimeCell9AM(){clickButtonWithOutScroll(timeCells9AM);
    }
    public void clickTimeCell1PM(){clickButtonWithOutScroll(timeCells1PM);
    }
    public void clickTimeCell5PM(){clickButtonWithOutScroll(timeCells5PM);
    }
    public void clickTimeCell9PM(){clickButtonWithOutScroll(timeCells9PM);
    }

    //  C A L E N D E R     T Y P E - A G E N D A
    public boolean isAgendaAppointmentEvent1(){
        waitVisibilityOfElement(agendaAppointmentEvent1);
        return isElementDisplayed(agendaAppointmentEvent1);
    }
    public void hoverAgendaAppointmentEvent1(){mouseOver(agendaAppointmentEvent1);}
    public void hoverAgendaAppointmentEvent2(){mouseOver(agendaAppointmentEvent2);}
    public String getTextAgendaTime1(){return getText(agendaTime1);}
    public String getTextAgendaTime2(){return getText(agendaTime2);}
    public void clickAgendaDayRadio(){clickButtonWithOutScroll(agendaDayRadio);}


    public void overEventElementScrollVerify(){
        boolean flag = false;
        int i =0;
        // while(!(TimeList.isEmpty()))
        {
            System.out.println("while");
            waitFor(2000);
            try{
                flag = isAppointmentEventVisible();}
            catch(Exception e) {
                flag = false;
                System.out.println("catch");
            }
            if(flag){
                System.out.println("if");
                waitFor(1000);
                mouseOver(appointmentEvent);
            } else {
                System.out.println("else");
                waitFor(2000);
                //clickButtonWithOutScroll(TimeList.get(i));
                i++;
            }
        }
    }
    public void overEventElementScrollVerify2(){
        Actions act = new Actions(getDriver());

        Dimension windowSize = getDriver().manage().window().getSize();
        int centerX = windowSize.width / 2;
        int centerY = windowSize.height / 2;
        boolean flag = false;
        while(true){
            //act.clickAndHold(elems);
            System.out.println("while");
            waitFor(1000);
            JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
            String script = String.format("window.scrollTo(%d, %d);", centerX, centerY);
            jsExecutor.executeScript(script);
            System.out.println("try - upper");
            try{
                waitFor(1000);
                flag = isAppointmentEventVisible();
                System.out.println("try");
                if(flag){
                    System.out.println("if");
                    waitFor(2000);
                    Assert.assertEquals(getToolTip1Text(),"Jan 10, 2024 11:30 PM");
                    getDriver().navigate().refresh();
                    break;
                }
            }
            catch(Exception e){System.out.println("catch");}

            waitFor(1000);
            System.out.println("action");
            act.moveByOffset(0,100);
            act.moveByOffset(0, 200).perform();
            act.release().perform();}
    }
    public void overEventElementScrollVerify3(){
        clickPreviousDate();
        waitFor(4000);
        Point hoverItem =getDriver().findElement(By.id("b-scheduler-1-normalSubgrid")).getLocation();
        Actions act = new Actions(getDriver());
        ((JavascriptExecutor)getDriver()).executeScript("return window.title;");
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollBy(0,"+(hoverItem.getY())+");");
        while(true){
            act.moveByOffset(hoverItem.getY(),100).perform();
            waitFor(3000);
            boolean flag = false;
            try{
                flag = isAppointmentEventVisible();
                if(flag){
                    System.out.println("if");
                    mouseOver(appointmentEvent);
                    break;
                }}catch(Exception e){System.out.println("Exception");}
        }
    }


}