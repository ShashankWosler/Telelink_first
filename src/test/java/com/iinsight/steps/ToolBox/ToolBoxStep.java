package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.TopMainPage;
import io.cucumber.java.en.Then;

public class ToolBoxStep extends TopMainPage {
    @Then(("Go to the report"))
    public void goToReport(){clickDownloadsReport();
    }

}
