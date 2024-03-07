package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.Settings.SettingsMainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

public class SettingsMainStep extends SettingsMainPage {
    String within30Days = get6DaysLaterDate();
    String over30Days = get30DaysLaterDate();
    @And("User Enable the {string}")
    public void clickCheckBoxSettingPage(String checkBox){
        Assert.assertTrue(isSettingTextVisible());
        switch (checkBox){
            case "Enable Case Alert":
                clickEnableCaseAlertCheckBox();
                break;
            case "Exclude case from Automated Archival/Deletion":
                clickExcludeCaseCheckBox();
                break;
            case "Allow receiving SMS notifications":
                clickReceiveSmsNotificationsCheckBox();
                break;
            case "Allow receiving email notifications":
                clickReceiveEmailNotificationsCheckBox();
                break;
        }
    }

    @And("User enter Deletion Date {string}")
    public void userEnterDeleteDate(String dateType){
        switch (dateType){
            case "30 Days Later":
                enterDeletionDateInput(over30Days);
                break;
            case "Within 30 Days":
                enterDeletionDateInput(within30Days);
                break;
        }
    }

    @And("User enter Archival Date {string}")
    public void userEnterArchivalDate(String dateType){
        switch (dateType){
            case "30 Days Later":
                enterArchivalDateInput(over30Days);
                break;
            case "Within 30 Days":
                enterArchivalDateInput(within30Days);
                break;
        }
    }

    @And("User Click on Settings Save Button")
    public void clickOnSaveButtonSetting(){
        Assert.assertTrue(isSettingTextVisible());
        try{
        clickSaveButton();
        }catch(StaleElementReferenceException e){
            System.out.println("SettingMainStep.clickOnSaveButtonSetting() -"+e.getClass());
            clickSaveButton();
            waitFor(4000);
        }
    }

    @And("User Remove {string} Date Filter")
    public void removeDateFilter(String dateType){
        switch (dateType){
            case "Deletion":
                try{
                waitElementToBeClickable(deletionDateInput);
                deletionDateInput.clear();
                } catch(Exception e){
                    waitFor(2000);
                    deletionDateInput.clear();
                }
                break;
            case "Archival":
                try{
                waitElementToBeClickable(archivalDateInput);
                archivalDateInput.clear();
                } catch(Exception e) {
                    waitFor(2000);
                    archivalDateInput.clear();
                }
                break;
        } waitFor(4000);
    }
    @And("Verify {string} are Visible")
    public void verifyContactNotificationCheckBoxes(String fieldToVerify){
        switch (fieldToVerify){
            case "Contact Notification checkboxes":
                Assert.assertTrue(isReceiveSmsNotificationsCheckBoxVisible());
                Assert.assertTrue(isReceiveEmailNotificationsCheckBoxVisible());
                break;
            case "Finance Template":
                Assert.assertTrue(isElementDisplayed(invoiceTemplateDropDown));
                Assert.assertTrue(isElementDisplayed(paymentTemplateDropDown));
                Assert.assertTrue(isElementDisplayed(refundTemplateDropDown));
                Assert.assertTrue(isElementDisplayed(adjustmentTemplateDropDown));
                Assert.assertTrue(isElementDisplayed(MonetaryBasedDropDown));
                Assert.assertTrue(isElementDisplayed(timeBasedDropDown));
                break;
        }

    }
}

