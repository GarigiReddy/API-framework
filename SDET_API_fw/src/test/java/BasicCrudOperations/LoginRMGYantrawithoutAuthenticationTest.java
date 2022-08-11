package BasicCrudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithoutAuthenticationTest {
@Test
public void loginRMGYantrawithoutAuthenticationTest() {
	RequestSpecification req = RestAssured.given();
	Response resp = req.get("http://localhost:8084/login");
	ValidatableResponse validate = resp.then();
	validate.log().all();
}
}
