package com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments;


import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.TaskAppointments.NewTaskPopUp;
import org.apache.commons.text.WordUtils;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;

public class NewTaskPopUpPage extends NewTaskPopUp {
    public NewTaskPopUpPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public String getUsername = WordUtils.capitalizeFully(globalUserName.substring(0, globalUserName.indexOf("@")).replace("."," "));;
    public String[] getUsernameArray = getUsername.split(" ");
    public boolean isNewTaskPopUpVisible(){
        waitVisibilityOfElement(newTaskPopUpVisible);
        return isElementDisplayed(newTaskPopUpVisible);
    }
    public void enterTitleInput(){
        waitElementToBeClickable(titleInput);
        enterText(titleInput, CaseTypeTestData.TaskTitle);
    }
    public void clickTitleDropDown(){
        waitElementToBeClickable(titleDropDown);
        clickButtonWithOutScroll(titleDropDown);
    }

    public void enterAssignTo(){
        try{
            //enterText(assignToInput,getUsernameArray[0]);
            enterTextAppend(assignToInput," "+getUsernameArray[0]);
            waitFor(2000);
            selectDropDownFromText(getUsernameArray[0]+" "+getUsernameArray[1]);
            String exp = getAttributeValue(assignToInput,"value");
            waitFor(2000);
            Assert.assertEquals(exp,getUsername);
            waitFor(2000);
        }catch (StaleElementReferenceException e){
            System.out.println("NewTaskPopUpPage.enterAssignTo() - StaleElementReferenceException");
        }
    }
    public void enterCreatedBy(){
        try{
            //  enterText(createdByInput,getUsernameArray[0]);
            enterTextAppend(createdByInput," "+getUsernameArray[0]);
            waitFor(2000);
            selectDropDownFromText(getUsernameArray[0]+" "+getUsernameArray[1]);
            String exp = getAttributeValue(createdByInput,"value");
            Assert.assertEquals(exp,getUsername);
            waitFor(2000);

        }catch (StaleElementReferenceException e){
            System.out.println("NewTaskPopUpPage.enterCreatedBy() - StaleElementReferenceException");
        }}
    public void enterDueDate(){
        clickButtonWithOutScroll(dueDateDropDown);
        waitVisibilityOfElement(dateDialog);
        enterText(dueDateInput,getTodayDate());
        //Assert.assertTrue(isElementDisplayed(dateDialog));
        clickButtonWithOutScroll(dueDateDropDown);

    }
    public void selectStatusFromDropdown(String status){
        SelectByVisibleText(statusDropDown,status);
    }
    public void selectPriorityFromDropdown(String priority){
        SelectByVisibleText(priorityDropDown,priority);
    }
    public void clickDescription(){clickButtonWithOutScroll(descriptionBox);}
    public void enterDescription(){
        setImplicit(60);
        waitElementToBeClickable(descriptionBox);
        enterTextWithJS(descriptionBox,CaseTypeTestData.Description+" New Task");}
    public void clickOnSaveButton(){
        clickButtonWithOutScroll(saveButton);
    }
    public void clickOnCancelButton(){
        clickButtonWithOutScroll(cancelButton);
    }
    public boolean isCancelButtonVisible(){return isElementDisplayed(cancelButton);}

    // A D D     V A L U E     T O     T H E     L I S T

    public boolean isAddValuePopUpVisible(){
        waitVisibilityOfElement(addValuePopUp);
        return isElementDisplayed(addValuePopUp);
    }
    public void clickYesButtonAddPopUp(){
        waitElementToBeClickable(YesButtonAddPopUp);
        clickButtonWithOutScroll(YesButtonAddPopUp);
    }
    public void clickNoButtonAddPopUp(){
        clickButtonWithOutScroll(NoButtonAddPopUp);
    }
    public void clickCancelButtonAddPopUp(){
        clickButtonWithOutScroll(CancelButtonAddPopUp);
    }

}
