package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.Driver;
import utilities.TestBase;

public class Hooks {
    @Before(order = 1)
    public void setUp(){
        TestBase.setExtentReports();

    }


    @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","fail");
        }
        Driver.closeDriver();
    }

}
