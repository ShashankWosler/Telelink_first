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

    //@After
    public void close_the_browser(Scenario scenario) {
        getDriver().executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
        System.out.println(getDriver().getSessionId());
        quitBrowser();
    }
    @After
    public void afterClass(Scenario scenario) throws Exception {
//        GenericWrappers genericWrappers = new GenericWrappers();
        if(scenario.isFailed()) {
            System.out.println("Scenario Failed...Taking screenshot....");
//            takeSnap(scenario);
            TakesScreenshot tk= (TakesScreenshot) getDriver();
            byte[] b1 = tk.getScreenshotAs(OutputType.BYTES);
            scenario.attach(b1, "image/png", "Screenshot on Failure");
            //quitBrowser();
        }
//        getDriver().executeScript("lambda-status=" + (scenario.isFailed() ? "failed" : "passed"));
//        System.out.println(getDriver().getSessionId());
//        quitBrowser();
    }
    //@AfterClass
    public void tearDown() throws Exception{
        boolean status = false;
        ((JavascriptExecutor)getDriver()).executeScript("lambda-status=" + status);
        quitBrowser();
    }

    @Before
    public void updateName(Scenario scenario) throws InterruptedException {
        new GenericWrappers().invokeApp();
       //getDriver().executeScript("lambda-name=" + scenario.getName());
    }
}
