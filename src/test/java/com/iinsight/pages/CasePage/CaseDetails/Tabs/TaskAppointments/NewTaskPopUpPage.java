package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;


import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.NewTaskPopUp;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class NewTaskPopUpPage extends NewTaskPopUp {
    public NewTaskPopUpPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void enterTitle(){
        clickButtonWithOutScroll(titleDropDown);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void enterAssignedTo(){
        enterText(assignToInput, "Rajus Kumar");
    }
    public void enterCreatedBy(){
        enterText(createdByInput, "Rajus Kumar");
    }
    public void clickOnSaveButton(){
        clickButtonWithOutScroll(saveButton);
    }

}
