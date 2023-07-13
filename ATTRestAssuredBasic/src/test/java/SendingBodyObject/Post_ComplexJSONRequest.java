package SendingBodyObject;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Post_ComplexJSONRequest {
	
	@Test
	public void PostRequest()
	{
		 List<Integer> Idvalue= new ArrayList<Integer>();
		 Idvalue.add(5);
		 Idvalue.add(9);
		 
		 HashMap<String,Object> BatterObj1= new HashMap<String,Object>();
		 BatterObj1.put("id", "1001");
		 BatterObj1.put("type","Regular");
		 
		 
		 HashMap<String,Object> BatterObj2= new HashMap<String,Object>();
		 BatterObj2.put("id", Idvalue);
		 BatterObj2.put("type", "Chocolate");
		 
		 List<HashMap<String,Object>> BatterArrayList= new ArrayList<HashMap<String,Object>>();
		 BatterArrayList.add(BatterObj1);
		 BatterArrayList.add(BatterObj2);
		 
		 HashMap<String,List<HashMap<String,Object>>> batterhashMap= new HashMap<String,List<HashMap<String,Object>>>();
		 batterhashMap.put("better", BatterArrayList);
		 
		 //topping
		 
		 HashMap<String,String> ToppingValue= new HashMap<String,String>();
		 ToppingValue.put("id", "5001");
		 ToppingValue.put("type", "None");
		 
		 HashMap<String,String> ToppingValue1= new HashMap<String,String>();
		 ToppingValue.put("id", "5002");
		 ToppingValue.put("type", "Glazed");
		 
		 HashMap<String,String> ToppingValue2= new HashMap<String,String>();
		 ToppingValue.put("id", "5005");
		 ToppingValue.put("type", "Sugar");
		 
		 List<HashMap<String,String>> ToppingArrayList= new ArrayList<HashMap<String,String>>();
		 ToppingArrayList.add(ToppingValue);
		 ToppingArrayList.add(ToppingValue1);
		 ToppingArrayList.add(ToppingValue2);
		 
	// HashMap<String, String> ToppingHashMap = new HashMap<String,String>();
	//	 ToppingHashMap.put("tooping", ToppingHashMap);
		 
		 HashMap<String,Object> MainObject = new HashMap<String,Object>();
		 MainObject.put("id", "0001");
		 MainObject.put("type", "donut");
		 MainObject.put("name", "cake");
		 MainObject.put("ppu", "0.55");
		 MainObject.put("better",  BatterArrayList);
		 MainObject.put("tooping", ToppingArrayList);
		 
		 	 
		RestAssured.baseURI="https://c02f3a0d-deb8-4c0a-ac31-ce528f7df793.mock.pstmn.io";
		
		given()
		
		.header("Content-Type","application/json")
		
		.header("x-mock-match-request-body", "true")
		
		.body( MainObject)
		
		.log().all()
		
		
		.when()
		
		.post("/complexpostRequest")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
	}

}
