package com.iinsight.pagefactory.Toolbox.Side.ManageUsers;

import com.iinsight.utils.GenericWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserDetails extends GenericWrappers {
    @FindBy(xpath="//div[@class='level2_form_top_block 1']//button[1]")
    public WebElement passwordButton;
    @FindBy(xpath="//div[@class='level2_form_top_block 1']//button[2]")
    public WebElement signatureButton;
    @FindBy(xpath="//div[@class='level2_form_top_block 1']//button[3]")
    public WebElement emailNotificationButton;
    @FindBy(css="[id='users.job_title']")
    public WebElement jobTitleInput;        //getAttribute - "value"
    @FindBy(css="[id='users.qualifications']")
    public WebElement qualificationInput;   //getText
    @FindBy(css="[id='users.provider_number']")
    public WebElement providerNumberInput;      //getAttribute - "value"
    @FindBy(css="[id='users.consultant_id']")
    public WebElement consultantInput;      //getAttribute - "value"
    @FindBy(css="[id='users.email']")
    public WebElement emailInput;      //getAttribute - "value"
    @FindBy(css="[id='users.second_email']")
    public WebElement secondEmailInput;      //getAttribute - "value"
    @FindBy(css="[id='users.first_name']")
    public WebElement firstNameInput;      //getAttribute - "value"
    @FindBy(css="[id='users.title']")
    public WebElement titleInput;         //getAttribute - "value"
    @FindBy(css="[name='users.title_button']")
    public WebElement titleDropDown;
    @FindBy(css="[id='users.last_name']")
    public WebElement lastNameInput;    //getAttribute - "value" - Use "value" For Other Locators
    @FindBy(css="[id='user_consultant_rate']")
    public WebElement hourlyRate;       //Disabled - Input  Tab - R100,00
    @FindBy(css="[id='user_consultant_rate_apply_gst']")
    public WebElement applyVAT;        // Disabled - Input = "Yes"
    @FindBy(css="[id='user_super_rate']")
    public WebElement superRate;         //Disabled - Input = 0
    @FindBy(css="[id='user_profiles']")
    public WebElement userProfileInput;
    @FindBy(css="[name='user_profiles_button']")
    public WebElement userProfileDropDown;
    @FindBy(id="employee_type")
    public WebElement userTypeInput;
    @FindBy(css="[name='employee_type_button']")
    public WebElement userTypeDropDown;
    @FindBy(css="[id='users.phone']")
    public WebElement phoneInput;
    @FindBy(css="[id='users.mobile']")
    public WebElement mobileInput;
    @FindBy(css="div#teams1_list div")
    public WebElement selectedTeam;     // getText
    @FindBy(id="teamslist")
    public WebElement selectTeamInput;
    @FindBy(css="[name='teamslist_button']")
    public WebElement selectTeamDropDown;
    @FindBy(xpath="(//button[text()='Sort'])[1]")
    public WebElement selectTeamSortButton;
    @FindBy(xpath="(//button[text()='Remove'])[1]")
    public WebElement selectTeamRemoveButton;
    @FindBy(css="img[name='user_profiles_button']")
    public WebElement userProfileDropdown;
    @FindBy(css="img[name='employee_type_button']")
    public WebElement userTypeDropdown;
    @FindBy(css="img[name='users.title_button']")
    public WebElement titleDropdown;
    @FindBy(css="img[name='teamslist_button']")
    public WebElement selectTeamDropdown;
    @FindBy(xpath="//div[@id='admin_container_person3']//img")
    public List<WebElement> availabilityLocationCheckBoxes;
    @FindBy(xpath="//div[@id='admin_container_person1']/div[11]//img")
    public List<WebElement> accessStateCheckBoxes;
    @FindBy(css="[id='users.not_availability_date_from']")
    public WebElement fromDateInput;        //02-10-2019
    @FindBy(css="[id='not_availability_time_from']")
    public WebElement fromTimeInput;    //5:23 pm
    @FindBy(css="[id='users.not_availability_date_to']")
    public WebElement toDateInput;
    @FindBy(css="[id='not_availability_time_to']")
    public WebElement toTimeInput;
    @FindBy(css="[id='users.locale']")
    public WebElement localeInput;
    @FindBy(css="[name='user_locale_button']")
    public WebElement localeDropdown;
    @FindBy(css="[id='users.user_location']")
    public WebElement userLocationInput;
    @FindBy(css="[class='btn btn-form google_maps_button']")
    public WebElement userLocationButton;

    /** P O P    U P     -   C L I E N T     L O C A T I O N*/
    @FindBy(css="[aria-label='Incident Location']")
    public WebElement current_location;
    @FindBy(id="location_save_button")
    public WebElement save_btn;
    @FindBy(id="case_reopen_2")
    public WebElement client_loc_cancel_btn;

    @FindBy(id="time_zone")
    public WebElement timeZoneInput;
    @FindBy(css="[name='time_zone_button']")
    public WebElement timeZoneDropDown;

    //  W O R K     T I M E
    @FindBy(xpath="(//img[@name='time_custom'])[1]")
    public WebElement customWorkTimeCheckBox;
    @FindBy(css="[name='time_office']")
    public WebElement bussDevWorkTimeCheckBox;
    @FindBy(css="[name='time_all']")
    public WebElement allWorkTimeCheckBox;
    @FindBy(xpath="//input[contains(@id,'users.time')]")
    public List<WebElement> timeInputsWorkTime;     //14 Elements - From Time, To Time

    // C O N S U L T A N T      A V A I L A B I L I T Y
    @FindBy(xpath="(//img[@name='time_custom'])[2]")
    public WebElement customConsultCheckBox;
    @FindBy(css="[name='appt_time_office']")
    public WebElement bussDevConsultCheckBox;
    @FindBy(css="[name='appt_time_all']")
    public WebElement allConsultCheckBox;
    @FindBy(xpath="//input[contains(@id,'users.appt_time')]")
    public List<WebElement> timeInputsConsultant;     //14 Elements - From Time, To Time

}
