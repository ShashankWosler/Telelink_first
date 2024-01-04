package com.iinsight.pagefactory.CasePage.CaseListing;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billing extends GenericWrappers {
    @FindBy(xpath="//div[text()='New Billing']")
    public WebElement billingPopUpVisible;
    @FindBy(id="billing_invoice_options")
    public WebElement invoice_dropdown_icon;
    @FindBy(css="select[id='costs.billings.body']")
    public WebElement billing_dropdown_icon;
    @FindBy(id="invoice_generator_3_2")
    public WebElement submit_button;
    @FindBy(id="cost_duplicate_5_1")
    public WebElement continue_yes_button;
    @FindBy(id="timeslot")
    public WebElement durationInput;
    @FindBy(css="input[id='costs.unit_charge']")
    public WebElement rateInput;    //getAttribute - "value"
    @FindBy(id="sub_total")
    public WebElement subTotal;     //getInnerText
    @FindBy(css="input[id='costs.tax_amount']")
    public WebElement vat;          //getInnerText
    @FindBy(css="input[id='costs.total_charge']")
    public WebElement total;        //getInnerText
    @FindBy(css="img[name='apply_gst']")
    public WebElement billApplyVatCheckBox;         //Billable time & rate
    @FindBy(id="template_title")
    public WebElement fileNotes;

    // T A S K      A P P O I N T M E N T S
    @FindBy(id="billing_invoice_options")
    public WebElement invoiceTypeDropDown;
    @FindBy(css="[id='costs.details']")
    public WebElement detailsInput;
    @FindBy(css="[id='costs.reference_date']")
    public WebElement dateInput;
    @FindBy(css="[id='users.name']")
    public WebElement nameInput;
    @FindBy(css="[name='costs.team_button']")
    public WebElement teamDropDown;
    @FindBy(css="[id='costs.description']")
    public WebElement descriptionInput;
    @FindBy(css="[id='costs.reference_time']")
    public WebElement startTimeInput;
    @FindBy(css="[id='costs.charge_code']")
    public WebElement codeInput;        //getAttribute Value
    @FindBy(css="[id='costs.kilometres']")
    public WebElement kilometresInput;
    @FindBy(css="[name='template_title_button']")
    public WebElement fileNotesDropDown;
    @FindBy(css="img[name='is_privileged']")
    public WebElement privilegedCheckBox;
    @FindBy(css="[id='costs.notes']")
    public WebElement fileNotesDescription;
    @FindBy(css="[id='costs.quantity']")
    public WebElement quantityInput;        //getAttribute - "value"
    @FindBy(css="[id='left']")
    public WebElement quantityToDate;       //getAttribute - "value"
    @FindBy(id="total_remaining")
    public WebElement totalRemaining;       //getAttribute - "value"
    @FindBy(css="img[name='estimate']")
    public WebElement linkedPlanCheckBox;
    @FindBy(css="img[name='billing_linked_to_appointment']")
    public WebElement linkedAppointmentCheckBox;
    @FindBy(css="img[name='costs.appointment_button']")
    public WebElement LinkedAppointmentDropDown;
    @FindBy(css="img[name='timesheet_apply_gst']")
    public WebElement consultantApplyVatCheckBox;         // Consultants time

    // C O N S U L T A N T S        T I M E
    @FindBy(css="[id='costs.consultant_time_expense']")
    public WebElement consultantDurationInput;
    @FindBy(css="[id='costs.consultant_rate']")
    public WebElement consultantRateInput;
    @FindBy(css="[id='costs.consultant_expense_net']")
    public WebElement consultantSubTotalInput;      //getInnerText
    @FindBy(css="[id='costs.consultant_expense_tax']")
    public WebElement consultantVatInput;
    @FindBy(css="[id='costs.consultant_expense_total']")
    public WebElement consultantTotalInput;
    @FindBy(css="[id='costs.consultant_super_rate']")
    public WebElement consultantSuperRateInput;
    @FindBy(css="[id='costs.consultant_super_expense_net']")
    public WebElement consultantSuperExpenseInput;
    @FindBy(css="img[name='after_save']")
    public WebElement addEntryCheckBox;     //Add another entry after saving
    @FindBy(css="img[id='add_document']")
    public WebElement addDocumentCheckBox;

    // B O T T O M      B U T T O N S
    @FindBy(xpath="//button[text()='Add Signature']")
    public WebElement addSignatureButton;
    @FindBy(id="on_old")
    public WebElement saveAsDraftButton;
    @FindBy(id="invoice_generator_3_4")
    public WebElement cancelButton;









}
