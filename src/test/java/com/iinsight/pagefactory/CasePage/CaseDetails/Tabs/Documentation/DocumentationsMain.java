package com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Documentation;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocumentationsMain extends GenericWrappers {

    @FindBy(id = "cases_documentation_new")
    public WebElement documentation_add_new_btn;
    @FindBy(id = "cases_documentation_muti_upload")
    public WebElement documentation_upload_btn;
    @FindBy(id = "cases_documentation_delete")
    public WebElement documentation_delete_btn;
    @FindBy(id = "cases_documentation_edit")
    public WebElement documentation_edit_btn;
    @FindBy(id = "cases_documentation_clone")
    public WebElement documentation_clone_btn;
    @FindBy(id = "cases_documentation_word")
    public WebElement documentation_openDoc_btn;
    @FindBy(id = "cases_documentation_email")
    public WebElement documentation_emailDoc_btn;
    @FindBy(id = "cases_documentation_download")
    public WebElement documentation_downloadCopy_btn;
    @FindBy(id = "cases_documentation_approve")
    public WebElement documentation_approveDoc_btn;
    @FindBy(id = "cases_documentation_download_selected")
    public WebElement documentation_selectDocumentsToExport_btn;
    @FindBy(css = "input#documentation_list_search_text")
    public WebElement documentation_search_field;
    @FindBy(css = "img[name='documentation_list_button']")
    public WebElement documentation_Title_dropdown_icon;
    @FindBy(id = "documentation_list_find")
    public WebElement documentation_find_btn;
    @FindBy(id = "small_fields_view_documentation_list")
    public WebElement documentation_fieldEdit_btn;
    @FindBy(css = "img[name='documentation_list_filter_by_special_button']")
    public WebElement documentation_AllStatus_dropdown_icon;
    @FindBy(xpath="//div[@id='documentation_list']//table//td[contains(@id, 'documentation.title_column')]")
    public List<WebElement> documentationCount;
}
