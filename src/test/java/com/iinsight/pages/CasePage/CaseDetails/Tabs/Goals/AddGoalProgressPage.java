package com.iinsight.pages.CasePage.CaseDetails.Tabs.Goals;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Goals.AddGoalProgress;
import org.openqa.selenium.support.PageFactory;

public class AddGoalProgressPage extends AddGoalProgress {
    public AddGoalProgressPage(){PageFactory.initElements(getDriver(),this);}

    public boolean isAddProgressVisible(){
        waitVisibilityOfElement(addProgress);
        return isElementDisplayed(addProgress);
    }
    public void clickAddProgressButton(){ clickButtonWithOutScroll(addProgress);
    }
    public void clickCrossButton(){ clickButtonWithOutScroll(crossButton);
    }
    public void clickStatusDropDown(){ clickButtonWithOutScroll(statusDropDOwn);
    }
    public void clickGoalDropDown(){ clickButtonWithOutScroll(goalDropDown);
    }
    public void enterDescriptionInput(){enterText(descriptionInput,"Test Automation - Goal");
    }
    public void clickSaveButton(){ clickButtonWithOutScroll(saveButton);
    }
    public void clickCancelButton(){ clickButtonWithOutScroll(cancelButton);
    }

}
