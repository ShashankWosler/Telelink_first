package com.iinsight.pagefactory;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends GenericWrappers {
    @FindBy(id = "user-email")
    public WebElement txt_Username;
    @FindBy(id = "password")
    public static WebElement txt_Password;
    @FindBy(id = "submitBtn")
    public WebElement btn_SignIn;

    @FindBy(xpath = "//div[text()='Email or Password Incorrect']")
    public WebElement invalidLoginErrorMsg;
}

