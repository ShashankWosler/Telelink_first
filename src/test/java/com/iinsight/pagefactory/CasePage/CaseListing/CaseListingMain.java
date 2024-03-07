package com.iinsight.pagefactory.CasePage.CaseListing;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CaseListingMain extends GenericWrappers {
    @FindBy(css="div#case_list tr:nth-child(1)")
    public WebElement caseListIndex1;
    @FindBy(id="archival_status")
    public WebElement archiveText;
    @FindBy(css="div#case_list tr")
    public WebElement getSearchedTableRow;
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

    // F U L L      S C R E E N
    @FindBy(css="i#back-arrow-caselist")
    public WebElement backButtonFullScreen;

    // E L L I P S E S      I C O N
    @FindBy(css="div[class='btn-group hidden-sm']")
    public WebElement ellipsesIcon;
    @FindBy(css="[title='Export']")
    public WebElement dropDownValue1;
    @FindBy(css="[title='Save view']")
    public WebElement dropDownValue2;
    @FindBy(id="archive_case")
    public WebElement dropDownValue3;

    //  D I S A B L E D     O P T I O N
    @FindBy(id="archival_dropdown")
    public WebElement archivalOption;
    @FindBy(id="restore_dropdown")
    public WebElement restoreArchiveOption;
    // P O P    -   U P
    @FindBy(id="contact_new_1")
    public WebElement archiveConfirmBtn;        //Restore Archive - Restore Archived Case Button
    @FindBy(id="level3_form_close")
    public WebElement popUpCrossBtn;
    @FindBy(id="contact_new_2")
    public WebElement archiveCancelBtn;     //Restore Archive Cancel Button
    @FindBy(id="user_bypass_password")
    public WebElement passwordField;
    @FindBy(id="case_list_delete")
    public WebElement dropDownValue4;
    @FindBy(id="restore_dropdown")
    public WebElement restoreArchiveBtn;
    @FindBy(id="contact_new_3")
    public WebElement proceedAnywayBtn;     //Restore Archive - Create New Case Button
    @FindBy(css="p#alert_info_message p")
    public WebElement newCreatedCase;
    @FindBy(id="contact_new_1")
    public WebElement deleteCaseBtn;
    @FindBy(css="[id='case_list.filter']")
    public WebElement filterInput;
    @FindBy(css="[name='case_list.filter_button']")
    public WebElement filterDropDown;
    @FindBy(xpath = "//div[@id='drop_down_multiselect']/child::div[text()='All cases']")
    public WebElement allCasesDropDownValue;
    @FindBy(css="td[id='case_details.case_n_column']")
    public WebElement getCaseID;
    @FindBy(id="costs")
    public WebElement costCount;
    @FindBy(id="invoices")
    public WebElement invoicesCount;
    @FindBy(id="transactions")
    public WebElement transactionsCount;
    @FindBy(id="tasks")
    public WebElement tasksCount;
    @FindBy(id="documentation")
    public WebElement documentationCount;
    @FindBy(id="contacts")
    public WebElement contactCount;
    @FindBy(id="appointment")
    public WebElement appointmentCount;
    @FindBy(id="estimates")
    public WebElement planCount;

    // S A V E  P O P U P
    @FindBy(id="org_view_name")
    public WebElement viewNameField;
    @FindBy(id="organisation")
    public WebElement organisationViewBtn;
    @FindBy(id="view_save_edit")
    public WebElement newViewSaveBtn;

    // S A V E  P O P U P -- Delete Popup
    @FindBy(id="rate_delete_1")
    public WebElement okBtn;
    @FindBy(id="rate_delete_2")
    public WebElement cancelDeleteBtn;

    //  W A R N I N G - S E T T I N G S : [Archival,Deletion]
    @FindBy(xpath="//span[@id='discasewarning']/span[3]")
    public WebElement deleteWarning;
    @FindBy(xpath="//span[@id='discasewarning']/span[2]")
    public WebElement archiveWarning;


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

    // H O M E P A G E
    @FindBy(id="dispcasenum")
    public WebElement caseNoteName;
    @FindBy(css = "[type=password]")
    public  WebElement txt_Password;        // Pop-Up
    @FindBy(xpath = "//td[contains(text(),'returned no results')]")
    public WebElement emptySearchResult;

    // T A B L E    H E A D E R
    @FindBy(css="div#case_list_head td")
    public List<WebElement> caseListingHeaderCount;
    @FindBy(id="table_header_col_new_2")
    public WebElement caseIDColumn;
}

