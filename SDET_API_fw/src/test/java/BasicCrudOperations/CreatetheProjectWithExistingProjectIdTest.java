package BasicCrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatetheProjectWithExistingProjectIdTest {
@Test
public void createtheProjectWithExistingProjectIdTest() {
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "reddy");
	obj.put("projectId", "TY_PROJ_806");
	obj.put("projectName","tyss1fs");
	obj.put("status","Created");
	obj.putIfAbsent("teamSize", 10);
	RequestSpecification req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	Response resp = req.post("http://localhost:8084/addProject");
	ValidatableResponse validate = resp.then();
	validate.log().all();
	
}
}
