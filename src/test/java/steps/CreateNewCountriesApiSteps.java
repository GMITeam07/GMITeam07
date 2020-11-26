package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateNewCountriesApiSteps {

    CustomerCreationPage customerCreationPage = new CustomerCreationPage();
    DataCreationPage dataCreationPage = new DataCreationPage();
    LoginPage loginPage = new LoginPage();
    LoginSteps loginSteps = new LoginSteps();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();



    Demo29Page demo29Page= new Demo29Page();
    Response response;
    JsonPath json;
    List<Map<String, Object>> allCountryData;
    List<Map<String, Object>> CountryName;


    @Given("user provides the api end point to set the response using by {string}")
    public void userProvidesTheApiEndPointToSetTheResponseUsingBy(String url) {

        response = given().
                accept(ContentType.JSON).
                auth()
                .preemptive()
                .basic("team07user", "S123456s?")
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();;
        response.prettyPrint();
        json = response.jsonPath();

    }
    @Given("user is on the Create Customer Page with valid credentials {string} {string}")
    public void userIsOnTheCreateCustomerPageWithValidCredentials(String validemployee_username, String validemployee_password) {

//        loginPage.loginDrpDwn.click();
//        loginPage.signinOptionDrpDwn.click();
//        loginPage.userName.sendKeys(validemployee_username);
//        loginPage.password.sendKeys(validemployee_password);
//        loginPage.signinSubmitButton.click();


    }



    @And("user verifies the country {string} does not exist in database")
    public void userVerifiesTheCountryDoesNotExistInDatabase(String countryDNExist) {

        Assert.assertFalse(countryDNExist.contains("Egypt"));
    }
    @And("user clicks on My Operations button")
    public void userClicksOnMyOperationsButton() {

        manageCustomerPage.myOperations.click();
    }


    @And("user clicks on Create a New Customer button")
    public void userClicksOnCreateANewCustomerButton() {

        manageCustomerPage.manageCostumer.click();


    }

    @When("user creates a new customer with new country {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userCreatesANewCustomerWithNewCountry(String ssn, String firstname, String lastname, String middleinitial, String email, String mobile, String zipcode, String address, String city, String country, String state) {



        Driver.getDriver().get("https://www.gmibank.com");


//        customerCreationPage.ssn.sendKeys(ssn);
//        customerCreationPage.firstname.sendKeys(firstname);
//        customerCreationPage.lastname.sendKeys(lastname);
//        customerCreationPage.email.sendKeys(email);
//        customerCreationPage.mobile.sendKeys(mobile);
//        dataCreationPage.zipCode.sendKeys(zipcode);
//        customerCreationPage.address.sendKeys(address);
//        dataCreationPage.city.sendKeys(city);
//        dataCreationPage.customerCountry.sendKeys(country);
//        dataCreationPage.customerState.sendKeys(state);


    }
    @Then("user clicks on save button")
    public void userClicksOnSaveButton() {
    }



    @Then("user verifies the country had been created in database {string}")
    public void userVerifiesTheCountryHadBeenCreatedInDatabase(String countryName) {
    }
}
