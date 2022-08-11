package SerelizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDeserilization.EmployeeDetails;

public class DeserializationEmployeeDetails {
	@Test
public void DeserialiseEmployeedetailsTest() throws Throwable, Throwable, IOException {
//create oject od object mapper from the jackson mapper
	ObjectMapper obj=new ObjectMapper();
	//read the values from the object mapper
	  EmployeeDetails e = obj.readValue(new File(".\\EmployeeDetails.json"),EmployeeDetails.class);
	//fectch the required details from the  class
	  System.out.println(e.getAddress());
	  System.out.println(e.getPhone());
}
}
