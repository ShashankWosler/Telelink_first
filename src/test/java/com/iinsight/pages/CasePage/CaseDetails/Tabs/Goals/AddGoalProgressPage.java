package com.iinsight.pages.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals.AddGoalProgress;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.text.WordUtils;

public class AddGoalProgressPage extends AddGoalProgress {
    public AddGoalProgressPage(){PageFactory.initElements(getDriver(),this);}
    public String getUsername = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," "));

    public boolean isAddProgressVisible(){
        waitVisibilityOfElement(addProgress);
        return isElementDisplayed(addProgress);
    }
    public void clickAddProgressButton(){ clickButtonWithOutScroll(addProgress);
    }
    public void clickCrossButton(){ clickButtonWithOutScroll(crossButton);
    }
    public void clickGoalDropDown(String goalValue){ SelectByVisibleText(goalDropDown,goalValue);
    }
    public void enterDescriptionInput(){
        waitFor(2000);
        enterText(descriptionText,"Test Automation - Goal");
    }
    public void clickSaveButton(){
        try {
            //waitElementToBeClickable(saveButton);
            clickWithJS(saveButton);
        }catch (Exception e){
            System.out.println("AddGoalProgressPage.clickSaveButton()-"+e.getClass()+" "+e.getMessage());
            mouseOver(saveButton);
            clickWithJS(saveButton);
        }
    }
    public void clickCancelButton(){ clickButtonWithOutScroll(cancelButton);
    }

    //  C R E A T I N G    A    N E W    G O A L
    public boolean isCreatePopUpVisible(){
        waitVisibilityOfElement(createPopUp);
        return isElementDisplayed(createPopUp);
    }
    public boolean isEditPopUpVisible(){
        waitVisibilityOfElement(editPopUp);
        return isElementDisplayed(editPopUp);
    }
    public void enterTitle(String titleValue){ enterText(title,titleValue);
    }
    public String getTitle(){return getAttributeValue(dueDateInput,"value");
    }
    public void clickLastDueDate(){
        waitFor(2000);
        waitElementToBeClickable(getLastDueDate);
        clickButtonWithOutScroll(getLastDueDate);
    }
    public void enterAssignToInput(){
        enterTextAppend(assignToInput,getUsername);
    }
    public void clickAssignToDropDown(){clickButtonWithOutScroll(assignToDropDown);
    }
    public String getAssignToInput(){return getAttributeValue(assignToInput,"value");
    }
    public void clickDueDateDropDown(){clickButtonWithOutScroll(dueDateDropDown);
    }
    public void selectStatus(String statusValue){SelectByVisibleText(status,statusValue);
    }
    public void selectPriority(String priorityValue){SelectByVisibleText(priority,priorityValue);
    }
    public String getCaseIDText() {return getAttributeValue(caseId, "value");
    }
    public void clickDisabledCheckBox() {clickButtonWithOutScroll(disabledCheckBox);
    }

}
