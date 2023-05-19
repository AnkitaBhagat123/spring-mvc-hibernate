<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Registration Form</title>
</head>
<body>
<form action="edit" method="post">
	<table style="with:10%">
	
	    <!-- <input type="text" name="id"><br> -->
	     <tr>
	    <td> UserName </td>
		<td><input type="text" name="userName"/></td><br>
		</tr>
	    <tr>
	    <td> First Name </td>
		<td><input type="text" name="firstName"/></td><br>
		</tr>
		<tr>
		<td> Last Name </td>
		<td><input type="text" name="lastName"/></td><br>
		</tr>
		<tr>
		<td> DOJ </td>
		<td><input type="date" name="doj"/></td><br>
		</tr>
		<tr>
		<td> Address
		<td><input type="text" name="address"/></td><br>
		</tr>
		<tr>
		<td> MobileNo </td>
		<td><input type="text" name="mobileNo"/></td><br>
		</tr>
		<tr>
		<td> Password </td>
		<td><input type="password" name="password"/></td><br>
		</tr>
		
		
		</table>
		 <input type="submit" value="Edit">
	</form>
</body>
</html>