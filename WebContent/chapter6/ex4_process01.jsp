<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String reading = request.getParameter("reading");
	String exercise = request.getParameter("exercise");
	String movie = request.getParameter("movie");
	
	String id = request.getParameter("id");					//Id
	String pw = request.getParameter("password");			//password
	String pwCheck = request.getParameter("password2");		//passwordCheck
	String name = request.getParameter("name");
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	String gender = request.getParameter("gender");
	
// 	String hobby1 = request.getParameter("hobby1");			// hobby1
	
	String[] hobby = request.getParameterValues("hobby");	// hobby
	String hobbys = "";
	
	for(String h : hobby){
		hobbys += (h + ",");
	}
	
	String comment = request.getParameter("comment");
	comment = comment.replace("\n", "<br>");
	System.out.println(comment);
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>id : <%= id %></p>
	<p>pw : <%= pw %></p>
	<p>name : <%= name %></p>
	<p>phone : <%= phone1+'-'+phone2+'-'+phone3%></p>
	<p>취미 : <%=hobby %></p>
	<p>가입인사 : <%= comment %></p>
	
</body>
</html>