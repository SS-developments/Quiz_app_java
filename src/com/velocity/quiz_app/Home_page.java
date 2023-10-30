package com.velocity.quiz_app;
import java.sql.SQLException;
import java.util.*;

public class Home_page {
	
	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		
		// different  objects for different class to access methods 
		Login_page Login_page_obj = new Login_page(); // login class object 
		
		Student_registration_page reg_obj = new Student_registration_page();
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int log_input;
	
		System.out.println ("\t\t\t\tWelcome\n ");
		
		do {		    // adding do-while for getting correct input from user 
		
		System.out.println(" plase select \n 1.login \n 2.Registration");
		
		 log_input = scan.nextInt();
		
	}while(log_input==3);
		
		
		
		switch (log_input) {
		
		
		case 1: {
			Login_page_obj.login();
			
		}
			break;
		case 2:{
			
			System.out.println(" Welcome student ");
			reg_obj.std_reg();
			
			System.out.println(" \n\n\tNow restart and login ");
			
			
		}
			break;
			
		
		}
	
		
	}

}
