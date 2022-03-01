<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.sql.DriverManager, java.sql.Connection, java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Select Route:</h1>
	</center>
	<form action="showdetails.jsp" method="post">
	<datalist id="source">
		<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/flyaway";
		String user = "root";
		String pass = "Aswin@2468";
		String sql = "select name from places order by name";
		Connection con = DriverManager.getConnection(url, user, pass);
		ResultSet rs = con.createStatement().executeQuery(sql);
		while (rs.next()) {
			String source = rs.getString("name");
		%>
		<option value="<%=source%>" />
		<%
		}
		%>
	</datalist>
	<center>
	<p>
		Source: <input type="text" name="source" list="source" required/>
	</p>
	</center>
		<datalist id="destination">
		<%
		Class.forName("com.mysql.jdbc.Driver");
		String url1 = "jdbc:mysql://localhost:3306/flyaway";
		String user1 = "root";
		String pass1 = "Aswin@2468";
		String sql1 = "select name from places order by name";
		Connection con1 = DriverManager.getConnection(url1, user1, pass1);
		ResultSet rs1 = con.createStatement().executeQuery(sql1);
		while (rs1.next()) {
			String destination = rs1.getString("name");
		%>
		<option value="<%=destination%>" />
		<%
		}
		rs.close();
		con.close();
		%>
		
	</datalist>
	<style>
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color:Gray;  
}  
</style>
<div align ="center">
	<p>
		Destination: <input type="text" name ="destination" list="destination" required/>
		<h2>Enter your details</h2>
		<%
		int count = Integer.parseInt(request.getParameter("no of persons"));
		for (int i = 1; i <= count; i++) {
		%>
		Passenger Name <%=i %> : <input type="text" name="fullname" required> </br> </br> 
		Aadhar No <%=i %> : <input type="integer" name="No" required></br> </br>
		Phone Number <%=i %> : <input type="integer" name="phone" required> </br> </br> 
		Age <%=i %> : <input type="number" name="age" required></br></br>
		-----------------------------------------------------------------------</br></br>
		<%
		}
		%>
		<input type="submit" value="Book Ticket"></br></br>
	</form>
	</div>
</body>
</html>