package utilities;

import groovyjarjarpicocli.CommandLine;
import io.cucumber.messages.internal.com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.json.Json;
import pojos.Authority;
import pojos.Customer;
import pojos.User;
import specs.Specs;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public static User getUserByLoginName(String userLoginname){
        User user=new User();
        Response response=getRequest("admin","/api/users/"+userLoginname);
        user=response.as(User.class);
        return user;
    }

    public static Customer getCustomerById(int customerId){

       Response response=getRequest("admin","/api/customers/"+customerId);

        Customer customer=response.as(Customer.class);
        return customer;
    }






    public static void getAllUsersAsAList() throws IOException {
        Response response=getRequest("admin","/api/users");


//        JsonPath jsonPath=response.jsonPath();
//        List<User> users=response.as(List.class);
//        System.out.println(users);
//        for (int i=0;i<jsonPath.getList("id").size();i++){
//            User user=new User();
//            user.setId(Integer.parseInt(jsonPath.getList("id").get(i).toString()));
//            user.setLogin(jsonPath.getList("login").get(i).toString());
//            user.setFirstName(jsonPath.getList("firstname").get(i).toString());
//            user.setLastName(jsonPath.getList("lastname").get(i).toString());
//            user.setEmail(jsonPath.getList("email").get(i).toString());
//            user.setImageUrl(jsonPath.getList("imageurl").get(i).toString());
//            user.setActivated(Boolean.getBoolean(jsonPath.getList("activated").get(i).toString()));
//            user.setLangKey(jsonPath.getList("langKey").get(i).toString());
//            user.setCreatedBy(jsonPath.getList("createdBy").get(i).toString());
//            user.setCreatedDate(jsonPath.getList("createdDate").get(i).toString());
//            user.setLastModifiedBy(jsonPath.getList("lastModifiedBy").get(i).toString());
//            user.setLastModifiedDate(jsonPath.getList("astModifiedDate").get(i).toString());
//
//            System.out.println(user);
//
//        }
//        users.stream().map(t->t.getId()+" , " +t.getLastModifiedDate()).forEach(System.out::println);





    }
}
