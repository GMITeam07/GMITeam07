package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.CustomerCreationPage;
import pages.RegistrationPage;
import pojos.Customer;
import specs.Specs;
import utilities.ApiUtils;
import utilities.ConfigReader;
import utilities.DBUtilsNew;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateNewCountriesApiSteps {

    Response response;
    JsonPath json;
    List<Map<String, Object>> allCountryData;

    @Given("user provides the api end point to set the response using by {string}")
    public void userProvidesTheApiEndPointToSetTheResponseUsingBy(String url) {


        response = given().headers(
                "Authorization",
                "Bearer" + ConfigReader.getProperty("bearerToken"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).auth()
                .preemptive()
                .basic("team07admin", "S123456s?")
                .accept(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

       // response.prettyPrint();

    }

    @And("user verifies the country {string} does not exist in database")
    public void userVerifiesTheCountryDoesNotExistInDatabase(String countryDNExist) {

        //Assert.assertFalse(countryDNExist.contains("Egypt"));
    }

    @When("user creates a new country {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void userCreatesANewCountry(String ssn, String firstname, String lastname, String middleinitial, String email, String mobile, String zipcode, String address, String city, String country, String state) {


        Map map=new HashMap();


        map.put("ssn","234-048-8705");
        map.put("firstName","Hale ");
        map.put("lastName","Hug");
        map.put("email","hh@gmail.com");
        map.put("address","jonny st");
        map.put("phonenumber","789-045-7321");
        map.put("city","NorthYork");
        map.put("country","Egypt");
        map.put("state","ST");

        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validemployee_username"),
                        ConfigReader.getProperty("validemployee_password")).
                headers(map).

                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().
                post("/api/customers");

        response.prettyPrint();
        }


//        if(!firstname.equals("")) {
//            CustomerCreationPage..clear();
//            RegistrationPage.firstname.sendKeys(firstname);
//        }
//
//        if(!lastname.equals("")) {
//            createEditUserPage.lastname.clear();
//            createEditUserPage.lastname.sendKeys(lastname);
//        }
//
//



    @Then("user verifies the country had been created in database")
    public void userVerifiesTheCountryHadBeenCreatedInDatabase() {
    }


}
