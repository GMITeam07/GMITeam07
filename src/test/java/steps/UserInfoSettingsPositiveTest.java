package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.UserSettingsPage;
import pojos.User;
import utilities.ApiUtils;
import utilities.Driver;

public class UserInfoSettingsPositiveTest {
    private User userUI=new User();
    private User userApi=new User();
    private User userDB=new User();
    private User userNew=new User();


    LoginPage loginPage=new LoginPage();
    UserSettingsPage userSettingsPage =new UserSettingsPage();
    HomePage homePage=new HomePage();

    @Given("user clicks on User Account Menu")
    public void user_clicks_on_user_account_menu() {
        Driver.waitForPageToLoad(2);
        homePage.userAccountMenu.click();

    }

    @When("user selects the User Info option")
    public void user_selects_the_user_info_option() {
        Driver.clickWithJS(homePage.userInfoDrpDnOption);
    }

    @Then("user verifies the page displays text {string} text is displayed\"")
    public void user_verifies_the_page_displays_text_text_is_displayed(String userSettingsForText) {
        Assert.assertTrue(userSettingsPage.userSettingsText.getText().contains(userSettingsForText));
    }

    @Then("user verifies {string} is written in message inside bracelets")
    public void user_verifies_is_written_in_message_inside_bracelets(String username) {

        Assert.assertTrue(userSettingsPage.loginNameText.
                getText().contains(LoginSteps.getLoginname(username)));
    }

    @Then("user verifies firstname textbox is available")
    public void user_verifies_firstname_textbox_is_available() {
        Driver.waitForClickablility(userSettingsPage.firstnameTextBox,2);
    }

    @Then("user verifies lastname textbox is available")
    public void user_verifies_lastname_textbox_is_available() {
        Driver.waitForVisibility(userSettingsPage.lastnameTextBox,2);
    }

    @Then("user verifies email textbox is available")
    public void user_verifies_email_textbox_is_available() {
        Driver.waitForVisibility(userSettingsPage.emailTextBox,2);
    }

    @Then("user verifies the language dropdown menu exists")
    public void user_verifies_the_language_dropdown_menu_exists() {
        Driver.waitForClickablility(userSettingsPage.languageDrpDwn,2);

    }

    @Then("user verifies language drop down menu has {string} and {string} options")
    public void user_verifies_language_drop_down_menu_has_and_options(String languages1, String languages2) {
        Assert.assertEquals(
                2, Driver.getSelectDropDownOptions(userSettingsPage.languageDrpDwn).size());
        Assert.assertTrue(Driver.getSelectDropDownOptions(userSettingsPage.languageDrpDwn).
                stream().anyMatch(t->t.equalsIgnoreCase(languages1)));
        Assert.assertTrue(Driver.getSelectDropDownOptions(userSettingsPage.languageDrpDwn).
                stream().anyMatch(t->t.equalsIgnoreCase(languages2)));
    }

    @Then("user gets the user data from UI")
    public void user_gets_the_user_data_from_ui() {
        userUI.setFirstName(userSettingsPage.firstnameTextBox.getText());
        userUI.setLastName(userSettingsPage.lastnameTextBox.getText());
        userUI.setEmail(userSettingsPage.emailTextBox.getText());
        userUI.setLangKey(
                Driver.getFirstSelectedOption(userSettingsPage.
                        languageDrpDwn).equalsIgnoreCase("en")? "en":"tr");
    }

    @When("user retrieves the user info {string} by api")
    public void user_retrieves_the_user_info_by_api(String username) {
        userApi= ApiUtils.getUserByLogin(username);

    }

    @Then("user verifies the user data is same as api data")
    public void user_verifies_the_user_data_is_same_as_api_data() {
        Assert.assertEquals(userUI.getFirstName(),userApi.getFirstName());
        Assert.assertEquals(userUI.getLastName(),userApi.getLastName());
        Assert.assertEquals(userUI.getEmail(),userApi.getEmail());
        Assert.assertEquals(userUI.getLangKey(),userApi.getLangKey());
    }

    @Then("user retrieves the user info {string} by database")
    public void user_retrieves_the_user_info_by_database(String username) {


    }

    @Then("user verifies the user data is same as database data")
    public void user_verifies_the_user_data_is_same_as_database_data() {


    }

