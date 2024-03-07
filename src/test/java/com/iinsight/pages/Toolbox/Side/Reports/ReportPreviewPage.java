package com.iinsight.pages.Toolbox.Side.Reports;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.Toolbox.Side.Reports.ReportPreview;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class ReportPreviewPage extends ReportPreview {
    public ReportPreviewPage(){PageFactory.initElements(getDriver(), this);
    }
    ArrayList<String> expected = new ArrayList<>();

    public boolean isCrossButtonVisible(){
        waitVisibilityOfElement(crossButton);
        waitElementToBeClickable(crossButton);
        return isElementDisplayed(crossButton);
    }
    public double calculateMargin(String totalAmount, String employeeAmount){
        return Math.round(((Double.parseDouble(totalAmount) - Double.parseDouble(employeeAmount)) / Double.parseDouble(totalAmount))*100);
    }
    public int calculateProfit(String totalAmount, String employeeAmount){
        return ((Integer.parseInt(totalAmount)) - (Integer.parseInt(employeeAmount)));
    }
    public int calculateAmount(String totalAmount, String employeeAmount){
        return ((Integer.parseInt(totalAmount)) + (Integer.parseInt(employeeAmount)));
    }

    /** BILLING BY EMPLOYEE **/
    // Locators When Selected Employee Filter Is Selected
    public String getByEmployeeAmountExVAT1Text(){ return getText(byEmployeeAmountExVAT1).replaceAll("[^0-9,]","").replaceAll(",.", "");
    }
    public String getByEmployeeAmount1Text(){ return getText(byEmployeeAmount1);
    }
    public String getByEmployeeAmountVAT1Text(){ return getText(byEmployeeAmountVAT1);
    }
    public String getByEmployeeCostsExVAT1Text(){ return getText(byEmployeeCostsExVAT1).replaceAll("[^0-9,]","").replaceAll(",.", "");
    }
    public String getByEmployeeCosts1Text(){ return getText(byEmployeeCosts1);
    }
    public String getByEmployeeVAT1Text(){ return getText(byEmployeeVAT1);
    }
    public String getByEmployeeProfit1Text(){ return getText(byEmployeeProfit1).replaceAll("[^0-9,]","").replaceAll(",.", "");
    }
    public String getByEmployeeMargin1Text(){ return getText(byEmployeeMargin1);
    }

    // T O T A L    V A L U E S     L O C A T O R S
    // Locators When Selected Employee Filter Is Selected
    public String getByEmployeeAmountExVATTotalText(){ return getText(byEmployeeAmountExVATTotal);
    }
    public String getByEmployeeAmountTotalText(){ return getText(byEmployeeAmountTotal);
    }
    public String getByEmployeeAmountVATTotalText(){ return getText(byEmployeeAmountVATTotal);
    }
    public String getByEmployeeCostsExVATTotalText(){ return getText(byEmployeeCostsExVATTotal);
    }
    public String getByEmployeeCostsTotalText(){ return getText(byEmployeeCostsTotal);
    }
    public String getByEmployeeVATTotalText(){ return getText(byEmployeeVATTotal);
    }
    public String getByEmployeeProfitTotalText(){ return getText(byEmployeeProfitTotal);
    }
    public String getByEmployeeMarginTotalText(){ return getText(byEmployeeMarginTotal);
    }

    /** BILLING BY CASE **/
    public void verifyReportGetByCase(){
        String CurrentAppointmentCaseNumber, getAmount;
        CurrentAppointmentCaseNumber = getTestDataValue("CompanyID");
        WebElement listItem;
        By xpath = By.xpath("//td[contains(text(),'"+CurrentAppointmentCaseNumber+"')]//following::table[1]//td[@class='report_total'][position() mod  2 = 0]");
        waitPresenceOfElementLocated(xpath);
        int sizeOfList = getDriver().findElements(xpath).size();
        System.out.println("sizeOfList; "+sizeOfList);
        for(int i=1;i<=sizeOfList;i++){
            By xpath2 = By.xpath("(//td[contains(text(),'"+CurrentAppointmentCaseNumber+"')]//following::table[1]//td[@class='report_total'][position() mod  2 = 0])["+i+"]");
            listItem = getDriver().findElement(xpath2);
            waitVisibilityOfElement(listItem);
            getAmount  = getText(listItem).replaceAll("[^0-9,]","").replaceAll(",.", "");
            System.out.println("getAmount: "+getAmount);
            expected.add(getAmount);    // GET All 6 Fields Value
        }
        System.out.println("AmountsList: "+expected);
        // GET Sum Of Cost - Values Added In List From Costs Tab
        String amountsSum = String.valueOf(CaseTypeTestData.AmountsList.stream().mapToInt(Integer::parseInt).sum());
        System.out.println("Total Amount: "+amountsSum);
        // GET Second Last Value From List - TO Verify Sum (Amount) with Cost Tab Values
        Assert.assertTrue(expected.get(sizeOfList - 2).contains(amountsSum));
        // GET Sum Of Duration - Values Added In List From Costs Tab
        String durationSum = Integer.toString(CaseTypeTestData.DurationsList.stream().mapToInt(Integer::parseInt).sum());
        System.out.println("Total Duration: "+durationSum);
        // GET Fourth Last Value From List - TO Verify Sum (Duration) with Cost Tab Values
        Assert.assertTrue(expected.get(sizeOfList-4).contains(durationSum));
        expected.clear();
        CaseTypeTestData.DurationsList.clear();
    }

    /** BILLING BY EMPLOYEE (GROUPED) **/
    public void clickTabularReportTab(){
        waitElementToBeClickable(tabularReportTab);
        clickButtonWithOutScroll(tabularReportTab);
    }
    public boolean isGroupedByEmployeeAmountExVATVisible(){
        waitVisibilityOfElement(groupedByEmployeeAmountExVAT1);
        return isElementDisplayed(groupedByEmployeeAmountExVAT1);
    }
    // Locators When Selected Employee Filter Is Selected
    // 1 Represent Single Values in Below Locators
    public String getGroupedByEmployeeDurationText(){return getText(groupedByEmployeeDuration1).replaceAll("[:0]","");}
    public String getGroupedByEmployeeAmountExVAT1Text(){return getText(groupedByEmployeeAmountExVAT1).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeAmount1Text(){return getText(groupedByEmployeeAmount1);}
    public String getGroupedByEmployeeVAT1Text(){return getText(groupedByEmployeeVAT1).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeCostsExVAT1Text(){return getText(groupedByEmployeeCostsExVAT1).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeCost1Text(){return getText(groupedByEmployeeCost1);}
    public String getGroupedByEmployeeProfit1Text(){return getText(groupedByEmployeeProfit1).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeMargin1Text(){return getText(groupedByEmployeeMargin1);}

    // G R A N D    T O T A L   V A L U E       L O C A T O R S
    public String getGroupedByEmployeeDurationGrandTotalText(){return getText(groupedByEmployeeDurationGrandTotal).replaceAll("[:0]","");}
    public String getGroupedByEmployeeAmountExVATGrandTotalText(){return getText(groupedByEmployeeAmountExVATGrandTotal);}
    public String getGroupedByEmployeeAmountGrandTotalText(){return getText(groupedByEmployeeAmountGrandTotal).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeVATGrandTotalText(){return getText(groupedByEmployeeVATGrandTotal);}
    public String getGroupedByEmployeeCostsExVATGrandTotalText(){return getText(groupedByEmployeeCostsExVATGrandTotal);}
    public String getGroupedByEmployeeCostGrandTotalText(){return getText(groupedByEmployeeCostGrandTotal);}
    public String getGroupedByEmployeeProfitGrandTotalText(){return getText(groupedByEmployeeProfitGrandTotal).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeMarginGrandTotalText(){return getText(groupedByEmployeeMarginGrandTotal);}

    // T O T A L    V A L U E S     L O C A T O R S
    public String getGroupedByEmployeeDurationTotalText(){return getText(groupedByEmployeeDurationTotal).replaceAll("[:0]","");}
    public String getGroupedByEmployeeAmountExVATTotalText(){return getText(groupedByEmployeeAmountExVATTotal);}
    public String getGroupedByEmployeeAmountTotalText(){return getText(groupedByEmployeeAmountTotal).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeVATTotalText(){return getText(groupedByEmployeeVATTotal);}
    public String getGroupedByEmployeeCostsExVATTotalText(){return getText(groupedByEmployeeCostsExVATTotal);}
    public String getGroupedByEmployeeCostTotalText(){return getText(groupedByEmployeeCostTotal);}
    public String getGroupedByEmployeeProfitTotalText(){return getText(groupedByEmployeeProfitTotal).replaceAll("[^0-9,]","").replaceAll(",.", "");}
    public String getGroupedByEmployeeMarginTotalText(){return getText(groupedByEmployeeMarginTotal);}

}
