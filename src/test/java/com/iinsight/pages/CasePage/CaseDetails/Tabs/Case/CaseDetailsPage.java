package com.iinsight.pages.CasePage.CaseDetails.Tabs.Case;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Case.CaseDetails;
import org.openqa.selenium.support.PageFactory;

public class CaseDetailsPage extends CaseDetails {
    public CaseDetailsPage(){
        PageFactory.initElements(getDriver(), this);
    }
    public boolean isBillToCompanyNameIsVisible(){return isElementDisplayed(bill_company_name);}
    public boolean isBillToCompanyStatusIsVisible(){return isElementDisplayed(bill_company_status);}
    public String getTextBillToCompanyName(){return getAttributeValue(bill_company_name,"value");}
    public String getTextBillToCompanyStatus(){return getAttributeValue(bill_company_status,"value");}

}
