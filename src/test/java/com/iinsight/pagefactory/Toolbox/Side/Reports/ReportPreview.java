package com.iinsight.pagefactory.Toolbox.Side.Reports;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReportPreview extends GenericWrappers {
    @FindBy(id="level3_form_close")
    public WebElement crossButton;    //Common

    // BILLING BY EMPLOYEE - Iteration (1) Continue and GetText()
    // Last Index in List Will Be Total of Each Coloumn

    // Locators When Selected Employee Filter Not Selected
    @FindBy(xpath = "//table[@class='report_table'][3]//td[4]")
    public List<WebElement> byEmployeeAmountExVAT;
    @FindBy(xpath = "//table[@class='report_table'][3]//td[5]")
    public List<WebElement> byEmployeeAmount;
    @FindBy(xpath = "//table[@class='report_table'][3]//td[6]")
    public List<WebElement> byEmployeeAmountVAT;
    @FindBy(xpath = "//table[@class='report_table'][3]//td[7]")
    public List<WebElement> byEmployeeCostsExVAT;
    @FindBy(xpath = "//table[@class='report_table'][3]//td[8]")
    public List<WebElement> byEmployeeCosts;
    @FindBy(xpath = "//table[@class='report_table'][3]//td[9]")
    public List<WebElement> byEmployeeVAT;
    @FindBy(xpath = "//table[@class='report_table'][3]//td[13]")
    public List<WebElement> byEmployeeProfit;

    // Locators When Selected Employee Filter Is Selected
    // 1 Represent Single Values in Below Locators
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[4])[2]")
    public WebElement byEmployeeAmountExVAT1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[5])[2]")
    public WebElement byEmployeeAmount1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[6])[2]")
    public WebElement byEmployeeAmountVAT1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[7])[2]")
    public WebElement byEmployeeCostsExVAT1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[8])[2]")
    public WebElement byEmployeeCosts1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[9])[2]")
    public WebElement byEmployeeVAT1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[13])[2]")
    public WebElement byEmployeeProfit1;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[14])[2]")
    public WebElement byEmployeeMargin1;

    // T O T A L    V A L U E S     L O C A T O R S
    // 1 Represent Single Values in Below Locators
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[4])[last()]")
    public WebElement byEmployeeAmountExVATTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[5])[last()]")
    public WebElement byEmployeeAmountTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[6])[last()]")
    public WebElement byEmployeeAmountVATTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[7])[last()]")
    public WebElement byEmployeeCostsExVATTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[8])[last()]")
    public WebElement byEmployeeCostsTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[9])[last()]")
    public WebElement byEmployeeVATTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[13])[last()]")
    public WebElement byEmployeeProfitTotal;
    @FindBy(xpath = "(//table[@class='report_table'][3]//td[14])[last()]")
    public WebElement byEmployeeMarginTotal;


    // BILLING BY CASE - Iteration (1) Continue and GetText()

    // Last Index in List Will Be Total of Each Coloumn

    // //td[contains(text(),'CurrentAppointmentCaseNumber')] - Find This Element : Before Verifying Cost

    // //td[contains(text(),'CurrentAppointmentCaseNumber')]//following::table[1]//td[@class='report_total'][position() mod  2 = 0]
    // To Get Values - Continue Till Iteration - 2
    // Index Element : Total Activity Duration, Total Activity Charge, Total Case Costs inc VAT, Total inc VAT


    // BILLING BY EMPLOYEE (GROUPED) - Iteration (1) Continue and GetText()
    //    // Last Index in List Will Be Grand Total of Each Coloumn
    //    // Second Last Index in List Will Be Total of Each Coloumn
    @FindBy(id="link_text")
    public WebElement tabularReportTab;
    // Locators When Selected Employee Filter Not Selected
    @FindBy(xpath="//td[@class='report_header']//ancestor::table//td[5]")
    public List<WebElement> groupedByEmployeeAmountExVAT;
    @FindBy(xpath="//td[@class='report_header']//ancestor::table//td[6]")
    public List<WebElement> groupedByEmployeeAmount;
    @FindBy(xpath="//td[@class='report_header']//ancestor::table//td[8]")
    public List<WebElement> groupedByEmployeeCostsExVAT ;
    @FindBy(xpath="//td[@class='report_header']//ancestor::table//td[9]")
    public List<WebElement> groupedByEmployeeCost ;
    @FindBy(xpath="//td[@class='report_header']//ancestor::table//td[12]")
    public List<WebElement> groupedByEmployeeProfit;

    // Locators When Selected Employee Filter Is Selected
    // 1 Represent Single Values in Below Locators
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[4])[2]")
    public WebElement groupedByEmployeeDuration1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[5])[2]")
    public WebElement groupedByEmployeeAmountExVAT1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[6])[2]")
    public WebElement groupedByEmployeeAmount1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[7])[2]")
    public WebElement groupedByEmployeeVAT1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[8])[2]")
    public WebElement groupedByEmployeeCostsExVAT1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[9])[2]")
    public WebElement groupedByEmployeeCost1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[12])[2]")
    public WebElement groupedByEmployeeProfit1;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[13])[2]")
    public WebElement groupedByEmployeeMargin1;

    // G R A N D    T O T A L   V A L U E       L O C A T O R S
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[4])[last()]")
    public WebElement groupedByEmployeeDurationGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[5])[last()]")
    public WebElement groupedByEmployeeAmountExVATGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[6])[last()]")
    public WebElement groupedByEmployeeAmountGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[7])[last()]")
    public WebElement groupedByEmployeeVATGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[8])[last()]")
    public WebElement groupedByEmployeeCostsExVATGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[9])[last()]")
    public WebElement groupedByEmployeeCostGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[12])[last()]")
    public WebElement groupedByEmployeeProfitGrandTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[13])[last()]")
    public WebElement groupedByEmployeeMarginGrandTotal;

    // T O T A L    V A L U E S     L O C A T O R S
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[4])[last()-1]")
    public WebElement groupedByEmployeeDurationTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[5])[last()-1]")
    public WebElement groupedByEmployeeAmountExVATTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[6])[last()-1]")
    public WebElement groupedByEmployeeAmountTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[7])[last()-1]")
    public WebElement groupedByEmployeeVATTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[8])[last()-1]")
    public WebElement groupedByEmployeeCostsExVATTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[9])[last()-1]")
    public WebElement groupedByEmployeeCostTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[12])[last()-1]")
    public WebElement groupedByEmployeeProfitTotal;
    @FindBy(xpath="(//td[@class='report_header']//ancestor::table//td[13])[last()-1]")
    public WebElement groupedByEmployeeMarginTotal;

}
