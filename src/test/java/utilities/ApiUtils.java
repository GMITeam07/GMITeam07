package utilities;

import groovyjarjarpicocli.CommandLine;
import io.cucumber.messages.internal.com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import specs.Specs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static List<Map> getTpAccountRegistrations(){
        Response response=ApiUtils.getRequest("admin","/api/tp-account-registrations");
        JsonObject jsonObject=new JsonObject();

        Map map=new HashMap<>();
        map.put("id",0);
        map.put("ssn","");
        map.put("firstname","");
        map.put("lastname","");
        map.put("address","");
        map.put("mobilePhoneNumber","");
        map.put("userId",0);
        map.put("userName","");
        map.put("email","");
        map.put("createDate","");
        List<Map> list=response.as(List.class);


        return list;
    }

    public static Response getUserInfoByLoginId(String login){

        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().get("/api/users/"+login);

        return response;
    }


}
