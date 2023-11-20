package com.iinsight.pages.Toolbox.Top.MyDashboard;

import com.iinsight.pagefactory.Toolbox.Top.MyDashboard.TaskAppointments;
import org.openqa.selenium.support.PageFactory;

public class TaskAppointmentsPage extends TaskAppointments {
    public TaskAppointmentsPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isNewTaskBtnVisible(){return isElementDisplayed(newTaskBtn);}
    public boolean isSearchTabVisible(){return isElementDisplayed(searchTab);}
    public boolean isMyTaskAppBtnVisible(){return isElementDisplayed(myTaskAppBtn);}
    public boolean isCompletedTaskAppBtnVisible(){return isElementDisplayed(completedTaskAppBtn);}
    public boolean isAssignDropDownVisible(){return isElementDisplayed(assignDropDown);}
    public boolean isFindBtnVisible(){return isElementDisplayed(findBtn);}
    public boolean isExportBtnVisible(){return isElementDisplayed(exportBtn);}
    public boolean isTaskAppDeleteBtnVisible(){return isElementDisplayed(taskAppDeleteBtn);}
    public boolean isEditBtnVisible(){return isElementDisplayed(editBtn);}
    public boolean isNewAppointmentsBtnVisible(){return isElementDisplayed(newAppointmentsBtn);}
    public boolean isFieldsEditBtnVisible(){return isElementDisplayed(fieldsEditBtn);}
    public boolean isAssignToColumnVisible(){return isElementDisplayed(assignToColumn);}

    public void clickNewTaskBtn(){clickButtonWithOutScroll(newTaskBtn);}
    public void clickSearchTab(){clickButtonWithOutScroll(searchTab);}
    public void clickMyTaskAppBtn(){clickButtonWithOutScroll(myTaskAppBtn);}
    public void clickCompletedTaskAppBtn(){clickButtonWithOutScroll(completedTaskAppBtn);}
    public void clickAssignDropDown(){clickButtonWithOutScroll(assignDropDown);}
    public void clickFindBtn(){clickButtonWithOutScroll(findBtn);}
    public void clickExportBtn(){clickButtonWithOutScroll(exportBtn);}
    public void clickTaskAppDeleteBtn(){clickButtonWithOutScroll(taskAppDeleteBtn);}
    public void clickEditBtn(){clickButtonWithOutScroll(editBtn);}
    public void clickNewAppointmentsBtn(){clickButtonWithOutScroll(newAppointmentsBtn);}
    public void clickFieldsEditBtn(){clickButtonWithOutScroll(fieldsEditBtn);}
    public void clickAssignToColumn(){clickButtonWithOutScroll(assignToColumn);}

}
