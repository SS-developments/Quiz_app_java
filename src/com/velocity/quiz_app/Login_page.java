package com.velocity.quiz_app;

import java.sql.SQLException;
import java.util.Scanner;

public class Login_page {
	Validation_student_log valid_std_obj = new Validation_student_log();
//	
//	public static void main(String[] args) {
//		
//		login();
//	}
	
	
	public   void login() throws ClassNotFoundException, SQLException {
		
//		Validation_student_log class object 
	
		Scanner login_sc = new Scanner (System.in);
		int  login_i;
		
		do {
		System.out.println("\nselct login \n 1.Student \n 2.Admin");
		  login_i =  login_sc.nextInt();
		}while(login_i>2);
		
		switch (login_i) {
		
		
		case 1: {
			
			System.out.println("\n\twelcome back student\n \n plase enter user name:");
			String u_name= login_sc.next();
			valid_std_obj.username_validation(u_name);
			
			
//			System.out.println("login success");
		}
		break;
		
		
		case 2: {
			
//			 adding hardcode    password for Admin  login 
			String A_pass = "123";
			System.out.println("Hello Admin \n user name:Admin");
			System.out.println(" plase enter password:");
			if (A_pass.equals(login_sc.next())) {
				System.out.println(" admin login successful!");
			}
			else {
				System.out.println(" wrong password ");
			}

		}
		break;
		
		
		}
		
	}
	
	
}
