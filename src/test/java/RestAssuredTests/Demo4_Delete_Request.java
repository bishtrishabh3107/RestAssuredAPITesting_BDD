package RestAssuredTests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo4_Delete_Request {



    @Test
    public void deleteEmployeeRecord(){

        RestAssured.baseURI="https://dummyjson.com/products";
        RestAssured.basePath="/30";

        given()
                .when().delete()
                .then().statusCode(200)
                .log().all()
                .extract().response();


    }
}
