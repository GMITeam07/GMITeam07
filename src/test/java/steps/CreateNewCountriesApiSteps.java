package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.Country;

import pojos.Country;
import specs.Specs;
import utilities.ApiUtils;
import utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.DBUtilsNew;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
public class CreateNewCountriesApiSteps {
    Response  response;
    SoftAssert softAssert = new SoftAssert();
    private List<Map<String,String>> list1;

    @When("User send a POST request to create a country {string}")
    public void userSendAPOSTRequestToCreateACountry(String name) {

        Country countryForPost = new Country(name, null);

        response =           given().
                contentType(ContentType.JSON).
                auth().
                preemptive().
                basic("team07user", "S123456s?").
                body(countryForPost).
                when().
                put("https://www.gmibank.com/api/tp-countries");
        response.prettyPrint();
    }


    @Given("user verifies the country does not exists in database {string}")
    public void userVerifiesTheCountryDoesNotExistsInDatabase(String name) throws SQLException {

        list1=DBUtilsNew.getQueryAsAListOfMaps("SELECT * FROM public.tp_country WHERE name='"+name+"'");
        System.out.println(list1);
        Assert.assertTrue(list1.size()==0);

    }

    @Given("After creation HTTP Status Code should be {string}")
    public void after_creation_HTTP_Status_Code_should_be(String statusCode) {

        int expectedStatusCode = Integer.parseInt(statusCode);
        response.then().
                assertThat().
                statusCode(expectedStatusCode);
    }
    @Then("After creation user verifies the created country {string}")
    public void after_creation_user_verifies_the_created_country(String expectedCountry) throws Exception, SQLException {

        ObjectMapper objectMapper = new ObjectMapper();

        Country responseCountry= objectMapper.readValue(response.asString(), Country.class);


        System.out.println(responseCountry);
        String actualCountry =responseCountry.getName();
        System.out.println("Actual country: " + actualCountry);
        System.out.println("Expected country: " + expectedCountry);
//      Assert.assertEquals(expectedCountry,actualCountry);
        softAssert.assertEquals(actualCountry,expectedCountry);
        softAssert.assertAll();

        list1=DBUtilsNew.getQueryAsAListOfMaps("SELECT * FROM public.tp_country WHERE name='"+expectedCountry+"'");

        Assert.assertTrue(list1.get(0).get("name").equalsIgnoreCase(expectedCountry));
    }


}




