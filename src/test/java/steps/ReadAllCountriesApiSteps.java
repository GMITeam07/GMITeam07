package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.Country;
import utilities.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ReadAllCountriesApiSteps {

    Response response;
    JsonPath json;
    List<Map<String, Object>> allCountryData;
    private List<Map<String,String>> list1;

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

         //response.prettyPrint();

    }


    @And("compare Database and API country numbers")
    public void compareDatabaseAndAPICountryNumbers() throws SQLException {

        int actualcountrycountofDB = DBUtilsNew.getAllCountriesAsAList().size();
        System.out.println("DB Country Count: " +  actualcountrycountofDB);

        int actualCountryCountAPI = ApiUtils.getCountriesAsList().size();
        System.out.println("API COuntry Count: " + actualCountryCountAPI );

        Assert.assertEquals(actualcountrycountofDB, actualCountryCountAPI);

    }


    @Then("user validates all data for countries'")
    public List<Country> user_validates_all_data_for_countries() throws IOException, SQLException {

        List<Country> list = DBUtilsNew.getAllCountriesAsAList();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        return list;

    }

    @Then("user verifies all countries one by one {string}")
    public List<Country> userVerifiesAllCountriesBy(String allCountry) throws SQLException {

        List<Country> list = DBUtilsNew.getAllCountriesAsAList();
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        String APICountryCount = ApiUtils.getCountriesAsList().toString();
        Assert.assertEquals(list.toString(), APICountryCount.toString());

        return list;
    }
    }



