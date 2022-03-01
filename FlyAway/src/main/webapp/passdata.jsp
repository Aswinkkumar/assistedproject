<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: Blue;  
}  
</style>
</head>
<body>
<center>
<h1>Update Password</h1><br></br>
<form action="changepassword.jsp" method="post">
Enter existing password <input type="password" name="existing password"></br></br>
Enter new password <input type="password" name="new password"></br></br>
Confirm password <input type="password" name="confirm password"></br></br>
<input type="submit" value="change">
</form>
</body>
</center>
</html>