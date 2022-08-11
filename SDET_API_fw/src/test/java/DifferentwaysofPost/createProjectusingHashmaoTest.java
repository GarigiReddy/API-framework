package DifferentwaysofPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured .*;

import java.util.HashMap;
import java.util.Random;

public class createProjectusingHashmaoTest {
@Test
public void Createprojectusinghashmap() {
	Random r=new Random();
	int ran = r.nextInt(500);
	baseURI="http://localhost";
	port=8084;
	
	HashMap map=new HashMap();
	map.put("createdy","REddy");
	map.put("projectName","tsyy15"+ran);
	map.put("status","Created");
	map.put("teamSize",10);
	given().body(map).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat()
	//.statusCode(201)
	.log().all();
}
}
