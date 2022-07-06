<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page import="com.dto.*" %>

	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Welcome to Home page</h2>	
	
<c:forEach  var="i" begin="1" end="10" step="1">
 <li>${i}
</c:forEach>
	<br>
	<c:out value=" test message"></c:out>
	
	welcome1 <%=session.getAttribute("fulName") %>!
	
	
	welcome2 <jsp:useBean id="fullName" class="java.lang.String" scope="session"></jsp:useBean>
	
	
	<%
	UseDTO useDTO = (UseDTO)session.getAttribute("useDto");
	
	%>
	
	
	User Details;
	User-Id -<%=useDTO.getUserId() %>
	Address -<%=useDTO.getAddress() %>
	ContactNo -<%=useDTO.getContactNo()%>
	
	
	<%!
	 public static void test() {
		System.out.print("dkfknsfkfk");
	}
	%>
	 --%>
	
</body>
</html>