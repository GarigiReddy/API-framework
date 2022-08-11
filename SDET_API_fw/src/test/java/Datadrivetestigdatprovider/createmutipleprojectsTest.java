package Datadrivetestigdatprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJOclasses.ProjectlibraryTest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

import java.util.Random;

public class createmutipleprojectsTest {
	@Test(dataProvider = "getdata")
	public void createmultipleprojectTest(String createdBy,String projectName,String status,int teamSize) {
	Random r=new Random();
	int random = r.nextInt();
		ProjectlibraryTest pojo=new ProjectlibraryTest(createdBy,projectName+random,status, teamSize);
	baseURI="http://localhost";
	port=8084;
	given().body(pojo).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().log().all();
	}
	@DataProvider(name="getdata")
	public Object[][] data(){
		Object[][] d=new Object[3][4];
		d[0][0]="reddy";
		d[0][1]="tyss";
		d[0][2]="ongoing";
		d[0][3]=20;
		d[1][0]="reddy";
		d[1][1]="tyss";
		d[1][2]="created";
		d[1][3]=20;
		d[2][0]="reddy";
		d[2][1]="tys5s";
		d[2][2]="Created";
		d[2][3]=20;
		
				
		return d;
	}
	

}
