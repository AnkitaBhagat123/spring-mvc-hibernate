<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Report</title>
<h1>Registration Page</h1>

	<form action="addReport" method="post">
	<th>
	<thread>
	<tr>
	
	<th scope="col">userName</th>
	<th scope="col">firstName</th>
	<th scope="col">lastName</th>
	<th scope="col">doj</th>
	<th scope="col">address</th>
	<th scope="col">mobileNo</th>
	<th scope="col">password</th>
	<th scope="col">Edit</th>
	<th scope="col">Delete</th>
	</tr>
	</thread>
	
	<c:forEach var="registration" items="&{registration}">
	<tr>
	
	<td> $ {rObj.userName}</td>
	<td> $ {rObj.firstName}</td>
	<td> $ {rObj.lastName}</td>
	<td> $ {rObj.doj}</td>
	<td> $ {rObj.address}</td>
	<td> $ {rObj.mobileNo}</td>
	<td> $ {rObj.password}</td>
	<td><a=href="editRegistration/${rObj.edit}"></a>
	Edit </a></td>
	<td><a=href="deleteRegistration/${rObj.delete}"></a>
	Delete </a></td>
	</tr>
	</c:forEach>
	
</head>
<body>

</body>
</html>