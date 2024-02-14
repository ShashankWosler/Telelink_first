package com.iinsight.pages.Toolbox.Side.TimeSheets;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.Toolbox.Side.TimeSheets.TimeSheetsMain;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TimeSheetsMainPage extends TimeSheetsMain {
    public TimeSheetsMainPage(){PageFactory.initElements(getDriver(),this);
    }

    // H E A D E R S    B U T T O N S
    public boolean isBillingButtonVisible(){
        waitVisibilityOfElement(billingButton);
        return isElementDisplayed(billingButton);
    }
    public void clickBillingButton(){clickButtonWithOutScroll(billingButton);
    }
    public void clickGroupBillingButton(){clickButtonWithOutScroll(groupBillingButton);
    }
    public void clickInternalExpenseButton(){clickButtonWithOutScroll(internalExpenseButton);
    }
    public void clickDeleteButton(){clickButtonWithOutScroll(deleteButton);
    }
    public void clickExportButton(){clickButtonWithOutScroll(exportButton);
    }

    // D R O P D O W N S    T A B S
    public String getEmployeeInputText(){return getAttributeValue(employeeInput,"value");
    }
    public String getDateRangeInputText(){return getAttributeValue(dateRangeInput,"value");
    }
    public String getFromInputText(){return getAttributeValue(fromInput,"value");
    }
    public String getToDateInputText(){return getAttributeValue(toDateInput,"value");
    }
    public void clickEmployeeDropDown(){clickButtonWithOutScroll(employeeDropDown);
    }
    public void clickEmployeeAllFilterButton(){
        waitFor(4000);
        clickButtonWithOutScroll(employeeAllFilterButton);
    }
    public void clickEmployeeCancelButton(){
        try{
        clickButtonWithOutScroll(employeeCancelButton);
        }catch(Exception e){
            System.out.println("TimeSheetsMainPage.clickEmployeeCancelButton()"+e.getClass()+" "+e.getMessage());
        }

    }
    public void clickDateRangeDropDown(){clickButtonWithOutScroll(dateRangeDropDown);
    }
    public void clickFromDropDown(){clickButtonWithOutScroll(fromDropDown);
    }
    public void clickToDateDropDown(){clickButtonWithOutScroll(toDateDropDown);
    }

    // TOTAL OF ACTIVITY
    public String getActivityTimeInputText(){return getInnerText(activityTimeInput);}
    public String getActivityChargeInputText(){return getInnerText(activityChargeInput);}
    public String getItemTotalNumberInputText(){return getInnerText(itemTotalNumberInput);}
    public String getItemChargeInputText(){return getInnerText(itemChargeInput);}
    public String getTotalBillingInputText(){return getInnerText(totalBillingInput);}

    // TOTAL EMPLOYEE DURATION
    public String getEmployeeDurationInputText(){return getInnerText(employeeDurationInput);}
    public String getEmployeeDurationChargeInputText(){return getInnerText(employeeDurationChargeInput);}
    public String getEmployeeItemsInputText(){return getInnerText(employeeItemsInput);}
    public String getEmployeeInputChargeInputText(){return getInnerText(employeeInputChargeInput);}
    public String getEmployeeTotalExpenseInputText(){return getInnerText(employeeTotalExpenseInput);}

    // LISTING
    public void clickSearchButton(){
        try {
            clickButtonWithOutScroll(searchButton);
        }catch (StaleElementReferenceException e){
            System.out.println("TimeSheetsMainPage.clickSearchButton() "+e.getClass()+" "+e.getMessage());
            clickButtonWithOutScroll(searchButton);
        }}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public String getCostTypeInputText(){return getAttributeValue(costTypeInput,"value");}
    public void clickCostTypeDropDown(){clickButtonWithOutScroll(costTypeDropDown);}
    public void SelectIncludeInternalExpenseCheckBox(){clickButtonWithOutScroll(includeInternalExpenseCheckBox);}
    public boolean isTableListingVisible(){
        waitVisibilityOfElement(tableListing);
        return isElementDisplayed(tableListing);}
    public String getTableCaseNumberText(){return getAttributeValue(tableCaseNumber,"title");}
    public String getTableChargeText(){return getAttributeValue(tableCharge,"title");}
    public void getAllTimesheetChargesAmount(){
        String getAmount;
        WebElement listItem;
        if(getAmounts.size()!=0){
            for(int i=1;i<=getAmounts.size();i++) {
                By xpath= By.xpath("(//div[@id='time_sheet']//tr//td[position() mod 32 = 6])["+i+"]");
                listItem = getDriver().findElement(xpath);
                waitVisibilityOfElement(listItem);
                getAmount  = getAttributeValue(listItem,"title").replaceAll("[^0-9,]","");
                CaseTypeTestData.AmountsListTimeSheet.add(getAmount.substring(0, getAmount.indexOf(",")));
            }}
    }

    // S E A R C H      S I D E     B A R
    public boolean isSideBarVisible(){
        waitVisibilityOfElement(sideBar);
        return isElementDisplayed(sideBar);
    }
    public void clickByDropDown(){clickButtonWithOutScroll(byDropDown);
    }
    public void clickCancelButton(){clickButtonWithOutScroll(cancelButton);
    }
    public void clickSideBarSearchButton(){clickButtonWithOutScroll(sideBarSearchButton);
    }
    public boolean isBackButtonVisible(){return isElementDisplayed(sideBarInput);
    }
    public void clickBackButton(){clickButtonWithOutScroll(backButton);
    }
    public void enterSideBarInput(String valueToSearch){
        enterText(sideBarInput, valueToSearch);
    }
    public String getByInputText(){return getAttributeValue(byInput,"value");
    }






















}
