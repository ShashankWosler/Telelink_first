package com.iinsight.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.iinsight.utils.GenericWrappers;

public class Account extends GenericWrappers {
	
	
	
	
	@FindBy(xpath = "//span[text()='Accounts']")
    public WebElement AccountMenuBar;
    @FindBy(xpath = "//a[text()='New Account']")
    public WebElement NewAccountTab;
    @FindBy(id = "name")
    public WebElement NameTxT;
    @FindBy(id = "companyName")
    public WebElement ComnyTxT;
    @FindBy(id = "submitBtn")
    public WebElement RegisterBtn;
    @FindBy(xpath = "//div[text()='New Account Created Successfully']")
    public WebElement VerifySuccessSmg;
    @FindBy(xpath = "//div[text()='New Account Created Successfully']")
    public WebElement verifyAcctcreatedsuccessMsg;
    
    @FindBy(xpath = "//a[text()='All Accounts']")
    public WebElement Allaccounttab;
    
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBtn;
    @FindBy(xpath = "//table[@id='accountsTable']//td[contains(text(),'Demouser')]")
    public WebElement verifyAccountName;
  
    @FindBy(xpath = "//button[@title='Edit Recipe']")
    public WebElement ClickonEditforAccount;
    
    @FindBy(xpath = "//input[@name='name']")
    public WebElement Editname;
    @FindBy(xpath = "//input[@name='companyName']")
    public WebElement Editcompany;
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement updatebtnforAccount;
  
  
  
  
}
