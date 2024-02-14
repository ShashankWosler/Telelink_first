package com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms.PlanNew;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

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
    public String getTemplateInput(){
        waitElementToBeClickable(getTemplateInput);
        return getAttributeValue(getTemplateInput,"value");}

    // Select Plan Type For Billing
    public void clickSelectPlanDropDown1(){clickButtonWithOutScroll(selectPlanDropDown1);}
    public void clickSelectPlanDropDown2(){clickButtonWithOutScroll(selectPlanDropDown2);}

    // D E T A I L S
    public void enterTitleInput(){
        String fullName=CaseTypeTestData.FirstName+CaseTypeTestData.LastName;
        enterText(titleInput, fullName);}
    public void enterTemplateTitleInput(){
        String fullName=CaseTypeTestData.FirstName+CaseTypeTestData.TemplateLastName;
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
        return getAttributeValue(amountRemaining,"value").replaceAll(",",".");}

    public String getAmountRemainingGST(){return getAttributeValue(amountRemainingGST,"value").replaceAll(",",".");
    }
    public String getAmountRemainingEx(){return getAttributeValue(amountRemainingEx,"value").replaceAll(",",".");
    }
    public void getExistingPlanAmounts(){
        ArrayList<String> amountList = new ArrayList<String>();
        for(WebElement e : getAllAmountsInputs){
            String amountS = getAttributeValue(e,"data-real_value");
            amountList.add(amountS);
        }
        CaseTypeTestData.ExistingPlanAmounts = amountList.stream()
                .filter(value -> !value.equals("0"))
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public void getAllTemplateAmounts(){
        ArrayList<String> amountList = new ArrayList<String>();
        for(WebElement e : getAllAmountsInputs){
            String amountS = getAttributeValue(e,"data-real_value");
            amountList.add(amountS);
        }
        CaseTypeTestData.TemplateAmounts = amountList.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public void verifyZeroValues(){
        String DefaultPlanTotalValueSection = "0.00"; //9 + 3 (Activity) Elements
        String DefaultPlanTotalActivitiesSection = "00:00"; //3 Elements
        String DefaultPlanTotalItemsSection = "0"; //6 Elements

        for(int i=0;i<getAllAmountsInputs.size();i++){
            String amountS = getAttributeValue(getAllAmountsInputs.get(i),"value").replaceAll("[^0-9]","");
            //int amountI = Integer.parseInt(amountS);
            Assert.assertTrue(amountS.contains(DefaultPlanTotalItemsSection));
            /*if(amountI < 9){
                Assert.assertEquals(amountS,DefaultPlanTotalValueSection);
            } else if(amountI < 12){
                Assert.assertEquals(amountS,DefaultPlanTotalActivitiesSection);
            } else if (amountI < 15){
                Assert.assertEquals(amountS,DefaultPlanTotalValueSection);
            } else if(amountI < 18){
                Assert.assertEquals(amountS,DefaultPlanTotalItemsSection);
            } else if(amountI < 21){
                Assert.assertTrue(amountS.contains(DefaultPlanTotalItemsSection));
            }*/
        }
    }


    // F I L T E R
    public void enterSearchInput(){enterText(searchInput);}
    public void clickByDropDown(){clickButtonWithOutScroll(byDropDown);}
    public void clickFindButton(){clickButtonWithOutScroll(findButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}

    // Estimate Edit Table

    public void moveToSelectAllElem(){mouseOver(chargeCodeText);}
    public boolean isSelectAllButtonVisible(){     //Same Method For UnSelect
        try {
            waitElementToBeClickable(selectAllButtons.get(0));
            return isElementDisplayed(selectAllButtons.get(0));
        }catch(ElementNotInteractableException | IndexOutOfBoundsException e){
            System.out.println("PlanNewPage.isSelectAllButtonVisible() - :"+e.getClass()+" "+e.getMessage());
            return false;
        }
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
       }catch(NoSuchElementException | ElementNotInteractableException e){
            System.out.println("PlanNewPage.clickGreenCheckBox() Exception - "+e.getClass());
            waitFor(2000);
            System.out.println("clickGreenCheckBox.greenCheckBoxFirstIndex() -"+getAttributeValue(greenCheckBoxFirstIndex,"title"));
            //clickButtonWithOutScroll(greenCheckBoxFirstIndex);
        }
    }
    public void enterGreenCheckBoxAmount(){
        try{
            setImplicit(10);
            enterTextAndClearAll(greenCheckBoxAmount,CaseTypeTestData.Rate);}
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
        }catch(ElementNotInteractableException | StaleElementReferenceException e){
            System.out.println("PlanNewPage.clickBlueCheckBox() - "+e.getClass()+ " "+e.getMessage());
        }
    }
    public boolean isBlueCheckBoxSelectAllButton(){return isElementDisplayed(blueCheckBoxSelectAllButton);}
    public void clickBlueCheckBoxSelectAll(){       //TestAutoActivity (SelectAll Button)
        waitVisibilityOfElement(blueCheckBoxSelectAllButton);
        waitElementToBeClickable(blueCheckBoxSelectAllButton);
        clickButtonWithOutScroll(blueCheckBoxSelectAllButton);
    }
    public void enterBlueCheckBoxAmount(){
        try{
            setImplicit(10);
            enterTextAndClearAll(blueCheckBoxAmount,CaseTypeTestData.Rate);}
        catch(InvalidElementStateException e){
            System.out.println("PlanNewPage.enterBlueCheckBoxAmount -"+e.getClass());
            //waitFor(2000);
            //enterText(blueCheckBoxAmountFirstIndex,CaseTypeTestData.Rate);
            }
    }

    // CHARGE CODE BASED PLAN
    public boolean isChargeCodeTextVisible(){
        waitVisibilityOfElement(chargeCodeText);
        return isElementDisplayed(chargeCodeText);
    }

    // S A V E      B U T T O N
    public void clickSaveButton(){
        waitElementToBeClickable(saveButton);
        clickButtonWithOutScroll(saveButton);}
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
