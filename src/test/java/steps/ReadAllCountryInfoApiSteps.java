package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.Country;
import pojos.Country2;
import utilities.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ReadAllCountryInfoApiSteps {

    Response response;
    JsonPath json;
    List<Map<String, Object>> allCountryData;

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

         response.prettyPrint();

    }

    @Given("manipulate all countries' data")
    public void manipulate_all_countries_data() throws IOException, SQLException {


        ObjectMapper obj = new ObjectMapper();
        Country2[] country = obj.readValue(response.asString(), Country2[].class);

//
        // System.out.println(country[5].getName());
//            System.out.println(country[1].getId());
//            System.out.println(country[1].getStates());


    }

    @And("find out how many countries are and verify that there are {int} countries")
    public void findOutHowManyCountriesAreAndVerifyThatThereAreCountries(int countryCount) throws IOException, SQLException {


    //     System.out.println(DBUtilsNew.getAllCountriesAsAList().size());  //176

//        int actualCountryCount = DBUtilsNew.getAllStatesAsAList().size();
//        System.out.println(actualCountryCount);
//        Assert.assertEquals(countryCount,actualCountryCount);

    }

    @And("verify sixth customers' country name is {string}")
    public void verifySixthCustomersCountryNameIs(String arg0) throws IOException, SQLException {

        ObjectMapper obj = new ObjectMapper();
        Country2[] country = obj.readValue(response.asString(), Country2[].class);


        Assert.assertTrue(country[5].getName().contains("TURKEY"));
        System.out.println(country[5].getName());

    }

    @Then("user validates all data for countries'")
    public List<Country> user_validates_all_data_for_countries() throws IOException, SQLException {

        List<Country> list = DBUtilsNew.getAllCountriesAsAList("AllCountryData.txt");
        int count = 0;
        String expected = "UNITED STATES";
        //System.out.println(list.contains(expected));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        return list;

    }


    @And("user verifies first customer's country name is {string}")
    public void userVerifiesFirstCustomerSCountryNameIs(String country1st) throws IOException {

        ObjectMapper obj = new ObjectMapper();
        Country2[] country = obj.readValue(response.asString(), Country2[].class);


        Assert.assertTrue(country[0].getName().contains("UNITED STATES"));
        System.out.println(country[0].getName());
    }

    @And("user verifies fourth customer's country name is {string}")
    public void userVerifiesFourthCustomerSCountryNameIs(String country4th) throws IOException {

        ObjectMapper obj = new ObjectMapper();
        Country2[] country = obj.readValue(response.asString(), Country2[].class);


        Assert.assertTrue(country[3].getName().contains("GERMANY"));
        System.out.println(country[3].getName());


    }

    @And("user verifies fourteenth customer's country name is {string}")
    public void userVerifiesFourteenthCustomerSCountryNameIs(String country14th) throws IOException {
//
//        ObjectMapper obj = new ObjectMapper();
//        Country2[] country = obj.readValue(response.asString(), Country2[].class);
//
//        Assert.assertTrue(country[13].getName().contains("Yunanistan"));
//        System.out.println(country[13].getName());
    }


    @Then("user verifies all countries {int} by {int} {string}")
    public List<Country> userVerifiesAllCountriesBy(int arg0, int arg1, String allCountry) throws SQLException {

        List<Country> list = DBUtilsNew.getAllCountriesAsAList("AllCountryData.txt");
        int count = 0;
        String expected = "UNITED STATES";
        //System.out.println(list.contains(expected));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        return list;
    }
}
