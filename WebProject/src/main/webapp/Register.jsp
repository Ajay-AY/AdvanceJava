<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<style>
table, th, td {
	border:1px solid white;
	background-color:aqua;
	color:black;
	text-align:center;
	font-family: cursive;
	}
table{
	margin-top:10px;
	margin-left:10%;
}
	
body {
 background-color:skyblue;\r\n
}
</style>
<body>
 <%@ page import = "java.sql.*" %>
 
<%

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webDevelopment", "root", "cdac");
	String str="select * from tbl_customer ";
	 
	Statement stat=conn.createStatement();
	ResultSet set=stat.executeQuery(str); %>
	
<h1 style="text-align:center; font-family: Verdana">Customer Table</h1>
<table style="width:80%">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Mobile Number</th>
<th>User Name</th>
<th>Password</th>
</tr>
<%
while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String email=set.getString(3);
			long mob=set.getLong(4);
			String uname=set.getString(5);
			String pass=set.getString(6);
			
%>
<tr>
<td><%=id %></td>
<td><%=name %></td>
<td><%=email %></td>
<td><%=mob %></td>
<td><%=uname %></td>
<td><%=pass %></td>
</tr>
<%}%>
</table>
<% }catch(Exception e) {
	e.printStackTrace();
} %>


</body>
</html>