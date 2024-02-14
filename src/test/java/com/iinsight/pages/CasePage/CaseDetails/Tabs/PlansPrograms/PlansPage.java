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
    public void clickSavesAsTemplateButton(){
        mouseOver(saveAsTemplateButton);
        clickButtonWithOutScroll(saveAsTemplateButton);}
    public void clickSearchInputText(String searchedValue){enterText(searchInputText, searchedValue);}
    public void clickByDropDownButton(){clickButtonWithOutScroll(byDropDownButton);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public String getTitleOfCreatedPlan(){return getAttributeValue(TitleOfCreatedPlan,"title");}
    public String clickGetIdOfCreatedPlan(){return getInnerText(IdOfCreatedPlan);}
    public void clickLastRow(){clickButtonWithOutScroll(getLastRow);}
    public String getPlanIDTemplateFirstRowText(){return getAttributeValue(getPlanIDTemplateFirstRow,"title");}
    public String getTitleTemplateFirstRowText(){return getAttributeValue(getTitleTemplateFirstRow,"title");}

    // P L A N      R E P O R T         P R E V I E W
    public boolean isTitleReportPreviewVisible(){
        waitElementToBeClickable(titleReportPreview);
        return isElementDisplayed(titleReportPreview);}

    public boolean isCancelReportPreview(){
        waitElementToBeClickable(cancelReportPreview);
        return isElementDisplayed(cancelReportPreview);}
    public void clickCancelReportPreview(){clickButtonWithOutScroll(cancelReportPreview);}
    public String getActualCaseBillAmount(){return getInnerText(actualCaseBillingAmt);}

    // C O P Y      E S T I M A T E     T E M P L A T E
    public boolean isCopyEstimatePopUpVisible(){
        waitElementToBeClickable(copyEstimatePopUp);
        return isElementDisplayed(copyEstimatePopUp);
    }
    public void clickCopyEstimateOkButton(){clickButtonWithOutScroll(copyEstimateOkButton);
    }
    public void clickCopyEstimateCancelButton(){clickButtonWithOutScroll(copyEstimateCancelButton);
    }
}
