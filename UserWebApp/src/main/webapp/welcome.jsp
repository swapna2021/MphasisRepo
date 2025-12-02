<%@page import="jakarta.servlet.RequestDispatcher"%>
<%@page import="jakarta.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- Using Cookies
		String uname=null;
		Cookie[] cookies=request.getCookies();
		if(cookies!=null){
			for(Cookie c:cookies){
				if("user".equals(c.getName()))
					uname=c.getValue();
			}
		}	
		if(uname==null)
			response.sendRedirect("error.jsp");
			
	%> --%>
	
	<%-- <%
		/* url rewritting */
		String uname=request.getParameter("uname");
		if(uname==null)
		response.sendRedirect("error.jsp");
	%>
	 --%>
	 
	 
	 <%
	 	String uname= (String)session.getAttribute("uname");
	 	String token=(String)session.getAttribute("token");
	 	if(token==null){
	 		RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
	 		rd.forward(request,response);
	 	}
	 
	 %>
	 
	 <script>
	 	sessionStorage.setItem("token",<%=session.getAttribute("token") %>)
	 </script>
	<h1>Welcome <%= uname %></h1>
	<h2>Token <%=token %></h2>
</body>
</html>