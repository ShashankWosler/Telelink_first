package com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Individual extends GenericWrappers {
    // C A S E      T Y P E
    @FindBy(css="[name='case_new.client_title_button']")
    public WebElement type_title;
    @FindBy(css="[for='case_new.client_first_name']")
    public WebElement type_first_name;
    @FindBy(css="[id='case_new.client_last_name']")
    public WebElement type_last_name;
    @FindBy(xpath="//input[@id='case_new.client_location']/following::button[1]")
    public WebElement type_person_location_btn;
    @FindBy(css="[id='case_new.client_email']")
    public WebElement type_email;
    @FindBy(css="[id='case_new.client_phone1']")
    public WebElement type_phone_1;
    @FindBy(css="[id='case_new.client_phone2']")
    public WebElement type_phone_2;
    @FindBy(css="[id='case_new.client_fax']")
    public WebElement type_fax;
    @FindBy(css="[id='case_new.client_mobile']")
    public WebElement type_mobile;
    @FindBy(id="case_new_01_3")
    public WebElement next_btn_case_type;
    @FindBy(id="case_new_01_2")
    public WebElement cancel_btn;

    // P O P    U P     -   C L I E N T     L O C A T I O N
    @FindBy(css="[aria-label='Incident Location']")
    public WebElement current_location;
    @FindBy(id="location_save_button")
    public WebElement save_btn;
    @FindBy(id="case_reopen_2")
    public WebElement client_loc_cancel_btn;

    // E M P L O Y M E N T      D E T A I L S
    @FindBy(css="[id='case_new.employer.company_name']")
    public WebElement emp_company_name;
    @FindBy(css="[name='case_new.employer.title_button']")
    public WebElement emp_title_dropdown;
    @FindBy(css="[id='case_new.employer.first_name']")
    public WebElement emp_first_name;
    @FindBy(css="[id='case_new.employer.last_name']")
    public WebElement emp_last_name;
    @FindBy(xpath="//input[@id='case_new.employer.location']/following::button[1]")
    public WebElement emp_loc;
    @FindBy(css="[id='case_new.employer.email']")
    public WebElement emp_email;
    @FindBy(css="[id='case_new.employer.phone1']")
    public WebElement emp_phone;
    @FindBy(css="[id='case_new.employer.mobile']")
    public WebElement emp_mobile;
    @FindBy(id="case_new_04_3")
    public WebElement emp_next_btn;

    // R E F E R R A L   D E T A I L S
    @FindBy(css="[id='case_new.referrer.company_name']")
    public WebElement refer_company_name;
    @FindBy(css="[name='case_new.referrer.title_button']")
    public WebElement refer_title_dropdown;
    @FindBy(css="[id='case_new.referrer.first_name']")
    public WebElement refer_first_name;
    @FindBy(css="[id='case_new.referrer.last_name']")
    public WebElement refer_last_name;
    @FindBy(xpath="//input[@id='case_new.referrer.location']/following::button[1]")
    public WebElement refer_loc;
    @FindBy(css="[id='case_new.referrer.email']")
    public WebElement refer_email;
    @FindBy(css="[id='case_new.referrer.phone1']")
    public WebElement refer_phone;
    @FindBy(css="[id='case_new.referrer.mobile']")
    public WebElement refer_mobile;
    @FindBy(id="case_new_06_4")
    public WebElement refer_next_btn;

    // B I L L    C O M P A N Y    N A M E
    @FindBy(css="[id='case_new.bill_to.company_name']")
    public WebElement bill_company_name;
    @FindBy(css="[name='case_new.bill_to.title_button']")
    public WebElement bill_title_dropdown;
    @FindBy(css="[id='case_new.bill_to.first_name']")
    public WebElement bill_first_name;
    @FindBy(css="[id='case_new.bill_to.last_name']")
    public WebElement bill_last_name;
    @FindBy(xpath="//input[@id='case_new.bill_to.location']/following::button[1]")
    public WebElement bill_loc;
    @FindBy(css="[id='case_new.bill_to.email']")
    public WebElement bill_email;
    @FindBy(css="[id='case_new.bill_to.phone1']")
    public WebElement bill_phone;
    @FindBy(css="[id='case_new.bill_to.mobile']")
    public WebElement bill_mobile;
    @FindBy(id="case_new_08_5")
    public WebElement bill_next_btn;

    // S A V E
    @FindBy(css="[onclick*='case_new.status']")
    public WebElement status_dropdown;
    @FindBy(css="[onclick*='case_new.risk_category']")
    public WebElement risk_category_dropdown;
    @FindBy(css="[onmouseup*='case_new.team']")
    public WebElement team_dropdown;
    @FindBy(xpath="//*[@id='case_new_10_finish'][2]")
    public WebElement finish_btn;
}
