package com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms;


import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms.PlansProgramsMain;

import org.openqa.selenium.StaleElementReferenceException;
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
    public void clickTemplateTab(){
        waitElementToBeClickable(templateTab);
        clickButtonWithOutScroll(templateTab);}
    public boolean isNewButtonVisible(){
        waitElementToBeClickable(newButton);
        return isElementDisplayed(newButton);}
    public void clickNewButton(){
        waitElementToBeClickable(newButton);
        clickButtonWithOutScroll(newButton);
    }
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);}
    public void clickDetailsButton(){
        waitElementToBeClickable(detailsButton);
        clickButtonWithOutScroll(detailsButton);}
    public void clickCurrentButton(){clickButtonWithOutScroll(currentButton);}
    public void clickPreviewButton(){clickButtonWithOutScroll(previewButton);}
    public void clickLastRow(){
        try {
            waitElementToBeClickable(getLastRow);
            mouseOver(getLastRow);
        }catch(StaleElementReferenceException e){
            System.out.println("PlansProgramsMainPage.clickLastRow() -"+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            mouseOverClick(getLastRow);
        }
    }
    public void moveToCurrentPlanInputTab(){mouseOver(currentPlanInput);
    }
    public void clickActivePlanRow(){
        mouseOver(getActivePlanRow);
        clickButtonWithOutScroll(getActivePlanRow);
    }
    public String getCurrentActivePlanID(){
        waitVisibilityOfElement(currentPlanId);
        return getAttributeValue(currentPlanId,"title");}
    public void getPlansCount(){
        CaseTypeTestData.plansSize = String.valueOf(plansCount.size());
        System.out.println("Plans List Size: "+CaseTypeTestData.plansSize);
    }


    // P L A N      D E L E T E      P O P       U P
    public boolean isPlanDeletePopUpVisible(){      // Pop-Up [Plan Delete, Plan New] : Same Methods
        waitElementToBeClickable(planDeletePopUp);
        return isElementDisplayed(planDeletePopUp);}
    public void clickDeletePopUpOkButton(){clickButtonWithOutScroll(deletePopUpOkButton);}
    public void clickDeletePopUpCancelButton(){clickButtonWithOutScroll(deletePopUpCancelButton);}

}
