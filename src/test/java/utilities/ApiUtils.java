package utilities;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.*;
import specs.Specs;

import java.io.IOException;
import java.util.List;
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
//                oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMDdhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjA1OTI2NTU4fQ.lGr6aw4fMZRBY9Ghy4NtoTBaWZdsybLU4FOGGRZx66t5WDbAk3GePCHutlDeNcYsFoCxPSc1RxRH_2Q9g6LnSg").
                spec(Specs.specMainUrl()).accept(ContentType.JSON).
                when().get(endpoint);

        return response;
    }

    public static Response getRequest(String username,
                                      String password,
                                      String endpoint){
        Response response=given().
                auth().
                preemptive().
                basic(username,password).
//                oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMDdhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjA1OTI2NTU4fQ.lGr6aw4fMZRBY9Ghy4NtoTBaWZdsybLU4FOGGRZx66t5WDbAk3GePCHutlDeNcYsFoCxPSc1RxRH_2Q9g6LnSg").
                spec(Specs.specMainUrl()).accept(ContentType.JSON).
                when().get(endpoint);
        return response;
    }



    /* ----------------------------------------------*/
    public static Country getCountryById(int countryId){
        Country country=new Country();
        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().get("/api/tp-countries/1");
        country=response.as(Country.class);
        return country;
    }

    public static List<Country> getCountriesAsList() {
        //This works properly final....
        Response response = given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().get("/api/tp-countries");
        List<Country> list = response.getBody().jsonPath().getList("", Country.class);
        List<Country> countryList = list.stream().
                map(t ->
                {
                    Country country = t;
                    return t;
                }).
                collect(Collectors.toList());
        return countryList;
    }

    public static Country getCountryByCountryName(String countryName){
        return getCountriesAsList().stream().
                filter(t->t.getName().equalsIgnoreCase(countryName)).
                map(t->t).collect(Collectors.toList()).get(0);
    }
    /*----------------------------------------------------------------------------*/
    public static void createUserByApi(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("ssn","123-32-1234");
        jsonObject.addProperty("firstName","John");
        jsonObject.addProperty("lastName","Travolta");
        jsonObject.addProperty("email","johntravolta101@zmail.com");
//        jsonObject.addProperty("imageUrl","zzzzzzzzzzzz");
        jsonObject.addProperty("address","46 Butmayin road");
        jsonObject.addProperty("phonenumber","123-322-1235");
        jsonObject.addProperty("userName","team07user101");
        jsonObject.addProperty("password","S123456s!");

        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().post("/api/users");


    }

    public static User getUserByLogin(String login){
        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().get("/api/users/"+login);
        User user=response.as(User.class);
        return user;
    }

    public static List<User> getUsersAsList(String userType){
        Response response=getRequest(userType, "/api/users");

        List<User> list=response.getBody().jsonPath().getList("",User.class);
                List<User> userList=list.stream().
                map(t->
                {
                    User user=t;
                    return t;
                }).
                collect(Collectors.toList());
        return userList;
    }


    public static User getUserByUserId(int userId){
        return getUsersAsList("admin").stream().
                filter(t->t.getId()==userId).
                findAny().
                get();


    }


    /*-------------------------------------------------------------------------------*/
    public static Response getTpAccountRegistrations(){
        Response response=ApiUtils.getRequest("admin","/api/tp-accounts");
        return response;
    }

    public static Account getAccountByAccountId(String username, String password, int accountId){
        Response response=getRequest(username, password, "/api/tp-accounts/"+accountId);
        Account account=response.as(Account.class);
        return account;
    }

    public static Account getAccountByAccountId(String userType,int accountId){
        Response response=getRequest(userType, "/api/tp-accounts/"+accountId);
        Account account=response.as(Account.class);
        return account;
    }

    public static List<Account> getAccountsAsList(String userType) throws IOException {
        Response response=getRequest(userType, "/api/tp-accounts");

        List<Account> list=response.getBody().jsonPath().getList("",Account.class);
        List<Account> accountList=list.stream().
                map(t->
                {
                    Account account=t;
                    return t;
                }).
                collect(Collectors.toList());
        return accountList;
    }
    /*--------------------------------------------------------------------------------*/

    public static Customer getCustomerById(int customerId){
        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().get("/api/tp-customers/"+customerId);
        response.prettyPrint();
        Customer customer=response.as(Customer.class);
        return customer;
    }

    public static List<Customer> getCustomersAsList(String userType){
        Response response=getRequest(userType, "/api/tp-customers");

        List<Customer> list=response.getBody().jsonPath().getList("",Customer.class);
        List<Customer> customerList=list.stream().
                map(t->
                {
                    Customer customer=t;
                    return t;
                }).
                collect(Collectors.toList());
        return customerList;
    }
    /*------------------------------------------------------------------------*/

    public static State getStateById(int stateId){

        Response response=
                given().
                        auth().
                        preemptive().
                        basic("team07admin","S123456s?").
                        accept(ContentType.JSON).
                        when().
                        get("https://www.gmibank.com/api/tp-states/"+stateId);

        State state=response.as(State.class);

        return state;

    }

    public static List<State> getStatesAsList(){
        Response response=
                given().
                        auth().
                        preemptive().
                        basic("team07admin","S123456s?").
                        accept(ContentType.JSON).
                        when().
                        get("https://www.gmibank.com/api/tp-states");

        List<State> listOfStates=response.jsonPath().getList("",State.class);

        return listOfStates;
    }



}
