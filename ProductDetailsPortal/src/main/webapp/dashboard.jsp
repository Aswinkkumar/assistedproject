<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <jsp:include page="welcome.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<jsp:useBean id="product" class="com.portal.Product" scope="session"/>
	<jsp:setProperty property="id" name="product"/>  
	<jsp:setProperty property="productname" name="product"/>  
	<jsp:setProperty property="producttype" name="product"/>  
	<jsp:setProperty property="price" name="product"/>  <br><br>
	
<b><h2>
<center><a href = "detail.jsp"> Click here to get the Product Details</a></center></h2></b><br><br>


</body>
</html>