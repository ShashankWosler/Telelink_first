package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseDetails.Tabs.Costs.CostsMainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class TabCostsMainSteps extends CostsMainPage {

    @And("Verify that new Created {string} is listed in Cost list under Costs Tab")
    public void verifyThatNewCreatedCostIsListedInCostListUnderCostsTab(String cost) {
        getCostID(cost.replaceAll(" ",""));
        if(cost.equals("New cost")){
            String exp = getTodayDate()+" "+CaseTypeTestData.FromTimeOneDigitHour+" - "+CaseTypeTestData.Appointment_Title;
            Assert.assertTrue("E:"+getTextAppointmentToolTip()+" A:"+exp,getTextAppointmentToolTip().equalsIgnoreCase(exp));
        }
    }
    @And("Verify that new Created {string} with {string} is listed in Zero Cost list under Costs Tab")
    public void getBillIdForZeroCreatedCase(String cost, String vatValue){
        waitFor(4000);
        isCostFormVisible();
        System.out.println(getChargeText()+" "+CaseTypeTestData.Total);
        System.out.println(getDurationTab()+" "+CaseTypeTestData.Duration);
        System.out.println(getTotalCharge()+" "+CaseTypeTestData.Total);
        System.out.println(getActivityChargeTab()+" "+CaseTypeTestData.Total);
        switch (vatValue){
            case "With":
                CaseTypeTestData.BillingNumber = getAttributeValue(cost_ID , "title");
                Assert.assertTrue(getChargeText().contains(CaseTypeTestData.Total));
                Assert.assertEquals(getDurationTab(),CaseTypeTestData.Duration);
                Assert.assertTrue(getTotalCharge().contains(CaseTypeTestData.Total));
                Assert.assertTrue(getActivityChargeTab().contains(CaseTypeTestData.Total));
                Assert.assertTrue(getQuantity().contains("0"));
                Assert.assertTrue(getItemCharge().contains("0"));
                break;
            case "Without":
                CaseTypeTestData.BillingNumber = getAttributeValue(cost_ID , "title");
                Assert.assertTrue(getChargeText().contains(CaseTypeTestData.SubTotal));
                Assert.assertEquals(getDurationTab(),CaseTypeTestData.Duration);
                Assert.assertTrue(getTotalCharge().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue(getActivityChargeTab().contains(CaseTypeTestData.SubTotal));
                Assert.assertTrue(getQuantity().contains("0"));
                Assert.assertTrue(getItemCharge().contains("0"));
                break;
        }
            }
    @And("User Click on Billing button from Costs tab")
    public void clickOnCostsBillingButton(){
        try{
        waitVisibilityOfElement(billingButton);
        waitElementToBeClickable(billingButton);
        Assert.assertTrue(isBillingButtonIsVisible());
        clickBillingButton();}
        catch (StaleElementReferenceException | TimeoutException e){
            System.out.println("TabCostsMainSteps.clickOnCostsBillingButton(): "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            clickBillingButton();
        }
    }
    @And("User Click on Edit button from Costs tab")
    public void clickOnCostsEditButton(){
        try{
            clickFirstRow();
            getAllChargesAmount();
            waitVisibilityOfElement(editButton);
            waitElementToBeClickable(editButton);
            Assert.assertTrue(isBillingButtonIsVisible());
            clickEditButton();
        } catch (StaleElementReferenceException | TimeoutException e){
            System.out.println("TabCostsMainSteps.clickOnCostsBillingButton(): "+e.getClass()+" "+e.getMessage());
            waitFor(2000);
            clickEditButton();
        }
    }

    @Then("Verify Button on Costs Tab are {string}")
    public void verifyButtonOnCostsTabAreDisabled(String buttonType) {
        switch (buttonType){
            case "Disabled":
                Assert.assertEquals(getAttributeValue(deleteButton,"disabled"),"true");
                Assert.assertEquals(getAttributeValue(billingButton,"disabled"),"true");
                Assert.assertEquals(getAttributeValue(editButton,"disabled"),"true");
                break;
            case "Enabled":
                Assert.assertEquals(getAttributeValue(deleteButton,"disabled"),"false");
                Assert.assertEquals(getAttributeValue(billingButton,"disabled"),"false");
                Assert.assertEquals(getAttributeValue(editButton,"disabled"),"false");
                break;
        }

    }
    @And("User Get All Billing Amount From Cost Page")
    public void getAmountsFromCostPage(){
        clickFirstRow();
        getAllChargesAmount();
        getAllDurations();
    }
    @And("Verify Number of Cost added")
    public void verifyNumberOfCostAdded() {
        waitFor(5000);
        getCostList();
    }

}
