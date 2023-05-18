<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Home Page</h1>

	<P>The time on the server is ${serverTime}.</p>
	
	

	<form action="user" method="post">
	<tr>
	
	</tr>
	<tr>
		
<a href="registration">Register</a> 
		<a href="login">Login</a>
		
	</form>
</body>
</html>