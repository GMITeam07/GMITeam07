package specs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Specs {

    public static RequestSpecification specGmiBank(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        return requestSpecBuilder.setBaseUri(
                "https://gmibank.com").build();
    }
    public static RequestSpecification specMainUrl(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        return requestSpecBuilder.setBaseUri(
                "https://www.gmibank.com").build();
    }

}
