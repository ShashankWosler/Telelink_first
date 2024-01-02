package com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms;


import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms.PlansProgramsMain;

import org.openqa.selenium.support.PageFactory;

public class PlansProgramsMainPage extends PlansProgramsMain {
    public PlansProgramsMainPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isPlansTabVisible(){
        waitElementToBeClickable(plansTab);
        return isElementDisplayed(plansTab);}
    public void clickPlansTab(){clickButtonWithOutScroll(plansTab);}

    public boolean isTemplateTabVisible(){
        waitElementToBeClickable(templateTab);
        return isElementDisplayed(templateTab);}
    public void clickTemplateTab(){clickButtonWithOutScroll(templateTab);}
    public boolean isNewButtonVisible(){
        waitElementToBeClickable(newButton);
        return isElementDisplayed(newButton);}
    public void clickNewButton(){clickButtonWithOutScroll(newButton);}
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);}
    public void clickDetailsButton(){clickButtonWithOutScroll(detailsButton);}
    public void clickCurrentButton(){clickButtonWithOutScroll(currentButton);}
    public void clickPreviewButton(){clickButtonWithOutScroll(previewButton);}

    // P L A N      D E L E T E      P O P       U P
    public boolean isPlanDeletePopUpVisible(){      // Pop-Up [Plan Delete, Plan New] : Same Methods
        waitElementToBeClickable(planDeletePopUp);
        return isElementDisplayed(planDeletePopUp);}
    public void clickDeletePopUpOkButton(){clickButtonWithOutScroll(deletePopUpOkButton);}
    public void clickDeletePopUpCancelButton(){clickButtonWithOutScroll(deletePopUpCancelButton);}

}
