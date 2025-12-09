<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ tag description="num factorial" pageEncoding="UTF-8"%>
 <%@ attribute name="num" required="true" type="java.lang.Integer"%>
 <core:set var="fact" value="1"></core:set>
 <core:forEach var="i" begin="1" end="${num}">
 	<core:set var="fact" value="${fact*i}" ></core:set>
 </core:forEach>
 Result:<core:out value="${fact}"></core:out>