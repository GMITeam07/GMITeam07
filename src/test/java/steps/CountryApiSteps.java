package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Country2;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CountryApiSteps {

    Response response;
    JsonPath json;
    List<Map<String,Object>> allCountryData;
    @Given("user provides the api end point to set the response using {string}")
    public void user_provides_the_api_end_point_to_set_the_response_using(String endpoint) {

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
                   .get(endpoint)
                   .then()
                   .contentType(ContentType.JSON)
                   .extract()
                   .response();

          //  response.prettyPrint();

    }

    @Given("manipulate all countries' data")
    public void manipulate_all_countries_data() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        Country2[] country = obj.readValue(response.asString(), Country2[].class);

  //      allCountryData = json.getList("$");

        System.out.println(country[1].getName());
            System.out.println(country[1].getId());
            System.out.println(country[1].getStates());


    }

    @And("find out how many countries are and verify that there are {int} countries")
    public void findOutHowManyCountriesAreAndVerifyThatThereAreCountries(int arg0) throws IOException {



       //System.out.println(allCountryData.size());
//
//
////        Integer country =  allCountryData.size();
//        Assert.assertEquals(country,actualcountrycount);


    }
    @And("verify tenth customers' country name is {string}")
    public void verifyTenthCustomersCountryNameIs(String arg0) {

//        System.out.println(allCountryData.get(9));
//        WriteToTxt.saveDataInFileWithAllCountryInfo("AllCountryData.txt", allCountryData);


    }
    @Then("user validates all data for countries'")
    public void user_validates_all_data_for_countries() throws IOException {

        List<Country2> list = ReadTxt.readTextData("AllCountryData.txt");
        int count =0;
        String expected = "UNITED STATES";
        //System.out.println(list.contains(expected));
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i).getName());

        }
    }

    }
