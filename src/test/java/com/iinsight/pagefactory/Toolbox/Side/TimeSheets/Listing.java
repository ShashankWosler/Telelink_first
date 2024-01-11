package com.iinsight.pagefactory.Toolbox.Side.TimeSheets;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Listing extends GenericWrappers {
    @FindBy(id="table-search-icon")
    public WebElement searchButton;
    @FindBy(css="[id='Fields View']")
    public WebElement fieldEditButton;
    @FindBy(id="cost_type")
    public WebElement costTypeInput;    //getAttribute "value"
    @FindBy(css="[name='cost_type_button']")
    public WebElement costTypeDropDown;
    @FindBy(css="[name='chk_internal_expenses']")
    public WebElement includeInternalExpenseCheckBox;
    @FindBy(css="div#time_sheet")
    public WebElement tableListing;     // isElementDisplayed
    @FindBy(xpath="//div[@id='time_sheet']//tr/td[2]")
    public WebElement tableCaseNumber;      //getAttribute "title"
    @FindBy(xpath="//div[@id='time_sheet']//tr/td[6]")
    public WebElement tableCharge;      //getAttribute "title" - R88,00

    // S E A R C H      S I D E     B A R
    @FindBy(css="div#time_sheet-table-vertical-search-area")
    public WebElement sideBar;      //isElementDisplayed
    @FindBy(css="input#time_sheet_search_text")
    public WebElement sideBarInput;     //getAttribute "value" : sendKeys
    @FindBy(css="[name='time_sheet_button']")
    public WebElement byDropDown;
    @FindBy(id="time_sheet_search_field")
    public WebElement byInput;  //getAttribute "value" :
    @FindBy(id="time_sheet_find")
    public WebElement sideBarSearchButton;
    @FindBy(css="[class='fa fa-lg fa-times right']")
    public WebElement cancelButton;
    @FindBy(css="span#time_sheet_search_icon")
    public WebElement backButton;
}
