package Requestchaining;

import static  io.restassured.RestAssured .*;

import org.testng.annotations.Test;

import POJOclasses.ProjectlibraryTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RequestchainingTest {
@Test
public void requestchainingTest() {
	baseURI="http://localhost";
	port=8084;
	//step1: creatre the pojo class
	 ProjectlibraryTest poj=new ProjectlibraryTest("reddy","xylem123","Created",15);
	 Response resp = given().body(poj).contentType(ContentType.JSON)
	 .when().post("/addProject");
	 
	 //capture the projectid 
	 String proid = resp.jsonPath().get("projectId");
			 System.out.println(proid);
	 resp.then().log().all();
	//Create a get request and pass proID as path parameter
			given()
			 .pathParam("pid", proid)
			.when()
			 .get("/projects/{pid}")
			.then()
			 .assertThat().statusCode(200).log().all();
			 
}
}
