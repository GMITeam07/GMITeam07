package steps;

import io.restassured.response.Response;
import org.junit.Test;
import pojos.AccountInfo;
import utilities.ApiUtils;

import java.util.List;

public class SampleStep {
    @Test
    public void test01(){
        Response response=ApiUtils.getRequest("admin","/api/account");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
        response.prettyPrint();
    }
    @Test
    public void test02(){
        Response response=ApiUtils.getRequest("admin","/api/tp-account-registrations");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
         AccountInfo accountInfo =response.as(AccountInfo.class);
         System.out.println(accountInfo);
    }

    @Test
    public void test03(){
        Response response=ApiUtils.getRequest("admin","/api/tp-account-registrations");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak

        List list=ApiUtils.getTpAccountRegistrations();
        list.stream().map(t->t).forEach(System.out::println);
    }

    @Test
    public void test04(){
        Response response=ApiUtils.getRequest("admin","/api/tp-customers");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
        response.prettyPrint();

    }
    @Test
    public void test05(){
        Response response=ApiUtils.getUserInfoByLoginId("team07admin");
        response.prettyPrint();
    }


}
