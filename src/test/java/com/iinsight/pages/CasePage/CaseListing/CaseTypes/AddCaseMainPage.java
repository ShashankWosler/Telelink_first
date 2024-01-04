package com.iinsight.pages.CasePage.CaseListing.CaseTypes;


import com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes.AddCaseMain;
import org.openqa.selenium.support.PageFactory;

public class AddCaseMainPage extends AddCaseMain {
    public AddCaseMainPage(){PageFactory.initElements(getDriver(), this);
    }
    public String getBusinessDivisionInput(){return getAttributeValue(business_division_input,"value");}
    public String getServiceContractInput(){return getAttributeValue(service_contract_input,"value");}
    public boolean isBusinessDivisionDropdownVisible(){return isElementDisplayed(business_division_dropdown);}
    public boolean isServiceContractDropdownVisible(){return isElementDisplayed(service_contract_dropdown);}
    public boolean isInvoiceTemplateDropdownVisible(){return isElementDisplayed(invoice_template_dropdown);}
    public boolean isCompanyCheckboxVisible(){return isElementDisplayed(aCompany_checkbox);}
    public boolean isPersonCheckboxVisible(){return isElementDisplayed(aPerson_individual_checkbox);}
    public void clickBusinessDivisionDropdown(){clickButtonWithOutScroll(business_division_dropdown);}
    public void clickServiceContractDropdown(){clickButtonWithOutScroll(service_contract_dropdown);}
    public void clickInvoiceTemplateDropdown(){clickButtonWithOutScroll(invoice_template_dropdown);}
    public void clickCompanyCheckbox(){clickButtonWithOutScroll(aCompany_checkbox);}
    public void clickPersonCheckbox(){ clickButtonWithOutScroll(aPerson_individual_checkbox);}


}
