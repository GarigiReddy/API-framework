package CrudOperationswithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

import java.util.Random;

public class CreateProjectTest {
@Test
public void createprojectTest() {
	baseURI="http://localhost";
	port=8084;
	Random ran=new Random();
	int rendom = ran.nextInt(500);
	JSONObject obj=new JSONObject();
	obj.put("createdBy","milton");
	obj.put("projectName","Rmgteam14 "+rendom);
	obj.put("status","Created");
	obj.put("teamSize", 10);
	// step 1 create the data
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.log().all();
}
}
