<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 
	로그인 여부를 판단해서
	로그인이 되어있을 경우
	
	SessionIndex.jsp로 이동하도록 하세요.
 -->

<%
	
	boolean isLogin = (boolean) session.getAttribute("isLogin");
	if(isLogin){
		response.sendRedirect("/JSPBook/chapter14/sessionIndex.jsp");		
	}
		
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

<!-- 
	아이디, 비밀번호를 입력할 수 있도록 input 태그를 만들고 로그인 버튼을 추가하세요.
	
	로그인 버튼을 누르면 ajax를 사용해서 /session/login 경로에 있는 로그인 기능을 실행하세요.
	이때 로그인 기능을 실행할 때 사용자가 입력한 아이디와 비밀번호를 전달해야합니다.
	
	로그인 기능이 요청 성공의 의미를 담고 있는 응답 코드를 반환 했을 경우 SessionIndex.jsp 페이지로 이동하세요.
	로그인 기능이 요청 실패의 의미를 담고 있는 응답 코드를 반환 했을 경우 alert 함수를 사용해서
	"아이디 또는 비밀번호를 확인해주세요" 를 출력하세요.
 -->
 
 	<div>
	 	<p>아이디 : <input type="text" name="id"></p>
	 	<p>비밀번호 : <input type="password" name="pw"></p>
	 	<input type=submit value="로그인" onclick="login()">
	</div>
	
	<script>
		function login(){
			var id = $("[name=id]").val();
			var pw = $("[name=pw]").val();
			
			$.ajax({
				url: "/JSPBook/session/login",
				data: "id="+id+"&pw="+pw,
				success: function(){
					location.href="/JSPBook/chapter14/sessionIndex.jsp";
				},
				error: function(){
					alert("아이디 또는 비밀번호를 확인해주세요.");
				}
				
			})
			
			
			
		}
	
	
	</script>
	
</body>
</html>