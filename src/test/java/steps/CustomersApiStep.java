package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Customer;
import utilities.ConfigReader;
import utilities.DBUtilsNew;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CustomersApiStep {
    Response response;
    Customer[] customersArray;
    JsonPath jsonPath;
    List<Map<String,Object>> customersMap;
    ObjectMapper obj;
    String query;


    @Given("user provides the api end point to set the response using {string} ApiUrl")
    public void userProvidesTheApiEndPointToSetTheResponseUsingApiUrl(String api_url) {
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
                get(ConfigReader.getProperty(api_url));

 //         response.prettyPrint();

    }

    @Given("manipulate all customers' data")
    public void manipulateAllCustomersData() throws IOException, SQLException {
        obj = new ObjectMapper();
                                    // 1. Yol
             customersArray = obj.readValue(response.asString(),Customer[].class);

                                    // 2. Yol
            jsonPath = response.jsonPath();
            customersMap = jsonPath.getList("$");

                                    // 3.Yol
            query = "SELECT * FROM "+ ConfigReader.getProperty("customerTableName");
            DBUtilsNew.getQueryAsAListOfMaps(query);
    }


    @Then("user validates all data")
    public void userValidatesAllData() throws SQLException {

        for (int i = 0; i < customersArray.length; i++){
            Assert.assertEquals(customersArray[i].getLastName(),customersMap.get(i).get("lastName"));
            Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(i).get("first_name"),customersMap.get(i).get("firstName"));
            Assert.assertEquals(customersArray[i].getSsn(),customersMap.get(i).get("ssn"));
            Assert.assertEquals(customersArray[i].getCity(),customersMap.get(i).get("city"));
            Assert.assertEquals(customersArray[i].getMobilePhoneNumber(), DBUtilsNew.getQueryAsAListOfMaps(query).get(i).get("mobile_phone_number"));
            Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(i).get("zip_code"),customersArray[i].getZipCode());
            Assert.assertEquals(customersArray[i].getId(),customersMap.get(i).get("id"));
            Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(i).get("middle_initial"),customersMap.get(i).get("middleInitial"));

        }

    }

    @Then("user validates all data one by one")
    public void userValidatesAllDataBy() throws SQLException, IOException {
        Assert.assertEquals(customersArray[1].getLastName(),customersMap.get(1).get("lastName"));
        Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(3).get("first_name"),customersMap.get(3).get("firstName"));
        Assert.assertEquals(customersArray[11].getSsn(),customersMap.get(11).get("ssn"));
        Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(19).get("email"),customersMap.get(19).get("email"));
        Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(0).get("address"),customersMap.get(0).get("address"));
        Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(13).get("phone_number"),customersMap.get(13).get("phoneNumber"));
        Assert.assertEquals(customersArray[8].getCity(),customersMap.get(8).get("city"));
        Assert.assertEquals(DBUtilsNew.getQueryAsAListOfMaps(query).get(4).get("state"),customersMap.get(4).get("state"));
        Assert.assertEquals(customersArray[6].getId(),customersMap.get(6).get("id"));
    }
}
