package com.iinsight.steps.ToolBox;

import com.iinsight.pages.Toolbox.Top.MyDashboard.ReportPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ReportStep extends ReportPage {
    @And("User download option and download the desired format")
    public void downloadReport(){
        Assert.assertTrue(isTableRowBtn());
        clickDownloadExcelBtn();

    }


}
