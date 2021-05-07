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
 * Servlet implementation class SessionLogout
 */
@WebServlet("/session/logout")
public class SessionLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		session.setAttribute("isLogin", false);
		session.removeAttribute("nickname");

		// 포워딩의 4가지 방법들
		// RequestDispatcher -> 포워딩을 하면 페이지의 URL이 바뀌지 않음 1
//		RequestDispatcher dis = request.getRequestDispatcher("/chapter14/sessionLogin.jsp");
//		dis.forward(request, response);
		
		// sendRedirect -> 포워딩을 하면 URL이 바뀐다.  2
//		response.sendRedirect("/JSPBook/chapter14/sessionLogin.jsp");
		
		// Location 헤더에 이동해야할 URL을 명시 헤더에 Location을 담아서  3
//		response.addHeader("Location", "/JSPBook/chapter14/sessionLogin.jsp");
//		// 303 응답 코드를 반환
//		response.setStatus(303);
		
		// 자바스크립트 코드를 사용해서 - 페이지의 URL이 바뀜 4
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().print("<script>alert(\"로그아웃되었습니다\\n로그인 페이지로 이동합니다.\");location.href='/JSPBook/chapter14/sessionLogin.jsp'</script>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
