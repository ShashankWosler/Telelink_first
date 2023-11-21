package com.iinsight.pagefactory.CasePage.CaseListing;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billing extends GenericWrappers {
    @FindBy(id="billing_invoice_options")
    public WebElement invoice_dropdown_icon;
    @FindBy(css="select[id='costs.billings.body']")
    public WebElement billing_dropdown_icon;
    @FindBy(id="invoice_generator_3_2")
    public WebElement submit_button;
    @FindBy(id="cost_duplicate_5_1")
    public WebElement continue_yes_button;




}
