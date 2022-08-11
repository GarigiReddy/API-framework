package ResponseValidation;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured .*;

import java.util.concurrent.TimeUnit;

public class ResponsetimeValidateusingHamcrestmatcherTest1 {
@Test
public void responsevalidationhamcrestmatcher() {
	basePath="http://localhost:8084";
	//step 1:send the request and validate the response
	when()
	.get("/projects")
	.then().assertThat().time(Matchers.lessThan(8000L), TimeUnit.MILLISECONDS);
}
}
