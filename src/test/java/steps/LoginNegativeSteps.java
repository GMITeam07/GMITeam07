package steps;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;


public class LoginNegativeSteps {
    LoginPage loginPage = new LoginPage();


    @Then("user enters a username {string}")
    public void user_enters_a_username(String username) {
       String user_username="";


        switch (username) {
            case "invaliduser_username":
                user_username= ConfigReader.getProperty("invaliduser_username");
                break;
            case "invalidadmin_username":
                user_username= ConfigReader.getProperty("invalidadmin_username");
                break;
            case "invalidmanager_username":
                user_username= ConfigReader.getProperty("invalidmanager_username");
                break;
            case "invalidemployee_username":
                user_username= ConfigReader.getProperty("invalidemployee_username");
                break;
            case "invalidcustomer_username":
                user_username= ConfigReader.getProperty("invalidcustomer_username");
                break;
            case "invalidjoker_username":
                user_username= ConfigReader.getProperty("invalidjoker_username");
                break;
            case "validuser_username":
                user_username= ConfigReader.getProperty("validuser_username");
                break;
            case "validadmin_username":
                user_username= ConfigReader.getProperty("validadmin_username");
                break;
            case "validmanager_username":
                user_username= ConfigReader.getProperty("validmanager_username");
                break;
            case "validemployee_username":
                user_username= ConfigReader.getProperty("validemployee_username");
                break;
            case "validcustomer_username":
                user_username= ConfigReader.getProperty("validcustomer_username");
                break;
            case "validjoker_username":
                user_username= ConfigReader.getProperty("validjoker_username");
                break;
        }
//        System.out.println(user_username);
        loginPage.userName.sendKeys(user_username);

    }

    @When("user enters a password {string}")
    public void user_enters_a_password(String password) {
        String userpassword="";
        switch (password) {
            case "invaliduser_password":userpassword= ConfigReader.getProperty("invaliduser_password");
            break;
            case "invalidadmin_password":userpassword= ConfigReader.getProperty("invalidadmin_password");
                break;
            case "invalidmanager_password":userpassword= ConfigReader.getProperty("invalidmanager_password");
                break;
            case "invalidemployee_password":userpassword= ConfigReader.getProperty("invalidemployee_password");
                break;
            case "invalidcustomer_password":userpassword= ConfigReader.getProperty("invalidcustomer_password");
                break;
            case "invalidjoker_password":userpassword= ConfigReader.getProperty("invalidjoker_password");
                break;
            case "validuser_password":userpassword= ConfigReader.getProperty("validuser_password");
                break;
            case "validadmin_password":userpassword= ConfigReader.getProperty("validadmin_password");
                break;
            case "validmanager_password":userpassword= ConfigReader.getProperty("validmanager_password");
                break;
            case "validemployee_password":userpassword= ConfigReader.getProperty("validemployee_password");
                break;
            case "validcustomer_password":userpassword= ConfigReader.getProperty("validcustomer_password");
                break;
            case "validjoker_password":userpassword= ConfigReader.getProperty("validjoker_password");
                break;
        }
  //      System.out.println(userpassword);
        loginPage.password.sendKeys(userpassword);
    }





    @And("user should get Failed to sign in message")
    public void userShouldGetFailedToSignInMessage() {
        Driver.waitForVisibility(loginPage.failedSigninMessage,20);
    String failedSigninMessage =  loginPage.failedSigninMessage.getText();
        System.out.println(failedSigninMessage);

    }

    @Then("user verifies failed to signin message is displayed")
    public void userVerifiesFailedToSigninMessageIsDisplayed() {

        Driver.verifyElementDisplayed(loginPage.failedSigninMessage);

    }

}
