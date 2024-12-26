package com.hero.restful.Booking;

import com.hero.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteBooking extends TestBase {

    @Test
    public void deleteBookingData() {



        Response response = given().log().all()
                .header("Accept", "application/json")
                .header("Content-type", "application/json")
                .header("cookie", "e6c9ff76511a2be")
                .pathParam("id", 1)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
