package AssignmentCourcePurches;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class CourceQue {
	
	@Test
	public void bodyValidate()
	{
		JsonPath jp= new JsonPath(CourcePurchesJson.body());
		
		String valueTitle = jp.getString("courses[0].title");
		
		System.out.println(valueTitle);
		
		int noOfCource = jp.getInt("courses.size()");
		System.out.println("no of cource avilable="+noOfCource);
		
		System.out.println("------------------------------------");

		
		int purchAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println("total purches amount:"+purchAmount);
		
		System.out.println("------------------------------------");

		
		String secondTitle = jp.getString("courses[1].title");
		System.out.println("Second title is:"+secondTitle);
		
		System.out.println("------------------------------------");
		
		for(int i=0;i<3;i++)
		{
			String CTitle = jp.getString("courses["+ i +"].title");
			int price = jp.getInt("courses["+ i +"].price");
			System.out.println("all cource avilable");
			System.out.println(CTitle+ " " +price);
		}
		
		System.out.println("------------------------------------");
		
		int copiesSell = jp.getInt("courses[2].copies");
		
		System.out.println("RPA cpoies sell="+copiesSell);
		
		System.out.println("------------------------------------");
		
		int sum=0;
		
		for(int i=0; i<3;i++)	
		{
		
			int copies = jp.getInt("courses["+ i +"].copies");
			int price = jp.getInt("courses["+ i +"].price");
			
			sum = sum + copies * price;			
		}
		
		System.out.println("total value:"+sum);
		
		int purchAmount1 = jp.getInt("dashboard.purchaseAmount");
		System.out.println("total purches amount:"+purchAmount1);
		Assert.assertEquals(sum, purchAmount1);
		


		
		
	}

}
