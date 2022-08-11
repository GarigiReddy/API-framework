package SerelizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDeserilization.EmployeesDetailswithArray;

public class DeserializationEmployeeDetailsWithArray {
	@Test
public void DeserilizationEmployeeDetailsWithArrayTest() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper obj=new ObjectMapper();
	 EmployeesDetailswithArray aa = obj.readValue(new File(".\\EmployeesDetailswithArray.json"),EmployeesDetailswithArray.class);
System.out.println(aa.getPhone()[0]);
System.out.println(aa.getEmail()[1]);
	 
	}
}
 