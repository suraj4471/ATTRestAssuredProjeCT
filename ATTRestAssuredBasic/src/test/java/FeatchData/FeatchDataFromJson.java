package FeatchData;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class FeatchDataFromJson {
	
	@Test
	public void FeatchDetailsFromJson()
	{
		RestAssured.baseURI="https://reqres.in/";
		
		Response responce = given()
		
		.when()
		
		.get("/api/user/2")
		
		.then()
		
		.extract()
		
		.response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
		
		JsonPath jp = responce.jsonPath();
		
		String firstname = jp.getString("data.name");
		
		System.out.println("firstname:"+firstname);
		
		
		
	}

}
