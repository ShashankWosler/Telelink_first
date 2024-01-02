package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.AdminNotes;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.PageFactory;

public class AdminNotesPage extends AdminNotes{
    public AdminNotesPage(){PageFactory.initElements(getDriver(), this);
    }
    public String searchKeyword = Integer.toString(getRandomNumber(999));

    public void clickAdminNotesTab(){clickButtonWithOutScroll(admin_notes_tab);
    }
    public void clickAddNewButton(){clickButtonWithOutScroll(add_new_btn);
    }
    public void clickDetailsButton(){
        waitFor(2000);
        try{
            clickButtonWithOutScroll(details_btn);
        }
        catch (ElementClickInterceptedException e){
            System.out.println("AdminNotePage.clickDetailsButton() - "+e.getClass());
            waitFor(3000);
            clickButtonWithOutScroll(details_btn);
        }
    }
    public void clickDeleteButton(){clickButtonWithOutScroll(delete_btn);
    }
    public void clickSearchTabButton(){clickButtonWithOutScroll(search_tab);
    }
    public void enterKeywordInSearchTab(){
        enterTextWithoutScroll(search_tab,searchKeyword);
    }
    public void clickByDropDownTab(){clickButtonWithOutScroll(get_by_dropdown_tab);
    }
    public void clickFindBtn(){clickButtonWithOutScroll(find_btn);
    }
    public void clickFieldEditBtn(){clickButtonWithOutScroll(field_edit_btn);
    }
    public void clickFirstRowFromTable(){clickButtonWithOutScroll(table_index1);
    }
    public void getFirstRowFromTable(String str){
        waitFor(5000);
        String admintitle = getAttributeValue(table_index1 , "title");
       // String str2 = admintitle.replaceAll("[^0-9]","");
        System.out.println("Admin Title ----------------- " +admintitle);
        getID(str, admintitle);
    }
    public boolean isDeletePopUpVisible(){return isElementDisplayed(deletePopUpOkButton);}
    public void clickOkButton(){clickButtonWithOutScroll(deletePopUpOkButton);}
}
