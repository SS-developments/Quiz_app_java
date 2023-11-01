package com.velocity.quiz_app;

import java.util.Scanner;

public class Login_page {
	
//	
//	public static void main(String[] args) {
//		
//		login();
//	}
	
	
	public   void login() {
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
			
			
			System.out.println("login success");
		}
		break;
		
		
		case 2: {
			System.out.println("admin");
			System.out.println("Hello Admin \n user name:Admin");
			System.out.println(" plase enter password:");
//			String u_name= login_sc.next();
		}
		break;
		
		
		}
		
	}
	
	
}
