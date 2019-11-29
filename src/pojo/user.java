package pojo;

public class user {
  private int id;
  private String name;
  private String email;
  private String phone;
  private String password;
  private String role;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}


public user(int id, String name, String email, String phone, String password, String role) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.password = password;
	this.role = role;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	user other = (user) obj;
	if (id != other.id)
		return false;
	return true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
  return String.format("%-5d%-15s%-15s%-15s%-15s%-15s",this.id,this.name,this.email,this.phone,this.password,this.role);
}


 
}
