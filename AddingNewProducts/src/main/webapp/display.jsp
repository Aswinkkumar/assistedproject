<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
</head>
<body>
<center>
<form action="Prompt" method="post" productname="form_name" id="form_id"
		class="form_class">
		<label for="name">ProductName:</label><br> <input type="text" id="productname"
			productname="productname"><br> <label for="productdesc">ProductDescription:</label><br>
		<input type="text" id="productdesc" name="productdesc"><br>
		<br> <input type="submit" value="Submit">
			
	</form>
	</center>
</body>
</html>