package com.iinsight.steps.LoginPage;

import com.iinsight.pages.LoginPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends LoginPage {
    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
       // new GenericWrappers().openURL();
    }

    @Then("User Login with the Valid Credential")
    public void userLoginWithTheValidCredential() {
        enterEmail();
        enterPassword();
        clickSignInButton();
        clickProceedButton();
    }


}
