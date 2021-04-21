<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	response.setIntHeader("refresh", 5);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="quiz_process.jsp" method="get">
		<p>아이디: <input type = "text" name ="id"></p>
		<p>비밀번호: <input type = "password" name ="pw"></p>
		<p><input type="submit" value ="로그인"></p>
	</form>
	<p>현재 시간은 <%= LocalDateTime.now() %></p>
			
	
	<p><a href="response_data.jsp">Google 홈페이지로 이동하기</a></p>
</body>
</html>