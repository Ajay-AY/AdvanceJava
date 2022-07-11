package com.cdac.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Register2Service {
	
	public boolean checkStatus(String email) {
		Connection conn = null;
		boolean status = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webDevelopment", "root", "cdac");
			
			PreparedStatement stt = conn.prepareStatement("select count(*) from tbl_customer where email = ?");
		
			stt.setString(1,email);
			ResultSet rs = stt.executeQuery();
			
			if(rs.next()) {
				int c =rs.getInt(1);
				if(c==1)
					status=true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		return status;
	}


	public boolean checkLogin(String user,String pass){
		Connection conn = null;
		boolean status = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webDevelopment", "root", "cdac");
			
			PreparedStatement stt = conn.prepareStatement("select username,password from tbl_customer");
		
			
			ResultSet rs = stt.executeQuery();
			
			if(rs.next()) {
				String uname =rs.getString(1);
				String pwd =rs.getString(2);
				if(user.equals(uname) && pass.equals(pwd))
					status=true;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		return status;
	}




	public void addData(String name,String email,int mobileNo,String username,String password) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webDevelopment", "root", "cdac");
		PreparedStatement st = conn.prepareStatement("insert into tbl_customer(name, email, mobileno, username, password) values(?, ?, ?, ?, ?)");
		st.setString(1, name); //substituting ? with actual value
		st.setString(2, email);
		st.setInt(3, mobileNo);
		st.setString(4, username);
		st.setString(5, password);
		st.executeUpdate();
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
	}
	
}

