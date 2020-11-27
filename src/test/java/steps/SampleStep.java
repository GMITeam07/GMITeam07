package steps;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.*;
import specs.Specs;
import utilities.*;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        ApiUtils.getAccountsAsList("admin").stream().
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

        List<Customer> allCustomers= ApiUtils.getCustomersAsList("admin");
        System.out.println(allCustomers.get(0).toString());

        allCustomers.stream().
                map(t->t).
                forEach(System.out::println);
    }

    @Test
    public void getCustomerById() throws IOException {
        System.out.println(ApiUtils.getCustomerById(2553));
    }

    @Test
    public void apiStates() throws IOException {



        Map map=new HashMap();

        map.put("ssn","123321234");
        map.put("firstName","John");
        map.put("lastName","Travolta");
        map.put("email","johntravolta101@zmail.com");
        map.put("address","46 Butmayin road");
        map.put("phonenumber","1233221235");
        map.put("userName","team07user101");
        map.put("password","D123456d!!");

        Response response=given().
                auth().
                preemptive().
                basic(
                        ConfigReader.getProperty("validadmin_username"),
                        ConfigReader.getProperty("validadmin_password")).
                headers(map).
                spec(Specs.specMainUrl()).
                accept(ContentType.JSON).
                when().
                post("/api/users");

        response.prettyPrint();
//        User user=ApiUtils.getUserByLogin("team07user101");
//        System.out.println(user);

    }

    @Test
    public void getToken() throws AWTException {
        System.out.println(ApiUtils.getUserByLogin("firstuser"));
    }

    @Test
    public void sampleDB() throws SQLException {
//        String query="SELECT * FROM public.tp_state";
//        DBUtilsNew.getQueryAsAListOfMaps(query).
//                stream().map(t->t).
//                forEach(System.out::println);

//        String query2="SELECT * FROM public.tp_state WHERE id>=19240";
//        DBUtilsNew.getQueryAsAListOfMaps(query2).
//                stream().map(t->t).
//                forEach(System.out::println);

//        String query3="SELECT * FROM public.tp_country";
//
//        DBUtilsNew.getQueryAsAListOfMaps(query3).
//                stream().map(t->t).
//                forEach(System.out::println);
//
//        DBUtilsNew.getQueryAsAListOfMaps("SELECT id FROM Jhi_user WHERE login = 'team07admin1001'").
//                stream().map(t->t).
//                forEach(System.out::println);
//
//        String queryDeletion="DELETE FROM public.jhi_user WHERE login='"+"team07admin1001"+"';";
//        DBUtilsNew.executeQuery(queryDeletion);

//        Country country=new Country();
//        country.setName("Ghana Republic");
//        country.setId(12378);
//        country.setStates("1stState");




        DBUtilsNew.getQueryAsAListOfMaps("SELECT * FROM public.jhi_user WHERE last_name LIKE '%Kelly%'").
                stream().
//                filter(t->t.get("last_name").equalsIgnoreCase("Kelly")).
                map(t->t).
                forEach(System.out::println);

    }

}
