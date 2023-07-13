package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PUT_UpdatedWorkPaceDetails {
	
	@Test
	public void upadteDetails()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
		Response responce = given()
		
		.header("x-api-key","PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd")
		
		.body("{\r\n" + 
				"    \"workspace\": {\r\n" + 
				"        \"name\": \"newUpdatedWorkpace\",\r\n" + 
				"        \"description\": \"update of workspace\",\r\n" + 
				"        \"type\": \"personal\"\r\n" + 
				"    }\r\n" + 
				"}")
		
		.when()
		
		.put("/workspaces/aec9f97b-9805-4c2c-84a9-a0cb7efb1019")
		
		.then()
		
		.extract()
		
		.response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
		
		int code = responce.statusCode();
		
		System.out.println(code);
		
		
	}

}
