package com.iinsight.pagefactory;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kiosk extends GenericWrappers {
    @FindBy(xpath = "//a[@id='pagesDropdown']//span[text()='Kiosks']/..")
    public WebElement kiosksMenuBar;
    @FindBy(css = "a[href='/kiosk/register']")
    public static WebElement registerKiosksTab;
    @FindBy(id = "name")
    public WebElement nameField;
    @FindBy(id = "submitBtn")
    public WebElement registerBtn;
    @FindBy(id = "checkin")
    public WebElement checkInBox;
    
    @FindBy(xpath = "//strong[text()='TAP ANYWHERE TO CONTINUE']")
    public WebElement TapAnywhere;
    
    @FindBy(id = "inputName")
    public WebElement yourNameField;
    @FindBy(id = "inputPhone")
    public WebElement phoneNumberField;
    @FindBy(id = "inputHCN")
    public WebElement healthCardNumberField;
    @FindBy(id = "quick-join")
    public WebElement connectBtn;
    @FindBy(xpath = "//div[@id='flow-need-permission']//h3")
    public WebElement waitMsg;


}

