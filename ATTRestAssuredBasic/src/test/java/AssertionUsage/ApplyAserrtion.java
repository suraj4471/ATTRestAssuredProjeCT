package AssertionUsage;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ApplyAserrtion {
	
	@Test
	public void applyAssertion()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
		given()
		
		.header("x-api-key","PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd")
		
		.when()
		
		.get("/workspaces")
		
		.then()
		
		.assertThat()
		
		.header("Transfer-Encoding", "chunked")
		
		.contentType(ContentType.JSON)
		
		.statusCode(200)
		
		.body("workspaces.name", contains("MyWorkspace","ATTWorkPace","restWorkpace")) // multiple element in order
		
		.body("workspaces.name",hasItem("MyWorkspace")) //single element
		
		.body("workspaces.name",containsInAnyOrder("ATTWorkPace","restWorkpace","MyWorkspace"))
		
		.body("workspaces[0]", hasKey("id"))
		
		.body("workspaces[1]", hasEntry("id","7fa07621-8c13-4cf3-8787-23fdc2b42b78"));
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
