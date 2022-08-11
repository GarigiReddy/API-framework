package DifferentwaysofPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

public class creteProjectusingformdataTest {
@Test
public void createusingFormdataTest() {
	baseURI="http://localhost";
	port=8084;
	
	given()
.formParam("createdBy","cristan")
.formParam("projectName","rmg23")
.formParam("status","Created")
.formParam("teamSize",10)
.contentType(ContentType.JSON)
.when().post("/addProject")
.then().assertThat()
//.statusCode(201)
.log().all();
}
}
