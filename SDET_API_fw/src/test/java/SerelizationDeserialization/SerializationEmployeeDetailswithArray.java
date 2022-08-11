package SerelizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDeserilization.EmployeesDetailswithArray;

public class SerializationEmployeeDetailswithArray {
	@Test
public void EmployeeDetailswithArray() throws JsonGenerationException, JsonMappingException, IOException {
		int phoneno[]={961159659,947585488};
		String emaiid[]={"reddy@123","reddy@143"};
		EmployeesDetailswithArray a1=new EmployeesDetailswithArray("bunti","tsy22",phoneno,emaiid,"bangalore") ;
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./EmployeesDetailswithArray.json"),a1);
	}
}
