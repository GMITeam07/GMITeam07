package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_26_Step_Definitions {

    Response response;
    Response responseAfterPut;
    JsonPath json;
    List<Map<String,Object>> listOfCountries;
    Map country = new HashMap<String,Object>();

    @Given("User sends a GET request to api endpoint {string}")
    public void user_sends_a_get_request_to_api_endpoint(String url) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("validadmin_token")).
                when().
                get(url);

  //       response.prettyPrint();

        json =response.jsonPath();
    }

    @Given("User finds out the size of the country list")
    public void user_finds_out_the_size_of_the_country_list() {
        listOfCountries = response.as(ArrayList.class);
        System.out.println("Nb of countries :" + listOfCountries.size());
    }

    @Then("User sends a Put request to api endpoint {string} as {string}")
    public void user_sends_a_put_request_to_api_endpoint_as(String url, String Van) {

        country.put("id", 25561);
        country.put("name",Van);
        country.put("states",null);

        Response responseAfterPut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("validadmin_token")).
                body(country).
                when().
                put(url);

        responseAfterPut.prettyPrint();

        json =  responseAfterPut.jsonPath();


        responseAfterPut.then().
                assertThat().
                statusCode(200);

        Response responseAfterPutGetRequest = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("validadmin_token")).
                when().
                get(url+"/25561");

        responseAfterPutGetRequest.prettyPrint();

   }
}
