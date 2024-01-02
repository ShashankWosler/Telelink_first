package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms.PlanNewPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

public class TabPlansNewStep extends PlanNewPage {
    @And("User Select the plan {string} and billing {string} to add")
    public void userSelectPlanBillingType(String invoiceType, String billingType){
        clickSelectPlanDropDown1();
        setImplicit(10);
        selectDropDownFromText(invoiceType);
        setImplicit(10);
        waitFor(2000);
        clickSelectPlanDropDown2();
        setImplicit(10);
        selectDropDownFromText(billingType);
        waitFor(3000);
    }
    @And("User enter title from plan new page")
    public void userEnterTitle(){
        enterTitleInput();
        getID("Plan",clickIdInput());
    }
    @And("User Select ActivityItem {string} and Enter Updated Amount")
    public void userSelectActivityItem(String billingType){
        //Assert.assertTrue(isSelectAllButtonVisible());
        //Assert.assertTrue(isBlueCheckBoxVisible());
        isSelectAllButtonVisible();
        isBlueCheckBoxVisible();
        setImplicit(10);
        clickBlueCheckBox();
        enterBlueCheckBoxAmount();
        switch (billingType){
            case "Monetary Based":
                Assert.assertTrue(isGreenCheckBoxVisible());
                clickGreenCheckBox();
                enterGreenCheckBoxAmount();
                break;
            case "Time Based":
                break;
        }
    }
    @And("User click on plan save button")
    public void userClickOnSaveButton(){
        try{
        setImplicit(10);
        clickSaveButton();
        waitFor(3000);
        if(isCurrentPlanSaveButton()){
            clickCurrentRadioButton();
            setImplicit(10);
            waitElementToBeClickable(currentPlanSaveButton);
            clickCurrentPlanSaveButton();
        }
        }catch (Exception e){System.out.println("TabPlansNewStep.userClickOnSaveButton() -"+e.getClass());
            clickCurrentPlanSaveButton();
        }
    }
}
