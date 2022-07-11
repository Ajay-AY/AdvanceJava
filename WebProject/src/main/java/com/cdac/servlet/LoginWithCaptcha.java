package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.service.Register2Service;

/**
 * Servlet implementation class LoginWithCaptcha
 */
@WebServlet("/loggMeIn")
public class LoginWithCaptcha extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		String capt = request.getParameter("captcha");
		
		Register2Service reg = new Register2Service();
		
		if(capt.equals(CaptchaServlet.captcha) && reg.checkLogin(uname, pass)){
			
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Welcome to homepage</h1>");
			out.write("</body></html>");
			
			
		}else {
			
			
			response.sendRedirect("loginWithCaptcha.html");
			
		}
		
	}

}
