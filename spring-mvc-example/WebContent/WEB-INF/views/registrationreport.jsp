<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration List</title>
</head>
<body>

	<h3>Registration List</h3>
	<form action="registrationreport" method="get">
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
		<th> Id </th>
			<th>UserName</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Doj</th>
			<th>Address</th>
			<th>MobileNo</th>
			<th>Password</th>
			
		</tr>
	
	<c:forEach var="rObj" items="${listRegistration}">
	<tr>
	           <td>${rObj.id}</td>
	           <td>${rObj.userName}</td>
				<td>${rObj.firstName }</td>
				<td>${rObj.lastName }</td>
				<td>${rObj.doj }</td>
				<td>${rObj.address}</td>
				<td>${rObj.mobileNo}</td>
				<td>${rObj.password}</td>
				
			<td>	<a href="editRegistration/${rObj.id}">Edit</a><br></td>
	          <td><a href="deleteRegistration/${rObj.id}">Delete</a><br> </td>
	</tr>
			</tr>
		</c:forEach>
		</form>
	</table>

</body>
</html>
	
	