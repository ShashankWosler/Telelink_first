package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.CaseLogs;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class CaseLogsPage extends CaseLogs{
    public static String billingID, invoiceID;
    public CaseLogsPage(){PageFactory.initElements(getDriver(), this);
    }
    public String searchKeyword = Integer.toString(getRandomNumber(999));

    public boolean isCaseLogsTabVisible(){return isElementDisplayed(getCase_log_tab);
    }
    public void clickCaseLogsTab(){clickButtonWithOutScroll(getCase_log_tab);
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
        Assert.assertEquals(actual, actual.contains(str));
    }
    public void verifyInvoiceLog(){
        waitFor(3000);
        invoiceID = config.getString("InvoiceID");
       String str = invoiceID.replaceAll("[^0-9]","");
        String actual = getAttributeValue(title_text, "title");
        System.out.println("InvoiceID in Case Log ----- "+actual);
        System.out.println("Expected InvoiceID ----- "+str);
        Assert.assertTrue(actual, actual.contains(str));

    }
}
