package com.iinsight.pages.CasePage.CaseDetails;

import com.iinsight.pagefactory.CasePage.CaseDetails.TabsMain;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;


public class TabsMainPage extends TabsMain {
    public TabsMainPage(){PageFactory.initElements(getDriver(), this);
    }
    public boolean isClientTabIsVisible(){return isElementDisplayed(client_tab);}
    public void clickClientsTab(){clickButtonWithOutScroll(client_tab);
    }
    public void clickCaseTab(){clickButtonWithOutScroll(case_tab);
    }
    public void clickAddInfoTab(){clickButtonWithOutScroll(add_info_tab);
    }
    public boolean isCaseNoteTabIsVisible(){
        waitVisibilityOfElement(case_notes_tab);
        return isElementDisplayed(case_notes_tab);}

    public void clickCaseNotesTab(){
        waitElementToBeClickable(case_notes_tab);
        clickButtonWithOutScroll(case_notes_tab);
    }
    public void clickDocumentationTab(){clickButtonWithOutScroll(documentation_tab);
    }

    public void clickContactsTab(){clickButtonWithOutScroll(contacts_tab);
    }
    public boolean isClickCostsTabVisible(){
        waitElementToBeClickable(costs_tab);
        return isElementDisplayed(costs_tab);
    }
    public void clickCostsTab(){
            clickButtonWithOutScroll(costs_tab);
    }
    public void clickAccountsTab(){clickButtonWithOutScroll(accounts_tab);
    }
    public boolean isPlansProgramsTabIsVisible(){return isElementDisplayed(plans_programs_tab);}

    public void clickPlansProgramsTab(){clickButtonWithOutScroll(plans_programs_tab);
    }

    public boolean isTaskAppointmentsTabVisible(){
        waitVisibilityOfElement(task_appointments_tab);
        return isElementDisplayed(task_appointments_tab);
    }
    public void clickTaskAppointmentsTab(){clickButtonWithOutScroll(task_appointments_tab);
    }

    public boolean isGoalsTabVisible(){
        waitVisibilityOfElement(goals_tab);
        return isElementDisplayed(goals_tab);
    }
    public void clickGoalsTab(){clickButtonWithOutScroll(goals_tab);
    }

    public boolean isSettingsTabVisible(){
        waitVisibilityOfElement(settings_tab);
        return isElementDisplayed(settings_tab);
    }
    public void clickSettingTab(){clickButtonWithOutScroll(settings_tab);
    }

    // D R O P D O W N     V A L U E S     ----->>     COMMON IN ALL TABS
    public void SelectFirstValueFromByDropDown(){clickButtonWithOutScroll(get_by_dropdown_index1);
    }
    public void SelectSecondValueFromByDropDown(){clickButtonWithOutScroll(get_by_dropdown_index2);
    }
    public void SelectThirdValueFromByDropDown(){clickButtonWithOutScroll(get_by_dropdown_index3);
    }
    public void SelectFourthValueFromByDropDown(){clickButtonWithOutScroll(get_by_dropdown_index4);
    }
    public boolean isFiveValueFromByDropDownDisplayed(){return isElementDisplayed(get_by_dropdown_index5);
    }
    public void SelectFiveValueFromByDropDown(){clickButtonWithOutScroll(get_by_dropdown_index5);
    }

}
