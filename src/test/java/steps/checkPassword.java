package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CheckPassword;
import utilities.ConfigReader;
import utilities.Driver;


public class checkPassword {
    CheckPassword checkPassword = new CheckPassword();
    @Given("user is on new user registration page")
    public void userIsOnNewUserRegistrationPage() {
        Driver.getDriver().get(ConfigReader.getProperty("registration_page_url"));
    }

    @Then("user enters a valid ssn {string}")
    public void userEntersAValidSsn(String arg0) {
        checkPassword.ssnTextBox.sendKeys();

    }

    @Then("user enters a valid first name {string}")
    public void userEntersAValidFirstName(String arg0) {
    }

    @Then("user enters a valid last name {string}")
    public void userEntersAValidLastName(String arg0) {
    }

    @Then("user enter a valid address {string}")
    public void userEnterAValidAddress(String arg0) {
    }

    @Then("user enter a valid Mobile Phone Number {string}")
    public void userEnterAValidMobilePhoneNumber(String arg0) {
    }

    @Then("user enters a null password {string}")
    public void userEntersANullPassword(String arg0) {
    }

    @Then("user verifies the passwordrequired text is displayed")
    public void userVerifiesThePasswordrequiredTextIsDisplayed() {
    }

    @Then("user enters a password with three digits {string}")
    public void userEntersAPasswordWithThreeDigits(String arg0) {
    }

    @Then("user enters a password with four digits and more {string}")
    public void userEntersAPasswordWithFourDigitsAndMore(String arg0) {
    }

    @Then("user enters a different password to second box {string}")
    public void userEntersADifferentPasswordToSecondBox(String arg0) {
    }
}
