package BasicRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class HEAD_Request {
	
	@Test
	public void Haeadrequest()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
		Response responce = given()
		
		.header("x-api-key","PMAK-649bcf8c7290bd0031fcd28a-4d8fd26f8a3cb01ca377b9408f615d1fdd")

		.when()
		
		.head("/workspaces")
		
		.then()
		
		.extract()
		
		.response();
		
		String res = responce.asPrettyString();
		
		System.out.println(res);
		
		int code = responce.getStatusCode();
		
		System.out.println(code);
		
		//featching headers information\
		
		Headers header = responce.headers();
		List<Header> value = header.asList();
		
		Header firstHeader = value.get(0);
		
		String name = firstHeader.getName();
		
		String vl = firstHeader.getValue();
		
		System.out.println(name+" "+vl);
		
		
		
		//featching all values of header
		
		String valuee = header.toString();
		System.out.println(valuee);
		
		//get individual value of header
		
		String contentValue = responce.getHeader("Content-Type");
		
		System.out.println(contentValue);
		
		
		
		
		
		
		
		
	}

}
