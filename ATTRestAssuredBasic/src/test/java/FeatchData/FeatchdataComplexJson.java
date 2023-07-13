package FeatchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FeatchdataComplexJson {
	
	@Test
	public void FeatchdataJson()
	{
	
	
	RestAssured.baseURI="https://reqres.in/";
	
	Response responce = given()
	
	.when()
	
	.get("/api/user?page=2")
	
	.then()
	
	.extract()
	
	.response();
	
	String res = responce.asPrettyString();
	
	System.out.println(res);
	
	JsonPath jp = responce.jsonPath();
	int valuepage = jp.getInt("page");
	System.out.println("value of page:"+valuepage);
	
	//featching the data email information
	
	String namevalue = jp.getString("data[0].name");
	System.out.println("name information is :"+namevalue);
	
	}
}
