package BasicRequest;



import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class GET_Request {
	
	@Test
	public void getAllUser()
	{
		RestAssured.baseURI="https://reqres.in/";
		
Response responce = given()
		
		.when()
		
		.get("api/users?page=2")
		
		.then()
		
		.extract()
		
		.response();


   String res = responce.asPrettyString();
   System.out.println(res);
   
  int statuscode = responce.statusCode();
  
  System.out.println(statuscode);
  
 long time = responce.getTime();
 
 System.out.println(time);
		
	}

}
