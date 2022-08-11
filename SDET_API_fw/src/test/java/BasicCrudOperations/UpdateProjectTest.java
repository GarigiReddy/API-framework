package BasicCrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
@Test
public void updateprojectTest() {
	//step 1:create the neccessary data
	JSONObject jobj=new JSONObject();
	jobj.put("createBy","Reddy" );
	jobj.put("projectName","tyss");
	jobj.put("status","on going");
	jobj.put("teamSize",10);
	//step 2:send the request
	 RequestSpecification req = RestAssured.given();
req.body(jobj);
req.contentType(ContentType.JSON);
Response resp = req.put("http://localhost:8084/projects/TY_PROJ_001");
//step 3: validate the response
resp.then().log().all();
}
}
