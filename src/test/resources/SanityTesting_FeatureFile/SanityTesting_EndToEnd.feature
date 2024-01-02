@sanityTest
Feature: Validating of the Smoke Test

  Background:
    Given User is on Login Page
    Then User Login with the Valid Credential

  @TC_2

  Scenario Outline: Verify that user can create a new case as a company type and validate that created case
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "<Type of Case>" to add
    And User fill the Cases Type Form of "<Type of Case>"
    And User fill the Employment Details Form of "<Type of Case>"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User fill the Save Form
    Then User Verify the case is created and should be visible in case list "<Type of Case>"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case Created" Text is visible in Case Logs Tab
    Examples:
      |Type of Case|
      |  Company  |
      |  Individual  |


  Scenario Outline: Verify input fields of company and individual case type
   When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "<Type of Case>"
    And User click on search button from search popup
    And User verify the case type id "<Type of Case>"
    And User click on client tab
    Then User verify the mandatory fields of client form of "<Type of Case>"
    Examples:
      |Type of Case|
      |  Company  |
      #| Individual |

    @T_12
      @sn
      Scenario Outline: Verify User is able to create Standard billing from case list "+ Billing" Button without plan and validate the newly Created cost is displayed under Case List>Cost tab.
      When User click on search button from HomePage
      And User Select Newly Created "Case"
      And User click on search button from search popup
      And User Click on +Billing button
      And User Select "<Invoice Type>" from Select your invoice type dropdown
      And User Select "CTP403 : TestAutoActivity" Option from the Billing dropdown
      And User Click on Submit button
      And User select Costs tab
      And Verify that new Created "Cost" is listed in Cost list under Costs Tab
      And User select Case Notes tab
      And User select Case Log tab
      Then Verify that Newly created billing ID of should be visible in Case logs
  Examples:
      |Invoice Type|
      |Standard cost (included in regular batch invoice run)|
      |This single cost requires invoicing immediately      |
      |This cost completes a 'Milestone'                    |

      @TC_16 @sn
        Scenario: Verify user is able to create Invoice with Single Type of Billing
        When User click on search button from HomePage
        And User Select Newly Created "Case"
        And User click on search button from search popup
        And User Select Account Tab
        And User Click on +Invoice Button
        And User DeSelect the Checkbox from invoice filtering option
        And User Enter Description in Invoice Description box
        And User Click on Case Selection Next button
        And User Verify the Cost Selection tab
        And User Click on Costs Selection Next button
        And User Click on Finish Button
        And Verify "Invoice" Id is Created and should be visible in the Case Account table
        And User select Case Notes tab
        And User select Case Log tab
        Then Verify that Case log is generated for the Newly created "Invoice"
        And User Select Account Tab
        Then Click On Payment Button from Accounts Tab
        And Click on "Current Invoice" CheckBox from Payment PopUp
        And Select Payment Method from "Cheque" Dropdown
        And Click on Next Button From Payment PopUp
        And User Edit the Amount From PopUp
        And Click on Finish Button from Payment PopUp
        Then Verify "Payment" Amount is Created and should be visible in the Case Account table
        And User select Case Notes tab
        And User select Case Log tab
        Then Verify that Newly created payment of billing ID of should be visible in Case logs

        @sn
