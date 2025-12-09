<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Database connectivity"></c:out><br>
	<sql:setDataSource var="ds" 
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/mphasisdb"
		user="root"
		password=""/>
		
	<sql:query var="rs" dataSource="${ds}">
		select * from emptable;
	</sql:query>
	
	<!-- employeeid, empname, mobile, address, deptid, age, email -->
	<c:forEach var="item" items="${ rs.rows}">
	Employee Id : <c:out value="${item.employeeid}"></c:out><br>
	Employee Name : <c:out value="${item.empname}"></c:out><br>
	address : <c:out value="${item.address}"></c:out><br>
	deptid : <c:out value="${item.deptid}"></c:out><br>
	Mobile : <c:out value="${item.mobile}"></c:out><br>
	age: <c:out value="${item.age}"></c:out><br>
	email : <c:out value="${item.email}"></c:out><br>
	</c:forEach>
	<sql:transaction>
	 <sql:update var="insert" dataSource="${ds}">
		insert into emptable 
		(employeeid, empname, mobile, address, deptid, age, email)
		values
		(9999,'preethi','7878787878','chennai',1,40,'preethi1@gmail.com')
	</sql:update>
	</sql:transaction>
	<c:out value="${insert}"></c:out> 
	
</body>
</html>