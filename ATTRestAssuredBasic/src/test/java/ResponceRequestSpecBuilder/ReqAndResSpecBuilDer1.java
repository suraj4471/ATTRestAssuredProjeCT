package ResponceRequestSpecBuilder;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReqAndResSpecBuilDer1 {
	  RequestSpecification ReqSpecific;
	  ResponseSpecification ResSpecific;
	@BeforeClass
	public void initiRequest()
	{
		RequestSpecBuilder ReqBuilder= new RequestSpecBuilder();
	    ReqBuilder.setBaseUri("https://api.getpostman.com");
	    ReqBuilder.addHeader("x-api-key", "PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd");
	    ReqBuilder.log(LogDetail.ALL);
	   ReqSpecific = ReqBuilder.build();
	   
	   ResponseSpecBuilder ResBuilder=new  ResponseSpecBuilder();
	   ResBuilder.expectStatusCode(200);
	   ResBuilder.expectContentType(ContentType.JSON);
	   ResBuilder.log(LogDetail.ALL);
	   ResSpecific = ResBuilder.build();
		
	}
	
	@Test(priority=1)
	public void getPostWOrkpace()
	{
	
        given()
        
        .spec(ReqSpecific)
		
		.when()
		
		.get("/workspaces")
		
		.then()
		
		.spec(ResSpecific)
				
		.extract()
		
		.response();

	}
	
	@Test(priority=2)
	public void getSingleBody()
	{
		given()
		
		.spec(ReqSpecific)
		
		.when()
		
		.get("/workspaces/7fa07621-8c13-4cf3-8787-23fdc2b42b78")
		
		.then()
		
		.spec(ResSpecific)
		
		.extract()
		
		.response();
		
	}

}
