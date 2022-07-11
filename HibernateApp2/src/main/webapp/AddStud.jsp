<%@page import="com.cdac.entity.Department"%>
<%@page import="com.cdac.dao.StudentDeptDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="StudDeptServlet">
Enter Student Name : <input type="text" name="name" /> <br />
Enter Email : <input type="text" name="email" /> <br />
<%  
   Department d = new Department();
  StudentDeptDao dao = new StudentDeptDao();
%>
  Select Department:
  <select name="dept" >
<%
List<Department> dept = dao.fetchAll();
for(int i=0; i<dept.size(); i++) {
	 d = dept.get(i);
%>
  
			
  
  <option value="1">
  <%=d.getDname() %>
  </option>
 
			
		
<%
		}
%>
		 </select>
		 
		  <br>
  
Enter date of joining : <input type="date" name="doj" /> <br />
<button type="submit">Add</button>
</form>
</body>
</html>