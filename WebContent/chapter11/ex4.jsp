<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String su1 = request.getParameter("su1");
	String su2 = request.getParameter("su1");

	if(su1 == null || su2 == null){
%>
	<!-- su1 또는 su2가 요청 파라미터로 전달되지 않았을 경우 -->
	<form action="#" method="GET">
		<p>수 1 : <input type="text" name="su1"></p>
		<p>수 2 : <input type="text" name="su2"></p>
		<input type="submit" value="계산">
	</form>
<%
	} else {
%>
	<!-- su1과 su2가 요청 파라미터로 전달되었을 경우 -->
	<%
		int su1_i = Integer.parseInt(su1);
		int su2_i = Integer.parseInt(su2);
	%>
	<p><%= su1_i %> + <%= su2_i %> = <%= su1_i / su2_i %></p>
	<a href = "./ex4.jsp">돌아가기...</a>
<%		
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>