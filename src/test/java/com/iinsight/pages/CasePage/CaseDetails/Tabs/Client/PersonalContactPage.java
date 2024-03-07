package com.iinsight.pages.CasePage.CaseDetails.Tabs.Client;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Client.PersonalContact;
import org.openqa.selenium.support.PageFactory;

public class PersonalContactPage extends PersonalContact {
    public PersonalContactPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isTitleTabIsVisible(){
        waitFor(2000);
        waitElementToBeClickable(titleTab);
        return isElementDisplayed(titleTab);}
    public String getTextTitleTabText(){return getAttributeValue(titleTab, "value");}
    public String getTextFirstNameTab(){return getAttributeValue(firstNameTab, "value");}
    public String getTextLastNameTab(){return getAttributeValue(lastNameTab, "value");}
    public String getTextPhoneNumTab(){return getAttributeValue(phone1Tab, "value");}
    public String getTextMobileTab(){return getAttributeValue(mobileTab, "value");}
    public String getTextEmailTab(){return getAttributeValue(emailTab, "value");}
    public String getTextEmployerNameTab(){return getAttributeValue(employerTab, "value");}
    public String getTextCompanyNameTab(){return getAttributeValue(companyName, "value");}
}
