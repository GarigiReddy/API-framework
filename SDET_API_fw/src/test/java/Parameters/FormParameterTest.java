package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

public class FormParameterTest {
@Test
public void formparameterTest() {
	baseURI="http://localhost:8084";
	//step 1: create pre requisits 
	given().formParam("createdBy","critanraj")
	.formParam("projectName","Dream11")
	.formParam("status ","Created")
	.formParam("teamSize",15)
	.contentType(ContentType.JSON)
	
	//step2 :send the request and validate
	.when().post("/addProject")
	.then().log().all();	
}
}
