package com.iinsight.steps;

import com.iinsight.TestData.TestData;
import com.iinsight.pages.AccountPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccountStep extends AccountPage {
	public String account ;
	
	 @And("User Navigate to Account Page")
	 public void userNavigateToCreatenewaccount()
	 {
		 CreateNewAccount();
	 }
	 @And("User Enter Name and CompanyName")
	 public void enterAccountname()
	 {
		 account = TestData.randomNumberforAccount();
		  enterName(account);	
		 enterCompanyName(TestData.randomNumberforCompany());
	 }
	 @And("Click on Register")
	 public void enterCompanynamename()
	 {
		
		 clickOnRegisterBtn();
	 }
	 @And("Verify the {string} message for New Account")
	    public void verifyTheMessage(String arg1) {
		 
	        isElementTextMatch(verifyAcctcreatedsuccessMsg, arg1);
	    }
	 @And("Click on Account tab")
	 public void ClickOnAccounttab()
	 {
		 ClickonAccount();
	 }
	 @And("Seach Recent Created Account")
	 public void SearchRecentCreatedAccount()
	 {
		 enterNewAccountinSearchtxtBox(account);
	 }
	 
	 
	 @Then("Update the Account")
	    public void UpdateAccount()
	 {
	    	UpdateAccountdetails();
	    }
}
