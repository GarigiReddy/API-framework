package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured .*;

import java.util.List;

public class DyanamicresponseValidationTest {
@Test
public void dynamicresponsevalidateTest() {
	baseURI="http://localhost";
	port=8084;
	boolean flag=false;
	String expdat="TY_PROJ_001";
	//step1: sennd the request
	Response resp = when().get("projects");
	
	//step2:capture the response by writing json path 
	List<String> list = resp.jsonPath().get("projectId");
	for(String data:list)
	{
		if(data.equalsIgnoreCase(expdat))
		{
			System.out.println(data);
			flag=true;//flag rising
			break;
		}
			//step3 validate
			Assert.assertTrue(flag);
		
	}
}
}
