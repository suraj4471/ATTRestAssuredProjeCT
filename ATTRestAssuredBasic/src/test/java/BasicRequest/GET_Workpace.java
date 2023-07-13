package BasicRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GET_Workpace {
	
	@Test
	public void getPostWOrkpace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
Response responce = given()
		
		.header("x-api-key", "PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd" )
		
		.when()
		
		.get("/workspaces")
		
		.then()
		
		.extract()
		
		.response();

String res = responce.asPrettyString();

 System.out.println(res);



	}

}
