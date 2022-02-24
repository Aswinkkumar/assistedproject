<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  padding: 5px;
}
</style>
</head>
<body>
<jsp:useBean id="product" class="com.portal.Product" scope="session"></jsp:useBean>
<div align="center">
<h3>Product Details : </h3> 
<br><table >
<tr>
<th>Product ID 	</th>
<th>Product Name	</th>
<th>Product Type 	</th>
<th>Product Price  </th>
</tr>
<tr>
<td><jsp:getProperty property="id" name="product"/></td>
<td><jsp:getProperty property="productname" name="product"/></td>  
<td><jsp:getProperty property="producttype" name="product"/></td>  
<td><jsp:getProperty property="price" name="product" /></td>
</tr>
</div>
<br></br>
</table>
<center><a href = "index.html"> Click here to go back to main page</a></center></h2><br/><br/></br>
 
</body>
</html>