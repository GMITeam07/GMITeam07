package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.UserInfoSettingsUpdatePage;
import utilities.ConfigReader;
import utilities.Driver;

public class UserInfoSettingsUpdateStep {
    UserInfoSettingsUpdatePage userInfoSettingsUpdatePage = new UserInfoSettingsUpdatePage();


    @When("user selects the User Info option")
    public void user_selects_the_user_info_option() {
        userInfoSettingsUpdatePage.userInfo.click();
    }

    @Then("user verifies the page displays text {string} text is displayed\"")
    public void user_verifies_the_page_displays_text_text_is_displayed(String string) {
      Driver.verifyElementDisplayed(userInfoSettingsUpdatePage.userSettingsText);

    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        userInfoSettingsUpdatePage.saveButton.click();
    }

    @And("User enters first name {string}")
    public void userEntersFirstName(String firstname) {
        Driver.getDriver().findElement(By.id("firstName")).clear();
        userInfoSettingsUpdatePage.firstNameTextBox.sendKeys(firstname);
    }

    @And("User enters last name {string}")
    public void userEntersLastName(String lastname) {
        Driver.getDriver().findElement(By.id("lastName")).clear();
        userInfoSettingsUpdatePage.lastNameTextBox.sendKeys(lastname);
    }

    @And("User enters invalid email{string}")
    public void userEntersInvalidEmail(String invalidEmail) {

        Driver.getDriver().findElement(By.id("email")).clear();
        userInfoSettingsUpdatePage.emailTextBox.sendKeys(invalidEmail);
    }

    @Then("User should see This field is invalid massage")
    public void userShouldSeeThisFieldIsInvalidMassage() {
        System.out.println(userInfoSettingsUpdatePage.emailNameInvalidFeedBack.getText());
        Assert.assertTrue(userInfoSettingsUpdatePage.emailNameInvalidFeedBack.getText().contains("This field is invalid"));
    }

    @And("user enters valid email {string}")
    public void userEntersValidEmail(String email) {
        Driver.getDriver().findElement(By.id("email")).clear();
        userInfoSettingsUpdatePage.emailTextBox.sendKeys(ConfigReader.getProperty("valid_email"));
    }

    @Then("user should see Your first name is required massage")
    public void userShouldSeeYourFirstNameIsRequiredMassage() {
        System.out.println(userInfoSettingsUpdatePage.firstNameInvalidFeedBack.getText());
        Assert.assertTrue(userInfoSettingsUpdatePage.firstNameInvalidFeedBack.getText().contains("Your first name is required"));
    }

    @Then("User should see Your last name is required massage")
    public void userShouldSeeYourLastNameIsRequiredMassage() {
        System.out.println(userInfoSettingsUpdatePage.lastNameInvalidFeedBack.getText());
        Assert.assertTrue(userInfoSettingsUpdatePage.lastNameInvalidFeedBack.getText().contains("Your last name is required"));
    }

    @And("user clicks Language drop down")
    public void userClicksLanguageDropDown() {
        userInfoSettingsUpdatePage.languageDrpDwn.click();
    }

    @Then("user should be see just English and Turkish language options")
    public void userShouldBeSeeJustEnglishAndTurkishLanguageOptions() {
    Select select = new Select(userInfoSettingsUpdatePage.languageDrpDwn);
        System.out.println( Driver.selectRandomTextFromDropdown(select).getText());

    }

}
