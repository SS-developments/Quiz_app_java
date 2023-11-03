package com.velocity.quiz_app;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayQuestion {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	int score =0;
	  
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mp_db","root","Taklu@1721");
	
	 PreparedStatement pstm=con.prepareStatement("select * from question");
	 
	 ResultSet rs=pstm.executeQuery();
	 Scanner sc=new Scanner (System.in);
	 while(rs.next()) { // it will check next record is there or not
		 System.out.println("Qustion No: "+rs.getInt(1));// the no is clm index
		 System.out.println("Question: "+rs.getString(2)+"\n");
		 System.out.println(" 1) "+rs.getString(3));
		 System.out.println(" 2) "+rs.getString(4));
		 System.out.println(" 3) "+rs.getString(5));
		 System.out.println(" 4) "+rs.getString(6));
		 
		 System.out.println("\nEnter your correct Answer");
		 String i=sc.next();
		 String c_ans =rs.getString(7);
		 
		if (i.equals(c_ans)) {
			System.out.println("Correct");
			score++;
			System.out.println("your score is :"+score +"\n");
		}
		else {
			System.out.println("Incorrect");
			System.out.println("Correct Answer is: "+c_ans);
			System.out.println("your score is :"+score+"\n");
			
		}
	 }
	 con.close();
	 pstm.close();
	 rs.close();
	
}
}
	
		