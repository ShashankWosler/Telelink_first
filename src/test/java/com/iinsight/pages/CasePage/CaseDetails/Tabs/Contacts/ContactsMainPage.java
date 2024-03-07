package com.iinsight.pages.CasePage.CaseDetails.Tabs.Contacts;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Contacts.ContactsMain;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Costs.CostsMain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContactsMainPage extends ContactsMain {
    public ContactsMainPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void getContactsCount(){
        CaseTypeTestData.contactsSize = String.valueOf(contactsCount.size());
        System.out.println("Contacts List Size: "+CaseTypeTestData.contactsSize);
    }

}
