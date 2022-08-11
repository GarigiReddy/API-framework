package POJOforSerilizationAndDeserilization;

public class EmployeeDetails {
//step1: Declare  all the variales  as global
	String Ename;
	String eid;
	int phone ;
	String Email;
	String Address;
	//step2 : create constructor to initialise
	public EmployeeDetails(String ename, String eid, int phone, String email, String address) {
		
		Ename = ename;
		this.eid = eid;
		this.phone = phone;
		Email = email;
		Address = address;
	}
	// create empty constuctor
	public EmployeeDetails() {
	}	//step 3: use getters and setters to access
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
