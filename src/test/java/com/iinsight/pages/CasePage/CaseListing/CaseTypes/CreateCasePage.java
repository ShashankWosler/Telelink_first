package com.iinsight.pages.CasePage.CaseListing.CaseTypes;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes.Company;
import com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes.CreateCase;
import org.apache.commons.lang.ObjectUtils;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class CreateCasePage extends CreateCase {
    public CreateCasePage(){
        PageFactory.initElements(getDriver(), this);
    }

    public void selectCompanyType(){
        waitFor(3000);
        click(aCompany_checkbox);
    }
    public void selectPersonType(){
        click(aPerson_individual_checkbox);
    }

    /**Case Type Company*/
    public void enterCompanyName(){
        enterText(company_name_field, CaseTypeTestData.CompanyName);
    }
    public void enterEmail(){
        enterText(email_field, CaseTypeTestData.Email);
    }
    public void enterPhone1(){
        enterText(phone1_field, CaseTypeTestData.Phone);
    }
    public void clickCaseTypeNextBtn(){
        clickButtonWithOutScroll(next_btn_case_type);
    }
    public void clickCompanyLocationBtn(){clickButtonWithOutScroll(location_icon);}

    /**Case Type Person*/
    public boolean isPersonTitleDropdownVisible(){return isElementDisplayed(type_title);}
    public void clickPersonTitleDropdown(){clickButtonWithOutScroll(type_title);}
    public void clickPersonFirstNameTab(){clickButtonWithOutScroll(type_first_name);}
    public void enterPersonFirstNameTab(){enterText(type_first_name, CaseTypeTestData.FirstName);}

    public void enterPersonLastName(){enterText(type_last_name, CaseTypeTestData.LastName);}
    public boolean isPersonEmailTabVisible(){return isElementDisplayed(type_email);}
    public void enterPersonEmailTab(){enterText(type_email, CaseTypeTestData.Email);}
    public void enterPersonPhone1Tab(){enterText(type_phone_1,CaseTypeTestData.Phone);}


    public void clickPersonLastName(){clickButtonWithOutScroll(type_last_name);}
    public void clickPersonLocationBtn(){clickButton(type_location_btn,type_location_btn);}
    public void clickPersonEmailTab(){clickButtonWithOutScroll(type_email);}
    public void clickPersonPhone1Tab(){clickButtonWithOutScroll(type_phone_1);}
    public void clickPersonMobileTab(){clickButtonWithOutScroll(type_mobile);}
    public void clickPersonFirstNextBtn(){clickButtonWithOutScroll(next_btn_case_type);}
    public void clickPersonCancelBtn(){clickButtonWithOutScroll(cancel_btn);}

    /** P O P    U P     -   C L I E N T     L O C A T I O N*/
    public boolean isPersonCurrentLocBtnVisible(){return isElementDisplayed(current_location);}
    public void clickPersonCurrentLocBtn(){clickButton(current_location,current_location);}
    public void clickPersonSaveBtnClientLocPopUp(){clickButtonWithOutScroll(save_btn);}
    public void clickPersonCancelBtnClientLocPopUp(){clickButtonWithOutScroll(client_loc_cancel_btn);}

    /** E M P L O Y M E N T      D E T A I L S*/
    public boolean isPersonEmpCompanyNameTabVisible(){return isElementDisplayed(emp_company_name);}
    public void enterPersonEmpCompanyNameTab(){enterText(emp_company_name,CaseTypeTestData.CompanyName);}
    public void clickPersonEmpTitleTab(){clickButtonWithOutScroll(emp_title_dropdown);}
    public void enterPersonEmpFirstNameTab(){enterText(emp_first_name,CaseTypeTestData.FirstName);}
    public void enterPersonEmpLastNameTab(){enterText(emp_last_name,CaseTypeTestData.FirstName);}
    public void clickPersonEmpLocationBtn(){clickButtonWithOutScroll(emp_loc);}
    public void enterPersonEmpPhoneTab(){enterText(emp_phone,CaseTypeTestData.Phone);}
    public void clickPersonEmpMobileTab(){clickButtonWithOutScroll(emp_mobile);}
    public void enterEmpEmailTab(){enterText(emp_email,CaseTypeTestData.Email);}
    public void clickPersonEmpNextBtn(){clickButtonWithOutScroll(emp_next_btn);}

    /** Referral Details */
    public boolean isReferCompanyNameTabIsVisible(){return isElementDisplayed(refer_company_name_input);}
    public void enterReferCompanyName(){ enterText(refer_company_name_input, CaseTypeTestData.CompanyName);}
    public void clickReferCompanyNameDropdown(){clickButtonWithOutScroll(refer_company_name_dropdown);}
    public void getReferCompanyContact(){
        String getContactIntValue = getText(refer_company_contact);
        int intValue = Integer.parseInt(getContactIntValue.replaceAll("[^0-9]", ""));
        try{
            if(intValue!=0)
                System.out.println("Contacts: "+getText(refer_company_contact));
        }
        catch(Exception e){
            System.out.println("Exception Occurred: CreateCasePage.getReferCompanyContact() - "+e.getClass()+" "+e.getMessage());
        }
    }
    public String verifyReferCompanyName(){
        String companyValue="";
        try{
        if(!(getText(refer_company_name).isEmpty()))
            companyValue=getText(refer_company_name);}
        catch(NullPointerException e){
            System.out.println("CreateCasePage.verifyReferCompanyName() "+e.getMessage());
        }
    return companyValue;
    }
    public boolean isPersonReferNextBtnVisible(){return isElementDisplayed(refer_next_btn);}
    public void clickReferralNextBtn(){clickButtonWithOutScroll(refer_next_btn);}

    /** Bill to Company  */
    public String getBillToCompanyName(){
        String valueOfCompany="";
        try{
            valueOfCompany= getText(bill_to_company_name);
            if(valueOfCompany!=null)
                System.out.println(valueOfCompany);
        }catch(NullPointerException e){
            System.out.println("CreateCasePage.enterBillToCompanyName() - "+e.getMessage());
        }
        return valueOfCompany;

    }
    public void enterBillToFirstName(){
        enterText(bill_to_first_name, CaseTypeTestData.Bill_To_FirstName);
    }
    public void enterBillToLastName(){
        enterText(bill_to_last_name, CaseTypeTestData.Bill_To_LastName);
    }
    public void enterBillToPhone1(){
        enterText(bill_to_phone1_field, CaseTypeTestData.Phone);
    }
    public boolean isReferralButtonIsVisible(){return isElementDisplayed(same_as_referrer_btn);}

    public void clickOnReferralButton(){clickButtonWithOutScroll(same_as_referrer_btn);}
    public void clickBillToNextBtn(){
        click(bill_next_btn);
    }

    /**Save*/
    public void selectStatus(){
        click(status_dropdown_icon);
        //click(status_dropdown_value);
    }

    public void clickOnSubmitButton(){
        click(finish_btn);
    }


}
