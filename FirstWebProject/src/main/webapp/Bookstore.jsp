<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Books are added in database</h2>
<%
String isbn = request.getParameter("isbn");
String title = request.getParameter("title");
String author  = request.getParameter("author");
String price = request.getParameter("price");
String publisher = request.getParameter("publisher");

%>

<hr color= red size= 4>
<%@page import="java.sql" %>
<%
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


%>
</body>
</html>