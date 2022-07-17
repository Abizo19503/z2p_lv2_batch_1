<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scopes</title>
</head>
<body>
	<h2>Scope Objects</h2>
	<h3>Application --> <% out.println(application.getAttribute("Cscope")); %></h3>
	<h3>Session --> <% out.println(session.getAttribute("Sscope")); %></h3>
	
	<h4><%out.println(LocalDate.now()); %></h4>
	
</body>
</html>