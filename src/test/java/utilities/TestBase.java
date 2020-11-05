package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;

import java.io.IOException;

public class TestBase {
    protected static ExtentReports extentReports;
    protected static ExtentTest extentTest;
    protected static ExtentHtmlReporter extentHtmlReporter;

    public static void setExtentReports() {
        extentReports = new ExtentReports();//1. create object to set the location of the report
        String filePath = System.getProperty("user.dir") + "/test-output/myprojectreport.html";//create a custom report in the current project.
        //Folder name = test-output, File name = report.html
        //String filePath = System.getProperty("user.dir") + "\\test-output\\report.html";//THIS IS FOR WINDOWS USER
        extentHtmlReporter = new ExtentHtmlReporter(filePath);//2. creating the report with the path we created
        extentReports.attachReporter(extentHtmlReporter);//3. attaching the html report to our custom report
        //WE CAN ADD CUSTOM INFO. NOT NECESSARY. JUST TO GIVE MORE INFORMATION TO THE USER OR TEAM
        extentReports.setSystemInfo("Environment", "Environment Name");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("Automation Engineer", "ENGINEER INFORMATION");
        extentHtmlReporter.config().setDocumentTitle("GMI Bank Reports");
        extentHtmlReporter.config().setReportName("GMI Bank Automation Reports");

    }

    public void tearDownMethod(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {//When test case fails, then take the screenshot and attached the report
            String screenshotLocation = BrowserUtils.getScreenshot(result.getName());//getScreenshot is coming from ReusableMethods
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);//adding the screenshot to the report
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test Case is skipped: " + result.getName());
        }
        Driver.closeDriver();
    }
}
