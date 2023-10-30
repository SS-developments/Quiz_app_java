package com.velocity.quiz_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_registration_page {
	
						// column name in DB
	 String firstname;   // s_name 
	 String lastname;	// s_lastName
	 String username;	// s_userName
	 String password;	// s_password
	 String city;		// s_city
	 String email;		// s_email
	 String mobileNumber; // s_mobileNo
	
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Student_registration_page obj = new Student_registration_page();
		 obj.std_reg();
		
		 
	}
	
	
	public  void std_reg() throws ClassNotFoundException, SQLException {
		Scanner reg_sc = new Scanner(System.in);
		
		System.out.println("Enter your First Name");
		firstname=reg_sc.next();

		System.out.println("Enter your Last Name");
		lastname=reg_sc.next();
		
		System.out.println("Enter a username");
		username=reg_sc.next();
		
		System.out.println("Enter a password");
		password=reg_sc.next();
		
		System.out.println("Enter your city ");
		city=reg_sc.next();
		
		System.out.println("Enter your Email");
		email=reg_sc.next();
		
		System.out.println("Enter your mobile number");
		mobileNumber=reg_sc.next();
		
		// load driver 
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// server / database URL 
//		String url="jdbc:mysql://localhost:3306/quiz_app_db";
		
		// establish  connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_app_db", "root", "Admin@1721");
		
		String querry="insert into quiz_app_db.student_registration(s_name,s_lastName,s_userName,s_password,s_city,s_email,s_mobileNo)values( ?,?,?,?,?,?,?)";
		// create statement 
		PreparedStatement pstmt = con.prepareStatement(querry);
		
	
		
		// set  values 
		pstmt.setString(1, firstname);
		pstmt.setString(2, lastname);
		pstmt.setString(3, username);
		pstmt.setString(4, password);
		pstmt.setString(5, city);
		pstmt.setString(6, email);
		pstmt.setString(7, mobileNumber);
		
	  try {
		pstmt.executeUpdate();
	
		
		System.out.println(" \n\tRegistration successful!!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("use unique username !!  data not recorded");
	}
	
		
		con.close();
		pstmt.close();
	
		
		
	}

}
