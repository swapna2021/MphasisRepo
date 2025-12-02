
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charSet=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<!-- jsp Expression -->
<h2><%= "Hello World!" %></h2>

<h3>current time:<%=new java.util.Date() %></h3>

<!-- jsp decleration    -->
<%! public int add(){
	int a=56;
	int b=78;
	return a+b;
}
%>

<!-- Scriptlet -->
<%out.println(add()); %>

<% ArrayList alist=new ArrayList();
	alist.add(56);
	alist.add("swapna");
	out.println(alist);

%>


</body>
</html>
