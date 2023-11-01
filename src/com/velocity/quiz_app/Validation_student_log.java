package com.velocity.quiz_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Validation_student_log {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter username");
		String user_name=sc.next();
		username_validation(user_name);
		
	}
	
	public static void username_validation(String user_name) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner (System.in);
		
		
//		 load driver 
		
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_app_db", "root", "Admin@1721");
		
		String querry = "select * from quiz_app_db.student_registration";
		
		PreparedStatement p_stmt = con.prepareStatement(querry);
		
//		 creating reference for storing data from DB
		
		ResultSet rs = p_stmt.executeQuery();
		
		while (rs.next()) {
			String usernmae =rs.getString(4);
			String pass=rs.getString(5);
			if (usernmae.equals(user_name)) {
				System.out.println("Enter Password");
				String s_pass =sc.next();
				if(s_pass.equals(pass)) {
					
					System.out.println("\n\tlogin success!!");
				}
				
				else {
				System.out.println("wrong password plz restart and try again");
				}
				
				
			}
			else {
				System.out.println("plaze  register first ");
			}
		}
		
//		System.out.println(" now ask password");
		con.close();
		p_stmt.close();
		
		
	}

}
