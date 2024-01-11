package com.iinsight.pagefactory.Toolbox.Side.Finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appointment extends Invoices {
    public Appointment(){PageFactory.initElements(getDriver(), this);
    }
    @FindBy(css="img[name='show_all_appointments']")
    public WebElement includeAppointmentChkBox;
    @FindBy(id="time_sheet_activity_new")
    public WebElement billingAppointmentBtn;
    @FindBy(id="ifinanceappointment_link_billing_id")
    public WebElement editAppointmentBtn;
    @FindBy(css="button[onclick='finance_handler('appointment_billing', true)']")
    public WebElement exportAppointmentBtn;

    @FindBy(id="appointment_billing_search_text")
    public WebElement searchAppointmentField;
    @FindBy(css="img[name='appointment_billing_button']")
    public WebElement searchByAppointmentDropdown;
    @FindBy(id="appointment_billing_find")
    public WebElement findAppointmentBtn;
    @FindBy(id="small_fields_view_appointment_billing")
    public WebElement fieldEditAppointmentBtn;

}
