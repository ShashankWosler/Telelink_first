package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.FieldsEdit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FieldsEditPage extends FieldsEdit {
    public FieldsEditPage(){PageFactory.initElements(getDriver(), this);
    }

    public boolean isDisableButtonVisible(){
        return isElementDisplayed(disableBtn);
    }
    public boolean isEnableButtonVisible(){
        return isElementDisplayed(enableBtn);
    }
    public Select enabledDropDown(){return selectDropdown(enabledBox);
    }
    public Select disabledDropDown(){return selectDropdown(disabledBox);
    }
    public int sizeOfEnabledOptions(){
        List<WebElement> elementCount = enabledDropDown().getOptions();
        System.out.println("Number of Enabled items: " + elementCount.size());
        return elementCount.size();
    }
    public int sizeOfDisabledOptions(){
        List<WebElement> elementCount = disabledDropDown().getOptions();
        System.out.println("Number of Disabled items: " + elementCount.size());
        return elementCount.size();
    }
    public void selectTitleFromEnableDropDown(){
        int count = sizeOfEnabledOptions();
        if(count!=0)
            selectByIndex(enabledBox,1);
    }
    public boolean isFirstIndexFromDisableDropDownDisplayed(){return isElementDisplayed(enabledBox);
    }
    public void selectFirstIndexFromDisableDropDown(){
        int count = sizeOfDisabledOptions();
        if(count!=0){
            selectByIndex(enabledBox,1);
        }
    }
    public void clickEnableButton(){ clickButtonWithOutScroll(enableBtn);
    }
    public void clickDisableButton(){ clickButtonWithOutScroll(disableBtn);
    }
    public void clickApplyButton(){ clickButtonWithOutScroll(applyBtn);
    }
    public void clickCancelButton(){ clickButtonWithOutScroll(cancelBtn);
    }
    public void clickUpArrowButton(){
        for(int i=1;i<=sizeOfDisabledOptions()-1;i++){
            clickButtonWithOutScroll(upArrowBtn);}
    }
    public void clickDownArrowButton(){ clickButtonWithOutScroll(downArrowBtn);
    }
}
