package SendingBodyObject;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Post_CreateWorkPace {
	
	
	@Test
	public void getPostWOrkpace()
	{
		HashMap<String,String> value = new  HashMap<String,String>();
		value.put("id", "93d50fb7-dca4-4aca-90bc-0212dd8b3a48");
		value.put("name", "ATTObjectWorkpace");
		value.put("type","personal");
		
		HashMap<String, Object> MainObject = new  HashMap<String, Object>();
		MainObject.put("WorksPace"," value");
		

		
 		RestAssured.baseURI="https://api.getpostman.com";
		
          given()
		
		.header("x-api-key", "PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd" )
		
		.body(MainObject)
		
		.log().all()
		
		.when()
		
		.post("/workspaces")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();





	}

}
