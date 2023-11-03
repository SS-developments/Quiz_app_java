package com.velocity.quiz_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Question_DB {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc= new Scanner(System.in);
//		System.out.println("how many  Question do you want to add");
//		System.out.println("Enter the number");
//		int num =sc.nextInt();
		
		
//		for(int i=1;i<=num;i++) {
		System.out.println("Enter the  Question");
		String question=sc.nextLine();
//		System.out.println(question);
		System.out.println("Enter the Option 1");
		String option_1=sc.nextLine();
		System.out.println("Enter the Option 2");
		String option_2=sc.nextLine();
		System.out.println("Enter the Option 3");
		String option_3=sc.nextLine();
		System.out.println("Enter the Option 4");
		String option_4=sc.nextLine();
		System.out.println("Enter the Answer ");
		String answer=sc.nextLine();
		
//		System.out.println(question + option_1+option_2+option_3+option_4+answer);
			
			
			Question_DB db=new Question_DB();
			db.questionData(question, option_1,option_2,option_3,option_4,answer );
			sc.close();
		    }
//	}
	
	
	   Connection con=null;  
	
	   PreparedStatement pstm=null;
	
		
	   public void questionData(String Question,String Option_1,String Option_2,String Option_3,String Option_4,String Answer) throws SQLException    {
		   
		   try {
			   Connection_Db ct= new Connection_Db();
			   con=ct.getConnectionQuestion();
			   pstm=con.prepareStatement("insert into question(Question,Option_1,Option_2,Option_3,Option_4,Answer)values(?,?,?,?,?,?)");
			   pstm.setString(1, Question);
			   pstm.setString(2, Option_1);
			   pstm.setString(3, Option_2);
			   pstm.setString(4, Option_3);
			   pstm.setString(5, Option_4);
			   pstm.setString(6, Answer);
			   
			   int i=pstm.executeUpdate();
			   System.out.println(" Insertion Successfully");
			   
		   } catch (SQLException e) {
			   
			   e.printStackTrace();
		   }finally {
			   con.close();
			   pstm.close();
		   }
		   
		   
	   }
}
