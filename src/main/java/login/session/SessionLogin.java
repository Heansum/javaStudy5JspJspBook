package login.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLogin
 */
@WebServlet("/session/login")
public class SessionLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 사용자가 입력한 아이디와 비밀번호
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// 회원가입 되어있는 사용자의 아이디, 비밀번호, 닉네임
		String userId = "id";
		String userPw = "pw";
		String nickname = "사용자";
		
		
		if(id.equals(userId) && pw.equals(userPw)) {
			// 세션에 isLogin=true로 저장 -> 로그인 되어있다는 의미
			// 세션에 nickname=회원가입되어있는사용자의닉네임 -> 현재 로그인한 사용자의 닉네임을 저장
			HttpSession session = request.getSession();
			
			session.setAttribute("isLogin", true);
			session.setAttribute("nickname", nickname);
			
		} else {
			response.setStatus(400);
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
