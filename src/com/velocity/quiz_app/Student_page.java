package com.velocity.quiz_app;

import java.util.Scanner;

public class Student_page {
	
	// 1. give a test  2. see result 
	
	
	public static void Student_opt_page(String s_username) {
		String user = s_username;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("select opetion\n\t1.Give Test \n\t2.See Result ");
		int selected_opt=scan.nextInt();
		
		switch (selected_opt) {
		
		case 1: {
			
			System.out.println(user);
			
			if(user.equals(user)) {
				
				System.out.println(" you alredy given test");
				System.out.println("Your Score was: ");
				
			}
			else {
				
				System.out.println(user);
				System.out.println(" welcome to test ");
				System.out.println("call test method");
			}
			
			
			
			
		}break;
		
		
		case 2: {
			
			System.out.println(" your test mark :  ");
			System.out.println(" you not given test");
		}
		break;
		
		}
		
		
		
	}
	

}
