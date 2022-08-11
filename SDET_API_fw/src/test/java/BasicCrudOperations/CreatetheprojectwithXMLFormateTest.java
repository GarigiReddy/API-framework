package BasicCrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatetheprojectwithXMLFormateTest {
@Test
public void createtheprojectwithXMLFormateTest() {
	JSONObject oj=new JSONObject();
	oj.put("createdBy","Reddy");
	oj.put("projectName", "tysan");
	oj.put("status","Created");
	oj.put("teamsize",10);
	RequestSpecification req = RestAssured.given();
	req.body(oj);
	req.contentType(ContentType.XML);
	Response resp = req.post("http://localhost:8084/addProject");
	ValidatableResponse validate = resp.then();
	validate.log().all();
	
	
	
}

}