Scenario: Verify User is able to Delete Invoice
  When User click on search button from HomePage
  And User Select Newly Created "Case"
  And User click on search button from search popup
  And User Select Account Tab
  And User click Delete Invoice button
  And User select Case Notes tab
  And User select Case Log tab
  Then Verify that Case log is generated for the "deleted" Invoice


  @TC_17 @sn
  Scenario: Verify user is able to create Invoice with Multiple Type of Billing.
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User Select Account Tab
    And User Click on +Invoice Button
    And User Enter Description in Invoice Description box
    And User Click on Case Selection Next button
    And User Verify the Cost Selection tab
    And User Click on Costs Selection Next button
    And User Click on Finish Button
    And Verify "Invoice" Id is Created and should be visible in the Case Account table
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that Case log is generated for the Newly created "Invoice"
    And User Select Account Tab
    Then Click On Payment Button from Accounts Tab
    And Click on "Current Invoice" CheckBox from Payment PopUp
    And Select Payment Method from "Cheque" Dropdown
    And Click on Next Button From Payment PopUp
    And User Edit the Amount From PopUp
    And Click on Finish Button from Payment PopUp
    Then Verify "Payment" Amount is Created and should be visible in the Case Account table
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that Newly created payment of billing ID of should be visible in Case logs


 @sanity
 @TC_1-29 @TC
 Scenario: User is able to create an admin note on the Admin notes tab
   When User click on search button from HomePage
   And User Select Newly Created "Case"
   And User click on search button from search popup
   And User select Case Notes tab
   And User select Admin Notes tab
   And User click on Admin Add New button
   And User fill all the mandatory fields in Add Note PopUp
   And User click on the Save button
   Then Verify the "AdminNote" should be added on Admin notes tab
   And User select Case Log tab
   Then Verify that Case log is generated for the Newly created "AdminNote"


  @TC_1-653 @TC
  Scenario: Verify that the Details/Edit button functionality on the admin notes tab
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select Admin Notes tab
    And User select any Admin Notes from the admin list
    And User click on the Admin Details button
    And User Edit the information in Title and Description fields
    And User click on the Save button
    Then Verify the "AdminNote" should be added on Admin notes tab
    And User select Case Log tab
    Then Verify that Case log is generated for the Newly created "AdminNote"

   @RunAll
  Scenario: Verify that the Delete button functionality on the admin notes tab (Delete Admin Notes)
    When User select any case from the case list
    And User select Case Notes tab
    And User select Admin Notes tab
    And User click on the Admin Delete button
    And User click on the Ok button from Delete PopUp
    And User select Case Log tab
    Then Verify that Case log is generated for the "deleted" Admin Notes

   @TC_1-28
   Scenario: Verify that the Details/Edit button functionality on the user notes tab
     When User click on search button from HomePage
     And User Select Newly Created "Case"
     And User click on search button from search popup
     And User select Case Notes tab
     And User select User Notes tab
     And User click on the User Notes Details button
     And User Edit the information in Title and Description fields
     And User click on the Save button
     Then Verify the User Note should be added on User notes tab

  @TC_1-820
   Scenario: Verify that newly created User note and Admin note logs are displaying on the Case log tab
      When User click on search button from HomePage
      And User Select Newly Created "Case"
      And User click on search button from search popup
       And User select Case Notes tab
       And User select User Notes tab
       And User click on User Notes Add New button
       And User fill all the mandatory fields in Add Note PopUp
       And User click on the Save button
       And User select Case Log tab
       Then Verify the newly created notes logs should be created on the case logs tab

  Scenario: Verify that the Delete button functionality on the user notes tab (Delete User Note)
    When User select any case from the case list
    And User select Case Notes tab
    And User select User Notes tab
    And User select any User Notes from the list
    And User click on the User Note Delete button
    And User click on the Ok button from Delete PopUp
    And User select Case Log tab
    Then Verify that Case log is generated for the "deleted" Admin Notes

   @TC_1-655
    Scenario: Verify the search feature functionality on the Case Note/ all sub-tabs
     When User click on search button from HomePage
     And User Select Newly Created "Case"
     And User click on search button from search popup
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the by Dropdown on User Notes Tab
    And User Select Title Option from By DropDown
    And User Enter the keyword on the search box according to the filter option selected in the by dropdown
    And User click on the Find button
    Then Verify the Search Result

  @TC_1-657
  Scenario: Disable and Arranging the sequence of Case Notes all sub-tabs column by using field view edit button
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the Field Edit button From User Notes Tab
    And User select the required custom field on the enabled side
    And User Use the arrow key for the order of the position needed
    And User click on the Disable button
    Then User click on the Apply button

  @TC_1-656
  Scenario: Enable and Arranging the sequence of Case Notes all sub-tabs columns by using the field view edit button
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the Field Edit button From User Notes Tab
    And User select the required custom field on the disabled side
    And User click on the Enable button
    And User Use the arrow key for the order of the position needed
    Then User click on the Apply button

  @TC_1-654
  Scenario: Verify the details button on the Case Notes case tab
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select Case Log tab
    And User select any Case log from the list
    And User click on the Case Log Details button
    And User Check and View the Add Note PopUp
    Then User click on the Close button Add Note PopUp

  @TC_1-658
  Scenario: To verify the Report Selection Criteria on the Case Note Tab
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
   # And User select Case Log tab
    And User Go to the Report Selection Criteria, Select Date Range from DropDown
  #  And User Select the date From and To
    And User Sort it by Ascending order
  #  And User Select Note type from the dropdown
  #  And User click on the print-preview button
    And User click on the Export button
    Then Go to the report
    And User download option and download the desired format

  Scenario Outline: Verify that User is able to create Billing using Multiple Plans
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    Then User click on plans programs tab
    And User click on Plans button from plans programs tab
    And User click on Plans New Button
    And User Select the plan "<Plan Type>" and billing "<Billing Type>" to add
    And User enter title from plan new page
    And User Select ActivityItem "<Billing Type>" and Enter Updated Amount
    And User click on plan save button
    And Verify that New created plan will be listed under PlanProgram Tab
    And User select Costs tab
    And User Click on Billing button from Costs tab
    And User Select "Standard cost (included in regular batch invoice run)" from Select your invoice type dropdown
    And User Select "CTP403 : TestAutoActivity" Option from the Billing dropdown
    And User Click on Submit button
    And User select Costs tab
    And Verify that new Created "Cost" is listed in Cost list under Costs Tab
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that Newly created billing ID of should be visible in Case logs
    Examples:
      |Plan Type        |     Billing Type|
