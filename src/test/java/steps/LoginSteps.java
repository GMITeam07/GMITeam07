package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

import utilities.ConfigReader;
import utilities.Driver;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the GMIBank HomePage")
    public void user_is_on_the_gmi_bank_home_page() { Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
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
        System.out.println(user_username);
        loginPage.userName.sendKeys(user_username);
    }

    @When("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {

        String userpassword = password;
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
        System.out.println(userpassword);
        loginPage.password.sendKeys(userpassword);
    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.signinSubmitButton.click();
    }

    @Then("user verifies successful login")
    public void user_verifies_successful_login() {
        WebElement element = loginPage.accountMenu;
        System.out.println(element.getText());
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


    }

    public static String getLoginname(String username){
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

        return user_username;

    }
}




