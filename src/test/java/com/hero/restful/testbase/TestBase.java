package com.hero.restful.testbase;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void inIt(){

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

    }
}