    @Then("user selects language {string}")
    public void user_selects_language(String language) {
       Driver.selectFromDrpDown(userSettingsPage.languageDrpDwn,language);
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        userSettingsPage.saveBtn.click();

    }

    @Then("user verifies success message is displayed {string}")
    public void user_verifies_success_message_is_displayed(String successmessage) {
        Driver.waitForVisibility((WebElement) By.partialLinkText(successmessage),2);
    }

    @Then("user verifies the user language \"English\"is same as api")
    public void user_verifies_the_user_language_english_is_same_as_api() {


    }

    @Then("user verifies the user language \"English\"is same as database")
    public void user_verifies_the_user_language_english_is_same_as_database() {


    }

    @Then("user verifies the user language {string} is same as api")
    public void user_verifies_the_user_language_is_same_as_api(String language) {


    }

    @Then("user verifies the user language {string} is same as database")
    public void user_verifies_the_user_language_turkish_is_same_as_database() {


    }

    @Then("user clears the firstname textbox")
    public void user_clears_the_firstname_textbox() {


    }

    @Then("user enters a new firstname {string}")
    public void user_enters_a_new_firstname(String string) {


    }

    @Then("user refreshes the page")
    public void user_refreshes_the_page() {


    }

    @Then("user verifies the UI firstname is same as {string}")
    public void user_verifies_the_ui_firstname_is_same_as(String string) {


    }

    @Then("user verifies the api firstname {string} is same as {string}")
    public void user_verifies_the_api_firstname_is_same_as(String string, String string2) {


    }

    @Then("user verifies the database firstname {string} is same as {string}")
    public void user_verifies_the_database_firstname_is_same_as(String string, String string2) {


    }

    @Then("user enters the initial firstname to firstname textbox")
    public void user_enters_the_initial_firstname_to_firstname_textbox() {


    }

    @Then("user clears the lastname textbox")
    public void user_clears_the_lastname_textbox() {


    }

    @Then("user enters a new lastname {string}")
    public void user_enters_a_new_lastname(String string) {


    }

    @Then("user verifies the lastname is same as {string}")
    public void user_verifies_the_lastname_is_same_as(String string) {


    }

    @Then("user verifies the api lastname {string} is same as {string}")
    public void user_verifies_the_api_lastname_is_same_as(String string, String string2) {


    }

    @Then("user verifies the database lastname {string} is same as {string}")
    public void user_verifies_the_database_lastname_is_same_as(String string, String string2) {


    }

    @Then("user enters the initial lastname to lastname textbox")
    public void user_enters_the_initial_lastname_to_lastname_textbox() {


    }

    @Then("user clears the email textbox")
    public void user_clears_the_email_textbox() {


    }

    @Then("user enters a new invalid email {string}")
    public void user_enters_a_new_invalid_email(String string) {


    }

    @Then("user verifies the email is same as {string}")
    public void user_verifies_the_email_is_same_as(String string) {


    }

    @Then("user verifies the api email {string} is same as {string}")
    public void user_verifies_the_api_email_is_same_as(String string, String string2) {


    }

    @Then("user verifies the database email {string} is same as {string}")
    public void user_verifies_the_database_email_is_same_as(String string, String string2) {


    }

    @Then("user enters the initial email to email textbox")
    public void user_enters_the_initial_email_to_email_textbox() {


    }


    @Then("user verifies an error message is under email textbox displayed contains {string}")
    public void userVerifiesAnErrorMessageIsUnderEmailTextboxDisplayedContains(String arg0) {

    }

    @Then("user verifies an error message under email textbox is displayed contains {string}")
    public void userVerifiesAnErrorMessageUnderEmailTextboxIsDisplayedContains(String arg0) {

    }

    @Then("user verifies an error message under firstname textbox is displayed contains {string}")
    public void userVerifiesAnErrorMessageUnderFirstnameTextboxIsDisplayedContains(String arg0) {

    }

    @Then("user verifies an error message under lastname textbox is displayed contains {string}")
    public void userVerifiesAnErrorMessageUnderLastnameTextboxIsDisplayedContains(String arg0) {
    }

    @Then("user enters a new valid email {string}")
    public void userEntersANewValidEmail(String arg0) {

    }

    @And("User logs into user settings page with valid {string} and {string}")
    public void userLogsIntoUserSettingsPageWithValidAnd(String arg0, String arg1) {

    }
}
