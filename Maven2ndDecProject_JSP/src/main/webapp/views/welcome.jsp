<%@ page language="java" contentType="text/html; charSet=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:red">Welcome....</h1>
	<h3>Username:</h3><%String uname= request.getParameter("uname");%>
	<h3>Password:</h3><%String pwd=request.getParameter("pwd"); %>
	<%
		if(uname.equals("swapna")&&pwd.equals("swapna")){
			session.setAttribute("uname",uname);
		response.sendRedirect("success.jsp");
		}
		else
			response.sendRedirect("error.jsp");
	%>
</body>
</html>