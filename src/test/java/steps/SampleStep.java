package steps;

import io.restassured.response.Response;
import org.junit.Test;
import pojos.AccountInfo;
import utilities.ApiUtils;

public class SampleStep {
    @Test
    public void test01(){
        Response response=ApiUtils.getRequest("admin","/api/account");  // endpoint e ne yazarsanız cevap gelip cıktı alıcak
//         AccountInfo accountInfo=response.as(AccountInfo.class);
//         System.out.println(accountInfo);
        response.prettyprint();
    }
}
