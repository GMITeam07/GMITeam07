package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Demo29Page;
import utilities.Driver;

public class Demo29Steps {
    Demo29Page demo29Page =new Demo29Page();

    @Given(".user is on the Create or edit a user Page with valid credentials {string} {string}")
    public void userIsOnTheCreateOrEditAUserPageWithValidCredentials(String username, String password) {
        Driver.getDriver().get("https://www.gmibank.com");
        demo29Page.loginDrpDwn.click();
        demo29Page.signinOptionDrpDwn.click();
        demo29Page.userName.sendKeys(username);
        demo29Page.password.sendKeys(password);
        demo29Page.signinSubmitButton.click();
        Driver.verifyElementDisplayed(demo29Page.accountMenu);
    }

    @Then(".user verifies there is no such user in database {string}")
    public void userVerifiesThereIsNoSuchUserInDatabase(String arg0) {
    }


    @Then(".user enters new user data login {string} {string} {string} {string} {string} <newlanguage> {string}")
    public void userEntersNewUserDataLoginNewlanguage(String arg0, String arg1, String arg2, String arg3, int int1, String arg5) {
    }
}
