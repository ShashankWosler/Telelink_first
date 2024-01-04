package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Accounts;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdjustPopUp extends GenericWrappers {
    //Only Applicable To Invoice Tab

    // A D J U S T M E N T S        D E T A I L S
    @FindBy(xpath="//div[text()='Adjustment']")
    public WebElement adjustPopUp;
    @FindBy(id="Adjustment")
    public WebElement idTab;     //getAttribute "value" - NAT117-A2
    @FindBy(id="adjustment_date")
    public WebElement dateTab;      //Date Format - 04-12-2023
    @FindBy(id="reason")
    public WebElement reasonTab;    //SendKeys

    // C U R R E N T        A C C O U N T S        S T A T U S
    @FindBy(xpath="(//input[@id='invoice'])[2]")
    public WebElement invoiceTab;      //getAttribute "value" - NAT117
    @FindBy(id="payment")
    public WebElement paymentReceivedTab;
    @FindBy(id="balance")
    public WebElement invoiceBalanceTab;
    @FindBy(id="original_total")
    public WebElement originalInvoiceTotalTab;
    @FindBy(id="adjustment")
    public WebElement adjustmentTab;
    @FindBy(id="gst_balance")
    public WebElement vatBalanceTab;
    @FindBy(id="total_adjustment")
    public WebElement totalAdjustmentTab;
    @FindBy(id="total_gts")
    public WebElement totalVatTab;

    // F I L T E R
    @FindBy(css="input#invoice_costs_adjustment_search_text")
    public WebElement searchInputTab;
    @FindBy(css="[name='invoice_costs_adjustment_button']")
    public WebElement byDropDownButton;
    @FindBy(id="invoice_costs_adjustment_find")
    public WebElement adjustFindButton;
    @FindBy(id="small_fields_view_invoice_costs_adjustment")
    public WebElement adjustFieldEditButton;

    // T A B L E
    @FindBy(css="img#activity_item")
    public WebElement selectAllDescriptionItemBox;
    @FindBy(xpath="//div[@id='invoice_costs_adjustment']//tr")
    public List<WebElement> tableSize;
    @FindBy(xpath="(//div[@id='invoice_costs_adjustment']//tr[1]//input)[3]")
    public WebElement existingActivityTotalAmount;  // First Row Always     -       gettAttribute "value"

    // R O W    -    1

    @FindBy(css="td#td_time_based img")
    public WebElement CheckBox1;
    @FindBy(id="rate")
    public WebElement Rate1;    //getAttribute "value" - GetNumbersOnly
    @FindBy(xpath="(//td[@id='td_duration'])[1]/input")
    public WebElement Duration1;    //getAttribute "value"
    @FindBy(xpath="(//td[@id='sub_total_column'])[1]")
    public WebElement SubTotal1;    //getAttribute "title"
    @FindBy(xpath="(//td[@id='gst_column'])[1]")
    public WebElement Vat1;         //getAttribute "title"
    @FindBy(xpath="(//td[@id='td_amount'])[1]")
    public WebElement Total1;         //getAttribute value"
    @FindBy(xpath="(//td[@id='employee_column'])[1]")
    public WebElement Employee1;

    // R O W    -    2
    @FindBy(xpath="//div[@id='invoice_costs_adjustment']//tr[2]//td[1]")
    public WebElement CheckBox2;       //WaitFor(2000)
    @FindBy(xpath="(//td[@id='description_column'])[2]/input")
    public WebElement description2;
    @FindBy(xpath="(//td[@id='details_column'])[2]/input")
    public WebElement details2;
    @FindBy(xpath="(//td[@id='td_rate'])[2]/input")
    public WebElement rate2;
    @FindBy(xpath="(//td[@id='td_duration'])[2]/input")
    public WebElement duration2;
    @FindBy(xpath="(//td[@id='sub_total_column'])[2]")
    public WebElement subtotal2;    //getAttributeValue - "title"
    @FindBy(xpath="(//td[@id='gst_column'])[2]")
    public WebElement vat2;    //getAttributeValue - "title"
    @FindBy(xpath="(//td[@id='td_amount'])[2]")
    public WebElement totalAmount2;     //getAttributeValue - "value"
    @FindBy(css="[title='GL Code']")
    public WebElement glCodeHeader;         //For Swipe The Table To End_Right
    @FindBy(xpath="(//td[@id='td_applygst'])[2]/img")
    public WebElement vatCheckBox2;
    @FindBy(xpath="(//td[@id='charge_code_column'])[2]/select")
    public WebElement chargeCodeDropDown;       //Select - DropDown By visible Text - Item

    // B O T T O M          B U T T O N S
    @FindBy(xpath="//button[@id='adjustment_4']//parent::div//button[1]")
    public WebElement activityLineButton;      // Add Activity Line
    @FindBy(xpath="//button[@id='adjustment_4']//parent::div//button[2]")
    public WebElement itemLineButton;       //Add Item Line
    @FindBy(id="adjustment_4")
    public WebElement okButton;
    @FindBy(id="adjustment_5")
    public WebElement cancelButton;



}
