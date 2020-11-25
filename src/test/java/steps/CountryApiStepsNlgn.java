package steps;

//import gmibank.utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.WriteToTxt;
import utilities.WriteToTxtIbr;

import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;
public class CountryApiStepsNlgn {
        Response response;
        JsonPath json;
        List<Map<String,Object>> allCustomerData;
        @Given("use api end point  {string}")
        public void use_api_end_point(String endpointUrl) {
            response = given().
                    accept(ContentType.JSON).
                    auth().oauth2(ConfigReader.getProperty("token")).
                    when().
                    get(endpointUrl);
//    Eger post, put, patch request yapiyorsak accept type yerine ==> content type kullanmaliyiz.
//    get ve delete de ==> accept type kullanabiliriz.
            response.
                    then().
                    assertThat().
                    statusCode(200);
//        response.prettyPrint();
            json = response.jsonPath();
        }
        @Given("get all countries' information as De-Serialization")
        public void get_all_countries_information_as_De_Serialization() {
//    1. yontem ==> JsonPath
//    2. yontem ==> Pojo
            //    1. yontem ==> JsonPath
            allCustomerData = json.getList("$"); // butun data elimizde
            System.out.println("Java List Map response: " + allCustomerData);
            System.out.println("First customer info: " + allCustomerData.get(0));
            System.out.println("First customer firstname: " + allCustomerData.get(0).get("firstName"));
            String customerLatsname= allCustomerData.get(2).get("lastName").toString();
            System.out.println("customer Lastname: " + customerLatsname);
            int id = (int) allCustomerData.get(0).get("id");
            System.out.println("customer id: "  + id);
        }
        @Given("find out how many customers are and verify that there are {int} customers")
        public void find_out_how_many_customers_are_and_verify_that_there_are_customers(Integer customerCount) {
            Integer actualCustumerCount =  allCustomerData.size();
            Assert.assertEquals(customerCount,actualCustumerCount);
        }
        @Given("get all the information of the seventh customer")
        public void get_all_the_information_of_the_seventh_customer() {
            System.out.println(allCustomerData.get(6));
            WriteToTxt.saveDataInFileWithJsonListMap("AllCountry",allCustomerData);
        }
        @Given("verify seventh customers ssn is {string} and country name is {string}")
        public void verify_seventh_customers_ssn_is_and_country_name_is(String expectedSsn, String expectedCountryName) {
            String actualSsn = allCustomerData.get(6).get("ssn").toString();
            Assert.assertEquals(expectedSsn,actualSsn);
            String actualCountryName = json.getString("country[6].name");
            Assert.assertEquals(expectedCountryName,actualCountryName);
        }
        @Given("verify first customer's firstName {string}")
        public void verify_first_customer_s_firstName(String expectedFirstname) {
            Assert.assertEquals(expectedFirstname,allCustomerData.get(0).get("firstName"));
        }
        @Given("verify second customer's lastName {string}")
        public void verify_second_customer_s_lastName(String expectedLastname) {
            String actualLastname = allCustomerData.get(1).get("lastName").toString();
            Assert.assertEquals(expectedLastname,actualLastname);
        }
        @Given("verify fifth customer's country {string}")
        public void verify_fifth_customer_s_country(String expectedCountry) {
            String actualCountry = json.getString("country[4].name");
            Assert.assertEquals(expectedCountry,actualCountry);
        }
        @Given("verify last customer's user email {string}")
        public void verify_last_customer_s_user_email(String expectedEmail) {
            String actualEmail = allCustomerData.get(allCustomerData.size()-1).get("email").toString();
            Assert.assertEquals(expectedEmail,actualEmail);
        }
    }


