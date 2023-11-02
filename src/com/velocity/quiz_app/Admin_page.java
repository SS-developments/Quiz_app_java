package com.velocity.quiz_app;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin_page {
	Admin_operations admin_op_obj = new Admin_operations();
	

	
	public  void admin_opt() throws ClassNotFoundException, SQLException {
		int admin_in;
		
		Scanner scan = new Scanner (System.in);
		do {
		
		System.out.println(" \tselect \n 1.Add  Questions \n 2. Result \n 3.Search Student Result ");
		 admin_in = scan.nextInt();
		} while(admin_in>3);
		
		switch (admin_in) {
		
		case 1: {
			
			admin_op_obj.add_questions();
			
		}break;
		
	case 2: {
	
		admin_op_obj.result();
			
		}break;
		
	case 3: {
		
		admin_op_obj.search_student();
		
	}break;
		
		}
		
	}
}
