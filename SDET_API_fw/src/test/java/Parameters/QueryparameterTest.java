package Parameters;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured .*;

public class QueryparameterTest {
@Test
public void queryparameterTest() {
	baseURI="http://reqres.in";
	//step1 : create pre requisits
	given().queryParam("page", 3)
	
	//step2 :send the request and validate 
	.when().get("/api/users")
	.then()
	.log().all();
}
}
