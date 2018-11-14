package com.speetail.api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetApiCalls {
	
	
	
	public Response getResponseApiCall() {
		RestAssured.baseURI = "https://reqres.in/";
		
		Response response = given().log().all().get("api/users?page=2");
		
		return response;
	}

}
