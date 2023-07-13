package UploadDownload;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class uploadfile {
	
	
	@Test
	public void Post_Request() {
		
		File  image= new File("C:\\Users\\HP\\eclipse-workspace\\SeliniumAutomation\\ScreenshotProject");
		RestAssured.baseURI="https://the-internet.herokuapp.com";
		
		given()
	
		//it is send to file to server
		.multiPart("file",image)
		
		
		
		.log().all()
		
		.when()
		
		.post("/upload")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
	}

}
