package BasicRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class POST_GetUserSwagger {
static	String messageValue ;
	@Test(priority=1)
	public void createUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response responce = given()
		
		.body("{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"username\": \"Suraj@098\",\r\n" + 
				"  \"firstName\": \"akshay\",\r\n" + 
				"  \"lastName\": \"yadav\",\r\n" + 
				"  \"email\": \"ahgfjha@gmail.com\",\r\n" + 
				"  \"password\": \"hgaga\",\r\n" + 
				"  \"phone\": \"98565412442\",\r\n" + 
				"  \"userStatus\": 0\r\n" + 
				"}")
		
		.header("Content-Type","application/json")
		
		.when()
		
		.post("/user")
		
		.then()
		
		.extract()
		
		.response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
		
		String statusLine = responce.getStatusLine();
		
		System.out.println("status line is :"+statusLine);
		
		JsonPath jp = responce.jsonPath();
		
		int codeValue = jp.getInt("code");
		
		System.out.println(codeValue);
		
		messageValue = jp.getString("message");
		
		System.out.println("message create by user"+messageValue);
		
		String typevalue = jp.getString("type");
		
		System.out.println(typevalue);
		
			
	}
	
	@Test(priority=2)
	public void getUserDetails()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		
		Response responce = given()
		
		.when()
		
		.get("/user/Suraj@098")
		
		.then()
		
		.extract()
		
		.response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
		
		JsonPath jp = responce.jsonPath();
		
		String idValue = jp.getString("id");
		
		System.out.println("user create id"+idValue);
		
		Assert.assertEquals (messageValue, idValue);
		
		
		
		
		
	}

}
