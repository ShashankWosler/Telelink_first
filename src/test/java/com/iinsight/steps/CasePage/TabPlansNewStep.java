package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlanNewPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

import java.net.StandardSocketOptions;

public class TabPlansNewStep extends PlanNewPage {
    @And("User Select the plan {string} and billing {string} to add")
    public void userSelectPlanBillingType(String invoiceType, String billingType){
        try{
        waitElementToBeClickable(selectPlanDropDown1);
        clickSelectPlanDropDown1();
        setImplicit(10);
        waitFor(2000);
        selectDropDownFromText(invoiceType);
        setImplicit(10);
        waitFor(2000);
        waitElementToBeClickable(selectPlanDropDown2);
        clickSelectPlanDropDown2();
        setImplicit(10);
        waitFor(2000);
        selectDropDownFromText(billingType);
        waitFor(2000);
        } catch(ElementNotInteractableException e){
            System.out.println("TabPlansNewStep.userSelectPlanBillingType() - ElementNotInteractableException");
        }
    }
    @And("User enter title from plan new page and Get Id of {string} {string}")
    public void userEnterTitle(String invoiceType, String billingType){
        enterTitleInput();
        String concatenatedValue = invoiceType.replaceAll(" ", "") + billingType.replaceAll(" ", "");
        getID(concatenatedValue,clickIdInput());
    }
    @And("User Select ActivityItem {string} and {string} and Enter Updated Amount")
    public void userSelectActivityItem(String invoiceType, String billingType){
        setImplicit(10);
    //This IF_Block -> Used To Scroll Page To TestAutoActivity CTP-403 For (Charge Code Based Plan)
        try
        {if(invoiceType.equals("Charge Code Based Plan")){
            setImplicit(10);
            moveToSelectAllElem();
            Assert.assertTrue(isChargeCodeTextVisible());
            setImplicit(10);
            mouseOver(testActivityText);
            waitFor(2000);
        }
        Assert.assertTrue(isSelectAllButtonVisible());}
        //Line No. 47 Throw Exception - As TestAutoActivity CheckBox Got Hidden if we Move on It
        catch(ElementNotInteractableException | StaleElementReferenceException e){
            System.out.println("TabsPlansNewStep.userSelectActivityItem() - Catch(1) "+e.getClass()+" "+e.getMessage());
            clickBlueCheckBoxSelectAll();
        }
        //Line No. 53 Throw Exception - As We are Clicking On it Again : Explicit Wait Failed If we Combine Both Exceptions
        catch (TimeoutException e){
            System.out.println("TabsPlansNewStep.userSelectActivityItem() - Catch(2) - "+e.getClass()+" "+e.getMessage());
            waitFor(1000);
            clickBlueCheckBoxSelectAll();

        }
        finally {
            //This IF_Block is for Total Sum Plan - Time Based: As It Throw timeoutException
            try{
                if(invoiceType.equals("Total Sum Plan") && billingType.equals("Time Based")){
                    scrollToBottom();
                    waitFor(2000);
                }
        Assert.assertTrue(isBlueCheckBoxVisible());     // Common For All
        setImplicit(10);

        if(invoiceType.equals("Charge Code Based Plan")){
            clickBlueCheckBoxSelectAll();
        }
        else {clickBlueCheckBox();
        }
        enterBlueCheckBoxAmount();
        switch (billingType){
            case "Monetary Based":
                if(invoiceType.equals("Charge Code Based Plan")){
                    mouseOver(testItemText);
                }
                Assert.assertTrue(isGreenCheckBoxVisible());
                clickGreenCheckBox();
                enterGreenCheckBoxAmount();
                break;
            case "Time Based":
                break;
        }}catch(StaleElementReferenceException | TimeoutException e){
                System.out.println("TabPlanNewStep.userSelectActivityItem - Try(2) - "+e.getClass()+" "+e.getMessage());
            }
        }
    }
    @And("User click on plan save button")
    public void userClickOnSaveButton(){
        boolean flag = false;
        try{
        setImplicit(10);
        clickSaveButton();
        waitFor(3000);
        flag = isCurrentPlanSaveButton();
        if(flag){
            clickCurrentRadioButton();
            setImplicit(10);
            waitElementToBeClickable(currentPlanSaveButton);
            clickCurrentPlanSaveButton();
        }
        }catch (Exception e){System.out.println("TabPlansNewStep.userClickOnSaveButton() -"+e.getClass());
        if(flag)
            clickCurrentPlanSaveButton();
        }
    }
}
