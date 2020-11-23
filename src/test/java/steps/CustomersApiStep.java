package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.util.List;

import static io.restassured.RestAssured.given;

public class CustomersApiStep {
    Response response;
    Customer[] customers;
    Customer customer;



    @Given("user provides the api end point to set the response using {string}")
    public void userProvidesTheApiEndPointToSetTheResponseUsing(String arg0) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("validemployee_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigReader.getProperty("customer_api_url"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

  //      response.prettyPrint();

    }

    @Given("manipulate all customers' data")
    public void manipulateAllCustomersData() throws  Exception {
        ObjectMapper obj = new ObjectMapper();
             customers = obj.readValue(response.asString(),Customer[].class);

  //      List<Customer> customers = obj.readValue(response.asString(),List.class);
             System.out.println(customers[1].getUser());



    }

    @And("user sets the data in correspondent files")
    public void userSetsTheDataInCorrespondentFiles() {
//        WriteToTxt.saveDataInFileWithSSN("Customers.txt", customers);
    }

    @Then("user validates all data")
    public void userValidatesAllData() {
        List <Customer> list = ReadTxt.returnCustomerSNN("Customer.txt");
        String expected = "111-10-1000";

        int expectedNumberOfSsn = 0;
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getSsn().equals(expected)){
                System.out.println(list.get(i).getSsn());
                System.out.println("Foun " + ++expectedNumberOfSsn);
            }
        }

    }
}
