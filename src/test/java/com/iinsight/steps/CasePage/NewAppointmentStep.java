package com.iinsight.steps.CasePage;

import com.iinsight.pages.CasePage.CaseDetails.Tabs.TaskAppointments.NewAppointmentPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class NewAppointmentStep extends NewAppointmentPage {


    @And("Enter all the mandatory fields for creating appointment")
    public void enterAllTheMandatoryFieldsForCreatingAppointment() {
        insertTitleInput();
        insertDateInputTab();
        insertToDateInputTab();

        selectEmployee();
        waitFor(2000);
        clickCategoryDropDown();
        waitFor(2000);
        selectDropDownFromText("Appointment");
        clickStatusDropDown();
        waitFor(2000);
        selectDropDownFromText("Confirmed");

        clickOfficeLocationDropDown();
        waitFor(2000);
        selectDropDownFromText("Mid Coast Office");


    }

    @And("User Click on Save Appointment button")
    public void userClickOnSaveAppointmentButton() {
        clickSaveButton();
    }
}
