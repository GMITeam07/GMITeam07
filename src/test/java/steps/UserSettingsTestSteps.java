package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;
import pages.UserSettingsPage;
import pojos.User;
import utilities.ApiUtils;
import utilities.Driver;

public class UserInfoSettingsPositiveTest {

    private String loginName;
    private User initialUIUser =new User();
    private User currentDisplayingUIUser =new User();
    private User previouslyDisplayedUIUser =new User();
    private User newUIUserTobeRegistered=new User();

    private User initialApiUser =new User();
    private User currentDisplayingApiUser =new User();
    private User previouslyDisplayedApiUser =new User();
    private User newApiUserTobeRegistered=new User();

    private User initialDBUser =new User();
    private User getCurrentDisplayingDBUser =new User();
    private User getPreviouslyDisplayedDBUser =new User();
    private User newDBUserTobeRegistered=new User();

    LoginPage loginPage=new LoginPage();
    UserSettingsPage userSettingsPage =new UserSettingsPage();
    HomePage homePage=new HomePage();

    @Given("user clicks on User Account Menu")
    public void user_clicks_on_user_account_menu() {
        Driver.waitForPageToLoad(2);
        homePage.userAccountMenu.click();
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

    @Then("user logs out")
    public void userLogsOut() {
        homePage.userAccountMenu.click();
        homePage.signOutOptionBtn.click();
    }

    @Then("user selects the {string} on language drop down")
    public void userSelectsTheOnLanguageDropDown(String language) {
        Driver.selectByVisibleText(userSettingsPage.languageDrpDwn,language);

    }

    @Then("user clicks on save button on User Settings Page")
    public void userClicksOnSaveButtonOnUserSettingsPage() {
        userSettingsPage.saveBtn.click();
    }


    @Then("user verifies successful saved message {string} is displayed")
    public void userVerifiesSuccessfulSavedMessageIsDisplayed(String successfulSavedMessage) {
        Driver.waitForVisibility(userSettingsPage.settingsSavedMessageAlert,3);
    }

    @Then("user verifies firstselected language dropdown option is {string}")
    public void userVerifiesFirstselectedLanguageDropdownOptionIs(String firstselectedoption) {
        Assert.assertTrue(Driver.getFirstSelectedOption(userSettingsPage.languageDrpDwn).equalsIgnoreCase(firstselectedoption));
    }


    @Then("user records initial UI user data on User Settings Page {string}")
    public void userRecordsInitialUIUserDataOnUserSettingsPage(String username) {

        initialUIUser.setFirstName(userSettingsPage.emailTextBox.getAttribute("value").toString());
        initialUIUser.setLastName(userSettingsPage.lastnameTextBox.getAttribute("value").toString());
        initialUIUser.setEmail(userSettingsPage.emailTextBox.getAttribute("value").toString());
        initialUIUser.setLangKey(Driver.getFirstSelectedOption(userSettingsPage.languageDrpDwn).equalsIgnoreCase("English") ? "en" : "tr");

    }
    @When("user retrieves initial Api user data {string}")
    public void userRetrievesInitialApiUserData(String username) {
        initialApiUser= ApiUtils.getUserByLogin(username);
    }

    @Then("user selects the initial language on language drop down")
    public void userSelectsTheInitialLanguageOnLanguageDropDown() {
        Driver.selectByVisibleText(
                userSettingsPage.languageDrpDwn,
                initialUIUser.getLangKey().equalsIgnoreCase("en") ? "English" : "Türkçe"
        );
    }

    @When("user enters new user data {string} {string} {string} {string}")
    public void userEntersNewUserData(String firstname, String lastname, String email, String language) {
        userSettingsPage.firstnameTextBox.clear();
        userSettingsPage.firstnameTextBox.sendKeys(initialUIUser.getFirstName());

        userSettingsPage.lastnameTextBox.clear();
        userSettingsPage.lastnameTextBox.sendKeys(initialUIUser.getLastName());

        userSettingsPage.emailTextBox.clear();
        userSettingsPage.emailTextBox.sendKeys(initialUIUser.getEmail());

        Driver.selectByVisibleText(
                userSettingsPage.languageDrpDwn,
                initialUIUser.getLangKey().equalsIgnoreCase("en")? "English":"Türkçe"
                );

    }

    @Then("user records current displaying UI user data {string}")
    public void userRecordsCurrentDisplayingUserData(String username) {

        currentDisplayingUIUser.setFirstName(userSettingsPage.emailTextBox.getAttribute("value").toString());
        currentDisplayingUIUser.setLastName(userSettingsPage.lastnameTextBox.getAttribute("value").toString());
        currentDisplayingUIUser.setEmail(userSettingsPage.emailTextBox.getAttribute("value").toString());
        currentDisplayingUIUser.setLangKey(Driver.getFirstSelectedOption(userSettingsPage.languageDrpDwn).equalsIgnoreCase("English")? "en":"tr");
    }

    @Then("user verifies current displaying UI user data is same as initial UI user data")
    public void userVerifiesCurrentDisplayingUIUserDataIsSameAsInitialUIUserData() {
        Assert.assertTrue(
        currentDisplayingUIUser.getFirstName().equalsIgnoreCase(initialUIUser.getFirstName())&&
                currentDisplayingUIUser.getLastName().equalsIgnoreCase(initialUIUser.getLastName())&&
                currentDisplayingUIUser.getEmail().equalsIgnoreCase(initialUIUser.getEmail())&&
                currentDisplayingUIUser.getLangKey().equalsIgnoreCase(currentDisplayingUIUser.getLangKey())

        );
    }

    @Then("user retrieves current displaying Api User data {string}")
    public void userRetrievesCurrentDisplayingApiUserData(String username) {
        currentDisplayingApiUser=ApiUtils.getUserByLogin(username);
    }

    @Then("user verifies current displaying Api user data is same as initial Api user data")
    public void userVerifiesCurrentDisplayingApiUserDataIsSameAsInitialApiUserData() {
        Assert.assertEquals(currentDisplayingApiUser,initialApiUser);
    }

    @Then("user verifies current displaying user data is same as current displaying UI data")
    public void userVerifiesCurrentDisplayingUserDataIsSameAsCurrentDisplayingUIData() {

    }

    @Then("user verifies current displaying Api user data is same as current displaying UI data")
    public void userVerifiesCurrentDisplayingApiUserDataIsSameAsCurrentDisplayingUIData() {
        Assert.assertTrue
                (
                currentDisplayingApiUser.getFirstName().equalsIgnoreCase(currentDisplayingUIUser.getFirstName())&&
                        currentDisplayingApiUser.getLastName().equalsIgnoreCase(currentDisplayingUIUser.getLastName())&&
                        currentDisplayingApiUser.getEmail().equalsIgnoreCase(currentDisplayingUIUser.getEmail())&&
                        currentDisplayingApiUser.getLangKey().equalsIgnoreCase(currentDisplayingUIUser.getLangKey())
                );
    }

    @Then("user verifies an error message is under email textbox displayed contains {string}")
    public void userVerifiesAnErrorMessageIsUnderEmailTextboxDisplayedContains(String errormessage) {
        Assert.assertTrue(userSettingsPage.emailErrorMessages.getText().
                toLowerCase().
                contains(errormessage.
                        toLowerCase()));
    }

    @Then("user clears the firstname textbox")
    public void user_clears_the_firstname_textbox() {
        userSettingsPage.firstnameTextBox.clear();

    }

    @Then("user clears the lastname textbox")
    public void user_clears_the_lastname_textbox() {

        userSettingsPage.lastnameTextBox.clear();
    }
    @Then("user clears the email textbox")
    public void user_clears_the_email_textbox() {
        userSettingsPage.emailTextBox.clear();

    }

    @Then("user enters a new invalid email {string}")
    public void user_enters_a_new_invalid_email(String invalidemail) {
        userSettingsPage.emailTextBox.sendKeys(invalidemail);
    }

    @Then("user verifies an error message under email textbox is displayed contains {string}")
    public void userVerifiesAnErrorMessageUnderEmailTextboxIsDisplayedContains(String errormessage) {
        Driver.waitForVisibility(By.partialLinkText(errormessage),2);
    }

    @Then("user verifies an error message under firstname textbox is displayed contains {string}")
    public void userVerifiesAnErrorMessageUnderFirstnameTextboxIsDisplayedContains(String firstnameerrormessage) {
        Driver.waitForVisibility(By.partialLinkText(firstnameerrormessage),2);
    }

    @Then("user verifies an error message under lastname textbox is displayed contains {string}")
    public void userVerifiesAnErrorMessageUnderLastnameTextboxIsDisplayedContains(String lastnameErrormessage) {
        Driver.waitForVisibility(By.partialLinkText(lastnameErrormessage),2);
    }

    @Then("user reinitialize the user data by UI")
    public void userReinitializeTheUserDataByUI() {
        userSettingsPage.firstnameTextBox.sendKeys(initialUIUser.getFirstName());
        userSettingsPage.lastnameTextBox.sendKeys(initialUIUser.getLastName());
        userSettingsPage.emailTextBox.sendKeys(initialUIUser.getEmail());
        Driver.selectByVisibleText(userSettingsPage.languageDrpDwn,
                initialUIUser.getLangKey().equalsIgnoreCase("en")? "Englis":"Türkçe");
    }

    @Then("user verifies successful saved message {string} is not displayed")
    public void userVerifiesSuccessfulSavedMessageIsNotDisplayed(String arg0) {
        System.out.println(Driver.waitForInVisibility( userSettingsPage.settingsSavedMessageAlert,3));
    }

    @When("user enters a new short email {string}")
    public void userEntersANewShortEmail(String invalidshortemail) {
        userSettingsPage.emailTextBox.sendKeys(invalidshortemail);
    }
}
