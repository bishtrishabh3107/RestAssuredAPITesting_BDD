package RestAssuredTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Demo2_POST_Request {

    public static HashMap map=new HashMap();

    @BeforeClass
    public static void postdata(){
        map.put("id",31);
        map.put("title","BMW Pencil");
        map.put("description", "Premium pencil from BMW");
        map.put("price", 45);

        RestAssured.baseURI="https://dummyjson.com/products";
        RestAssured.basePath="/add";

    }

    @Test
    public void testPost(){
        given()
                .contentType("application/json")
                .body(map)
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("title",equalTo("BMW Pencil"))
                .and()
                .body("price",equalTo(45));
    }



}
