package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.CaseLogs;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CaseLogsPage extends CaseLogs{
    public static String billingID, invoiceID;
    public CaseLogsPage(){PageFactory.initElements(getDriver(), this);
    }
    public String searchKeyword = Integer.toString(getRandomNumber(999));

    public boolean isCaseLogsTabVisible(){
        setImplicit(10);
        waitVisibilityOfElement(getCase_log_tab);
        return isElementDisplayed(getCase_log_tab);
    }
    public void clickCaseLogsTab(){
        waitFor(2000);
        waitElementToBeClickable(getCase_log_tab);
        clickButtonWithOutScroll(getCase_log_tab);
    }
    public void clickDetailsButton(){clickButtonWithOutScroll(details_btn);
    }
    public void clickSearchTabButton(){clickButtonWithOutScroll(search_tab);
    }
    public void enterKeywordInSearchTab(){
        enterTextWithoutScroll(search_tab,searchKeyword);
    }
    public void clickByDropDownTab(){clickButtonWithOutScroll(get_by_dropdown_tab);
    }
    public void clickFindBtn(){clickButtonWithOutScroll(find_btn);
    }
    public void clickFieldEditBtn(){clickButtonWithOutScroll(field_edit_btn);
    }
    public void getFirstRowFromTable(){isElementTextMatch(table_index1,searchKeyword);
    }
    public void clickFirstRowFromTable(){clickButtonWithOutScroll(table_index1);
    }

    public void verifyBillingLog(){
        waitFor(3000);
        billingID = config.getString("CostID");
        String actual = getAttributeValue(title_text, "title");
        System.out.println(actual);
        isTextContain(actual, billingID);
    }
    public void verifyCreatedCaseLog(String str){
        waitFor(3000);
     //   CreatedCase = config.getString(str);
        String actual = getAttributeValue(title_text, "title");
        System.out.println(actual);
        Assert.assertEquals(actual,str);
    }
    public void verifyInvoiceLog(){
        waitFor(3000);
        invoiceID = config.getString("InvoiceID");
       String str = invoiceID.replaceAll("[^0-9]","");
        String actual = getAttributeValue(title_text, "title");
        System.out.println("InvoiceID in Case Log ----- "+actual);
        System.out.println("Expected InvoiceID ----- "+str);
        //Assert.assertTrue(actual, actual.contains(str));
    }
    public void getRecurrenceCaseLog(String logValue){
        int daysDiff = CaseTypeTestData.CheckBoxesList.size();
        for(int i = 0; i< daysDiff; i++){
            String getText = getAttributeValue(caseLogsList.get(i),"title");
            Assert.assertTrue(getText.contains(logValue));
        } if(logValue.equals("deleted")){
            CaseTypeTestData.CheckBoxesList.clear();
        }
    }
    public void getTemplatePlanCaseLog(){
        for(int i=0; i<templatePlanCaseLogList.size();i++){
            String getText = getAttributeValue(templatePlanCaseLogList.get(i),"title");
            switch (i) {
                case 0:
                    Assert.assertTrue(getText.contains("deleted"));
                    break;
                case 1:
                    Assert.assertTrue(getText.contains("is made current"));
                    break;
                case 2:
                    Assert.assertTrue(getText.contains("saved as a template"));
                    break;
            }}
    }

}
