package com.iinsight.pages.LoginPage;

import com.iinsight.pagefactory.LoginPage.Login;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Login {
    public LoginPage(){PageFactory.initElements(getDriver(), this);
    }
    public void enterEmail() {
        enterTextWithoutScroll(txt_Username,globalUserName);
    }
    public void enterPassword()
    {
        enterTextWithoutScroll(txt_Password, globalPassword);
    }
    public void clickSignInButton() {
        clickButtonWithOutScroll(btn_SignIn);
        waitFor(4000);
    }
    public void clickProceedButton()
    {
        boolean flag = false;
        flag = isElementDisplayed(proceed_Btn);
        if(flag){
            waitElementToBeClickable(proceed_Btn);
            clickButtonWithOutScroll(proceed_Btn);}
        else{
            System.out.println("LoginPage.clickProceedButton() Skipped To Click");}
    }
    public boolean isEmailTextBoxDisplayed() {return isElementDisplayed(txt_Username);
    }
    public boolean isPasswordTextBoxDisplayed() {return isElementDisplayed(txt_Password);
    }
    public boolean isSigninButtonDisplayed() {return isElementDisplayed(btn_SignIn);
    }

}