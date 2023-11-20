package com.iinsight.pages.CasePage.CaseDetails.Tabs.Documentation;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Documentation.EmailPopUp;
import org.openqa.selenium.support.PageFactory;

public class EmailPopUpPage extends EmailPopUp {
    public EmailPopUpPage(){PageFactory.initElements(getDriver(), this);
    }
    public void clickEmailToDropdown(){clickButtonWithOutScroll(email_to_dropdown_icon);}
    public void clickEmailCCDropdown(){clickButtonWithOutScroll(email_cc_dropdown_icon);}
    public void clickSelectAllBtn(){clickButtonWithOutScroll(selectAll_email);}
    public void clickEmailTemplateDropdown(){clickButtonWithOutScroll(email_template_dropdown_icon);}
    public void clickSubjectTab(){clickButtonWithOutScroll(email_subject_dropdown_icon);}
    public void clickSearchTab(){clickButtonWithOutScroll(email_search_text_field);}
    public void clickSearchDropdown(){clickButtonWithOutScroll(email_search_dropdown);}

}
