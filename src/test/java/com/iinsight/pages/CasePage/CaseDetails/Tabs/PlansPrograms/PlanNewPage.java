package com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms.PlanNew;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanNewPage extends PlanNew {
    public PlanNewPage(){
        PageFactory.initElements(getDriver(), this);
    }

    // New Plan Bases on Existing Based Template
    public boolean isYesCheckBoxVisible(){
        waitElementToBeClickable(YesCheckBox);
        return isElementDisplayed(YesCheckBox);}
    public void clickYesCheckBox(){clickButtonWithOutScroll(YesCheckBox);}
    public void clickNoCheckBox(){clickButtonWithOutScroll(NoCheckBox);}
    public void clickSelectTemplateDropDown(){clickButtonWithOutScroll(selectTemplateDropDown);}

    // Select Plan Type For Billing
    public void clickSelectPlanDropDown1(){clickButtonWithOutScroll(selectPlanDropDown1);}
    public void clickSelectPlanDropDown2(){clickButtonWithOutScroll(selectPlanDropDown2);}

    // D E T A I L S
    public void enterTitleInput(){
        String fullName=CaseTypeTestData.FirstName+CaseTypeTestData.LastName;
        enterText(titleInput, fullName);}
    public String clickIdInput(){return getAttributeValue(idInput,"value");}
    public void enterCaseNoteInput(){enterText(caseNoteInput,CaseTypeTestData.Description);}

    // G O A L S
    public void clickEmploymentGoalDropDown(){clickButtonWithOutScroll(employmentGoalDropDown);}
    public void clickWorkCapacityGoalDropDown(){clickButtonWithOutScroll(workCapacityGoalDropDown);}
    public void clickWorkActivityGoalDropDown(){clickButtonWithOutScroll(workActivityGoalDropDown);}

    // D A T E      R A N G E
    public void enterStartDate(){enterText(startDate);}
    public void enterFinishDate(){enterText(finishDate);}
    // P L A N      I S
    public void clickDraftCheckbox(){clickButtonWithOutScroll(DraftCheckbox);}
    public void clickScheduledCheckbox(){clickButtonWithOutScroll(ScheduledCheckbox);}
    public void clickClosedCheckbox(){clickButtonWithOutScroll(ClosedCheckbox);}
    public void clickCurrentCheckbox(){clickButtonWithOutScroll(CurrentCheckbox);}
    public void clickAutoActiveCheckBox(){clickButtonWithOutScroll(AutoActiveCheckBox);}

    // L O C A T I O N
    public void clickLocationDropDown(){clickButtonWithOutScroll(locationDropDown);}


    // P L A N      T O T A L    V A L U E
    public String getPlanTotalValue(){      // GetAttribute By data-real_value : Only number 123
        return getAttributeValue(planTotalValue,"data-real_value");}
    public String getPlanTotalCostToDate(){   // GetAttribute By value : R0.00
        return getAttributeValue(planTotalCostToDate,"value");}
    public String getAmountRemaining(){     // GetAttribute By data-real_value : Only number 123
        return getAttributeValue(amountRemaining,"data-real_value");}


    // F I L T E R
    public void enterSearchInput(){enterText(searchInput);}
    public void clickByDropDown(){clickButtonWithOutScroll(byDropDown);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}

    // Estimate Edit Table
    public boolean isSelectAllButtonVisible(){     //Same Method For UnSelect
        waitElementToBeClickable(selectAllButtons.get(0));
        return isElementDisplayed(selectAllButtons.get(0));
    }
    public void clickSelectAllButtons(){ //Same Method For UnSelect
        if(selectAllButtons.size()>0){
            for(WebElement i : selectAllButtons){
                    setImplicit(2);
                    clickButtonWithOutScroll(i);
                    waitFor(100);}}
    }
    public void clickEditAmountCheckBoxes(){
        if(editAmountCheckBoxes.size()>0){
            for(WebElement i : editAmountCheckBoxes){
                setImplicit(2);
                clickButtonWithOutScroll(i);
                waitFor(100);}}
    }
    public void enterAmountsInput(){
        if(amountsInput.size()>0){
            for(WebElement i : amountsInput){
                setImplicit(2);
                enterText(i,CaseTypeTestData.Rate);
                waitFor(100);}}
    }
    public boolean isGreenCheckBoxVisible(){     //Same Method For UnSelect
        waitElementToBeClickable(greenCheckBox);
        return isElementDisplayed(greenCheckBox);
    }
    public void clickGreenCheckBox(){
        try{
            setImplicit(10);
            clickButtonWithOutScroll(greenCheckBox);
       }catch(NoSuchElementException | ElementNotVisibleException e){
            System.out.println("PlanNewPage.clickGreenCheckBox() Exception - "+e.getClass());
            waitFor(2000);
            System.out.println("clickGreenCheckBox.greenCheckBoxFirstIndex() -"+getAttributeValue(greenCheckBoxFirstIndex,"title"));
            clickButtonWithOutScroll(greenCheckBoxFirstIndex);
        }
    }
    public void enterGreenCheckBoxAmount(){
        try{
            setImplicit(10);
        enterText(greenCheckBoxAmount,CaseTypeTestData.Rate);}
        catch(NullPointerException e){
            System.out.println("PlanNewPage.enterGreenCheckBoxAmount -"+e.getClass());
            waitFor(2000);
            enterText(greenCheckBoxAmountFirstIndex,CaseTypeTestData.Rate);}
    }
    public boolean isBlueCheckBoxVisible(){     //Same Method For UnSelect
        waitElementToBeClickable(blueCheckBox);
        return isElementDisplayed(blueCheckBox);
    }
    public void clickBlueCheckBox(){
        try{
            setImplicit(10);
            clickButtonWithOutScroll(blueCheckBox);
        }catch(NoSuchElementException | ElementNotVisibleException e){
            System.out.println("PlanNewPage.clickBlueCheckBox() Exception - "+e.getClass());
            waitFor(2000);
            System.out.println("clickBlueCheckBox.blueCheckBoxFirstIndex() -"+getAttributeValue(blueCheckBoxFirstIndex,"title"));
            clickButtonWithOutScroll(blueCheckBoxFirstIndex);
        }
    }
    public void enterBlueCheckBoxAmount(){
        try{
            setImplicit(10);
            enterText(blueCheckBoxAmount,CaseTypeTestData.Rate);}
        catch(NullPointerException e){
            System.out.println("PlanNewPage.enterBlueCheckBoxAmount -"+e.getClass());
            waitFor(2000);
            enterText(blueCheckBoxAmountFirstIndex,CaseTypeTestData.Rate);}
    }


    // S A V E      B U T T O N
    public void clickSaveButton(){clickButtonWithOutScroll(saveButton);}
    public void clickCancelButton(){clickButtonWithOutScroll(cancelButton);}


    // C U R R E N T    P L A N     P O P   U P
    public boolean isCurrentPlanSaveButton(){
        waitElementToBeClickable(currentPlanSaveButton);
        return isElementDisplayed(currentPlanSaveButton);}
    public void clickCurrentPlanSaveButton(){clickButtonWithOutScroll(currentPlanSaveButton);}
    public void clickCurrentPlanCancelButton(){clickButtonWithOutScroll(currentPlanCancelButton);}
    public void clickConcurrentRadioButton(){clickButtonWithOutScroll(concurentRadioButton);}
    public void clickCurrentRadioButton(){clickButtonWithOutScroll(curentRadioButton);}



}
