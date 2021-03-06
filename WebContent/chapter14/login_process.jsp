<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- JSP는 기본 응답 코드가 200으로 설정되어있음 -->

<%
	// 회원가입 되어있는 사용자의 아이디
	String userID = "user";
	// 회원가입 되어있는 사용자의 비밀번호
	String userPW = "pw";
	// 회원가입 되어있는 사용자의 닉네임
	String userNickname = "사용자";
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// 회원가입 되어있는 아이디와 비밀번호를
	// 사용자가 보내는 아이디와 비밀번호와 비교해서
	// 같다면
	// 1. 쿠키 생성
	// 2. 아이디, 비밀번호, 닉네임(userNickname)을 저장하는 쿠키 생성
	// 3. 클라이언트로 쿠키 전달
	// 4. index.jsp 페이지로 이동
	// 다르다면
	// 1. login_fail.jsp 페이지로 이동
	
	if(id.equals(userID) && pw.equals(userPW)){
		// 같다면
		// 1. 쿠키 생성
		// 2. 아이디, 비밀번호, 닉네임(userNickname)을 저장하는 쿠키 생성
		Cookie cookie1 = new Cookie("ID", id);
		Cookie cookie2 = new Cookie("PW", pw);
		Cookie cookie3 = new Cookie("nickname", userNickname);		
		// 3. 클라이언트로 쿠키 전달
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		// 4. 200 응답 코드를 반환
		response.setStatus(200);
		
	} else {
		// 다르다면
		// 1. 400번대 응답 코드를 반환
		response.setStatus(400);
	}

%>