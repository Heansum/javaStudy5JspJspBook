<%@page import="service.Plus"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> Result of plus : <%= request.getAttribute("plus") %></p>
	<p> Result of minus : <%= request.getAttribute("minus") %></p>
	<p> Result of div : <%= request.getAttribute("div") %></p>
	<p> Result of mul : <%= request.getAttribute("mul") %></p>
	
</body>
</html>