package utilities;

import groovyjarjarpicocli.CommandLine;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import specs.Specs;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static Response getRequest(String userType,String endpoint){
        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("valid"+userType+"_username"),
                        ConfigReader.getProperty("valid"+userType+"_password")).
                spec(Specs.specMainUrl()).accept(ContentType.JSON).
                when().get(endpoint);
        return response;
    }

    public static Response getRequest(String username,String password, String endpoint){
        Response response=given().
                auth().
                preemptive().
                basic(username,password).
                spec(Specs.specMainUrl()).accept(ContentType.JSON).
                when().get(endpoint);
        return response;
    }




}
