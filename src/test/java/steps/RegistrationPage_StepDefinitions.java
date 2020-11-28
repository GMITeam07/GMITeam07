package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.RegistrationPage;
import utilities.Driver;

public class RegistrationPage_StepDefinitions {

    RegistrationPage registrationPage = new RegistrationPage();


    //Registration page test with credentials


    @Given("user enters SSN number {string}")
    public void user_enters_SSN_number(String SSN) { registrationPage.sSN.sendKeys(SSN);
    }

    @Given("user enters firstName {string}")
    public void user_enters_firstName(String firstName) { registrationPage.regFirstName.sendKeys(firstName);
    }

    @Given("user enters lastName {string}")
    public void user_enters_lastName(String lastName) { registrationPage.regLastName.sendKeys(lastName);
    }

    @Given("user enters address {string}")
    public void user_enters_address(String address) { registrationPage.regAddress.sendKeys(address);
    }

    @Given("user enters mobile phone number {string}")
    public void user_enters_mobile_phone_number(String mobilePhoneNumber) { registrationPage.regMobilePhone.sendKeys(mobilePhoneNumber);
    }

    @Given("user enters username {string}")
    public void user_enters_username(String username) { registrationPage.regUsername.sendKeys(username);
    }

    @Given("user enters email {string}")
    public void user_enters_email(String email) { registrationPage.regEmail.sendKeys(email);
    }

    @Then("user verifies there is no red boxes on the registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_registration_page() {

        Assert.assertTrue(Driver.waitForInVisibility(By.xpath("//*[@id='register-form']/div[1]/div[@class='invalid-feedback']"),2));
        Assert.assertTrue(Driver.waitForInVisibility(By.xpath("//*[@id='register-form']/div[2]/div[@class='invalid-feedback']"),2));
        Assert.assertTrue(Driver.waitForInVisibility(By.xpath("//*[@id='register-form']/div[3]/div[@class='invalid-feedback']"),2));
        Assert.assertTrue(Driver.waitForInVisibility(By.xpath("//*[@id='register-form']/div[5]/div[@class='invalid-feedback']"),2));
        Assert.assertTrue(Driver.waitForInVisibility(By.xpath("//*[@id='register-form']/div[6]/div[@class='invalid-feedback']"),2));
        Assert.assertTrue(Driver.waitForInVisibility(By.xpath("//*[@id='register-form']/div[7]/div[@class='invalid-feedback']"),2));

    }


    @Given("user clicks on the Account Menu icon")
    public void user_clicks_on_the_Account_Menu_icon() { registrationPage.accountIcon.click();
    }

    @Given("user clicks on the Register viewbox")
    public void user_clicks_on_the_Register_viewbox() { registrationPage.registerDropdown.click();
    }

    //Registration page SSN test with special numbers


    @Given("user enters special SSN number {string}")
    public void user_enters_special_SSN_number(String SSN) { registrationPage.sSN.sendKeys(SSN);
    }


    @Then("user verifies there is no red boxes on the SSN checkbox in the Registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_SSN_checkbox_in_the_Registration_page() {

        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.ssnErrorMessage,2).
                getText().
                toLowerCase().
                contains("Your SSN is invalid"));

        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.ssnErrorMessage,2).
                getText().
                toLowerCase().
                contains("translation-not-found[Your SSN is required]"));


    }

    //Registration Page test with special first name


    @Given("user enter no Firstname \"\"")
    public void user_enter_digits_phone_number(String string) {

        registrationPage.regFirstName.sendKeys("");

    }

    @Then("user verifies there is no red boxes on the firstname checkbox in the Registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_firstname_checkbox_in_the_Registration_page() {

        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.firstNameErrorMessage,2).
                getText().
                toLowerCase().
                contains("Your First Name is required"));

    }

    //Registration Page test with special last name

    @Given("user enter no Lastname {string}")
    public void user_enter_no_Lasttname(String string) {
        registrationPage.regLastName.sendKeys("");
    }

    @Then("user verifies there is no red boxes on the lastname checkbox in the Registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_lastname_checkbox_in_the_Registration_page() {
        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.lastNameErrorMessage,2).
                getText().
                toLowerCase().
                contains("Your Last Name is required"));

    }


    //Registration page test with special mobile phone number


    @Given("user enter ten digits phone number \"000-000-0000\"")
    public void user_enter_ten_digits_phone_number(String string) {
        registrationPage.regMobilePhone.sendKeys("000-000-0000");

    }

    @Then("user verifies there is no red boxes on the Mobile Phone Number checkbox in the Registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_Mobile_Phone_Number_checkbox_in_the_Registration_page() {

        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.phoneNumberErrorMessage,2).
                getText().
                toLowerCase().
                contains("Your mobile phone number is invalid"));

    }


    //Registration page test with special emails


    @Given("user enters special email {string}")
    public void user_enters__special_email(String email) {
        registrationPage.regEmail.sendKeys(email);

    }

    @Then("user verifies there is no red boxes on the Email checkbox in the Registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_Email_checkbox_in_the_Registration_page() {

        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.emailErrorMessage,2).
                getText().
                toLowerCase().
                contains("Your email is required to be at least 5 characters."));


    }


    //Registration page test with special emails

    @Then("user verifies there is no red boxes on the username checkbox in the Registration page")
    public void user_verifies_there_is_no_red_boxes_on_the_username_checkbox_in_the_Registration_page() {
        org.testng.Assert.assertTrue(Driver.waitForVisibility(registrationPage.usernameErrorMessage,2).
                getText().
                toLowerCase().
                contains("Your username is required."));
    }




}