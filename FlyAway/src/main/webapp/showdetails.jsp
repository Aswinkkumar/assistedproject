<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%
String SOURCE = request.getParameter("source");
String DESTINATION = request.getParameter("destination");
String time = "10:45 PM";
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/flyaway";
String user = "root";
String pass = "Aswin@2468";
String sql = "select * from flights where source='" + SOURCE + "'and destination='" + DESTINATION + "'";
Connection con = DriverManager.getConnection(url, user, pass);
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
%>
<center>
<h1>Your Flight Details :</h1>
<table border="1">
	<tr>
		<th>Flight name</th>
		<th>airline</th>
		<th>way</th>
		<th>price</th>
		<th>source</th>
		<th>destination</th>
		<th>Time</th>
	</tr>
	<%
	while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getString(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getString(3)%></td>
		<td><%=rs.getString(4) + "/-"%></td>
		<td><%=rs.getString(5)%></td>
		<td><%=rs.getString(6)%></td>
		<td><%=time%></td>
	</tr>
	<%
	}
	%>
</table>
</center>
</br>
<style>
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: Green;  
}  
</style>
<center>
<form action="payment.jsp" method="post">
	No of Persons <input type="number" name="no of persons" required></br> </br>
	<h1>Payment Details :</h1>
	Debit card Number : <input type="integer" required></br>
	</br> Expiry Date : <input type="date"></br>
	</br> CVV : <input type="integer" required></br>
	</br> <input type="submit" value="submit" ></br>
	</br>
<a href="home.jsp">Return Back TO Home Page</a> 
</form>
</center>
</html>