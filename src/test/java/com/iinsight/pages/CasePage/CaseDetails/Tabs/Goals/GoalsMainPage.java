package com.iinsight.pages.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals.GoalsMain;
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
    public String getDataText(){return getAttributeValue(getData,"title");}
    public String getStatusText(){return getAttributeValue(getStatus,"title");}
    public String getPriorityText(){return getAttributeValue(getPriority,"data-tooltip");}
    public String getProgressText(){return getAttributeValue(getProgress,"value");}

    // G O A L S    T R A C K I N G     T A B
    public boolean isGoalTrackSearchInputVisible(){
        waitVisibilityOfElement(goalTrackSearchInput);
        return isElementDisplayed(goalTrackSearchInput);
    }
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

}
