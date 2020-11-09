package steps;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Login {

   LoginPage loginPage = new LoginPage();

        @Given("user is on the GMI bank login page")
        public void user_is_on_the_gmi_bank_login_page() {
                Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
                loginPage.sigin1.click();
                loginPage.singin2.click();
                loginPage.userName.sendKeys(ConfigReader.getProperty("valid_username"));
                loginPage.password.sendKeys(ConfigReader.getProperty("valid_password"));
                loginPage.signInButton.click();


        }



}
