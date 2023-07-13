package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GET1_Request {
	
	
	@Test
	public void GetRequest()
	{
		RestAssured.baseURI="https://reqres.in/";
		
Response responce = given()
		
		.when()
		
		.get("api/user/2")
		
		.then()
		
		.extract()
		
		.response();


     String res = responce.asPrettyString();
     
     System.out.println(res);
     
	int statuscode = responce.getStatusCode();	
	
	System.out.println(statuscode);
	
	long time = responce.getTime();
	
	System.out.println(time);
	
		
		
	}

}
