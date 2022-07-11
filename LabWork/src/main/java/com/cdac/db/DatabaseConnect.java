package com.cdac.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnect {
	public void showDetails(){
		Connection conn = null;
				try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webDevelopment", "root", "cdac");
			
			PreparedStatement stt = conn.prepareStatement("select * from empDetails");
		
			
			ResultSet rs = stt.executeQuery();
			
			conn.close();
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
			}
		
	}
}
