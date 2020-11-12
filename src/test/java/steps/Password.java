package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PasswordPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Password {

    PasswordPage passwordPage = new PasswordPage();

    @Given("user is on the GMIBank homepage")
    public void userIsOnTheGMIBankHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmibank_url"));
    }

    @Then("click user icon")
    public void clickUserIcon() {
    }

    @Then("click register button")
    public void clickRegisterBotton() {
    }

    @Then("click new password")
    public void clickNewPassword() {
    }

    @Then("enter the given password")
    public void enterTheGivenPassword() {
    }

    @Then("password must contain at least seven characters")
    public void password_must_contain_at_least_seven_characters() {

    }


    @Then("checks if the password has numbers")
    public void checksIfThePasswordHasNumbers() {
    }

    @Then("checks if the password has an uppercase letter")
    public void checksIfThePasswordHasAnUppercaseLetter() {
    }

    @Then("checks if the password has a lowercase letter")
    public void checksIfThePasswordHasALowercaseLetter() {
    }

    @Then("checks if the password has a special character")
    public void checksIfThePasswordHasASpecialCharacter() {
    }

    @Then("If all conditions are met, verify that the password has met the requested criteria.")
    public void ifAllConditionsAreMetVerifyThatThePasswordHasMetTheRequestedCriteria() {
    }
}
