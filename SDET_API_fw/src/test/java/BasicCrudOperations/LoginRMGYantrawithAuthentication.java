package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithAuthentication {
@Test
public void loginRMGYantrawithAuthentication() {
	RequestSpecification req = RestAssured.given();
	req.auth().basic("rmgyantra","rmgy@9999");
	Response resp = req.get("http://localhost:8084/login");
	ValidatableResponse validate = resp.then();
	validate.log().all();
}
}
