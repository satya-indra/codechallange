package org.sunbeam;

import java.util.Scanner;

public class program 
{
	public static Scanner  sc = new Scanner(System.in);
	private static int  menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Sign In");
		System.out.println("2.Sign out");
		System.out.print("Enter your Choice");
		return sc.nextInt();
	}
  public static void main(String[] args) {
	int choice;
	String uname;
	String password;
	try (DAO.Login daologin = new DAO.Login();)
	{
	   while((choice = program.menuList())!=0)
	{
		switch(choice)
		{
		case 1:
			System.out.print("Enter user name::");
			program.sc.nextLine();
			uname=program.sc.nextLine();
			System.out.print("Enter user password::");
			password=program.sc.nextLine();
			daologin.select(uname, password);
		break;
		case 2 :
			choice=0;
			break;
		};
	}
    }
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
