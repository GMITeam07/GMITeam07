package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasswordSegmentSteps {

    @When("user clicks the sighIn dropdown")
    public void userClickTheSighInDropdown() {
    }
    @And("user selects the password dropdown")
    public void userSelectThePasswordDropdown() {
    }


    @When("User enters current password {string}")
    public void user_enter_current_password(String string) {

    }
    @When("user enters new password {string}")
    public void user_enter_new_password(String string) {


    }
    @And("user sees the level chart change accordingly")
    public void userSeesTheLevelChartChangeAccordingly() {
    }
    @When("user enters new password again for confirmation {string}")
    public void user_enter_new_password_again_for_confirmation(String string) {

    }

    @Then("click save button")
    public void clickSaveButton() {
    }


}