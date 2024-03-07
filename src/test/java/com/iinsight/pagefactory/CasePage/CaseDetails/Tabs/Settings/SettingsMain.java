package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Settings;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsMain extends GenericWrappers {
    @FindBy(xpath="//div[text()='Case - Settings']")
    public WebElement settingText;
    @FindBy(xpath="//div[text()='Case - Settings']/button")
    public WebElement saveButton;
    @FindBy(css="[name='case_details.archival_date_button']")
    public WebElement archivalDateDropDown;
    @FindBy(css="[id='case_details.archival_date']")
    public WebElement archivalDateInput;        //getAttribute - 'value' : 08-02-2024
    @FindBy(css="[name='case_details.deletion_date_button']")
    public WebElement deletionDateDropDown;
    @FindBy(css="[id='case_details.deletion_date']")
    public WebElement deletionDateInput;        //getAttribute - 'value' : 15-02-2024

    // C L I E N T      C O N T A C T      N O T I F I C A T I O N
    @FindBy(css="[name='case_details.enable_case_alert']")
    public WebElement enableCaseAlertCheckBox;
    @FindBy(css="[name='case_details.is_exclude_auto_archive']")
    public WebElement excludeCaseCheckBox;  //Exclude case from Automated Archival/Deletion - getAttribute - 'value' : 1 (Enabled)
    @FindBy(css="[name='case_details.case_client_allow_sms']")
    public WebElement receiveSmsNotificationsCheckBox;
    @FindBy(css="[name='case_details.case_client_allow_email']")
    public WebElement receiveEmailNotificationsCheckBox;

    //F I N A N C E      T E M P L A T E S
    // D R O P D O W N S    B U T T O N S
    @FindBy(css="[name='invoice_template_id_button']")
    public WebElement invoiceTemplateDropDown;
    @FindBy(css="[name='payment_template_id_button']")
    public WebElement paymentTemplateDropDown;
    @FindBy(css="[name='refund_template_id_button']")
    public WebElement refundTemplateDropDown;
    @FindBy(css="[name='adjustment_template_id_button']")
    public WebElement adjustmentTemplateDropDown;
    @FindBy(css="[name='plan_monetary_template_id_button']")
    public WebElement MonetaryBasedDropDown;
    @FindBy(css="[name='plan_time_template_id_button']")
    public WebElement timeBasedDropDown;

    // I N P U T
    @FindBy(id="invoice_template_id")
    public WebElement invoiceTemplateInput;      //value (Attribute) = Example Invoice, Service Contract (default)
    @FindBy(id="payment_template_id")
    public WebElement paymentTemplateInput;      //value (Attribute) = Service Contract (default)
    @FindBy(id="adjustment_template_id")
    public WebElement adjustmentTemplateInput;   //value (Attribute) = Service Contract (default)
    @FindBy(id="refund_template_id")
    public WebElement refundTemplateInput;      //value (Attribute) = Service Contract (default)
    @FindBy(id="plan_monetary_template_id")
    public WebElement monetaryInput;            //value (Attribute) = Service Contract (default)
    @FindBy(id="plan_time_template_id")
    public WebElement timeBasedInput;          //value (Attribute) = Service Contract (default)

    // A L E R T
    @FindBy(id="case_details.alert_message")
    public WebElement caseAlertMessageBox;


}
