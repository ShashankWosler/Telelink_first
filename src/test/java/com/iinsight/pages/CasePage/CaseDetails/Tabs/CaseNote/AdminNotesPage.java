package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.AdminNotes;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AdminNotesPage extends AdminNotes{
    public AdminNotesPage(){PageFactory.initElements(getDriver(), this);
    }
    public String searchKeyword = Integer.toString(getRandomNumber(999));

    public boolean isAdminNoteTabIsVisible(){
        waitVisibilityOfElement(admin_notes_tab);
        return isElementDisplayed(admin_notes_tab);}
    public void clickAdminNotesTab(){
        waitElementToBeClickable(admin_notes_tab);
        clickButtonWithOutScroll(admin_notes_tab);
    }
    public void clickAddNewButton(){clickButtonWithOutScroll(add_new_btn);
    }
    public void clickDetailsButton(){clickButtonWithOutScroll(details_btn);
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
    public void getFirstRowFromTable(){
        waitVisibilityOfElement(table_index1);
        isElementTextMatch(table_index1,searchKeyword);
    System.out.println("AdminNotesPage.getFirstRowFromTable -->> "+getText(table_index1));
    }
    public int getSizeOfTable(){
        By elem = By.cssSelector("div#admin_notes_list tr");
        waitPresenceOfElementLocated(elem);
        return getDriver().findElements(elem).size();
    }
    public boolean isDeletePopUpVisible(){
        waitVisibilityOfElement(deletePopUpOkButton);
        return isElementDisplayed(deletePopUpOkButton);}
    public void clickOkButton(){clickButtonWithOutScroll(deletePopUpOkButton);}

}
