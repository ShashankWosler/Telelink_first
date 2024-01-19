package com.iinsight.steps.CasePage;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.CasePage.CaseListing.CaseTypes.CreateCasePage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;

public class CaseTypeStep extends CreateCasePage {
    @And("User fill the Cases Type Form of {string}")
    public void userFillCaseTypeForm(String caseType){
        try{
        switch(caseType){
            case "Company":
                enterCompanyName();
                enterEmail();
                waitFor(2000);
                clickCompanyLocationBtn();
                Assert.assertTrue(isPersonCurrentLocBtnVisible());
                clickPersonCurrentLocBtn();
                clickPersonSaveBtnClientLocPopUp();
                enterPhone1();
                clickCaseTypeNextBtn();
                break;
            case "Individual":
                setImplicit(60);
                waitFor(2000);
                Assert.assertTrue(isPersonTitleDropdownVisible());
                clickPersonTitleDropdown();
                waitFor(2000);
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
        }}catch(TimeoutException | StaleElementReferenceException e){
            System.out.println("CaseTypeStep.userFillCaseTypeForm() - : "+e.getClass()+" "+e.getMessage());
        }
    }


    @And("User fill the Employment Details Form of {string}")
    public void userFillEmploymentDetailsForm(String caseType){
        switch(caseType){
            case "Company":
                System.out.println("Employment Details Skip : As per Functionality");
                break;
            case "Individual":
                try {
                    Assert.assertTrue(isPersonEmpCompanyNameTabVisible());
                    enterPersonEmpCompanyNameTab();
                    clickPersonEmpTitleDropDown();
                    selectDropDownFromText(CaseTypeTestData.Title);
                } catch(StaleElementReferenceException | TimeoutException e){
                    System.out.println("userFillEmploymentDetailsForm - Individual:"+e.getClass()+" "+e.getMessage());
                    waitFor(2000);
                    selectDropDownFromText(CaseTypeTestData.Title);
                    Assert.assertEquals(getAttributeValue(empTitleInput,"value"),CaseTypeTestData.Title);
                } try{
                enterPersonEmpFirstNameTab();
                enterPersonEmpLastNameTab();
                clickPersonEmpLocationBtn();
                Assert.assertTrue(isPersonCurrentLocBtnVisible());
                clickPersonCurrentLocBtn();
                clickPersonSaveBtnClientLocPopUp();
                enterPersonEmpPhoneTab();
                enterEmpEmailTab();
                clickPersonEmpNextBtn();
                break;
                } catch(StaleElementReferenceException | TimeoutException e){
            System.out.println("CaseTypeStep.userFillEmploymentDetailsForm()- "+e.getClass()+" "+e.getMessage());
        }
        }
    }
    @And("User fill the Referral Details Form")
    public void userFillReferralDetailsForm(){
        try {
            isReferCompanyNameTabIsVisible();
            enterReferCompanyName();
            waitFor(2000);
            selectDropDownFromText(CaseTypeTestData.CompanyName);
            Assert.assertTrue(isPersonReferNextBtnVisible());
            waitFor(1000);
            clickReferralNextBtn();
        }catch(StaleElementReferenceException e){
            System.out.println("CaseTypeStep.userFillReferralDetailsForm() - StaleElementReferenceException Caught");
            selectDropDownFromText(CaseTypeTestData.CompanyName);
            clickReferralNextBtn();
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
    @And("User Click on Add Appointment Button from Add Case Save Form")
    public void clickOnAppointmentBillingFromForm(){
        selectStatus();
        selectDropDownFromText("Active");
        clickSaveAddAppointmentsButton();
    }

}
