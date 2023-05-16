<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Registration Page</h1>

	<form action="add" method="post">
		<input type="text" name="firstName"><br> 
		<input type="submit" value="Register">
	</form>
</body>
</html>