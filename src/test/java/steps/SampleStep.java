package steps;

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
        System.out.println(ApiUtils.getAccountsAsList("admin"));
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
    public void rmzfeature(){
        LoginSteps loginSteps=new LoginSteps();
        UserSettingsPage userSettingsPage=new UserSettingsPage();
        loginSteps.userIsOnTheUserSetingsPageWithValidUsernameAndPassword("team07admin","S123456s?");
        Driver.waitForVisibility(By.id("settings-title"),3);
        System.out.println(userSettingsPage.firstnameTextBox.getAttribute("value"));

    }

    @Test
    public void apiStates() throws IOException {
        System.out.println( ApiUtils.getStateById(19226));

  //      System.out.println(ApiUtils.getUserByLogin("team07Admin"));
        System.out.println(ApiUtils.getUserByLogin("admin"));










    }


}
