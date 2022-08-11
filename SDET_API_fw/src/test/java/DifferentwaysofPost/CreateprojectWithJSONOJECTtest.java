package DifferentwaysofPost;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured .*;

import java.util.Random;

public class CreateprojectWithJSONOJECTtest {
	@Test
	public void CreateusingjsonTest() {
		Random r=new Random();
		int ran = r.nextInt(500);
	
JSONObject obj=new JSONObject();
obj.put("createdy","REddy");
obj.put("projectName","tsyy14"+ran);
obj.put("status","Created");
obj.put("teamSize",10);
 
baseURI="http://localhost";
port=8084;
given()
.body(obj)
.contentType(ContentType.JSON)
.when().post("/addProject")
.then().assertThat().log().all();

	}
}
