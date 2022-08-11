package CrudOperationswithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured .*;

public class PutprojectTest {
@Test
public void getproject() {
	baseURI="http://localhost";
	port=8084;
	
	JSONObject oj=new JSONObject();
	oj.put("createdBy","reddy");
	oj.put("projectName","cristandevelopers123");
	oj.put("status","Created");
	oj.put("teamSize", 5);
	given().body(oj).contentType(ContentType.JSON)
	.when().put("/projects/TY_PROJ_806")
	.then().assertThat().log().all();	
}
}
