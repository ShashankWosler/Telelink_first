package com.iinsight.pages.Toolbox.Side.Templates;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.Toolbox.Side.Templates.DocumentTemplate;
import org.openqa.selenium.support.PageFactory;

public class DocumentTemplatePage extends DocumentTemplate {
    public DocumentTemplatePage(){PageFactory.initElements(getDriver(), this);
    }
    public void enterName(){
        enterText(nameField, CaseTypeTestData.FirstName);
    }
    public void enterDescription(){
        enterText(nameField, CaseTypeTestData.Description);
    }
    public void clickOnUploadButton(){
        clickButtonWithOutScroll(uploadBtn);
    }
    public void clickOnCancelButton(){
        clickButtonWithOutScroll(cancelBtn);
    }
}
