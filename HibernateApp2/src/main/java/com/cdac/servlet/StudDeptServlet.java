package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.StudentDeptDao;
import com.cdac.entity.Department;
import com.cdac.entity.Student;

/**
 * Servlet implementation class StudDeptServlet
 */

public class StudDeptServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Student st = new Student();
		
		st.setName(request.getParameter("name"));
		st.setEmail(request.getParameter("email"));
		st.setYearOfAdms(LocalDate.parse(request.getParameter("doj")));

		StudentDeptDao dao = new StudentDeptDao();
		
		
		Department d  = dao.checkDname(Integer.parseInt(request.getParameter("dept")));
	    
		st.setDept(d);
		
		dao.add(st);
		PrintWriter out = response.getWriter();
		out.write("<h1>Record added!</h1>");
		
		
	}

}
