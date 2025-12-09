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
	<core:set var="name" value="swapna"></core:set>
	<core:out value="${name}"></core:out> 
	<core:if test="${name == 'swapna'}">
		<h1>Name is Swapna</h1>
	</core:if>
</body>
</html>