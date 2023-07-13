package PathAndQueryParameter;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PathParameter {
	
		
		@Test
		public void getAllUser()
		{
			RestAssured.baseURI="https://reqres.in/";
			
	         given() 
	         
	        .pathParam("pagevalue", "2")
	           
            .log().all()
	         		
			.when()
			
			.get("api/users/{pagevalue}")
			
			.then()
			
			.log().all()
			
			.extract()
			
			.response();


		}


}
