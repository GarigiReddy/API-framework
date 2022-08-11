package Authentication;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

public class basicAuthvarious {
	@Test
	public void basicPreEmptiveAuthtest()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().preemptive().basic("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
	}
	
	@Test
	public void basicDigestiveAuthTest1()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().digest("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
	}
	



}
