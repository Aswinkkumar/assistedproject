<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriplet</h1>
<hr>
<%
out.print("Hello World with JSP Programming");
%>
<h1>Declaration</h1>
<hr>
<%! int a=40;int b=20;%>
<%!public int cube(int n) 
{
	return n*n*n;
}
%>
<h1>Expression</h1>
<hr>
<%= "Result is " +a+b %><br>
<%="Cube of 5 is "+cube(5) %>
<a href="implicit.jsp?implicit">implicit page</a><br>

</body>
</html>