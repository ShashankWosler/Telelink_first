package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Case;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseDetails extends GenericWrappers {
    @FindBy(css="input[id='case_details.bill_to']")
    public WebElement bill_company_name;
    @FindBy(css="input[id='case_details.case_status']")
    public WebElement bill_company_status;

}
