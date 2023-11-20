package com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Company extends GenericWrappers {

    //Case types
    @FindBy(css = "input[id='case_new.company.company_name']")
    public WebElement company_name_field;
    @FindBy(css = "div[id=\"company_form\"] span[class=\"glyphicon glyphicon-map-marker google_maps_icon\"]")
    public WebElement location_icon;
    @FindBy(id = "autocomplete")
    public WebElement enter_location_field;
    @FindBy(id = "location_save_button")
    public WebElement save_location_btn;
    @FindBy(css = "input[id=\"case_new.company.email\"]")
    public WebElement email_field;
    @FindBy(css = "input[id=\"case_new.company.phone1\"]")
    public WebElement phone1_field;
    @FindBy(id = "case_new_01_3")
    public WebElement next1_btn;

    //Referral details
    @FindBy(id = "case_new_06_4")
    public WebElement next3_btn;

    //Bill to company
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
    public WebElement next4_btn;

    //Save
    @FindBy(id = "case_new.number")
    public WebElement case_number_field;

}
