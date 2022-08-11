package BasicCrudOperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
@Test
public void createprojectTest() {
	Random ran=new Random();
	int random = ran.nextInt(500);
//step1: create the neccessary data
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","Reddy");
	jobj.put("projectName","tyss"+random);
	jobj.put("status","Created");
	jobj.put("teamsize",10);
	
	//step 2:send the request
	RequestSpecification request = RestAssured.given();
	request.body(jobj);
	request.contentType(ContentType.JSON);
	Response resp = request.post("http://localhost:8084/addProject");
	//step 3: validate the response 
	//System.out.println(resp.prettyPrint());
	//System.out.println(resp.prettyPeek());
	ValidatableResponse validate = resp.then();
	validate.log().all();
}
}
