<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= "reuest from html file" %>
<%
String user = request.getParameter("user");
String gender = request.getParameter("gender");
String csit = request.getParameter("csit");
String BCA = request.getParameter("BCA");
String country = request.getParameter("country");

%>

<br>
<br>

hello I am
<%= user %>
from
<%= country %>.I am
<%= gender %>
and like to study
<%= csit %>
</body>
</html>