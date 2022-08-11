package Genericlibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured .*;

import java.sql.SQLException;

public class BaseApiclass {
public DatabaseLibrary dLib=new DatabaseLibrary();
public JavaLibrary jLib=new JavaLibrary();
public RestAssuredLibrary rLib=new RestAssuredLibrary();
@BeforeSuite
public void bsConfig() throws SQLException {
	dLib.connectionToDB();
	Reporter.log("==connection successful==",true);
	baseURI="http://localhost";
	port=8084;
	
}
@AfterSuite
public void asConfig() throws SQLException {
	dLib.closeDB();
	Reporter.log("connection closed",true);
}
}
