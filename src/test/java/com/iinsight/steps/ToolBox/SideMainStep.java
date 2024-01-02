package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.Side.SideMainPage;
import io.cucumber.java.en.And;

public class SideMainStep extends SideMainPage {
    @And("User Click on Appointment Option")
    public void userClickOnAppointmentOption() {
        clickOnAppointmentOption();
    }
}
