<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
<%-- <h3> RegistrationId: ${regObj.id}</h3> --%>
<h3> UserName: ${regObj.userName}</h3>
<h3> First Name: ${regObj.firstName}</h3>
<h3> Last Name: ${regObj.lastName}</h3>
<h3>DOJ: <fmt:formatDate pattern="dd/MM/yyyy" value="${regObj.doj}" /></h3>
<%-- <h3> DOJ: ${regObj.doj }</h3>	 --%>
<h3> Address: ${regObj.address}</h3>
<h3> MobileNo: ${regObj.mobileNo}</h3>
<h3> Password: ${regObj.password}</h3>


</body>
</html>