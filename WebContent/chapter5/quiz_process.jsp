<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
		String id = request.getParameter("id");
		String password = request.getParameter("pw");
		String qs = request.getQueryString();
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>id : <%= id %></p>
	<p>pw : <%= password %></p>
	<p>요청 파라메터 값 : <%= qs %></p>
</body>
</html>