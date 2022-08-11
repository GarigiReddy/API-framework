package SerelizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationAndDeserilization.EmployeeDetails;

public class SerilizationEmployeeDetails {
@Test
//step1:create object of pojo class and provide values 
public void SerilizationEmployeeDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
	EmployeeDetails emp=new EmployeeDetails("dinga","tYS143", 961158955,"dinga@gmail.com","bangalore");
//step2:create object of object Mapper from jakson mapper
	ObjectMapper obj=new ObjectMapper();
	//step 3:write data into the json file
	obj.writeValue(new File("./EmployeeDetails.json"), emp);
	}
}
