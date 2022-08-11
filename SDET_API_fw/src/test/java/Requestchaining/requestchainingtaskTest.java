package Requestchaining;

import org.testng.annotations.Test;

import POJOclasses.ProjectlibraryTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured .*;

public class requestchainingtaskTest {
@Test
public void requestchaintaskTest() {
	//create pojo class
	baseURI="http://localhost";
	port=8084;
	
	ProjectlibraryTest po=new ProjectlibraryTest("reddy","dream3"," Created", 10);
	 Response resp = given().body(po)
			.contentType(ContentType.JSON)
		.when().post("/addProject");
	//capture the project id
			String proId = resp.jsonPath().get("projectId");
			System.out.println(proId);
			resp.then().log().all();
			//update
	  ProjectlibraryTest poj=new ProjectlibraryTest("reddy","dream45", "Completed", 10);
	  
	  given()
	  .pathParam("pid1", proId)
	  .body(poj)
	  
	  .contentType(ContentType.JSON)
	  .when().put("/projects/{pid1}")
	  .then().log().all();
	  //geeting project 
	  
   given().param("pid1",proId)
	  .when()
  .delete("/projects/{pid1}")
  .then().assertThat().statusCode(204).log().all();
	  
 

		
}
}
