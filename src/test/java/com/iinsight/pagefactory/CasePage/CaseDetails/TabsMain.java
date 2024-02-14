package com.iinsight.pagefactory.CasePage.CaseDetails;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabsMain extends GenericWrappers {

    @FindBy(id = "_tab_level2a_form_b")
    public WebElement client_tab;

    @FindBy(id="_tab_level2b_form_b")
    public WebElement case_tab;

    @FindBy(id="_tab_level2c_form_b")
    public WebElement add_info_tab;

    @FindBy(css = "[id='_tab_level2d_form_b']")
    public WebElement case_notes_tab;

    @FindBy(id="_tab_level2e_form_b")
    public WebElement documentation_tab;

    @FindBy(id="_tab_level2f_form_b")
    public WebElement contacts_tab;

    @FindBy(css="div[id='main_tabs_section'] div:nth-child(7) div:nth-child(2)")
    public WebElement costs_tab;

    @FindBy(id="_tab_level2h_form_b")
    public WebElement accounts_tab;

    @FindBy(id="_tab_level2i_form_b")
    public WebElement plans_programs_tab;

    @FindBy(id="_tab_level2j_form_b")
    public WebElement task_appointments_tab;

    @FindBy(id="_tab_level2k_form_b")
    public WebElement goals_tab;

    @FindBy(id="_tab_level2m_form_b")
    public WebElement settings_tab;



    // D R O P D O W N     V A L U E S     ----->>     COMMON IN ALL TABS

    //Created By
    @FindBy(css="div#drop_down_multiselect div:nth-child(1)")
    public WebElement get_by_dropdown_index1;

    //Description
    @FindBy(css="div#drop_down_multiselect div:nth-child(2)")
    public WebElement get_by_dropdown_index2;

    //Modified By
    @FindBy(css="div#drop_down_multiselect div:nth-child(3)")
    public WebElement get_by_dropdown_index3;

   //Role
    @FindBy(css="div#drop_down_multiselect div:nth-child(4)")
    public WebElement get_by_dropdown_index4;

    //Title
    @FindBy(css="div#drop_down_multiselect div:nth-child(5)")
    public WebElement get_by_dropdown_index5;

}
