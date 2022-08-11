package POJOforSerilizationAndDeserilization;

public class Spouse {
String name;
String mail;
int phone;
public Spouse(String name, String mail, int phone) {
	super();
	this.name = name;
	this.mail = mail;
	this.phone = phone;
}
public String getname() {
	return name;
}
public void setname(String name) {
	name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}

}
