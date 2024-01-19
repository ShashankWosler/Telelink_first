@sanityTest
Feature: Validating of the Smoke Test

  Background:
    Given User is on Login Page
    Then User Login with the Valid Credential

  @TC_2 @RunLambdaOnly @Always
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
      |  Individual  |

  @Always
  Scenario: Verify that user can create a new case as a company and individual type and validate case is created
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "Company" to add
    And User fill the Cases Type Form of "Company"
    And User fill the Employment Details Form of "Company"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User fill the Save Form
    Then User Verify the case is created and should be visible in case list "Company"

  @RunLambdaOnly @Always
  Scenario Outline: Verify input fields of company and individual case type
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "<Type of Case>"
    And User click on search button from search popup
    And User verify the case type id "<Type of Case>"
    And User click on client tab
    Then User verify the mandatory fields of client tab of "<Type of Case>"
    And User click on case tab
    Then User verify the mandatory fields of case details form
    Examples:
      |Type of Case|
      |  Company  |
      |  Individual  |

    @T_12 @RunLambdaOnly
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

      @TC_16 @RunLambdaOnly
        Scenario: Verify user is able to create Payment with Single Type of Invoice
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
        Then Verify that Case log is generated for the Newly created Invoice
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

  @TC_16 @RunLambdaOnly
  Scenario: Verify user is able to create Payment with Multiple Type of Invoice
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
    Then Verify that Case log is generated for the Newly created Invoice
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

 @TC_1-29 @Always @RunLambdaOnly
 Scenario: User is able to create an admin note on the Admin notes tab
   When User click on search button from HomePage
   And User Select Newly Created "Case"
   And User click on search button from search popup
   And User select Case Notes tab
   And User select Admin Notes tab
   And User click on Admin Add New button
   And User fill all the mandatory fields in Add Note PopUp
   And User click on the Save button
   Then Verify the Admin Note should be added on Admin notes tab

  @TC_1-653 @RunLambdaOnly
  Scenario: Verify that the Details button functionality on the admin notes tab (Edit Admin Notes)
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select Admin Notes tab
    And User select any Admin Notes from the admin list
    And User click on the Admin Details button
    And User Edit the information in Title and Description fields
    And User click on the Save button

  @TC_1-653 @RunLambdaOnly
  Scenario: Verify that the Delete button functionality on the admin notes tab (Delete Admin Notes)
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select Admin Notes tab
    And User select any Admin Notes from the admin list
    And User click on the Admin Delete button
    And User click on the Ok button from Delete PopUp
    Then Verify Admin Note is Deleted

   @TC_1-28 @Always
   Scenario: Verify that the New button functionality on the user notes tab
     When User click on search button from HomePage
     And User Select Newly Created "Case"
     And User click on search button from search popup
     And User select Case Notes tab
     And User select User Notes tab
     And User click on User Notes Add New button
     And User Edit the information in Title and Description fields
     And User click on the Save button
     Then Verify the User Note should be added on User notes tab

  @TC_1-820 @RunLambdaOnly
  Scenario: Verify that newly created User note and Admin note logs are displaying on the Case log tab
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select User Notes tab
    And User click on User Notes Add New button
    And User fill all the mandatory fields in Add Note PopUp
    And User click on the Save button
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify the newly created notes logs should be created on the case logs tab

  @Always
  Scenario: Verify that the Details button functionality on the user notes tab (Edit User Note)
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select User Notes tab
    And User click on the User Notes Details button
    And User Edit the information in Title and Description fields
    And User click on the Save button
    Then Verify the User Note should be added on User notes tab

  @Always
  Scenario: Verify that the Delete button functionality on the user notes tab (Delete User Note)
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select User Notes tab
    And User select any User Notes from the list
    And User click on the User Note Delete button
    And User click on the Ok button from Delete PopUp
    Then Verify User Note is Deleted


   @TC_1-655 @Always
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

  @TC_1-654 @RunLambdaOnly
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

  @TC_1-658 @RunLambdaOnly
  Scenario: To verify the Report Selection Criteria on the Case Note Tab
    When User click on search button from HomePage
    And User Select Newly Created "Case"
    And User click on search button from search popup
    And User select Case Notes tab
    And User select Case Log tab
    And User Go to the Report Selection Criteria Select "Last week" from DropDown
    And User Sort it by "Ascending" order
    And User Select "All notes" from the Note Types
    And User click on the Export button
    Then Go to the report
    And User Download The Selected "Pdf" Format Report

  @RunLambdaOnly
    Scenario Outline: Verify that User is able to create Payment using Multiple Plans
      When User click on search button from HomePage
      And User Select Newly Created "Case"
      And User click on search button from search popup
      Then User click on plans programs tab
      And User click on Plans button from plans programs tab
      And User click on Plans New Button
      And User Select the plan "<Plan Type>" and billing "<Billing Type>" to add
      And User enter title from plan new page and Get Id of "<Plan Type>" "<Billing Type>"
      And User Select ActivityItem "<Plan Type>" and "<Billing Type>" and Enter Updated Amount
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
      And User Select Account Tab
      And User Click on +Invoice Button
      And User Enter Description in Invoice Description box
      And User Click on Case Selection Next button
      And User Verify the Cost Selection tab
      And User Click on Costs Selection Next button
      And User Click on Finish Button
      And Verify "<Plan Type>" "<Billing Type>" Id is Created and should be visible in the Case Account table
      And User select Case Notes tab
      And User select Case Log tab
      Then Verify that Case log is generated for the Newly created Invoice "<Plan Type>" "<Billing Type>"
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
      Then Verify that Newly created payment of billing ID "<Plan Type>" "<Billing Type>" of should be visible in Case logs

      Examples:
      |Plan Type|Billing Type|
      |Charge Code Based Plan|Monetary Based|
      |Charge Code Based Plan|Time Based    |
      |Service Based Plan    |Monetary Based|
      |Service Based Plan    |Time Based    |
      |Total Sum Plan        |Monetary Based|
      |Total Sum Plan        |Time Based    |

  @RunLambdaOnly
  Scenario Outline: Verify User is able to Refund and Adjust Invoice with/ without VAT for New Created Case and verifies all Amounts and IDs
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
    And Verify fields of Payment Breakdown page from Payment PopUp "<VATValue>" VAT
    And Verify Generated Amount in Edit Amount PopUp "<VATValue>" VAT
    And Click on Finish Button from Payment PopUp
    Then Verify New "Payment" Amount is Created and should be visible in the Case Account table "<VATValue>" VAT
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that New created payment of billing ID of should be visible in Case logs
    And User Select Account Tab
    And User click on Adjust Button from Accounts Tab
    And User Verify Amounts Fields From Adjust popup "<VATValue>" VAT
    And User Select Activity from Adjust popup
    And User Verify Adjust Id from Accounts Tab "<VATValue>" VAT
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "New adjustment" contains in Case Logs Tab
    And User Select Account Tab
    And User click on Refund Button from Accounts Tab
    And User Verify CaseId InvoiceId Amount from Refund PopUp
    And User Verify Refund Id from Accounts Tab "<VATValue>" VAT
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "New refund" contains in Case Logs Tab
    Examples:
    |VATValue|
    |With    |
    |Without |

  @RunLambdaOnly
  Scenario Outline: Verify user is able to create New Task From Accounts Tab
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Company"
    And User click on search button from search popup
    And User verify the case type id "Company"
    And User Select Tasks Appointments Tab
    And User click on "New Task" Button
    And User Enter Mandatory Details in New Task PopUp with "<Status>" "<Priority>"
    Then User Verify Task Added in Appointment List "<Status>"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "created" contains in Case Logs Tab
    And User Select Tasks Appointments Tab
    And User Select Created Task "<Status>"
    And User click on "Delete" Button
    And User Verify Task Deleted in Appointment List "<Status>"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Delete Task" contains in Case Logs Tab
    Examples:
    |Status|Priority|
    |Planned      |low     |
    |Working On   |medium  |
    |On Hold      |high    |
    |Completed    |low     |

  @VerifyTest
  Scenario: Verify User is able to create Billing from appointment and Deletion of Appointment
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "Individual" to add
    And User fill the Cases Type Form of "Individual"
    And User fill the Employment Details Form of "Individual"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User Click on Add Appointment Button from Add Case Save Form
    And User Enter all the mandatory fields for creating "Non Recurrence" appointment
    And User Click on Add Billing Button from Appointment Entry PopUp
    And User Select "Standard cost (included in regular batch invoice run)" from Select your invoice type dropdown
    And User Verify Selected Billing DropDown
    And User Verify The Updated Price "With" VAT
    And User Click on Submit button
    And User select Costs tab
    And Verify that new Created "New cost" is listed in Cost list under Costs Tab
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "New cost"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "New cost" billing ID of should be visible in Case logs
    And User Click on Menu Icon
    And User Click on Appointment Option
    And User Select Filter Option From Appointment Page
    And User Verify Created Appointment is Shown "Common"
    And User Select Event Option "Delete"
    And User Click on Menu Icon
    And User Click on Case List Option
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "No Value"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "deleted" text should be visible in Case logs

  @RunLambdaOnly @VerifyTest
  Scenario: Verify User is able to create Overlap Appointments, Edit Appointment and Delete Appointments
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "Individual" to add
    And User fill the Cases Type Form of "Individual"
    And User fill the Employment Details Form of "Individual"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User Click on Add Appointment Button from Add Case Save Form
    And User Enter all the mandatory fields for creating "Non Recurrence" appointment
    And User Click on Save Button from Appointment Entry PopUp
    And User Verify the Appointment case is created and should be visible in case list
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "New cost Without Billing"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "created" text should be visible in Case logs
    And User Click on Menu Icon
    And User Click on Appointment Option
    And User Select Filter Option From Appointment Page
    And User Verify Created Appointment is Shown "Common"
    And User Click on +New Button from Appointment Page
    And User Select "Allow Overlap" Checkbox From +New Appointment Page
    And User Enter all the mandatory fields for creating multiple appointment
    And User Click on Save Button from Appointment Entry PopUp
    And User Select Filter Option For Multiple Appointment
    And User Verify Multiple Created Appointment is Shown
    And User Select Event Option Multiple "Edit"
    And User Update Time of Existing Appointment
    And User Verify Client Name of Appointment From Edit Appointment Popup
    And User Click on Save Button from Edit Appointment Entry PopUp
    And User Verify Created Appointment is Shown "Edit"
    And User Click on Menu Icon
    And User Click on Case List Option
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Appointment Overlap"
    And User click on search button from search popup
    And User verify the case type id "Appointment Overlap"
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "Multiple"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "edited" text should be visible in Case logs
    And User Click on Menu Icon
    And User Click on Appointment Option
    And User Select Event Option Multiple "Delete"
    And User Click on Menu Icon
    And User Click on Case List Option
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "No Value"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "deleted" text should be visible in Case logs
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Appointment"
    And User click on search button from search popup
    And User verify the case type id "Appointment"
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "No Value"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "deleted" text should be visible in Case logs

  @RunLambdaOnly @VerifyTest
  Scenario Outline:Verify User is able to create Recurrence Appointments
    When User click on +case button
    And User click on Business Division dropdown get "NAT" value from dropdown
    And User click on Service Contract dropdown get "NAT-Clone@CTP" value from dropdown
    And User select case type "Individual" to add
    And User fill the Cases Type Form of "Individual"
    And User fill the Employment Details Form of "Individual"
    And User fill the Referral Details Form
    And User fill the Bill To Company Form
    And User Click on Add Appointment Button from Add Case Save Form
    And User Enter all the mandatory fields for creating "Recurrence" appointment
    And User Select "Recurrence" Checkbox From +New Appointment Page
    And User Enter enter fields of "<Recurrence Type>" appointment
    And User Click on Save Button from Appointment Entry PopUp
    And User Verify the Appointment case is created and should be visible in case list
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "Recurrence"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "created" Recurrence appointment of should be visible in Case logs
    And User Click on Menu Icon
    And User Click on Appointment Option
    And User Select Filter Option From Appointment Page
    And User Verify Created Recurrence Appointment is Shown
    And User Select Event Option "Recurrence Delete"
    And User Click on Menu Icon
    And User Click on Case List Option
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "No Value"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "deleted" Recurrence appointment of should be visible in Case logs
    Examples:
      |Recurrence Type|
      |Day            |
      |Weekly         |

  @RunLambdaOnly
  Scenario: Verify User is able to create All Day Event From Appointment
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Appointment"
    And User click on search button from search popup
    And User verify the case type id "Appointment"
    And User Select Tasks Appointments Tab
    And User click on "New Appointment" Button
    And User Enter all the mandatory fields for creating "All Day Event" appointment
    And User Select "All Day Event" Checkbox From +New Appointment Page
    And User Click on Save Button from Appointment Entry PopUp
    Then User Verify Task Added in Appointment List "All Day Event"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "created" text should be visible in Case logs
    And User Click on Menu Icon
    And User Click on Appointment Option
    And User Select Filter Option From Appointment Page
    And User Verify Created Appointment is Shown "All Day event"
    And User Select Event Option "Verify Delete Multiple"
    And User Click on Menu Icon
    And User Click on Case List Option
    And User Select Tasks Appointments Tab
    Then User Verify Task Added in Appointment List "No Value"
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "deleted" text should be visible in Case logs

  @Always @RunOnce
  Scenario Outline: Verify the user is able to create billing with employee rate from Timesheet Page
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Company"
    And User click on search button from search popup
    And User select Costs tab
    And User Click on Edit button from Costs tab
    And User Added Employee Expense "<VATValue>" VAT From Billing PopUp
    And User Click on Submit button
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "modified" text should be visible in Case logs
    When User Click on Menu Icon
    And User Click on Timesheet Option
    And User Verify the Billing and Employee Amounts
    And User Verify Fields From Activity Detail "<VATValue>" VAT
    Examples:
      |VATValue|
      |With    |
      |Without |

  @Always
  Scenario: Verify that the user is able to delete case by click on Delete Case in dropdown menu button
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Individual"
    And User click on search button from search popup
    And User verify the case type id "Individual"
    And User click on ellipses and Select Delete Case
    And User click on Proceed Anyway From Delete PopUp
    And Verify case is deleted from listing page

  @Always
  Scenario:Verify that the user is not able to archive open case by click on "Archive case" in dropdown menu button
    When User click on search button from HomePage
    And User select "Case" from search criteria dropdown
    And User enter case type id "Individual"
    And User click on search button from search popup
    And User verify the case type id "Individual"
    And User click on ellipses and Select Archive Case
    And User click on Proceed Anyway From Archive PopUp
    And User select Case Notes tab
    And User select Case Log tab
    Then Verify that "Case archived" Text is visible in Case Logs Tab

