package Parameters;

import org.testng.annotations.Test;


import static io.restassured.RestAssured .*;

public class GetprojectusigPathParameterTest {
@Test
public void GetprojectusingpathparamTest() {
	//step create pre requesit
	baseURI="http://localhost";
	port=8084;
	given().pathParam("pid","TY_PROJ_2002")
	
	//step2:send the request and validate the response
	.when().get("projects/{pid}")
	.then().log().all();
	
}
}
