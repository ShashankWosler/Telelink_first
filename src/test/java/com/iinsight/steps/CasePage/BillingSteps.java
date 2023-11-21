package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseListing.BillingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BillingSteps extends BillingPage {
    @And("User Select {string} from Select your invoice type dropdown")
    public void userSelectFromSelectYourInvoiceTypeDropdown(String arg0) {
        //clickOnInvoiceDropdown();
        SelectByVisibleText(invoice_dropdown_icon, arg0);
    }

    @And("User Select {string} Option from the Billing dropdown")
    public void userSelectOptionFromTheBillingDropdown(String arg0) {
      //  clickOnBillingDropdown();
        SelectByVisibleText(billing_dropdown_icon, arg0);
    }

    @And("User Click on Submit button")
    public void userClickOnSubmitButton() {
        clickOnSubmitButton();
        waitFor(4000);
        if(isElementDisplayed(continue_yes_button)){
            clickButtonWithOutScroll(continue_yes_button);
            waitFor(2000);
        }
        else {
           // clickButtonWithOutScroll(submit_button);
            System.out.println("Billing is created successfully");
        }
    }


}
