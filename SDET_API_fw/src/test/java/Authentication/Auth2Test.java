package Authentication;

import static  io.restassured.RestAssured .*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2Test {
	@Test
	public void oauthAuthentication()
	{
		
		//Create a request to generate accesss token 
	 Response resp = given()
		 .formParam("client_id", "sdet36restapi")
		 .formParam("client_secret", "f3d8d11a06ea5fd58c109b9d263be5ac")
		 .formParam("grant_type", "client_credentials")
		 .formParam("redirect_uri", "http://reddy.com")
		 .formParam("code", "authorization_code")
		 
	    .when()
	     .post("http://coop.apps.symfonycasts.com/token");
	     
	    //Capture the access token from the response of the above request
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		
		//Create another request and use the token to access the APIs
		given()
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 3680)
		 
		.when()
		 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		 
		.then().log().all();
		 
		 
	}
}
