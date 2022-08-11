package SerelizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import POJOforSerilizationAndDeserilization.EmployeeDetailsWithSpouse;

public class DeserilizationEmployeeDetailsWithspouse {
	public void DeserializationEmployeewithSpouse() throws JsonParseException, JsonMappingException, IOException {
ObjectMapper obj=new ObjectMapper();
EmployeeDetailsWithSpouse a1 = obj.readValue(new File(".\\Spouse.json"),EmployeeDetailsWithSpouse.class);
System.out.println(a1.getName());
System.out.println(a1.getS());
	}
}