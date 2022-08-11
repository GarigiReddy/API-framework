package BasicCrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatetheprojectwithTextFormateTest {
	@Test
	public void createtheprojectwithTextFormateTest() {
		JSONObject obj=new JSONObject();
		obj.put("createdBy","Reddy");
		obj.put("projectName","tyss1j");
		obj.put("status","Created");
		obj.put("teamSize",10);
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.TEXT);
		req.body(obj);
		Response resp = req.post("http://localhost:8084/addProject");
		ValidatableResponse validate = resp.then();
		validate.log().all();
	}

}
