package Authentication;

import static  io.restassured.RestAssured .*;

import org.testng.annotations.Test;

public class BasicAuthTest {
@Test
public void bacicauthTest() {
	baseURI = "http://localhost";
	port = 8084;
	// create the pre requisit
	given().auth()
	.basic("rmgyantra","rmgy@9999")
	.when().get("/login")
	.then().assertThat().statusCode(202).log().all();
	
	
}
}
