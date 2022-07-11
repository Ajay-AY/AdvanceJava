package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.StudentDeptDao;
import com.cdac.entity.Department;

/**
 * Servlet implementation class Department
 */
public class DepartmentServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDeptDao dao = new StudentDeptDao();
		
		Department d = new Department();
		d.setDname(request.getParameter("name"));
		d.setHod(request.getParameter("hod"));
		
		dao.add(d);
		
		PrintWriter out = response.getWriter();
		out.write("<h1>Record added!</h1>");
		
	}

}
