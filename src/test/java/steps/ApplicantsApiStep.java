package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApplicantsApiStep {
    Response response;
    JsonPath jsonPath;
    List<Map<String,Object>> applicantsMap;


    @Given("user provides the api endpoint to set the response using {string}")
    public void userProvidesTheApiEndpointToSetTheResponseUsing(String applicants_api_url) {
        //        response = given().headers(
//                "Authorization",
//                "Bearer " + ConfigReader.getProperty("validemployee_token"),
//                "Content-Type",
//                ContentType.JSON,
//                "Accept",
//                ContentType.JSON)
//                .when()
//                .get(ConfigReader.getProperty(applicants_api_url))
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();


        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("validemployee_token")).
                when().
                get(ConfigReader.getProperty(applicants_api_url));

 //                response.prettyPrint();

    }

    @Given("manipulate all applicants' data")
    public void manipulate_all_applicants_data() throws IOException, SQLException {
        jsonPath = response.jsonPath();
        applicantsMap = jsonPath.getList("$");

    }

    @Then("user validates all applicants data")
    public void user_validates_all_applicants_data() throws SQLException {
 //       WriteToTxt.saveDataInFileWithJsonListMap("User.txt", applicantsMap);
        ReadTxt.returnApplicantsData("User.txt", "ssn");

    }

    @Then("user validates all applicants data one by one")
    public void user_validates_all_applicants_data_one_by_one() {
        Assert.assertTrue(ReadTxt.returnApplicantsData("User.txt", "ssn").contains(applicantsMap.get(0).get("ssn")));
        Assert.assertEquals(Integer.parseInt(ReadTxt.returnApplicantsData("User.txt", "id").get(3)),applicantsMap.get(3).get("id"));
        Assert.assertTrue(ReadTxt.returnApplicantsData("User.txt", "firstname").contains(applicantsMap.get(21).get("firstName")));
        Assert.assertTrue(ReadTxt.returnApplicantsData("User.txt", "lastname").contains(applicantsMap.get(7).get("lastName")));
        Assert.assertTrue(ReadTxt.returnApplicantsData("User.txt", "phonenumber").contains(applicantsMap.get(9).get("mobilePhoneNumber")));
        Assert.assertEquals(Integer.parseInt(ReadTxt.returnApplicantsData("User.txt", "userid").get(11)), (applicantsMap.get(11).get("userId")));
        Assert.assertEquals(ReadTxt.returnApplicantsData("User.txt", "email").get(13), (applicantsMap.get(13).get("email")));
        Assert.assertEquals(ReadTxt.returnApplicantsData("User.txt", "address").get(17),applicantsMap.get(17).get("address"));


    }



}
