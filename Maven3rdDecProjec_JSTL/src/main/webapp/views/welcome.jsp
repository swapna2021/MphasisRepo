<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<core:out  value="Befor remove cname is ${applicationScope.cname}"></core:out>
	<core:remove var="cname" scope="application"></core:remove>
	<core:out  value="After remove cname is ${applicationScope.cname}"></core:out>
</body>
</html>