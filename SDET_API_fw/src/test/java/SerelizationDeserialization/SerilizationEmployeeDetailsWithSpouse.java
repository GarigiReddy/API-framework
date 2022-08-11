package SerelizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDeserilization.EmployeeDetailsWithSpouse;
import POJOforSerilizationAndDeserilization.Spouse;

public class SerilizationEmployeeDetailsWithSpouse {
@Test
public void employeedetailswithspouse() throws JsonGenerationException, JsonMappingException, IOException {
	Spouse s1=new Spouse("dingu","reddyt@145", 1452888);
	EmployeeDetailsWithSpouse es=new EmployeeDetailsWithSpouse("dimga","dinga@1254",961159654,s1);
	ObjectMapper obj=new ObjectMapper();
	obj.writeValue(new File(".\\Spouse.json"),es );
}

}
