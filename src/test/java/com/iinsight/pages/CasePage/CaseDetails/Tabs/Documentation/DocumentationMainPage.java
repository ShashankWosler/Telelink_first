package com.iinsight.pages.CasePage.CaseDetails.Tabs.Documentation;

import com.iinsight.TestData.CaseTypeTestData;
import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.Documentation.DocumentationsMain;
import org.openqa.selenium.support.PageFactory;

public class DocumentationMainPage extends DocumentationsMain {
    public DocumentationMainPage(){PageFactory.initElements(getDriver(), this);
    }
    public void clickAddNewBtn(){clickButtonWithOutScroll(documentation_add_new_btn);}
    public void clickUploadBtn(){clickButtonWithOutScroll(documentation_upload_btn);}
    public void clickDeleteBtn(){clickButtonWithOutScroll(documentation_delete_btn);}
    public void clickEdirBtn(){clickButtonWithOutScroll(documentation_edit_btn);}
    public void clickEditBtn(){clickButtonWithOutScroll(documentation_clone_btn);}
    public void clickOpenDocBtn(){clickButtonWithOutScroll(documentation_openDoc_btn);}
    public void clickEmailDocBtn(){clickButtonWithOutScroll(documentation_emailDoc_btn);}
    public void clickDownloadCopyBtn(){clickButtonWithOutScroll(documentation_downloadCopy_btn);}
    public void clickApproveDocBtn(){clickButtonWithOutScroll(documentation_approveDoc_btn);}
    public void clickSelectDocToExportBtn(){clickButtonWithOutScroll(documentation_selectDocumentsToExport_btn);}
    public void clickSearchBtn(){clickButtonWithOutScroll(documentation_search_field);}
    public void clickTitleTab(){clickButtonWithOutScroll(documentation_Title_dropdown_icon);}
    public void clickFindBtn(){clickButtonWithOutScroll(documentation_find_btn);}
    public void clickFieldsEditBtn(){clickButtonWithOutScroll(documentation_fieldEdit_btn);}
    public void clickAllStatusDrpDownBtn(){clickButtonWithOutScroll(documentation_AllStatus_dropdown_icon);}
    public void getDocumentationsCount(){
        CaseTypeTestData.documentSize = String.valueOf(documentationCount.size());
        System.out.println("Documentation List Size: "+CaseTypeTestData.documentSize);
    }

}
