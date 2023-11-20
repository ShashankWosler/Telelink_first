package com.iinsight.pagefactory.CasePage.CaseListing;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseListingMain extends GenericWrappers {

    @FindBy(css="[table_id='1']")
    public WebElement caseListIndex1;
    @FindBy(id="case_list_list_click_view")
    public WebElement listView;
    @FindBy(id="case_list_details_click_view")
    public WebElement listDetailsView;
    @FindBy(id="case_list_new")
    public WebElement addCaseBtn;
    @FindBy(id="case_list_activity_new")
    public WebElement addCaseBillingBtn;
    @FindBy(id="table-search-icon")
    public WebElement searchBtn;
    @FindBy(id="fields_view_multicriteria_case_list")
    public WebElement fieldsEditBtn;
    @FindBy(className="btn-group hidden-sm")
    public WebElement dropDown;
    @FindBy(css="[title='Export']")
    public WebElement dropDownValue1;
    @FindBy(css="[title='Save view']")
    public WebElement dropDownValue2;
    @FindBy(id="archive_case")
    public WebElement dropDownValue3;
    @FindBy(id="restore_archive_case")
    public WebElement dropDownValue4;
    @FindBy(css="[id='case_list.filter']")
    public WebElement filterDropDown;
    @FindBy(css="td[id='case_details.case_n_column']")
    public WebElement getCaseID;


    @FindBy(css="#drop_down_multiselect div:nth-child(1)")
    public WebElement filterDropDownValue1; // All Cases
    @FindBy(css="#drop_down_multiselect div:nth-child(2)")
    public WebElement filterDropDownValue2; // Closed Cases Only
    @FindBy(css="#drop_down_multiselect div:nth-child(3)")
    public WebElement filterDropDownValue3; // Open Cases Only
    @FindBy(css="#drop_down_multiselect div:nth-child(4)")
    public WebElement filterDropDownValue4; // My Assigned Cases
    @FindBy(css="#drop_down_multiselect div:nth-child(5)")
    public WebElement filterDropDownValue5; // My Assigned Open Cases
    @FindBy(css="#drop_down_multiselect div:nth-child(6)")
    public WebElement filterDropDownValue6; // My Team Cases
    @FindBy(css="#drop_down_multiselect div:nth-child(7)")
    public WebElement filterDropDownValue7; // Organisation Views (Disabled)
    @FindBy(css="#drop_down_multiselect div:nth-child(8)")
    public WebElement filterDropDownValue8; // Not Yet Assigned
    @FindBy(id="dispcasenum")
    public WebElement caseNoteName;
}

