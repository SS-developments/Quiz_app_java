package com.velocity.quiz_app;
import java.util.*;

public class Log_page {
	
	public static void main (String args[]) {
		
		// different  objects for different class to access methods 
		Login_page Login_page_obj = new Login_page();
		
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
			
			System.out.println(" Student Registration ");
		}
			break;
			
		
		}
	
		
	}

}
