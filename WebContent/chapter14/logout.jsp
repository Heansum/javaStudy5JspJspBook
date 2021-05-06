<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	Cookie[] cookies = request.getCookies();

// 쿠키에 이름이 아이디, 비밀번호, 닉네임인 쿠키가 모두 들어있었다면은

		for(Cookie cookie : cookies){
			String name = cookie.getName();
			
			if(name.equals("ID") || name.equals("PW") || name.equals("nickname")){
			// 쿠키의 타이머(유효시간)을 0초로 설정
			cookie.setMaxAge(0);
			// 타이머가 다 된 쿠키를 클라이언트에게 보냄
			// (클라이언트는 타이머가 다 된 쿠키를 받으면 삭제 처리를 함)
			response.addCookie(cookie);
			}
			
	}
%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
	<strong>로그아웃이 되었습니다.</strong>
	
	<br>
	
	<a href="/JSPBook/chapter14/login.jsp">로그인 페이지로...</a>
</body>
</html>