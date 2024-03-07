package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.TaskMain;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class TaskMainPage extends TaskMain {
    public TaskMainPage(){
        PageFactory.initElements(getDriver(), this);
    }

    // C O M M O N
    public boolean isNewTaskButtonVisible(){
        waitVisibilityOfElement(addNewTaskButton);
        return isElementDisplayed(addNewTaskButton);
    }
    public boolean isNewAppointmentButtonVisible(){
        waitVisibilityOfElement(addNewAppointmentButton);
        return isElementDisplayed(addNewAppointmentButton);
    }

    public void clickEditButton(){clickButtonWithOutScroll(editButton);
    }
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);
    }
    public void clickExportButton(){clickButtonWithOutScroll(exportButton);
    }
    public void clickTaskAppointmentTab(){clickButtonWithOutScroll(taskAppointmentTab);
    }
    public void clickCompletedTaskAppointmentTab(){clickButtonWithOutScroll(completedTaskAppointmentTab);
    }
    public boolean isFirstRowTaskAppointmentVisible(){return isElementDisplayed(emptyRowTaskAppointment);}
    public boolean isFirstRowCompletedAppointmentVisible(){return isElementDisplayed(emptyRowCompletedAppointment);}


    // C O M P L E T E D    A P P O I N T M E N T    T A B
    public boolean isSearchInputCompVisible(){
        waitVisibilityOfElement(compSearchInput);
        return isElementDisplayed(compSearchInput);
    }
    public void clickSearchCompInput(){
        waitElementToBeClickable(compSearchInput);
        clickButtonWithOutScroll(compSearchInput);}

    public void clickByDropDownComp(){clickButtonWithOutScroll(compByDropDown);}
    public void clickFindButtonComp(){clickButtonWithOutScroll(compFindButton);}
    public void clickFieldEditButtonComp(){clickButtonWithOutScroll(compFieldEditButton);}
    public void clickCompGetFirstRow(){
        waitElementToBeClickable(compGetFirstRow);
        clickButtonWithOutScroll(compGetFirstRow);
    }
    public String getTextTitleOfCompFirstRow(){return getAttributeValue(compGetTitleOfFirstRow,"title");}
    public String getTextStatusOfCompFirstRow(){return getAttributeValue(compGetStatusOfFirstRow,"title");}
    public String getTextAssignToOfCompFirstRow(){return getAttributeValue(compGetAssignToOfFirstRow,"title");}

    // T A S K    A P P O I N T M E N T    T A B
    public boolean isSearchInputTaskVisible(){
        waitVisibilityOfElement(taskSearchInput);
        return isElementDisplayed(taskSearchInput);
    }
    public void clickSearchTaskInput(){
        waitElementToBeClickable(taskSearchInput);
        clickButtonWithOutScroll(taskSearchInput);}
    public void clickByDropDownTask(){clickButtonWithOutScroll(taskByDropDown);
    }
    public void clickTaskFieldEditButton(){clickButtonWithOutScroll(taskFieldEditButton);
    }
    public void clickTaskFindButton(){clickButtonWithOutScroll(taskFindButton);
    }
    public void clickTaskFirstOfTable(){
        waitElementToBeClickable(taskFirstOfTable);
        clickButtonWithOutScroll(taskFirstOfTable);
    }
    public String getTaskFirstOfTableText(){
        waitVisibilityOfElement(taskFirstOfTableEmptyRow);
        return getAttributeValue(taskFirstOfTableEmptyRow,"title");}    // Used in Deletion of Appointment
    public String getFirstTaskTitleOfTable(){return getAttributeValue(taskFirstTitleOfTable,"title");
    }
    public String getFirstTaskStatusOfTable(){return getAttributeValue(taskFirstStatusOfTable,"title");
    }
    public String getFirstTaskDateOfTable(){return getAttributeValue(taskFirstDateOfTable,"title");
    }
    public String getFirstTaskAssignToOfTable(){return getAttributeValue(taskFirstAssignToOfTable,"title");
    }
    public String getEndTimeFirstRowText(){return getAttributeValue(EndTimeFirstRow,"title");
    }
    public String getStartTimeFirstRowText(){return getAttributeValue(StartTimeFirstRow,"title");
    }
    public String getTaskFirstAmountOfTableText(){return getAttributeValue(taskFirstAmountOfTable,"title").replaceAll("[^0-9]","");}

    // D E L E T E    P O P - U P
    public boolean isDeletePopUpVisible(){
        waitVisibilityOfElement(deletePopUp);
        return isElementDisplayed(deletePopUp);
    }
    public void clickOkButtonDeletePopUp(){
        clickButtonWithOutScroll(OkButtonDeletePopUp);
    }
    public void clickCancelButtonDeletePopUp(){
        clickButtonWithOutScroll(CancelButtonDeletePopUp);
    }
    public void enterDescriptionButtonDeletePopUp(){
        enterText(DescriptionButtonDeletePopUp, CaseTypeTestData.Description+" Delete Task");
    }
}
