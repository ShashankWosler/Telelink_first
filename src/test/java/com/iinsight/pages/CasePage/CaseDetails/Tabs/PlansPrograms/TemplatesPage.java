package com.iinsight.pages.CasePage.CaseDetails.Tabs.PlansPrograms;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.PlansPrograms.Templates;
import org.openqa.selenium.support.PageFactory;

public class TemplatesPage extends Templates {
    public TemplatesPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isSaveAsPlanButtonVisible(){
        waitElementToBeClickable(saveAsPlanButton);
        return isElementDisplayed(saveAsPlanButton);}
    public void clickSaveAsPlanButton(){clickButtonWithOutScroll(saveAsPlanButton);}
    public void enterSearchTab(){enterText(searchTab);}
    public void clickByDropDownButton(){clickButtonWithOutScroll(byDropDownButton);}
    public void clickFieldEditButton(){clickButtonWithOutScroll(fieldEditButton);}
    public boolean isFirstRowFieldsVisible(){return isElementDisplayed(firstRowFields);}
}
