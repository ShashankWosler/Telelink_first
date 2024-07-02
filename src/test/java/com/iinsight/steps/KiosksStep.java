package com.iinsight.steps;

import com.iinsight.TestData.TestData;
import com.iinsight.pages.KioskePage;
import com.iinsight.utils.GenericWrappers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class KiosksStep extends KioskePage {

    @And("User Navigate to Register Kiosk Page")
    public void userNavigateToRegisterKioskPage() {
        gotoRegisterKioskPage();
    }

    @And("User Enter Name and Click on Register")
    public void userEnterNameAndClickOnRegister() {
        enterName(TestData.kioskeName);
        clickOnRegisterBtn();
        waitFor(4000);
        clickOnanywhere();
    }

    @And("User Click on Check-in box")
    public void userClickOnCheckInBox() {
        clickOnCheckInBox();
    }
    

    @And("User enters Information")
    public void userEntersInformation() {
        enterYourName(TestData.yourName);
        enterPhoneNo(TestData.phoneNo);
        enterHealthCarsNo(TestData.healthCardNo);
    }

    @And("User Click on Connect to Assistant button")
    public void userClickOnConnectToAssistantButton() {
        clickOnConnectAssistantBtn();
    }

//    @Then("Verify the {string} message")
//    public void verifyTheMessage(String arg0)
//    {
//    	waitFor(3000);
//    	waitVisibilityOfElement(waitMsg);
//        isElementTextMatch(waitMsg, arg0);
//    }
}
