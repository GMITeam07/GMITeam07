package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import pages.PasswordSegmentPage;
import utilities.Driver;

public class PasswordSegmentSteps {
    PasswordSegmentPage passwordSegment = new PasswordSegmentPage();
    LoginPage loginPage = new LoginPage();

    @When("user clicks the login dropdown")
    public void userClickTheSighInDropdown() throws InterruptedException {
        passwordSegment.loginDrpDwn.click();

    }
    @And("user selects the password option")
    public void userSelectThePasswordDropdown() throws InterruptedException {

        Driver.clickWithJS(passwordSegment.passwordDropdown);

    }

    @When("User enters current password {string}")
    public void user_enter_current_password(String currentpassword) throws InterruptedException {

        passwordSegment.currentPassword.sendKeys(currentpassword);

    }

    @When("user enters new password {string}")
    public void user_enter_new_password(String newpassword) throws InterruptedException {

       passwordSegment.newPassword.sendKeys(newpassword);

    }
    @And("user sees the level chart change accordingly")
    public void userSeesTheLevelChartChangeAccordingly() throws InterruptedException {
        String level1data=passwordSegment.levelChartBar1.getAttribute("style");
        level1data.replaceAll("\\w","");
        System.out.println(level1data);
        String level2data=passwordSegment.levelChartBar2.getAttribute("style");
        level1data.replaceAll("\\w","");
        System.out.println(level2data);
        String level3data=passwordSegment.levelChartBar3.getAttribute("style");
        level1data.replaceAll("\\w","");
        System.out.println(level3data);
        String level4data=passwordSegment.levelChartBar4.getAttribute("style");
        level1data.replaceAll("\\w","");
        System.out.println(level4data);
        String level5data=passwordSegment.levelChartBar5.getAttribute("style");
        level1data.replaceAll("\\w","");
        System.out.println(level5data);

    }
    @When("user enters new password again for confirmation {string}")
    public void user_enter_new_password_again_for_confirmation(String confirmpassword) {

        passwordSegment.confirmNewPassword.sendKeys(confirmpassword);
    }

    @Then("click save button")
    public void clickSaveButton() {

        passwordSegment.saveButton.click();
    }

    @Then("User verifies that {string} is not displyed")
    public void userVerifiesThatIsNotDisplyed(String succesmessage) throws InterruptedException {
        Assert.assertTrue(Driver.waitForInVisibility(By.xpath
                ( "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']"),2));

    }
}