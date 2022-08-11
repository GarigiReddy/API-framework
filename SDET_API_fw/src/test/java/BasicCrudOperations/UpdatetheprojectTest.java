package BasicCrudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdatetheprojectTest {
@Test
public void updatetheprojectTest() {
JSONObject ob=new JSONObject();
ob.put("status","ongoing");
RequestSpecification req = RestAssured.given();
req.body(ob);
req.contentType(ContentType.JSON);
Response resp = req.put("http://localhost:8084/projects/{TY_PROJ_1403}");
ValidatableResponse validate = resp.then();
validate.log().all();
}
}
