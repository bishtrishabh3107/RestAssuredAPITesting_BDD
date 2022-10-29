package RestAssuredTests;
/*
given()
        set cookies, add auth, add params, set headers info etc......
when()
        get, post, put, delete .....
then()
        validate status code, extract response, extract headers cookies & response body
 */


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Demo1_GetRequest {

    @Test
    public void getProductDetails(){
        given().when().get("https://dummyjson.com/products/1").
                then().statusCode(200).assertThat().body("title",equalTo("iPhone 9"));

    }


}
