package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Client;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalContact extends GenericWrappers {
    @FindBy(css="[id='case_details.client_title']")
    public WebElement titleTab;
    @FindBy(css="[id='case_details.client_first_name']")
    public WebElement firstNameTab;
    @FindBy(css="[id='case_details.client_last_name']")
    public WebElement lastNameTab;
    @FindBy(css="[id='case_details.client_phone1']")
    public WebElement phone1Tab;
    @FindBy(css="[id='case_details.client_mobile']")
    public WebElement mobileTab;
    @FindBy(css="[id='case_details.client_email']")
    public WebElement emailTab;
    @FindBy(css="[id='case_details.employer']")
    public WebElement employerTab;

    @FindBy(css="input[id='case_details.client_company_name']")
    public WebElement companyName;
}
