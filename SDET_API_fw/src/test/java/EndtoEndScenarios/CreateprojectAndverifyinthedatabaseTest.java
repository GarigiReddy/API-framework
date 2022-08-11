package EndtoEndScenarios;

import static  io.restassured.RestAssured .*;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Genericlibrary.BaseApiclass;
import Genericlibrary.EndPointLibrary;
import POJOclasses.ProjectlibraryTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateprojectAndverifyinthedatabaseTest  extends BaseApiclass{
@Test
public void Createproject() throws SQLException {
	//step1: create pre  requists
	ProjectlibraryTest p=new ProjectlibraryTest("reddy", "zommu"+jLib.getRandomNum(), "Created", 25);
	

// step2: send the request
	Response response = given().body(p).contentType(ContentType.JSON)
	.when().post(EndPointLibrary.createProject);
	
	//step3: capture the project id
	String expData = rLib.getJsonData(response,"projectId");
	Reporter.log(expData,true);
	//step4:validate  the id the database
	String query="select * from project;";
String	actdata=dLib.readDataFromDBAndValidate(query, 1, expData);
Assert.assertEquals(expData, actdata);
}
}