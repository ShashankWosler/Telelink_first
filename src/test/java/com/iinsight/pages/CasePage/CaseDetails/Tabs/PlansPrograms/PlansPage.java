package com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms.Plans;

import org.openqa.selenium.support.PageFactory;

public class PlansPage extends Plans {
    public PlansPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isSaveAsTemplateButtonVisible(){
        setImplicit(10);
        waitElementToBeClickable(saveAsTemplateButton);
        return isElementDisplayed(saveAsTemplateButton);}
    public void clickSavesAsTemplateButton(){clickButtonWithOutScroll(saveAsTemplateButton);}
    public void clickSearchInputText(String searchedValue){enterText(searchInputText, searchedValue);}
    public void clickByDropDownButton(){clickButtonWithOutScroll(byDropDownButton);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public String getTitleOfCreatedPlan(){return getAttributeValue(TitleOfCreatedPlan,"title");}
    public String clickGetIdOfCreatedPlan(){return getInnerText(IdOfCreatedPlan);}

    // P L A N      R E P O R T         P R E V I E W
    public boolean isTitleReportPreviewVisible(){
        waitElementToBeClickable(titleReportPreview);
        return isElementDisplayed(titleReportPreview);}

    public boolean isCancelReportPreview(){
        waitElementToBeClickable(cancelReportPreview);
        return isElementDisplayed(cancelReportPreview);}
    public void clickCancelReportPreview(){clickButtonWithOutScroll(cancelReportPreview);}
    public String getActualCaseBillAmount(){return getInnerText(actualCaseBillingAmt);}

}