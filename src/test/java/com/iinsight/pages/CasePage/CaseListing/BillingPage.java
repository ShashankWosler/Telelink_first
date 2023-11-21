package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.pagefactory.CasePage.CaseListing.Billing;
import org.openqa.selenium.support.PageFactory;

public class BillingPage extends Billing {
    public BillingPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public void clickOnInvoiceDropdown(){
        selectDropdown(invoice_dropdown_icon);
    }
    public void clickOnBillingDropdown(){
        clickButtonWithOutScroll(billing_dropdown_icon);
    }
    public void clickOnSubmitButton(){
        clickButtonWithOutScroll(submit_button);
    }
}
