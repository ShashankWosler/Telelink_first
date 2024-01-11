package com.iinsight.TestData;

import java.util.ArrayList;
public class CaseTypeTestData {
    public static String CompanyName = "QA Test";
    public static String Title = "Mr";
    public static String FirstName = "Automation";
    public static String LastName = "Test";
    public static String Email = "qatest1234@gmail.com";
    public static String Phone = "9876543210";
    public static String Bill_To_CompanyName = "Person Bill QA";
    public static String Bill_To_FirstName = "Mr. Raju";
    public static String Bill_To_LastName = "Kumar";
    public static String Description = "Invoice Description";
    public static String CaseStatus = "Active";
    public static String UpdatedPrice = "2.00";
    public static String Duration = "02:00";        //Used For Both - [Verify, E2E]
    public static String Rate = "R 1 000,00";       //Used For Both - [Verify, E2E]
    public static String TaskTitle = "Test Automation Task Title";


    // A D J U S T M E N T S        P O P - U P
    public static String Appointment_Title = "Test Appointment Automation";
    public static String Reason = "Test Automation Reason";
    public static double VatRate = 0.10;        //Used For Both - [Verify : Billing, Adjust]
    public static int ZeroDuration = 2;        //Used For - Verify
    public static int ZeroRate = 1000;        //Used For Both -[Verify : Billing, Adjust]


    public static int PaymentUpdatedAmountI = 100;        //Used For - Verify [Payments : VAT , NON-VAT]
    public static int AdjustAmountI = 500;        //Used For - Verify [Adjust Amount]


    // B I L L I N G - W I T H  [ V A T     ,     N O N - V A T]
    public static int SubTotalI = CaseTypeTestData.ZeroDuration * CaseTypeTestData.ZeroRate;
    public static int VATI = (int) (SubTotalI * CaseTypeTestData.VatRate);
    public static int TotalI = SubTotalI + VATI;
    public static int VATRemainingAmountI = TotalI - PaymentUpdatedAmountI;
    public static int NOVATRemainingAmountI = SubTotalI - PaymentUpdatedAmountI;


    // Integer to String of Amount Variables
    public static String SubTotal = String.valueOf(SubTotalI);
    public static String VAT = String.valueOf(VATI);
    public static String Total = String.valueOf(TotalI);
    public static String PaymentUpdatedAmount = String.valueOf(PaymentUpdatedAmountI);
    public static String VATRemainingAmount = String.valueOf(VATRemainingAmountI);
    public static String NOVATRemainingAmount = String.valueOf(NOVATRemainingAmountI);
    public static String AdjustAmount = String.valueOf(AdjustAmountI);


    // A D J U S T - W I T H  [ V A T     ,     N O N - V A T]
    public static int AdjustNewDurationI = 1;        //Used For - Adjust
    public static int AdjustSubTotalI = CaseTypeTestData.AdjustNewDurationI * CaseTypeTestData.ZeroRate;
    public static int AdjustVATI = (int) (AdjustSubTotalI * CaseTypeTestData.VatRate);
    public static int AdjustTotalI = AdjustSubTotalI + AdjustVATI;
    public static int NOVATAdjustOwningAmountI = AdjustSubTotalI - PaymentUpdatedAmountI;
    public static int VATAdjustOwningAmountI = AdjustTotalI - PaymentUpdatedAmountI;


    // Integer to String of Amount Variables - A D J U S T
    public static String AdjustNewDuration = String.valueOf(AdjustNewDurationI);
    public static String AdjustSubTotal = String.valueOf(AdjustSubTotalI);
    public static String AdjustVAT = String.valueOf(AdjustVATI);
    public static String AdjustTotal = String.valueOf(AdjustTotalI);
    public static String VATAdjustOwningAmount = String.valueOf(VATAdjustOwningAmountI);
    public static String NOVATAdjustOwningAmount = String.valueOf(NOVATAdjustOwningAmountI);

    // V E R I F Y      A M O U N T S       I D ' S
    public static String CaseNumber;
    public static String BillingNumber;
    public static String InvoiceNumber;
    public static String AdjustId;


    // A P P O I N T M E N T S      V E R I F Y      F R O M      S I D E      M E N U
    /**
     * CREATE APPOINTMENT [MULTIPLE, SINGLE]
     */
    public static String FromTime = "09:15 am";
    public static String EndTime = "09:30 am";
    public static String FromTimeOneDigitHour = "9:15 AM";
    public static String EndTimeOneDigitHour = "9:30 AM";

    public static String AllDayEventFromTime = "12:00 am";
    public static String AllDayEventEndTime = "11:59 pm";
    public static String AllDayEventBothOneDigitHour = "12 AM";

    // UPDATE APPOINTMENT
    public static String UpdateFromTime ="09:45 am";
    public static String UpdateEndTime="10:00 am";
    public static String UpdateFromTimeOneDigitHour="9:45 AM";
    public static String UpdateEndTimeOneDigitHour="10 AM";

    // CLIENT NAME - Get Overlap Client Name = CASE ID
    public static String ClientName;
    public static String OverlapAppointmentUsername = "Web Automation";

    // S H O W      A P P O I N T M E N T      S E R V I C E S
    public static ArrayList<String> DatesList = new ArrayList<String>();
    public static ArrayList<String> DaysList = new ArrayList<String>();
    public static ArrayList<Integer> CheckBoxesList = new ArrayList<Integer>();



}