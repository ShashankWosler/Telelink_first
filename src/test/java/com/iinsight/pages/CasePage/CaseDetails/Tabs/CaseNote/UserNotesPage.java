package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.UserNotes;
import org.openqa.selenium.support.PageFactory;


public class UserNotesPage extends UserNotes{
    public UserNotesPage(){PageFactory.initElements(getDriver(), this);
    }
    public String searchKeyword = Integer.toString(getRandomNumber(999));

    public void clickUserNotesTab(){clickButtonWithOutScroll(user_notes_tab);
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
    public boolean isByDropDownTabDisplayed(){return isElementDisplayed(get_by_dropdown_tab);
    }
    public void clickByDropDownTab(){clickButtonWithOutScroll(get_by_dropdown_tab);
    }
    public void clickFindBtn(){clickButtonWithOutScroll(find_btn);
    }
    public boolean isFieldEditBtnDisplayed(){return isElementDisplayed(field_edit_btn);
    }
    public void clickFieldEditBtn(){clickButtonWithOutScroll(field_edit_btn);
    }
    public void getFirstRowFromTable(){isElementTextMatch(table_index1,searchKeyword);
    }


}
