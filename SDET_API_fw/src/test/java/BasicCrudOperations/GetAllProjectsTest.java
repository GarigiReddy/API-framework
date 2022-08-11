 package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjectsTest {
@Test
public void getallprojectsTest() {
	//step 1:create required data
	//step 2:send the request
	Response resp = RestAssured.get("http://localhost:8084/projects");
 //step:3 validate the response
	ValidatableResponse validate = resp.then();
	validate.log().all();
}
}
