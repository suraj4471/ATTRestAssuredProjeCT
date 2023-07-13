package FeatchData;

import org.testng.annotations.Test;

public class BodyDefination {
	
	@Test
	public static String getBody()
	{
		String body="{\r\n" + 
				"    \"page\": 2,\r\n" + 
				"    \"per_page\": 6,\r\n" + 
				"    \"total\": 12,\r\n" + 
				"    \"total_pages\": 2,\r\n" + 
				"    \"data\": [\r\n" + 
				"        {\r\n" + 
				"            \"id\": 7,\r\n" + 
				"            \"name\": \"sand dollar\",\r\n" + 
				"            \"year\": 2006,\r\n" + 
				"            \"color\": \"#DECDBE\",\r\n" + 
				"            \"pantone_value\": \"13-1106\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 8,\r\n" + 
				"            \"name\": \"chili pepper\",\r\n" + 
				"            \"year\": 2007,\r\n" + 
				"            \"color\": \"#9B1B30\",\r\n" + 
				"            \"pantone_value\": \"19-1557\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 9,\r\n" + 
				"            \"name\": \"blue iris\",\r\n" + 
				"            \"year\": 2008,\r\n" + 
				"            \"color\": \"#5A5B9F\",\r\n" + 
				"            \"pantone_value\": \"18-3943\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 10,\r\n" + 
				"            \"name\": \"mimosa\",\r\n" + 
				"            \"year\": 2009,\r\n" + 
				"            \"color\": \"#F0C05A\",\r\n" + 
				"            \"pantone_value\": \"14-0848\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 11,\r\n" + 
				"            \"name\": \"turquoise\",\r\n" + 
				"            \"year\": 2010,\r\n" + 
				"            \"color\": \"#45B5AA\",\r\n" + 
				"            \"pantone_value\": \"15-5519\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"id\": 12,\r\n" + 
				"            \"name\": \"honeysuckle\",\r\n" + 
				"            \"year\": 2011,\r\n" + 
				"            \"color\": \"#D94F70\",\r\n" + 
				"            \"pantone_value\": \"18-2120\"\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    \"support\": {\r\n" + 
				"        \"url\": \"https://reqres.in/#support-heading\",\r\n" + 
				"        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n" + 
				"    }\r\n" + 
				"}";
		
		return body;
	}

}
