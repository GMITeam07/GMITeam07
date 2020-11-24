package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Customer;
import pojos.User;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CustomersApiStep {
    Response response;
    Customer[] customersArray;
    JsonPath jsonPath;
    List<Map<String,Object>> customersMap;
    private User initialUIUser=new User();
    private User initialAPIUser=new User();
    private User initialDBUser=new User();

    private User editedUIUser=new User();
    private User editedAPIUser=new User();
    private User editedDBUser=new User();



    @Given("user provides the api end point to set the response using {string}")
    public void userProvidesTheApiEndPointToSetTheResponseUsing(String arg0) {
//        response = given().headers(
//                "Authorization",
//                "Bearer " + ConfigReader.getProperty("validemployee_token"),
//                "Content-Type",
//                ContentType.JSON,
//                "Accept",
//                ContentType.JSON)
//                .when()
//                .get(ConfigReader.getProperty("customer_api_url"))
//                .then()
//                .contentType(ContentType.JSON)
//                .extract()
//                .response();


        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("validemployee_token")).
                when().
                get(ConfigReader.getProperty("customer_api_url"));

//          response.prettyPrint();

    }

    @Given("manipulate all customers' data")
    public void manipulateAllCustomersData() throws  Exception {
        ObjectMapper obj = new ObjectMapper();
                                    // 1. Yol
             customersArray = obj.readValue(response.asString(),Customer[].class);
             for (int i = 0; i < customersArray.length; i++)
//             System.out.println(customersArray[i]);
                                    // 2. Yol
            jsonPath = response.jsonPath();
            customersMap = jsonPath.getList("$"); // tum data'yi aldim ve map'e koyudum.
//            System.out.println(customersMap);
        String countr3id = jsonPath.getString("country[3].id");
//        System.out.println(countr3id);





    }

    @And("user sets the data in correspondent files")
    public void userSetsTheDataInCorrespondentFiles() {
 //       WriteToTxt.saveDataInFileWithSSN("Customers.txt", customers);
    }

    @Then("user validates all data")
    public void userValidatesAllData() {


    }

    @Then("user validates all data one by one")
    public void userValidatesAllDataBy(int arg0, int arg1) {

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
