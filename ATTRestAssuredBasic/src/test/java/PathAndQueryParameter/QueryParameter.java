package PathAndQueryParameter;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class QueryParameter {
	
	@Test
	public void getAllUser()
	{
	
		
		RestAssured.baseURI="https://reqres.in/";
		
		given()
		
		// inserting single parameter
	.queryParam("page", "2")
		
		
		
		.log().all()
		
		.when()
		
		.get("api/users")
		
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
	}

}
