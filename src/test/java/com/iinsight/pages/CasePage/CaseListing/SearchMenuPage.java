package com.iinsight.pages.CasePage.CaseListing;

import com.iinsight.pagefactory.CasePage.CaseListing.SearchMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchMenuPage extends SearchMenu {
    public SearchMenuPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isClearButtonIsVisible(){return isElementDisplayed(clear_btn);}
    public void clickClearButton(){clickButtonWithOutScroll(clear_btn);
    }
    public boolean isSearchButtonIsVisible(){return isElementDisplayed(search_btn);
    }
    public void clickSearchButton(){clickButtonWithOutScroll(search_btn);
    }
    public boolean isDeleteButtonIsVisible(){return isElementDisplayed(delete_btn);
    }
    public boolean isSearchFiltersIsVisible(){return isElementDisplayed(search_criteria_fields);
    }
    public void enterTextSearchTab(String filterValue){
        setImplicit(10);
        waitElementToBeClickable(search_criteria_fields);
        enterText(search_criteria_fields,filterValue);
    }
    public boolean isTextSearchMainTabVisible(){return isElementDisplayed(search_criteria_main_tab);
    }
    public void enterTextSearchMainTab(String filterValue){
        search_criteria_main_tab.clear();
        enterTextAppend(search_criteria_main_tab,filterValue);
    }
    public boolean isSearchCriteriaDropDownIsVisible(){return isElementDisplayed(search_criteria_field_dropdown);}
    public void clickSearchCriteriaDropDown(){clickButtonWithOutScroll(search_criteria_field_dropdown);}
    public String getSearchCriteriaInputText(){return getAttributeValue(searchCriteriaInput,"value");
    }

    public void clickDeleteButton(){
        WebElement listElem;
            System.out.println("delete_btn.size() "+delete_btn.size());
            if(delete_btn.size()!=0){
                for(int i=delete_btn.size(); i>=1;i--){
                    waitFor(2000);
                    By xpath = By.xpath("(//div[contains(@class,'search-criteria-list')]//span)["+i+"]");
                    listElem = getDriver().findElement(xpath);
                    if(isElementDisplayed(listElem)){
                        try{
                        waitElementToBeClickable(listElem);
                        mouseOver(listElem);
                        setImplicit(60);
                        clickButtonWithOutScroll(listElem);
                        waitFor(2000);
                        System.out.println(listElem);}
                        catch(Exception e){
                            waitFor(2000);
                            clickButtonWithOutScroll(listElem);
                            waitFor(2000);
                        }}}
            }
    }

}
