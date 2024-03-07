package com.iinsight.pages.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals.GoalsMain;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GoalsMainPage extends GoalsMain {
    public GoalsMainPage(){PageFactory.initElements(getDriver(),this);}

    public boolean isNewButtonVisible(){
        waitVisibilityOfElement(newButton);
        return isElementDisplayed(newButton);
    }
    public void clickNewButton(){clickButtonWithOutScroll(newButton);}
    public void clickEditButton(){clickButtonWithOutScroll(editButton);}
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);}
    public void clickDeleteOkButton(){
        waitElementToBeClickable(deleteOkButton);
        clickButtonWithOutScroll(deleteOkButton);
    }
    public void clickDeleteCancelButton(){
        waitElementToBeClickable(deleteCancelButton);
        clickButtonWithOutScroll(deleteCancelButton);
    }
    public boolean isUnableDeletePopUpVisible(){
        waitVisibilityOfElement(unableDeletePopUp);
        return isElementDisplayed(unableDeletePopUp);
    }
    public void clickExportButton(){clickButtonWithOutScroll(exportButton);}
    public void clickAddProgressButton(){clickButtonWithOutScroll(addProgressButton);}

    // G O A L S    T A B
    public boolean isGoalsTabVisible(){
        waitVisibilityOfElement(goalsTab);
        return isElementDisplayed(goalsTab);
    }
    public void clickGoalsTab(){clickButtonWithOutScroll(goalsTab);}
    public void clickGoalTrackingTab(){clickButtonWithOutScroll(goalTrackingTab);}

    // G O A L S    T A B     E L E M E N T S
    public boolean isSearchInputVisible(){
        waitVisibilityOfElement(searchInput);
        return isElementDisplayed(searchInput);
    }
    public void enterSearchInput(){enterText(searchInput,"Test Automation - Goal");}
    public String getAssignToInputText(){return getAttributeValue(assignToInput,"value");}
    public void clickAssignToDropDown(){clickButtonWithOutScroll(assignToDropDown);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}

    // G O A L S    T A B   L I S T I G
    public boolean isTitleVisible(){
        waitVisibilityOfElement(getTitle);
        return isElementDisplayed(getTitle);
    }
    public String getTitleText(){return getAttributeValue(getTitle,"title");}
    public String getDateText(){return getAttributeValue(getData,"title");}
    public String getStatusText(){return getAttributeValue(getStatus,"title");}
    public boolean isPriorityIconVisible(String priorityValue){
        By cssPriority = By.cssSelector("img[src*='"+priorityValue+"']");
        WebElement priorityElem = getDriver().findElement(cssPriority);
        waitPresenceOfElementLocated(cssPriority);
        return isElementDisplayed(priorityElem);

    }
    public String getProgressText(){return getAttributeValue(getProgress,"value");}
    public String getDisableGoal(){return getAttributeValue(goalDisbaleIcon,"data-tooltip");}
    public String getPriorityText(){return getAttributeValue(getPriority,"data-tooltip");}



    // G O A L S    T R A C K I N G     T A B
    public boolean isGoalTrackSearchInputVisible(){
        waitVisibilityOfElement(goalTrackSearchInput);
        return isElementDisplayed(goalTrackSearchInput);
    }
    public void clickGoalTrackEditButton(){clickButtonWithOutScroll(goalTrackEditButton);}
    public void clickGoalTrackDeleteButton(){clickButtonWithOutScroll(goalTrackDeleteButton);}
    public void clickGoalTrackExportButton(){clickButtonWithOutScroll(goalTrackExportButton);}

    public String getGoalTrackByInputText(){return getAttributeValue(goalTrackByInput,"value");}
    public void clickGoalTrackSearchInput(){clickButtonWithOutScroll(goalTrackSearchInput);}
    public void clickGoalTrackByDropDown(){clickButtonWithOutScroll(goalTrackByDropDown);}
    public void clickGoalTrackFindButton(){clickButtonWithOutScroll(goalTrackFindButton);}
    public void clickGoalTrackFieldEditButton(){clickButtonWithOutScroll(goalTrackFieldEditButton);}


    // G O A L S    T R A C K I N G     E L E M E N T S
    public boolean isGetGoalTrackTitleVisible(){
        waitVisibilityOfElement(getGoalTrackTitle);
        return isElementDisplayed(getGoalTrackTitle);
    }
    public String getGoalTrackTitleText(){return getAttributeValue(getGoalTrackTitle,"title");}
    public String getGoalTrackProgressText(){return getAttributeValue(getGoalTrackProgress,"title");}
    public void deleteAllProgress(){
        System.out.println("deleteAllProgress.size(): "+addedProgressList.size());
        for(int i=addedProgressList.size();i>=1;i--){
            By xpath = By.xpath("//div[@id='goals_progress_list']//tr["+i+"]");
            WebElement elem = getDriver().findElement(xpath);
            waitElementToBeClickable(elem);
            clickGoalTrackDeleteButton();
            Assert.assertTrue(isElementDisplayed(deleteOkButton));
            clickDeleteOkButton();
            waitFor(2000);
        }
    }
}
