package ResponceRequestSpecBuilder;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqResSpecBuilder {
	
	
	@Test
	public void getPostWOrkpace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
Response responce = given()
		
		.header("x-api-key", "PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd" )
		
		.log().all()
		
		.when()
		
		.get("/workspaces")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();

//String res = responce.asPrettyString();
//
// System.out.println(res);



	}


}
