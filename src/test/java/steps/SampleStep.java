package steps;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.Account;
import pojos.Accounts;
import pojos.UserInfo;
import specs.Specs;
import utilities.ApiUtils;
import utilities.ConfigReader;
import utilities.DBUtils;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SampleStep {
    //added a trial sentence for git
    @Test
    public void test01(){
        Response response=ApiUtils.
                getRequest("admin","/api/account");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
//        response.prettyPrint();
        UserInfo userInfos=response.as(UserInfo.class);
        System.out.println(userInfos.toString());
    }

    @Test
    public void test02(){
        Response response=ApiUtils.
                getRequest("admin","/api/tp-account-registrations");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
         UserInfo userInfo =response.as(UserInfo.class);
         System.out.println(userInfo);
    }

    @Test
    public void test03(){
        Response response=ApiUtils.
                getRequest("admin","/api/tp-account-registrations/1251");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak

        response.prettyPrint();
//        List list=ApiUtils.getTpAccountRegistrations();
//        list.stream().map(t->t).forEach(System.out::println);
    }

    @Test
    public void test04(){
        Response response=ApiUtils.
                getRequest("admin","/api/tp-customers");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
        response.prettyPrint();

    }
    @Test
    public void test05(){
        Response response=ApiUtils.getUserInfoByLoginId("team07admin");
        response.prettyPrint();
    }

    @Test
    public void test06(){
//        DBUtils.createConnection();
//
//        List list=(DBUtils.getQueryResultList("SELECT * FROM public.tp-customers"));
//        list.stream().map(t->t.toString()).forEach(System.out::println);

        System.out.println("-------lets see the difference of DataBase and API---------------");

//        Response response=ApiUtils.getRequest("admin","/api/tp-customers");
        Response response=given().
                auth().
                preemptive().
                basic("team07admin","S123456s?"  ).
                accept(ContentType.JSON).
                when().get("https://www.gmibank.com/api/tp-accounts/3964");
//        response.prettyPrint();
        List<Account> accountList=response.as(List.class);
        JsonPath jsonPath=response.jsonPath();




    }


}
