package com.hero.restful.Booking;

import com.hero.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBooking extends TestBase {

    @Test
    public void getBooking() {

        Response response = given()
                .header("Content-Type","applicationj/son")
                .when()
                .get("booking");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
