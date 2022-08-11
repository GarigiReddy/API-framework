package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

import java.util.HashMap;

public class AuthenticationusingBearertokensTest {
@Test
public void authenticationearertokenTest() {
	//step1: create pre requisits
	HashMap map=new HashMap();
	map.put("name","sdet36");
	map.put("description","apifrmework");
	given()
	  .auth()
	  .oauth2("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")
	  .body(map)
	  .contentType(ContentType.JSON)
	  //step2 sed the request and validate the response
	  .when().post("https://api. github.com/user/repos")
	  .then().log().all();
	  
}
}
