package SendingBodyObject;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Post_MockServer {
	
	
	@Test
	public void post_Request()
	{
		
		HashMap<String,String> obj1= new HashMap<String,String>();
		obj1.put("id", "1001");
		obj1.put("type", "Regular");
		
		
		HashMap<String,String> obj2= new HashMap<String,String>();
		obj2.put("id", "1002");
		obj2.put("type", "Chocolate");
		
		List<Map<String,String>> jsonObj= new ArrayList<Map<String,String>>();
		jsonObj.add(obj1);
		jsonObj.add(obj2);
		
		RestAssured.baseURI="https://c02f3a0d-deb8-4c0a-ac31-ce528f7df793.mock.pstmn.io";
		
		given()	
		
		.body(jsonObj)
		
		.log().all()
		
		.when()
		
		.post("/post")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
	}

}
