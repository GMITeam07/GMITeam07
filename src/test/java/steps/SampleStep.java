package steps;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.Account;
import pojos.User;
import pojos.UserInfo;
import utilities.ApiUtils;

import java.io.IOException;
import java.util.List;

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
        // get a single user as a user and print the "user" and the "firstname"
        User user=ApiUtils.getUserByLoginName("betteam08");
        System.out.println(user);
        System.out.println(user.getFirstName());

    }

    @Test
    public void test07() throws IOException {
        System.out.println(ApiUtils.getCustomerById(2554));
    }

}
