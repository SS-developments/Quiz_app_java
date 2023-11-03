package com.velocity.quiz_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin_operations {
//	1.Add  Questions \n 2. Result \n 3.Search Student Result
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Admin_operations obj = new Admin_operations();
		obj.add_questions();
		
	}
	
	public void add_questions() throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter question :");
		String question=scan.nextLine();
		System.out.println("Enter option 1");
		String option_1 = "1. "+scan.nextLine();
		System.out.println("Enter option 2");
		String option_2 = "2. "+scan.nextLine();
		System.out.println("Enter option 3");
		String option_3 = "3. "+scan.nextLine();
		System.out.println("Enter option 4");
		String option_4 = "4. "+scan.nextLine();
		System.out.println("Enter Correct Answer");
		String correct_ans=scan.nextLine();
		
//		load driver 
		
		Class.forName("com.mysql.jdbc.Driver");
		
//		 connection establish 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_app_db", "root", "Admin@1721");
		
		String querry="insert into quiz_app_db.question_data(question,option_1,option_2,option_3,option_4,correct_ans)values( ?,?,?,?,?,?)";
		
		PreparedStatement p_stmt = con.prepareStatement(querry);
		
		
		p_stmt.setString(1, question);
		p_stmt.setString(2, option_1);
		p_stmt.setString(3, option_2);
		p_stmt.setString(4, option_3);
		p_stmt.setString(5, option_4);
		p_stmt.setString(6, correct_ans);
		
		p_stmt.executeUpdate();		
		
		System.out.println(" question added");
		
		con.close();
		p_stmt.close();
	}
	
	
	public void result() {
		System.out.println(" called result method");
	}
	public void search_student() {
		System.out.println(" called search student");
	}
}
