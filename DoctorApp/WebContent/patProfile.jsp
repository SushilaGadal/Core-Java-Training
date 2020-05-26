<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<h2 align="center"> Patient Profile</h2>
<title>Patient Profile</title>
</head>

<body bgcolor="E8DAEF">

<table align="center" width ="300" height="150">
<tr><td>
<a  href="patProfile.jsp">Patient Profile</a>
</td>
<td>
<a  href="index.html">LogOut</a> 
</td></tr>

<%@page import="java.sql.*" %>
<table align="center" width ="600" height="150" border="2">
<tr><td>Patient Id</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
</tr>



<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
String username = "root";
String password = "band12.6"; 
Connection con = DriverManager.getConnection(url, username, password);
Object ob=session.getAttribute("pid"); // get attribute is a instance factory method
int pid=(Integer)ob;
PreparedStatement ps=con.prepareStatement("select * from patient where pid=?");
ps.setInt(1,pid);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("pid") %></td> 
<td><%=rs.getString("username") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getLong("phone") %></td>

<%
} 
%>
  
</table>

</table> 

</body>
</html>