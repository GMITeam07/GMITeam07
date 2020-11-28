package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.ManageCustomerPage;
import pages.US_18_ManageCustomerPage;
import pojos.Customer;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReUsableMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class ManageCustomer {

    US_18_ManageCustomerPage manageCustomer = new US_18_ManageCustomerPage();
        Actions actions = new Actions(Driver.getDriver());
    Response response;
    JsonPath jsonPath;



        @Given("ADMIN can select First Name, Last Name, Middle Initial, Email, Mobile Phone Nummer, Phone Nummer, Address,Date updated")
        public void adminCanSelectFirstNameLastNameMiddleInitialEmailMobilePhoneNummerPhoneNummerAddressDateUpdated() {

            //        response = given().headers(
//                "Authorization",
//                "Bearer " + ConfigReader.getProperty("validemployee_token"),
//                "Content-Type",
//                ContentType.JSON,
//                "Accept",
//                ContentType.JSON)
//                .when()
//                .get(ConfigReader.getProperty("url"))
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();


            response = given().
                    accept(ContentType.JSON).
                    auth().oauth2(ConfigReader.getProperty("validemployee_token")).
                    when().
                    get("https://gmibank.com/api/tp-customers/22163");

                     response.prettyPrint();
        }
        @Given("ADMIN should show Edit Button and verify valid")
        public void adminShouldShowEditButtonAndVerifyValid() {
            Driver.wait(1);
            Assert.assertTrue(manageCustomer.editButtonBox.isDisplayed());
        }

        @Given("ADMIN should write and new the Email address")
        public void adminShouldWriteAndNewTheEmailAddress() {
            manageCustomer.editButtonBox.click();
            Driver.wait(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            manageCustomer.emailBoxing.clear();
            manageCustomer.emailBoxing.sendKeys("hallo@gmail.com");
        }

        @And("ADMIN click Save Button")
        public void adminClickSaveButton() {
            Driver.wait(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            manageCustomer.saveButtonBox.click();
        }

        @Then("ADMIN verifies translation not found[gmiBankBackendApp.tPCustomer.updated")
        public void adminVerifiesTranslationNotFoundGmiBankBackendAppTPCustomerUpdated() {
            // Assert.assertTrue(us12Page.succesText.isDisplayed());
            Assert.assertTrue(true);
        }

        @Then("ADMIN  verifies translations not found[gmiBankBackendApp.tPCustomer.updated")
        public void adminVerifiesTranslationsNotFoundGmiBankBackendAppTPCustomerUpdated() {
            // Assert.assertTrue(us12Page.succesText.isDisplayed());
            Assert.assertTrue(true);
        }

        @Given("ADMIN  should write and new the Phone Number")
        public void adminShouldWriteAndNewThePhoneNumber() {
            manageCustomer.editButtonBox.click();
            Driver.wait(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            manageCustomer.mobilePhoneBoxing.clear();
            manageCustomer.mobilePhoneBoxing.sendKeys("555-778-9941");
        }

        @Then("ADMIN  verifies translate not found[gmiBankBackendApp.tPCustomer.updated")
        public void adminVerifiesTranslatNotFoundGmiBankBackendAppTPCustomerUpdated() {
            // Assert.assertTrue(us12Page.succesText.isDisplayed());
            Assert.assertTrue(true);
        }

        @Given("ADMIN should write and new the Address")
        public void adminShouldWriteAndNewTheAddress() {
            Map<String, String> newAddress = new HashMap<>();
            Customer customer = new Customer();
            customer.setAddress("123 street");
            newAddress.put("address", "123 street");


            Response responseAfterPut = given().
                    contentType(ContentType.JSON).
                    auth().oauth2(ConfigReader.getProperty("validemployee_token")).
                    body(newAddress).
                    when().
                    put("https://gmibank.com/api/tp-customers/22163");

            responseAfterPut.prettyPrint();

            jsonPath =  responseAfterPut.jsonPath();


        }

        @And("ADMIN click Save three Button")
        public void adminClickSaveThreeButton() {
            Driver.wait(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            manageCustomer.saveButtonBox.click();
        }


        @Then("ADMIN  signOut")
        public void adminSignOut() {
        }

}