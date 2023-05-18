<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>

	<form action="verifylogin" method="post">
	<table style="with:10%">
	
	    
	     <tr>
	    <td> UserName </td>
		<td><input type="text" name="userName"/></td><br>
		</tr>
	    <tr>
	    <td> Password </td>
		<td><input type="password" name="password"/></td><br>
		</tr>
		</table>
		 <input type="submit" value="Login">
		
</body>
</html>