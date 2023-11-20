package com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCase extends GenericWrappers {

    @FindBy(css = "img[id='case_new.type_company']")
    public WebElement aCompany_checkbox;
    @FindBy(css = "img[id='case_new.type_person']")
    public WebElement aPerson_individual_checkbox;

    /**Case types Company*/

    @FindBy(css = "input[id='case_new.company.company_name']")
    public WebElement company_name_field;
    @FindBy(xpath = "//input[@id='case_new.company.client_location']/following::button[1]")
    public WebElement location_icon;
    @FindBy(id = "autocomplete")
    public WebElement enter_location_field;
    @FindBy(id = "location_save_button")
    public WebElement save_location_btn;
    @FindBy(css = "input[id=\"case_new.company.email\"]")
    public WebElement email_field;
    @FindBy(css = "input[id=\"case_new.company.phone1\"]")
    public WebElement phone1_field;

    /**Case Type Person*/
    @FindBy(css="[name='case_new.client_title_button']")
    public WebElement type_title;
    @FindBy(css="input[id='case_new.client_first_name']")
    public WebElement type_first_name;
    @FindBy(css="[id='case_new.client_last_name']")
    public WebElement type_last_name;
    @FindBy(xpath="//input[@id='case_new.client_location']/following::button[1]")
    public WebElement type_location_btn;
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

    /** P O P    U P     -   C L I E N T     L O C A T I O N*/
    @FindBy(css="[aria-label='Incident Location']")
    public WebElement current_location;
    @FindBy(id="location_save_button")
    public WebElement save_btn;
    @FindBy(id="case_reopen_2")
    public WebElement client_loc_cancel_btn;

    /**Employment Details*/
    //Person
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

    /**Referral details*/
    @FindBy(css="[id='case_new.referrer.company_name']")
    public WebElement refer_company_name;
    @FindBy(css="input[id='case_new.referrer']")
    public WebElement refer_company_name_input;
    @FindBy(css="[name='case_new.referrer_button']")
    public WebElement refer_company_name_dropdown;
    @FindBy(css="input[id='case_new.referrer_contacts']")
    public WebElement refer_company_contact;

    @FindBy(id = "case_new_06_4")
    public WebElement refer_next_btn;

    /**Bill to company*/
    @FindBy(id="case_new_08_referrer")
    public WebElement same_as_referrer_btn;
    @FindBy(css = "input[id=\"case_new.bill_to.company_name\"]")
    public WebElement bill_to_company_name;
    @FindBy(css = "input[id=\"case_new.bill_to.first_name\"]")
    public WebElement bill_to_first_name;
    @FindBy(css = "input[id=\"case_new.bill_to.last_name\"]")
    public WebElement bill_to_last_name;
    @FindBy(css = "input[id=\"case_new.bill_to.phone1\"]")
    public WebElement bill_to_phone1_field;
    @FindBy(css = "[name=\"case_new.bill_to.title_button\"]")
    public WebElement title_dropdown_icon;
    @FindBy(id = "case_new_08_5")
    public WebElement bill_next_btn;

    /**Save*/
    @FindBy(css = "img[name=\"case_new.status_button\"]")
    public WebElement status_dropdown_icon;
    @FindBy(css = "div[id=\"drop_down_multiselect\"] div[value=\"5022\"]")
    public WebElement status_dropdown_value;
    @FindBy(css="[onclick*='case_new.risk_category']")
    public WebElement risk_category_dropdown;
    @FindBy(css="[onmouseup*='case_new.team']")
    public WebElement team_dropdown;
    @FindBy(id = "case_new.number")
    public WebElement case_number_field;
    @FindBy(xpath="//*[@id='case_new_10_finish'][2]")
    public WebElement finish_btn;
}
