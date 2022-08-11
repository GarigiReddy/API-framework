package CrudOperationswithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured .*;

public class GetforProject {
@Test
public void getprojectTest() {
	baseURI="http://localhost";
	port=8084;
	when().get("/projects")
			.then()
			.log().all();
			
			 
}
}
