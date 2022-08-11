package DifferentwaysofPost;

import org.testng.annotations.Test;

import POJOclasses.ProjectlibraryTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

public class CreateprojectusingpojoTest {
@Test
public void CreateusingpojoTest() {
	baseURI="http://localhost";
	port=8084;
	
	ProjectlibraryTest pojo=new ProjectlibraryTest("reddy","rmg194","Created",10);
	given().body(pojo)
	.contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().log().all();
}
}
