package SendingBodyObject;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get_MockServer {
	
	@Test
	public void Get_Request()
	{
		RestAssured.baseURI="https://3b1cba8c-9513-4434-9836-cda2ac51f0b2.mock.pstmn.io";
				
				given()
				
				.log().all()
				
				.when()
				
				.get()
								
				.then()
				
				.log().all()
				
				.extract()
				
				.response();  
				
	}
	

}
