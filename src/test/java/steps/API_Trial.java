package steps;

import static io.restassured.RestAssured.*;


import io.restassured.response.Response;
import org.junit.Test;

public class API_Trial {
    @Test
    public void getRequest01() {
        Response response = (Response) given().
                            when().
                                get("https://restful-booker.herokuapp.com/booking/1");
        response.then().assertThat().statusCode(418).contentType("application/JSON");
        response.prettyPrint();
        System.out.println(response.getSessionId());
    }
}
