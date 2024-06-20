package com.iinsight.TestData;

import java.util.Random;

public class TestData {
    public static String kioskeName = "QA Test";
    public static String yourName = "Mr";
    public static String phoneNo = "44232323";
    public static String healthCardNo = "42424";
    
    public static String accountname="Account";
    public static String companyname="company";
  

    public static String InvalidLoginMessage = "You are not authorized to view this page";

    
    public static String randomNumberforAccount()
    {
    	
    	Random random = new Random();    
    	// Generates random integers 0 to 999  
    	int y = random.nextInt(1000);
    	String str = String.valueOf(y);
    	String z = accountname+str;
		return z; 
    }
    public static String randomNumberforCompany()
    {
    	
    	Random random = new Random();    
    	// Generates random integers 0 to 999  
    	int a = random.nextInt(1000);
    	String str = String.valueOf(a);
    	String b = companyname+str;
		return b; 
    }
}