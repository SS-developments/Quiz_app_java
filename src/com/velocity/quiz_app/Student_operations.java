package com.velocity.quiz_app;

import java.util.Scanner;

public class Student_operations {
	
	// 1. give a test  2. see result 
	
	
	public static void Student_opt() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("select opetion\n\t1.Give Test \n\t2.See Result ");
		int selected_opt=scan.nextInt();
		
		switch (selected_opt) {
		
		case 1: {
			
			System.out.println(" welcome to test ");
			System.out.println(" you alredy given test");
			
		}break;
		
		
		case 2: {
			
			System.out.println(" your test mark :  ");
			System.out.println(" you not given test");
		}
		break;
		
		}
		
		
		
	}
	

}
