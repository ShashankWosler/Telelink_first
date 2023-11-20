package com.iinsight.pagefactory.Toolbox.Top.MyDashboard;
import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Report extends GenericWrappers {
    @FindBy(id="select_mydownloads")
    public WebElement reportSelectAllBtn;
    @FindBy(css="#tab_report button:nth-child(1)")
    public WebElement reportDeleteBtn;
    @FindBy(css="#tab_report button:nth-child(2)")
    public WebElement reportUnSelectAllBtn;
    @FindBy(css="div#mydownloads tr")
    public WebElement sizeTableRow;
    @FindBy(css="[alt='Excel 2007']:nth-child(1)")
    public WebElement downloadExcel;
    @FindBy(css="div#mydownloads tr:nth-child(1) td:nth-child(7) img:nth-child(2)")
    public WebElement downloadWord;
    @FindBy(css="div#mydownloads tr:nth-child(1) td:nth-child(7) img:nth-child(4)")
    public WebElement downloadPdf;

}
