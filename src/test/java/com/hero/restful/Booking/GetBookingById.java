package com.hero.restful.Booking;

import com.hero.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookingById extends TestBase {


    @Test
    public void getBookingById(){

        Response response = given()
                .header("Content-Type","applicationj/son")
                .header("id",1)
                .when()
                .get("booking/{id");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}
