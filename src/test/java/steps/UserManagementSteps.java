package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.UserManagementPage;
import utilities.ConfigReader;
import utilities.Driver;


public class UserManagementSteps {
    UserManagementPage userManagementPage = new UserManagementPage();
    LoginPage loginPage = new LoginPage();

    @When("Admin clicks the Administration button")
    public void adminClicksTheAdministrationButton() {

        userManagementPage.administration.click();
    }

    @And("Admin select the usermangement dropdown")
    public void adminSelectTheUsermangementDropdown() {
        Driver.clickWithJS(userManagementPage.UsermanagemantDropdown);

    }


    @When("Admin clicks the Crete a new button")
    public void admin_clicks_the_crete_a_new_button() {
        userManagementPage.createNewUserButton.click();
    }

    @When("Admin enters a login {string}")
    public void admin_enters_a_login(String login) {
        userManagementPage.login.sendKeys(login);
    }

    @When("Admin enters a FirstName {string}")
    public void admin_enters_a_first_name(String firstname) {
        userManagementPage.firstName.sendKeys(firstname);

    }

    @When("Admin enters a LastName {string}")
    public void admin_enters_a_last_name(String lastname) {
        userManagementPage.lastName.sendKeys(lastname);
    }

    @When("Admin enters a Email {string}")
    public void admin_enters_a_email(String email) {
        userManagementPage.email.sendKeys(email);
    }

    @When("Admin click the activeted button")
    public void admin_click_the_activeted_button() {
        userManagementPage.activated.click();

    }

    @When("Admin selects the language")
    public void admin_selects_the_language() {
        Select select = new Select(userManagementPage.language);
        select.selectByIndex(1);

    }


    @And("Admin selects the role")
    public void adminSelectsTheRole() {


        Select select = new Select(userManagementPage.profile);
        select.selectByVisibleText("ROLE_USER");



    }


    @Then("Admin clicks the save button")
    public void admin_clicks_the_save_button() {
        userManagementPage.saveButton.click();

    }


}