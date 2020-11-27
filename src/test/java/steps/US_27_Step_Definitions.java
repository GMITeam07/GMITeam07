package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class US_27_Step_Definitions {
    Response responseBeforeDelete;
    JsonPath json;
    Response responseAfterDelete;


    @Given("User sends a GET request to REST API endpoint {string}")
    public void user_sends_a_get_request_to_rest_api_endpoint(String string) {

        responseBeforeDelete = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty ("validadmin_token")).
                when().
                get(string);
        responseBeforeDelete.prettyPrint();

//        System.out.println(responseBeforeDelete.getBody().asString());

        json = responseBeforeDelete.jsonPath();

    }

    @Then("Before delete request HTTP Status Code should be {string}")
    public void before_delete_request_http_status_code_should_be(String string) {
        int expectedStatusCode = Integer.parseInt(string);
        responseBeforeDelete.then().
                assertThat().
                statusCode(expectedStatusCode);
    }

    @Then("Before delete request response format should be {string}")
    public void before_delete_request_response_format_should_be(String string) {
        Assert.assertEquals(string,responseBeforeDelete.getContentType());
        System.out.println(responseBeforeDelete.getContentType());

    }

    @Then("Before delete request id should be {string}")
    public void before_delete_request_id_should_be(String string) {
        int actualId = json.getInt("id");
        int expectedId = Integer.parseInt(string);
//        System.out.println("Actual id: " + actualId);
//        System.out.println("Expected id: " + expectedId);
        Assert.assertEquals(expectedId,actualId);

    }

    @Then("Before delete request name should be {string}")
    public void before_delete_request_name_should_be(String string) {
        String actualName = json.getString("name");
//        System.out.println("Actual name: " + actualName);
        Assert.assertEquals(string,actualName);
    }


    @Given("User sends a DELETE request to REST API endpoint {string}")
    public void user_sends_a_delete_request_to_rest_api_endpoint(String string) {
        responseAfterDelete = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("validadmin_token")).
                when().
                delete(string);
        responseAfterDelete.prettyPrint();
        json = responseAfterDelete.jsonPath();

    }

    @Then("After delete request HTTP Status Code should be {string}")
    public void after_delete_request_http_status_code_should_be(String string) {
        int expectedStatusCode = Integer.parseInt(string);
        int actualStatusCode = responseAfterDelete.statusCode();
        Assert.assertEquals(actualStatusCode,expectedStatusCode);
    }

    @Then("After delete request response format should be {string}")
    public void after_delete_request_response_format_should_be(String string) {
        String actualContentType= responseAfterDelete.getContentType();
        String expectedContentType = string;
        System.out.println(expectedContentType);
        Assert.assertNotEquals(actualContentType,expectedContentType);

    }

    @Then("After delete request response after delete should contain nothing")
    public void after_delete_request_response_after_delete_should_contain_nothing() {
        Assert.assertTrue(responseAfterDelete.getBody().asString().isEmpty());
    }

}
