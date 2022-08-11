package POJOforSerilizationAndDeserilization;

public class EmployeeDetailsWithSpouse {
String name;
String email;
int phno;
Spouse s;
public EmployeeDetailsWithSpouse(String name, String email, int phno, Object spouse) {
	super();
	this.name = name;
	this.email = email;
	this.phno = phno;
	this.s = s;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public Spouse getS() {
	return s;
}
public void setS(Spouse s) {
	this.s = s;
}



}
