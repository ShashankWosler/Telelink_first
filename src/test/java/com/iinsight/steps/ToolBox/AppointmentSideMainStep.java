package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.Side.AppointmentSideMainPage;
import com.iinsight.pages.Toolbox.Side.SideMainPage;
import io.cucumber.java.en.And;

public class AppointmentSideMainStep extends AppointmentSideMainPage {

    @And("User Select the Employee")
    public void userSelectTheEmployee() {
        selectEmployee();
    }
}
