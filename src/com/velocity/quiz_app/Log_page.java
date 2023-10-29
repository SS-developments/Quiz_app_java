package com.velocity.quiz_app;
import java.util.*;

public class Log_page {
	
	public static void main (String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int log_input;
	
		System.out.println ("Welcome ");
		do {
		
		System.out.println(" plase select \n 1.login \n 2.signup");
		
		 log_input = scan.nextInt();
		
	}while(log_input==3);
		
		
		switch (log_input) {
		
		
		case 1: {
			
			System.out.println(" login ");
		}
			break;
		case 2:{
			
			System.out.println(" signup");
		}
			break;
			
		
		
		
		
		
		}
	
		
		
		
		
		
		
		
	}

}
