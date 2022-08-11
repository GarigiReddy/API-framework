package DifferentwaysofPost;

import static io.restassured.RestAssured .*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateusingJsonfileTest {
	@Test
	public void createorojectusingjsonFileTest() {
		baseURI="http://localhost";
		port=8084;
		
		File file=new File(".\\src\\test\\resources\\requestdata.json");
		given().body(file)
		.contentType(ContentType.JSON)
		.when().post("/addProject")
		.then()
		.log().all();
	}

}
