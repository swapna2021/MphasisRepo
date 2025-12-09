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
	
	<core:set var="uname" value="${ param.uname}"></core:set>
	<core:set var="pwd" value="${param.pwd}"></core:set>
	<core:if test="${uname =='swapna' && pwd=='swapna' }">
		<h1>Authentication successfull</h1>
		<core:redirect url="success.jsp"></core:redirect>
	</core:if>
	 <core:if test="${uname!='swapna' || pwd!='swapna' }">
	<h1>Invalid credentials</h1>
	</core:if> 
	
	
	
</body>
</html>