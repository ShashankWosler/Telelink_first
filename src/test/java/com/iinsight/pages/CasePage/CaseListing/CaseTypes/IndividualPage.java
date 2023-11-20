package com.iinsight.pages.CasePage.CaseListing.CaseTypes;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseListing.CaseTypes.Individual;
import org.openqa.selenium.support.PageFactory;

public class IndividualPage extends Individual {
    public IndividualPage(){PageFactory.initElements(getDriver(), this);
    }
    // C A S E      T Y P E
    public boolean isPersonTitleDropdownVisible(){return isElementDisplayed(type_title);}
    public void clickPersonTitleDropdown(){clickButtonWithOutScroll(type_title);}
    public void clickPersonFirstNameTab(){clickButtonWithOutScroll(type_first_name);}
    public void enterPersonFirstNameTab(){enterText(type_first_name, CaseTypeTestData.FirstName);}
    public void clickPersonLastName(){clickButtonWithOutScroll(type_last_name);}
    public void enterPersonLastName(){enterText(type_last_name, CaseTypeTestData.LastName);}
   // public void clickPersonLocationBtn(){clickButtonWithOutScroll(type_location_btn);}
    public boolean isPersonEmailTabVisible(){return isElementDisplayed(type_email);}
    public void clickPersonEmailTab(){clickButtonWithOutScroll(type_email);}
    public void enterPersonEmailTab(){enterText(type_email, CaseTypeTestData.Email);}
    public void clickPersonPhone1Tab(){clickButtonWithOutScroll(type_phone_1);}
    public void enterPersonPhone1Tab(){enterText(type_phone_1,CaseTypeTestData.Phone);}
    public void clickPersonMobileTab(){clickButtonWithOutScroll(type_mobile);}
    public void enterPersonMobileTab(){enterText(type_mobile, CaseTypeTestData.Phone);}
    public void clickPersonFirstNextBtn(){clickButtonWithOutScroll(next_btn_case_type);}
    public void clickPersonCancelBtn(){clickButtonWithOutScroll(cancel_btn);}

    // P O P    U P     -   C L I E N T     L O C A T I O N
    public boolean isPersonCurrentLocBtnVisible(){return isElementDisplayed(current_location);}
    public void clickPersonCurrentLocBtn(){clickButtonWithOutScroll(current_location);}
    public void clickPersonSaveBtnClientLocPopUp(){clickButtonWithOutScroll(save_btn);}
    public void clickPersonCancelBtnClientLocPopUp(){clickButtonWithOutScroll(client_loc_cancel_btn);}


    // E M P L O Y M E N T      D E T A I L S
    public boolean isPersonEmpCompanyNameTabVisible(){return isElementDisplayed(emp_company_name);}
    public void clickPersonEmpCompanyNameTab(){clickButtonWithOutScroll(emp_company_name);}
    public void clickPersonEmpTitleTab(){clickButtonWithOutScroll(emp_title_dropdown);}
    public void clickPersonEmpFirstNameTab(){clickButtonWithOutScroll(emp_first_name);}
    public void clickPersonEmpLastNameTab(){clickButtonWithOutScroll(emp_last_name);}
    public void clickPersonEmpLocationBtn(){clickButtonWithOutScroll(emp_loc);}
    public void clickPersonEmpPhoneTab(){clickButtonWithOutScroll(emp_phone);}
    public void clickPersonEmpMobileTab(){clickButtonWithOutScroll(emp_mobile);}
    public void clickEmpEmailTab(){clickButtonWithOutScroll(emp_email);}
    public void clickPersonEmpNextBtn(){clickButtonWithOutScroll(emp_next_btn);}

    // R E F E R R A L   D E T A I L S
    public boolean isPersonReferNextBtnVisible(){return isElementDisplayed(refer_next_btn);}
    public void clickPersonReferNextBtn(){clickButtonWithOutScroll(refer_next_btn);}

    // B I L L    C O M P A N Y    N A M E
    public boolean isPersonBillCompanyNameVisible(){return isElementDisplayed(bill_company_name);}
    //public void enterPersonBillCompanyName(){enterText(bill_company_name,Crea);}
    public void clickPersonBillFirstName(){clickButtonWithOutScroll(bill_first_name);}
    public void clickPersonBillLastName(){clickButtonWithOutScroll(bill_last_name);}
    public void clickPersonBillLocation(){clickButtonWithOutScroll(bill_loc);}
    public void clickPersonBillEmail(){clickButtonWithOutScroll(bill_email);}
    public void clickPersonBillPhone(){clickButtonWithOutScroll(bill_phone);}
    public void clickPersonBillMobile(){clickButtonWithOutScroll(bill_mobile);}
    public void clickPersonBillNextBtn(){clickButtonWithOutScroll(bill_next_btn);}

    // S A V E
    public boolean isPersonSaveStatusDropdownVisible(){return isElementDisplayed(status_dropdown);}
    public void clickPersonSaveStatusDropdown(){clickButtonWithOutScroll(status_dropdown);}
    public void clickPersonRiskCategoryDropdown(){clickButtonWithOutScroll(risk_category_dropdown);}
    public void clickPersonTeamDropdown(){clickButtonWithOutScroll(team_dropdown);}
    public void clickPersonFinishDropdown(){clickButtonWithOutScroll(finish_btn);}

    public void createNewCaseTypePerson(){

    }

}
