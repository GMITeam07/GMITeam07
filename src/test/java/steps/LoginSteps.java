package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import pages.LoginPage;

import pages.UserSettingsPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Scanner;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();
    UserSettingsPage userSettingsPage=new UserSettingsPage();

    @Given("user is on the GMIBank HomePage")
    public void user_is_on_the_gmi_bank_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
    }

    @When("user clicks on login Drop down menu")
    public void user_clicks_on_login_drop_down_menu() {
        loginPage.loginDrpDwn.click();
    }

    @Then("user clicks on Sign in option")
    public void user_clicks_on_sign_in_option() {
        loginPage.signinOptionDrpDwn.click();
    }

    @Then("user enters a valid username {string}")
    public void user_enters_a_valid_username(String username) {

        String user_username = username;

        switch (username) {
            case "validuser_username":
                user_username = ConfigReader.getProperty("validuser_username");
                break;
            case "validadmin_username":
                user_username = ConfigReader.getProperty("validadmin_username");
                break;
            case "validmanager_username":
                user_username = ConfigReader.getProperty("validmanager_username");
                break;
            case "validemployee_username":
                user_username = ConfigReader.getProperty("validemployee_username");
                break;
            case "validcustomer_username":
                user_username = ConfigReader.getProperty("validcustomer_username");
                break;
            case "validjoker_username":
                user_username = ConfigReader.getProperty("validjoker_username");
                break;
        }
        loginPage.userName.sendKeys(user_username);
    }

    @When("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {
                String userpassword = password ;
        switch (password) {
            case "validuser_password":
                userpassword = ConfigReader.getProperty("validuser_password");
                break;
            case "validadmin_password":
                userpassword = ConfigReader.getProperty("validadmin_password");
                break;
            case "validmanager_password":
                userpassword = ConfigReader.getProperty("validmanager_password");
                break;
            case "validemployee_password":
                userpassword = ConfigReader.getProperty("validemployee_password");
                break;
            case "validcustomer_password":
                userpassword = ConfigReader.getProperty("validcustomer_password");
                break;
            case "validjoker_password":
                userpassword = ConfigReader.getProperty("validjoker_password");
                break;
        }
        loginPage.password.sendKeys(userpassword);
    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signinSubmitButton.click();
    }

    @Then("user verifies successful login")
    public void user_verifies_successful_login() {
        WebElement element = loginPage.accountMenu;
        Driver.verifyElementDisplayed(element);
    }

    @Then("user logs in with valid credentials {string} {string}")
    public void userLogsInWithValidCredentials(String username, String password) {
        user_is_on_the_gmi_bank_home_page();
        user_clicks_on_login_drop_down_menu();
        user_clicks_on_sign_in_option();
        user_enters_a_valid_username(username);
        user_enters_a_valid_password(password);
        user_clicks_on_sign_in_button();
        user_verifies_successful_login();
<<<<<<< HEAD
=======

>>>>>>> main
    }



    @And("user clicks on the cancel button")
    public void userClicksOnTheCancelButton() {
        loginPage.cancelButton.click();
    }


    @Given("user is on the User Setings Page with valid username {string} and password {string}")
    public void userIsOnTheUserSetingsPageWithValidUsernameAndPassword(String username, String password) {
        //tested functioning properly

        userLogsInWithValidCredentials(username,password);
        homePage.userAccountMenu.click();
        homePage.userInfoDrpDnOption.click();
        Driver.waitForVisibility(userSettingsPage.userSettingsText,2);
        Driver.waitForVisibility(userSettingsPage.loginNameText,2);
    }

    @Given("user is on the User Management Page with valid credentials {string} {string}")
    public void userIsOnTheUserManagementPageWithValidCredentials(String username, String password) {

    }

    @Given("user is on the New User Registration Page")
    public void user_is_on_the_new_user_registration_page() {
        user_is_on_the_gmi_bank_home_page();
        user_clicks_on_login_drop_down_menu();
        userClicksOnRegisterDropDownOption();

    }

    @Then("user clicks on Register drop down option")
    public void userClicksOnRegisterDropDownOption() {
        homePage.registerDropDwnOption.click();
    }
}