#      |Charge Code Based Plan|Monetary Based|
#      |Charge Code Based Plan|Time Based    |
#      |Service Based Plan    |Monetary Based|
#      |Service Based Plan    |Time Based    |
      |Total Sum Plan        |Monetary Based|
      |Total Sum Plan        |Time Based    |

    @task
  Scenario: Verify User can Create a New Task
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User click on Task Appointments tab
    And User click on New Task button
    And Enter all the mandatory fields
    And User Click on Save button

  Scenario: Verify User can Create a New Appointments
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User click on Task Appointments tab
    And User click on New Appointment button
    And Enter all the mandatory fields for creating appointment
    And User Click on Save Appointment button
    And User select Case Notes tab
    And User select Case Log tab
    #Then Verify Newly Created Appointment should be visible in case logs
    And User Click on Menu Icon
    And User Click on Appointment Option
    And User Select the Employee


  @TestMethod
  Scenario Outline: Verify User is able to Refund & Adjust Invoice on New Created Case
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "Individual" to add
    And User fill the Cases Type Form of "Individual"
    And User fill the Employment Details Form of "Individual"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User fill the Save Form
    Then User Verify the Zero case is created and should be visible in case list
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case Created" Text is visible in Case Logs Tab
    And User Select Account Tab
    And User verify case account form with zero values
    And User Click on +Billing button
    And User Verify the billable time rate form with zero values
    And User Select "This single cost requires invoicing immediately" from Select your invoice type dropdown
    And User Select "CTP403 : TestAutoActivity" Option from the Billing dropdown
    And User Verify The Updated Price "<VATValue>" VAT
    And User Click on Submit button
    And User select Costs tab
    And Verify that new Created "Cost" with "<VATValue>" is listed in Zero Cost list under Costs Tab
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that New created billing ID of should be visible in Case logs
    And User Select Account Tab
    And User Click on +Invoice Button
    And User Enter Description in Invoice Description box
    And User Click on Case Selection Next button
    And User Verify the Cost Selection tab
    And User Click on Costs Selection Next button
    And User Click on Finish Button From Invoice Popup "<VATValue>" VAT
    And Verify Id is Created and should be visible in the Case Account table and Verify Amount "<VATValue>" VAT
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that Case log is generated for the New created Invoice
    And User Select Account Tab
    Then Click On Payment Button from Accounts Tab
    And Click on "Current Invoice" CheckBox from Payment PopUp
    And Select Payment Method from "Cheque" Dropdown
    And Verify fields of Payment Detail page from Payment PopUp
    And Click on Next Button From Payment PopUp
    And Verify fields of Payment Breakdown page from Payment PopUp
    And Verify Generated Amount in Edit Amount PopUp
    And Click on Finish Button from Payment PopUp
    Then Verify New "Payment" Amount is Created and should be visible in the Case Account table "<VATValue>" VAT
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that New created payment of billing ID of should be visible in Case logs
    And User Select Account Tab
    And User click on Adjust Button from Accounts Tab
    And User Verify Amounts Fields From Adjust popup "<VATValue>" VAT
    And User Select Activity from Adjust popup

    Examples:
      |VATValue|
      |With    |
      |Without |






