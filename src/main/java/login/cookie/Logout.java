package login.cookie;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/cookie/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
