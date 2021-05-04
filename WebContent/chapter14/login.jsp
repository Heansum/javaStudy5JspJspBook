<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
// login.jsp -> 로그인 아이디
// login_process.jsp -> 아이디와 비밀번호,닉네임을 쿠키에 저장
// index.jsp -> 로그인한 사용자의 닉네임을 보여준다.
// login.jsp -> 로그인 페이지는 로그인하지 않은 사용자만 접근할 수 있다.
// 				로그인한 사용자가 로그인 페이지로 들어온다면
// 				index.jsp 로 이동한다.
// index.jsp -> 로그인한 사용자만 접근할 수 있다.
// 				로그인 하지 않은 사용자가 이 페이지로 들어온다면
// 				login.jsp 로 이동한다.
 %>

<!-- 로그인 하지 않은 사용자만 접근할 수 있다. -->
<!-- 로그인한 사용자는 index.jsp로 이동한다. -->

<%
	// 로그인 여부 체크
	// 1. session을 통한 로그인 여부 체크
	// 2. cookie를 통한 로그인 여부 체크
	
	// 클라이언트가 보낸 쿠키의 목록
	Cookie[] cookies = request.getCookies();
	// 로그인 여부
	boolean isLogin = false;
	
	// 이름이 ID(아이디)인 쿠키가 있는지 여부
	boolean isID = false;
	// 이름이 PW(비밀번호)인 쿠키가 있는지 여부
	boolean isPW = false;
	// 이름이 nickName(닉네임)인 쿠키가 있는지 여부
	boolean isNickName = false;
	
	for(int i=0; i<cookies.length; i++){
		// 쿠키의 처음부터 끝까지 반복문을 돌면서
		// 로그인 여부를 체크

		// n번째 쿠키
		Cookie cookie = cookies[i];
		// n번째 쿠키의 이름
		String name = cookie.getName();
		// n번째 쿠키의 값
		String value = cookie.getValue();
		
		// isID == false -> n번째까지 이름이 ID인 쿠키를 찾지 못했다
		// 최적화
		if(isID == false && name.equals("ID")){
			isID = true;
		} 
		if(isPW == false && name.equals("PW")){
			isPW = true;
		}
		if(isNickName == false && name.equals("nickname")){
			isNickName = true;
		}
		
	}// end for
	
	// 쿠키에 이름이 아이디, 비밀번호, 닉네임인 쿠키가 모두 들어있었다면은
	isLogin = isID && isPW && isNickName;	
	
	
	if(isLogin){
		// 로그인이 되어있다면 index.jsp로 이동
		response.sendRedirect("/JSPBook/chapter14/index.jsp");	
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "/JSPBook/chapter14/login_process.jsp">
		<p>아이디 : <input type="text" name="id"></p>
		<p>비밀번호 : <input type="password" name ="pw"></p>
		<p><input type="submit" value ="전송"></p>
	</form>
</body>
</html>