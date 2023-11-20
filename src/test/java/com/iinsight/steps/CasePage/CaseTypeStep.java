package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseListing.CaseTypes.CreateCasePage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;

public class CaseTypeStep extends CreateCasePage {
    @And("User fill the Cases Type Form of {string}")
    public void userFillCaseTypeForm(String caseType){
        switch(caseType){
            case "Company":
                enterCompanyName();
                enterEmail();
                clickCompanyLocationBtn();
                Assert.assertTrue(isPersonCurrentLocBtnVisible());
                clickPersonCurrentLocBtn();
                clickPersonSaveBtnClientLocPopUp();
                enterPhone1();
                clickCaseTypeNextBtn();
                break;
            case "Individual":
                Assert.assertTrue(isPersonTitleDropdownVisible());
                clickPersonTitleDropdown();
                selectDropDownFromText(CaseTypeTestData.Title);
                waitFor(2000);
                //clickPersonFirstNameTab();
                enterPersonFirstNameTab();
                //clickPersonLastName();
                enterPersonLastName();
                //clickPersonEmailTab();
                enterPersonEmailTab();
                clickPersonLocationBtn();
                Assert.assertTrue(isPersonCurrentLocBtnVisible());
                clickPersonCurrentLocBtn();
                clickPersonSaveBtnClientLocPopUp();
                Assert.assertTrue(isPersonEmailTabVisible());
                enterPersonPhone1Tab();
                clickCaseTypeNextBtn();
                break;

        }
    }


    @And("User fill the Employment Details Form of {string}")
    public void userFillEmploymentDetailsForm(String caseType){
        switch(caseType){
            case "Company":
                System.out.println("Employment Details Skip : As per Functionality");
                break;
            case "Individual":
                try{
                Assert.assertTrue(isPersonEmpCompanyNameTabVisible());
                enterPersonEmpCompanyNameTab();
                clickPersonEmpTitleTab();
                selectDropDownFromText(CaseTypeTestData.Title);
                waitFor(2000);
                enterPersonEmpFirstNameTab();
                enterPersonEmpLastNameTab();
                clickPersonEmpLocationBtn();
                Assert.assertTrue(isPersonCurrentLocBtnVisible());
                clickPersonCurrentLocBtn();
                clickPersonSaveBtnClientLocPopUp();
                enterPersonEmpPhoneTab();
                enterEmpEmailTab();
                clickPersonEmpNextBtn();
                break;} catch(StaleElementReferenceException e){
            System.out.println("CaseTypeStep.userFillEmploymentDetailsForm() - StaleElementReferenceException Caught");
            selectDropDownFromText(CaseTypeTestData.Title);
        }
        }
    }
    @And("User fill the Referral Details Form")
    public void userFillReferralDetailsForm(){
        try{
        enterReferCompanyName();
        selectDropDownFromText(CaseTypeTestData.CompanyName);
        waitFor(2000);
        clickReferralNextBtn();
    }catch(StaleElementReferenceException e){
        System.out.println("CaseTypeStep.userFillReferralDetailsForm() - StaleElementReferenceException Caught");
        selectDropDownFromText(CaseTypeTestData.CompanyName);
    }}

    @And("User fill the Bill To Company Form")
    public void userFillBillToCompanyForm(){
        clickOnReferralButton();
        waitFor(1000);
        enterBillToFirstName();
        enterBillToLastName();
        enterBillToPhone1();
        clickBillToNextBtn();
    }
    @And("User fill the Save Form")
    public void userFillSaveForm(){
        selectStatus();
        selectDropDownFromText("Active");
        clickOnSubmitButton();
    }

}
