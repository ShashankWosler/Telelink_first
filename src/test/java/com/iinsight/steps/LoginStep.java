package com.iinsight.steps;

import com.iinsight.TestData.TestData;
import com.iinsight.pages.LoginPage;
import com.iinsight.utils.GenericWrappers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep extends LoginPage {
    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        new GenericWrappers().openURL();
    }

    @Then("User Login with the Valid Credential")
    public void userLoginWithTheValidCredential() {
        enterEmail();
        enterPassword();
        clickSignInButton();
    }

    @Then("User Login with the InValid Credential")
    public void userLoginWithTheInValidCredential() {
        enterInvalidEmail();
        enterInvalidPassword();
        clickSignInButton();
    }

    @Then("Verify the Error Message")
    public void verifyTheErrorMessage() {
        isElementTextMatch(invalidLoginErrorMsg, TestData.InvalidLoginMessage);
    }
}
