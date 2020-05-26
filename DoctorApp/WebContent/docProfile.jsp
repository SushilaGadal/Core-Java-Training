<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<h2 align="center"> Doctor Profile</h2>
<title>Doctor Home</title>
</head>

<body bgcolor="E8DAEF">

<table align="center" width ="300" height="150">
<tr><td>
<a  href="docProfile.jsp">Doctor Profile</a>
</td>
<td>
<a  href="index.html">LogOut</a> 
</td></tr>

<%@page import="java.sql.*" %>
<table align="center" width ="600" height="150" border="2">
<tr><td>Doctor Id</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Specialist</td>
</tr>



<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
String username = "root";
String password = "band12.6"; 
Connection con = DriverManager.getConnection(url, username, password);
Object ob=session.getAttribute("id"); // get attribute is a instance factory method
int id=(Integer)ob;
PreparedStatement ps=con.prepareStatement("select * from doctor where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("id") %></td> 
<td><%=rs.getString("username") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getLong("phone") %></td>
<td><%=rs.getString("specialist") %></td>
<%
} 
%>
  
</table>

</table> 

</body>
</html>