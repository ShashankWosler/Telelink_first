package com.iinsight.pages.Toolbox.Top.MyDashboard;
import com.iinsight.pagefactory.Toolbox.Top.MyDashboard.Report;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage extends Report {
    public ReportPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isReportSelectAllBtn(){return isElementDisplayed(reportSelectAllBtn);}
    public boolean isReportDeleteBtnBtn(){return isElementDisplayed(reportDeleteBtn);}
    public boolean isReportUnSelectAllBtnBtn(){return isElementDisplayed(reportUnSelectAllBtn);}
    public boolean isTableRowBtn(){return isElementDisplayed(sizeTableRow);}
    public boolean isDownloadExcelBtn(){return isElementDisplayed(downloadExcel);}
    public boolean isDownloadWordBtn(){return isElementDisplayed(downloadWord);}
    public boolean isDownloadPdfBtn(){return isElementDisplayed(downloadPdf);}

    public void clickReportSelectAllBtn(){clickButtonWithOutScroll(reportSelectAllBtn);}
    public void clickReportDeleteBtnBtn(){clickButtonWithOutScroll(reportDeleteBtn);}
    public void clickReportUnSelectAllBtnBtn(){clickButtonWithOutScroll(reportUnSelectAllBtn);}
    public void clickSizeTableRowBtn(){clickButtonWithOutScroll(sizeTableRow);}
    public void clickDownloadExcelBtn(){
        waitElementToBeClickable(downloadExcel);
        clickButtonWithOutScroll(downloadExcel);}
    public void clickDownloadWordBtn(){
        waitElementToBeClickable(downloadWord);
        clickButtonWithOutScroll(downloadWord);}
    public void clickDownloadPdfBtn(){
        waitElementToBeClickable(downloadPdf);
        clickButtonWithOutScroll(downloadPdf);}

}
