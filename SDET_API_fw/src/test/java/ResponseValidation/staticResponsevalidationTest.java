package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


import  static io.restassured.RestAssured .*;

public class staticResponsevalidationTest {
@Test
public void staticresposeVTest() {
	baseURI="http://localhost";
	port=8084;
	String expdata="TY_PROJ_001";
	
	// step1 :send request ad validate  response
	Response resp = when().get("/projects");
	String actdata = resp.jsonPath().get("[0].projectId");
	System.out.println(actdata);
	Assert.assertEquals(expdata, actdata);
}
}
