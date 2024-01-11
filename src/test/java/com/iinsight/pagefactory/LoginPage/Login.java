package com.iinsight.pagefactory.LoginPage;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends GenericWrappers {
    @FindBy(id = "username")
    public WebElement txt_Username;
    @FindBy(css = "[type=password]")
    public static WebElement txt_Password;
    @FindBy(id = "login_btn")
    public WebElement btn_SignIn;
    @FindBy(id = "force_one_user_ok")
    public WebElement proceed_Btn;

}

