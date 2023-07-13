package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

public class POST_Workpacecraeted {
	
	
	@Test
	public void createworkpace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		  
		Response responce = given()
		
		.header("x-api-key","PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd")

		.body("{\r\n" + 
				"    \"workspace\": {\r\n" + 
				"        \"name\": \"RestAssured\",\r\n" + 
				"        \"description\": \"Test workpace\",\r\n" + 
				"        \"type\": \"personal\"\r\n" + 
				"    }\r\n" + 
				"}")
		
		.when()
		
		.post("/workspaces")
		
	     .then()
	     
	     .extract()
	     
	     .response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
	     
	     
		
		
	}

}
