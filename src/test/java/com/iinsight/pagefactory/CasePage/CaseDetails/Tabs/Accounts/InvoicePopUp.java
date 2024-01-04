package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class InvoicePopUp extends GenericWrappers {
    //Page 1
    @FindBy(id="level3_form")
    public WebElement inVoicePopUpModal;
    @FindBy(id="current_case_tab")
    public WebElement currentCaseTab;
    @FindBy(id="search_case_tab")
    public WebElement searchCaseTab;
    @FindBy(id="case_prefix")
    public WebElement readCase;
    @FindBy(css="[id='case_details.bill_to']")
    public WebElement readCompanyName;
    @FindBy(css="#new-inv-date img")
    public WebElement dateDropDown;
    @FindBy(id="invoice_description")
    public WebElement enterDescription;
    @FindBy(id="addinvoice_1_next")
    public WebElement nextButton1;
    @FindBy(xpath="//div[@id='invoice_costs_list']//tr[1]/td[9]")
    public WebElement tableDurationTab;         //getAttributeBy - "title"
    @FindBy(xpath="//div[@id='invoice_costs_list']//tr[1]/td[11]")
    public WebElement tableChargeTab;          //getAttributeBy - "title"

    // Page 2
    @FindBy(css="img[id='standard']")
    public WebElement standardIcon;
    @FindBy(css="img[id='invoice']")
    public WebElement invoiceIcon;
    @FindBy(css="img[id='milestone']")
    public WebElement milestoneIcon;
    @FindBy(css="div#invoice_costs_list tr")
    public List<WebElement> activeCostId;
    @FindBy(id="addinvoice_2_next")
    public WebElement nextButton2;
    @FindBy(id="addinvoice_2_prev")
    public WebElement previousButton;
    @FindBy(id="addinvoice_2_activity")
    public WebElement billingButton;

    @FindBy(id="addinvoice_cost_selectall")
    public WebElement selectAllButton;
    @FindBy(id="addinvoice_cost_excludeall")
    public WebElement excludeAllButton;

    //Page 3
    @FindBy(id="bill_to")
    public WebElement readCompanyName2;
    @FindBy(id="total")
    public WebElement totalTab;     //getAttribute - "value"
    @FindBy(id="ex_tax")
    public WebElement amountExVatTab;     //getAttribute - "value"
    @FindBy(id="gst")
    public WebElement vatAmountTab;     //getAttribute - "value"
    @FindBy(id="inv_no_prefix")
    public WebElement invoicePrefixTab;
    @FindBy(id="inv_no")
    public WebElement invoiceNumberTab;
    @FindBy(css="img[name='print']")
    public WebElement previewInvoiceButton;
    @FindBy(css="img[name='after_save'")
    public WebElement saveInvoiceButton;
    @FindBy(id="addinvoice_3_next")
    public WebElement finishButton;






}
