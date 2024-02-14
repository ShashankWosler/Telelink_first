package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HR extends GenericWrappers {
    @FindBy(id="_tab_level2h_form_b")
    public WebElement hrTab;
    //Role Tab
    @FindBy(id="user_hr_tab_roles")
    public WebElement roleTab;
    @FindBy(id="hr_tab_list_new")
    public WebElement roleNewBtn;
    @FindBy(id="hr_tab_list_delete")
    public WebElement roleDeleteBtn;
    @FindBy(id="hr_tab_list_edit")
    public WebElement roleEditBtn;
    @FindBy(css="img[name='hr.roles_button']")
    public WebElement selectRoleDropdown;
    @FindBy(css="img[name='user_button']")
    public WebElement managerNameDropdown;
    @FindBy(css="img[name='effective_date']")
    public WebElement effectiveDateDropdown;
    @FindBy(id="hr_roles_new_3")
    public WebElement addBtn;
    @FindBy(id="hr_roles_new_4")
    public WebElement cancelBtn;
    @FindBy(id="hr_user_roles_delete_1")
    public WebElement deleteOKBtn;



    //Clearance Tab
    @FindBy(id="user_hr_tab_clearances")
    public WebElement clearanceTab;
    @FindBy(id="hr_clearances_new")
    public WebElement clearanceNewBtn;
    @FindBy(id="hr_clearances_delete")
    public WebElement clearanceDeleteBtn;
    @FindBy(id="hr_clearances_edit")
    public WebElement clearanceEditBtn;
    @FindBy(css="img[name='hr_user_clearances_button']")
    public WebElement clearanceDropdown;
    @FindBy(id="hr_submit_clearance_list")
    public WebElement addClearanceBtn;
    @FindBy(id="hr_documents_edit_2")
    public WebElement closeClearanceBtn;

    //Competencies Tab
    @FindBy(id="user_hr_tab_competencies")
    public WebElement competenciesTab;


    //Training Tab
    @FindBy(id="user_hr_tab_training")
    public WebElement trainingTab;
    @FindBy(id="hr_trainings_new")
    public WebElement trainingNewBtn;
    @FindBy(id="hr_trainings_delete")
    public WebElement trainingDeleteBtn;
    @FindBy(id="hr_trainings_edit")
    public WebElement trainingEditBtn;

    //Registrations Tab
    @FindBy(id="user_hr_tab_registrations")
    public WebElement registrationsTab;
    @FindBy(id="hr_registrations_new")
    public WebElement registrationsNewBtn;
    @FindBy(id="hr_registrations_delete")
    public WebElement registrationsDeleteBtn;
    @FindBy(id="hr_registrations_edit")
    public WebElement registrationsEditBtn;

    //Equipment Tab
    @FindBy(id="user_hr_tab_equipments")
    public WebElement equipmentTab;
    @FindBy(id="hr_equipments_new")
    public WebElement equipmentsNewBtn;
    @FindBy(id="hr_equipments_delete")
    public WebElement equipmentsDeleteBtn;
    @FindBy(id="hr_equipments_edit")
    public WebElement equipmentsEditBtn;
    @FindBy(id="hr_equipments_transfer")
    public WebElement equipmentsTransferBtn;

    //Specialist Areas
    @FindBy(id="user_hr_tab_specialist_areas")
    public WebElement specialistAreaTab;

    //Referral Notes Tab
    @FindBy(id="user_hr_tab_referral_notes")
    public WebElement referralNotesTab;

    //Performance Tab
    @FindBy(id="user_hr_tab_performance")
    public WebElement performanceTab;
    @FindBy(id="hr_performance_new")
    public WebElement performanceNewBtn;
    @FindBy(id="hr_performance_delete")
    public WebElement performanceDeleteBtn;
    @FindBy(id="hr_performance_edit")
    public WebElement performanceEditBtn;


}
