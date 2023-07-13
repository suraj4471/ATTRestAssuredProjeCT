package FeatchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DynamicDataExtraction {
	
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
	
	String size = jp.getString("data.size()");
	
	System.out.println("size of array:"+size);
	
	for(int i=0;i<6;i++)
	{
		String name = jp.getString("data["+i+"].name");
		
		System.out.println("all name in array:"+name);
		
		if(name.equals("turquoise"))
		{
			String idValue = jp.getString("data["+i+"].id");
			System.out.println("id value is:"+idValue);
			
		}
	}
	
	
	}

}
