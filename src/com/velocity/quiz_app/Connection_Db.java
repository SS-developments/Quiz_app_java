package com.velocity.quiz_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_Db {

Connection con=null;
	
	public Connection getConnectionQuestion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mp_db","root","Taklu@1721");
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
}
