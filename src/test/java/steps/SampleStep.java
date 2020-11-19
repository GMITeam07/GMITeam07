package steps;

import io.cucumber.messages.internal.com.google.gson.JsonObject;
import io.cucumber.messages.internal.com.google.protobuf.Api;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.UserSettingsPage;
import pojos.*;
import utilities.ApiUtils;
import utilities.Driver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SampleStep {
    @Test
    public void getAUserOverApi(){
        System.out.println(
                ApiUtils.getUsersAsList("admin"));

    }

    @Test
    public void getAccountOverApi(){
        Account account1=ApiUtils.getAccountByAccountId(
                "admin",
                2303);

        Account account2=ApiUtils.getAccountByAccountId(
                "team07admin",
                "S123456s?",
                2304);
        System.out.println(account1);
        System.out.println(account2);
    }

    @Test
    public void getaccountsByList() throws IOException {
        // getting all bank accounts as list
        List list=ApiUtils.getAccountsAsList("admin");
        list.stream().

                map(t->t).forEach(System.out::println);
    }

    @Test
    public void getCountriesAsList() throws IOException {

        List<Country> list= ApiUtils.getCountriesAsList();

        System.out.println(list.get(5).getName());
        list.stream().
                map(t->t).
                forEach(System.out::println);
    }

    @Test
    public void getCustomersByList() throws IOException {
////        List<Customer> allCustomers= ApiUtils.getCustomersAsList("admin");
////        System.out.println(allCustomers.get(0).toString());
////        allCustomers.stream().
////                map(t->t).
////                forEach(System.out::println);
//        System.out.println(ApiUtils.getCustomerById(2552));

    }
    @Test
    public void apiStates(){
    int stateId = 19226;
                Response response =
                        given().
                        auth().
                        preemptive().
                        basic("team07admin", "S123456s?").
                        accept(ContentType.JSON).
                        when().
                        get("https://www.gmibank.com/api/tp-states/"+stateId);
   //             response.prettyPrint();
  //             System.out.println(response.getHeaders());
        //       System.out.println("Status code: " + response.getStatusCode());
  //             System.out.println(response.getBody());

  //      JsonPath jsonPath =response.jsonPath();
  //      System.out.println(jsonPath.get("id").toString());

//        State state = new State();
//        state =response.as(State.class);
//
//        System.out.println(state.getId());
//
  //      List list = response.as(List.class);

   //     System.out.println(list);

//        List <State>list = response.jsonPath().getList("", State.class);
//        System.out.println(list.get(0).getId());

       State state =response.as(State.class);
        System.out.println(state);


    }
    }



