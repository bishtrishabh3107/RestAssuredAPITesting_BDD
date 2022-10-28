package RestAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo5_BasicValidations_JSON {


    @Test
    public void testLogging(){
        when().get("https://dummyjson.com/products/1")
                .then().statusCode(200)
                .log().all();
    }



}
