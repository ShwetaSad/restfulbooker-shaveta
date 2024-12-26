package com.hero.restful.Booking;

import com.hero.restful.model.BookingPojo;
import com.hero.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UpdateBooking extends TestBase {

    @Test
    public void updateBooking() {


        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("shaveta");
        bookingPojo.setLastname("Sethi");
        bookingPojo.setTotalprice(2344);
        bookingPojo.setDepositpaid(true);
        Map<String, String> dates = new HashMap<>();
        dates.put("checkin", "2024-10-01");
        dates.put("checkout", "2024-10-11");
        bookingPojo.setBookingdates(dates);
        bookingPojo.setAdditionalneeds("Breakfast");

        Response response = given().log().all()
                .header("Accept", "application/json")
                .header("Content-type", "application/json")
                .header("cookie", "e6c9ff76511a2be")
                .pathParam("id", 1)
                .body(bookingPojo)
                .when()
                .put("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
