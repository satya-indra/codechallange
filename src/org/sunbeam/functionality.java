package org.sunbeam;

public class functionality {
 private String role;
 
 public void setRole(String role) {
	this.role = role;
}
 
 public int menuListOwner() {
	System.out.println("0. Sign Out");
	System.out.println("1. Edit Profile");
	System.out.println("2. Change Password");
	System.out.println("3. Subjectwise Copies Report");
	System.out.println("4. Bookwise Copies Report");
	System.out.println("5. Fees/Fine Report");
	System.out.println("Enter your Choice");
	return program.sc.nextInt();
}
 
 public void menuListlib() {
		
}
 
 public void menuListuser() {
		
}
 
 public void functions() {
	 if(this.role == "liberarian")
		{
		   	
		}
		else if (this.role == "user")
		{
			
		}
		else if (this.role == "owner")
		{
			
		}
		else
		{
			System.out.println("Not Valid User Name Or Password");
		}
}
}
