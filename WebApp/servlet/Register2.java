package com.cdac.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.Register2Service;

/**
 * Servlet implementation class RegisterServlet
 */

//  Preventing duplicate insertion of same email registration

// Alternative for @WebServlet ----- see web.xml
//@WebServlet("/newRegister")

public class Register2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int mobileNo = Integer.parseInt(request.getParameter("mobileNo"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// By using seperate class for JDBC purpose
		Register2Service reg = new Register2Service();
		
		
		boolean status = reg.checkStatus(email);
		if(status==true) {
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Registration unsuccessful!</h1>");
			out.write("</body></html>");
			
			}else {
			    reg.addData(name, email, mobileNo, username, password);
				PrintWriter out = response.getWriter();
				out.write("<html><body>");
				out.write("<h1>Registration successful!</h1>");
				out.write("</body></html>");
			
			}
		
		}
	}
		
		
		//without using class for JDBC purpose ......
		
//		Connection conn = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webDevelopment", "root", "cdac");
//			boolean status = false;
//			PreparedStatement stt = conn.prepareStatement("select count(*) from tbl_customer where email = ?");
//			stt.setString(1,email);
//			ResultSet rs = stt.executeQuery();
//			
//			if(rs.next()) {
//				int c =rs.getInt(1);
//				if(c==1)
//					status=true;
//			}
//			
//	
//			
//		
		
	//		if(!status) {
		
			
		//			PreparedStatement st = conn.prepareStatement("insert into tbl_customer(name, email, mobileno, username, password) values(?, ?, 					?, ?, ?)");
		//			st.setString(1, name); //substituting ? with actual value
		//			st.setString(2, email);
		//			st.setInt(3, mobileNo);
		//			st.setString(4, username);
		//			st.setString(5, password);
		//			st.executeUpdate();
		//			
		//			PrintWriter out = response.getWriter();
		//			out.write("<html><body>");
		//			out.write("<h1>Registration successful!</h1>");
		//			out.write("</body></html>");
		//			conn.close();
//	
//		
		//		}else {
		//			PrintWriter out = response.getWriter();
		//			out.write("<html><body>");
		//			out.write("<h1>Registration unsuccessful!</h1>");
		//			out.write("</body></html>");
		//			conn.close();
		//		}
		//		
//		
//		
//		
//			} catch(Exception e) {
//		
//					e.printStackTrace();
//				}
//	}
		
		
//		}
//	}


