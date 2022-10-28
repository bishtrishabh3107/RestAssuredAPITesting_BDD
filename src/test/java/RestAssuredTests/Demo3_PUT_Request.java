package RestAssuredTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Demo3_PUT_Request {

    public static HashMap map=new HashMap();
    public static String id="1";

    @BeforeClass
    public static void putData(){
        map.put("title","iPhone Galaxy +1");
        RestAssured.baseURI="https://dummyjson.com/products";
        RestAssured.basePath="/"+id;
    }

    @Test
    public void testPut(){

        given()
                .contentType("application/json")
                .body(map)
                .when()
                .put()
                .then()
                .statusCode(200)
                .log().all();

    }
}
