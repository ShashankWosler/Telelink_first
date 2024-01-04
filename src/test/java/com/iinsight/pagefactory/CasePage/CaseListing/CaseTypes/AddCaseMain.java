package com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCaseMain extends GenericWrappers {
    @FindBy(css="[id='case_new.office']")
    public WebElement business_division_input;
    @FindBy(css="[id='case_new.category']")
    public WebElement service_contract_input;
    @FindBy(css="[name='case_new.office_button']")
    public WebElement business_division_dropdown;
    @FindBy(css="[name='case_new.category_button']")
    public WebElement service_contract_dropdown;
    @FindBy(css="[name='case_new.template2_button']")
    public WebElement invoice_template_dropdown;
    @FindBy(css = "img[id='case_new.type_company']")
    public WebElement aCompany_checkbox;
    @FindBy(css = "img[id='case_new.type_person']")
    public WebElement aPerson_individual_checkbox;

}
