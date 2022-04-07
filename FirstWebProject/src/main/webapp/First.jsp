<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Jsp different tags</title>
</head>
<body>


<h2>
<%="first JSP program" %>
<%
    for(int i=0;i<=10;i++){
%>
<a>katmandu</a>
<%} %>



</h2>

</body>
</html>