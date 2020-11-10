package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

import utilities.ConfigReader;
import utilities.Driver;

public class Login {

   LoginPage loginPage = new LoginPage();

    @Given("User on the GMIBank Homepage")
    public void user_on_the_gmi_bank_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
    }
    @When("user clicks loginDrpDwn")
    public void user_clicks_login_drp_dwn() {
        loginPage.loginDrpDwn.click();
    }
    @When("user clicks signinBtn")
    public void user_clicks_signin_btn() {
        loginPage.signinBtn.click();
    }
    @Then("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.userName.sendKeys(ConfigReader.getProperty("validuser_username"));
    }
    @Then("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.password.sendKeys(ConfigReader.getProperty("validuser_password"));
    }
    @Then("user click sign in button")
    public void user_click_sign_in_button() {
        loginPage.signInButton.click();
    }
    @Then("verify username on the login page")
    public void verify_username_on_the_login_page() {
        WebElement element = loginPage.accountMenu;
        System.out.println(element.getText());
        Driver.verifyElementDisplayed(element);



    }


















        }




