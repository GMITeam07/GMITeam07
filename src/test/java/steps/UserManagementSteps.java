package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.UserManagementPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.net.SocketTimeoutException;


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


    @And("Admin selects the role {string}")
    public void adminSelectsTheRole(String role) {

     Driver.selectByVisibleText(userManagementPage.profile,role);


    }


    @Then("Admin clicks the save button")
    public void admin_clicks_the_save_button() {
        userManagementPage.saveButton.click();
        userManagementPage.successMessage.isDisplayed();


    }


    @And("Admin can see view user info")
    public void adminCanSeeViewUserInfo() throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().navigate().refresh();

        userManagementPage.buttonWiew.click();
        Driver.verifyElementDisplayed(userManagementPage.viewUserInfo);
    }

    @And("Admin can edit user info")
    public void adminCanEditUserInfo() {
        Driver.getDriver().navigate().back();
        userManagementPage.buttonEdit.click();
        userManagementPage.ediLogin.clear();
        userManagementPage.ediLogin.sendKeys("example2");
        userManagementPage.saveButton.click();
    }

//    @And("Admin can delete any user info")
//    public void adminCanDeleteAnyUserInfo() throws InterruptedException {
//        Thread.sleep(5000);
//        Driver.getDriver().navigate().refresh();
//        userManagementPage.lastPageButton.click();
//        userManagementPage.buttonDelete.click();
//        userManagementPage.deleteAlert.click();
//
//    }
}