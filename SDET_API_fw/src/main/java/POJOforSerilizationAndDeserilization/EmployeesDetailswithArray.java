package POJOforSerilizationAndDeserilization;

import java.lang.reflect.Array;

import org.codehaus.jackson.map.ObjectMapper;

public class EmployeesDetailswithArray {
String name;
String id;
int[] phone;
String[] email;
String address;
public EmployeesDetailswithArray(String name, String id, int[] phone, String[] email, String address) {
	
	this.name = name;
	this.id = id;
	this.phone = phone;
	this.email = email;
	this.address = address;
}
public EmployeesDetailswithArray() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int[] getPhone() {
	return phone;
}
public void setPhone(int[] phone) {
	this.phone = phone;
}
public String[] getEmail() {
	return email;
}
public void setEmail(String[] email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
