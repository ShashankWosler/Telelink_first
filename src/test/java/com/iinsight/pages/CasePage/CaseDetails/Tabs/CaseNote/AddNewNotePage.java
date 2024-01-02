package com.iinsight.pages.CasePage.CaseDetails.Tabs.CaseNote;

import com.iinsight.pagefactory.CasePage.CaseDetails.Tabs.CaseNote.AddNewNote;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AddNewNotePage extends AddNewNote {
    public AddNewNotePage(){PageFactory.initElements(getDriver(), this);
    }
    public int num = getRandomNumber(999);

    public void verifyEmployeeTabIsVisible(){isElementDisplayed(employee_tab);
    }
    public void verifyRoleDropdownIsVisible(){isElementDisplayed(role_dropdown);
    }
    public void clickRoleDropDown(){clickButtonWithOutScroll(role_dropdown);
    }
    public void verifyRoleDropDownValueIsVisible(){isElementDisplayed(role_dropdown_value1);
    }
    public void verifyCreatedDateIsVisible(){isElementDisplayed(created_date);
    }
    public void verifyCreatedTimeIsVisible(){isElementDisplayed(created_time);
    }
    public void verifyTitleIsVisible(){isElementDisplayed(title);
    }
    public void clickTitle(){clickButtonWithOutScroll(title);
    }
    public void enterNewTitle(){
        String enteredTitle = "Test-New Title "+num;
        enterTextWithoutScroll(title,enteredTitle);
        }

    public void enterUpdatedTitle(){
        String enteredTitle = "Test-New Title "+num;
        enterTextWithoutScroll(title,enteredTitle);
    }
    public void verifyCaseNoteTemplate_dropdownIsVisible(){isElementDisplayed(case_note_template_dropdown);
    }
    public void clickCaseNoteTemplate_dropdownIsVisible(){clickButtonWithOutScroll(case_note_template_dropdown);
    }
    public void verifyCaseNoteTemplateDropdownValueIsVisible(){isElementDisplayed(case_note_template_dropdown_value);
    }
    public void verifyClearButtonIsVisible(){isElementDisplayed(clear_btn);
    }
    public void clickClearButton(){clickButtonWithOutScroll(clear_btn);
    }
    public void verifySaveButtonIsVisible(){isElementDisplayed(save_btn);
    }
    public void clickSaveButton(){
        clickButtonWithOutScroll(save_btn);
        waitFor(2000);
    }
    public void verifyCancelButtonIsVisible(){isElementDisplayed(cancel_btn);
    }
    public void clickCancelButton(){clickButtonWithOutScroll(cancel_btn);
    }
}
