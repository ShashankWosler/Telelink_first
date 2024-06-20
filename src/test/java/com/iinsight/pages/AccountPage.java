package com.iinsight.pages;

import org.openqa.selenium.support.PageFactory;

import com.iinsight.TestData.TestData;
import com.iinsight.pagefactory.Account;
import com.iinsight.pagefactory.Kiosk;

public class AccountPage extends Account {
    public AccountPage()
    {
    	PageFactory.initElements(getDriver(), this);
    }
    public void CreateNewAccount(){
        clickButtonWithOutScroll(AccountMenuBar);
        clickButtonWithOutScroll(NewAccountTab);
    }
    public void ClickOnAllAccounttab(){
        clickButtonWithOutScroll(AccountMenuBar);
        clickButtonWithOutScroll(Allaccounttab);
    }
    public void ClickonAccount(){
        clickButtonWithOutScroll(AccountMenuBar);
    }
    public void enterName(String Name) {
        enterTextWithoutScroll(NameTxT, Name);
    }
    public void enterCompanyName(String CmyName) {
        enterTextWithoutScroll(ComnyTxT, CmyName);
    }
    public void clickOnRegisterBtn(){
        clickButtonWithOutScroll(RegisterBtn);
    }
    public void enterNewAccountinSearchtxtBox(String Name) {
        enterTextWithoutScroll(searchBtn, Name);
    }
    public void UpdateAccountdetails() {
    	clickButtonWithOutScroll(ClickonEditforAccount);
        enterTextWithoutScroll(Editname, TestData.randomNumberforAccount());
        enterTextWithoutScroll(Editcompany, TestData.randomNumberforCompany());
        clickButtonWithOutScroll(updatebtnforAccount);
    }

}
