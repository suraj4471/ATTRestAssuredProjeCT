package PathAndQueryParameter;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class multipleQueryParameter {
	

		
		@Test
		public void getAllUser()
		{
			
			HashMap<String,String> qp = new HashMap<String,String>();
			qp.put("foo1", "bar1");
			qp.put("foo2", "bar2");
			qp.put("foo3", "bar3");

			
			RestAssured.baseURI="https://postman-echo.com";
			
	         given()
	         
	         .queryParams(qp)
	         
	         .log().all()
			
			.when()
			
			.get("/get")
			
			.then()
			
			.log().all()
			
			.extract()
			
			.response();


	   
		}

}
