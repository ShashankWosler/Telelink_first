package com.iinsight.runner;

import com.iinsight.utils.GenericWrappers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks extends GenericWrappers {

    /***
     * Embed a screenshot in test report if test is marked as failed
     * @param scenario
     * @throws Exception
     */
    @After
    public void afterClass(Scenario scenario) throws Exception {
//        GenericWrappers genericWrappers = new GenericWrappers();
        if(scenario.isFailed()) {
            System.out.println("Scenario Failed...Taking screenshot....");
//            takeSnap(scenario);
            TakesScreenshot tk= (TakesScreenshot) getDriver();
            byte[] b1 = tk.getScreenshotAs(OutputType.BYTES);
            scenario.embed(b1,"Failurescreenshots");
            quitBrowser();
        }
        quitBrowser();
    }
    @AfterClass
    public void tearDown() throws Exception{
        boolean status = false;
        ((JavascriptExecutor)getDriver()).executeScript("lambda-status=" + status);
        quitBrowser();
    }

    @Before
    public void before(){
        new GenericWrappers().invokeApp();
    }
}
