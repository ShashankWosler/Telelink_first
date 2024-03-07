package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Contacts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsMain extends GenericWrappers {
    @FindBy(xpath = "//div[@id='contacts_list']//table//td[contains(@id, 'contacts.name_column')]")
    public List<WebElement> contactsCount;

}