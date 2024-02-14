package com.iinsight.steps.ToolBox;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pages.Toolbox.Top.MyDashboard.ReportPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class ReportStep extends ReportPage {
    @And("User Download The Selected {string} Format Report")
    public void downloadReport(String downloadFormat){
        setImplicit(20);
        waitElementToBeClickable(sizeTableRow);
        Assert.assertTrue(isTableRowBtn());
        Assert.assertEquals(String.valueOf(sizeTableRowList.size()),String.valueOf(CaseTypeTestData.ReportToDownloadI));
        switch(downloadFormat){
            case "Pdf":
                clickDownloadPdfBtn();
                break;
            case "Word":
                clickDownloadWordBtn();
                break;
            case "Excel":
                clickDownloadExcelBtn();
                break;
        }
        clickReportSelectAllBtn();
        clickReportDeleteBtnBtn();
        waitFor(3000);
        Assert.assertTrue(getEmptyRowText().contains("no results"));
    }
}
