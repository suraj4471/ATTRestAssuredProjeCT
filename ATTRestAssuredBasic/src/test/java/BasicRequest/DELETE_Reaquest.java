package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DELETE_Reaquest {
	
	@Test
	public void deleteRequest()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
		Response responce = given()
		
		.header("x-api-key","PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd")

		.when()
		
		.delete("/workspaces/4d738ce4-3d49-41e4-a11c-e4804a8039ce")
		
		.then()
		
		.extract()
		
		.response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
		
	}
	

}
