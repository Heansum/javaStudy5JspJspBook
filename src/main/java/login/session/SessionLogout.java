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

		// �������� 4���� �����
		// RequestDispatcher -> �������� �ϸ� �������� URL�� �ٲ��� ���� 1
//		RequestDispatcher dis = request.getRequestDispatcher("/chapter14/sessionLogin.jsp");
//		dis.forward(request, response);
		
		// sendRedirect -> �������� �ϸ� URL�� �ٲ��.  2
//		response.sendRedirect("/JSPBook/chapter14/sessionLogin.jsp");
		
		// Location ����� �̵��ؾ��� URL�� ��� ����� Location�� ��Ƽ�  3
//		response.addHeader("Location", "/JSPBook/chapter14/sessionLogin.jsp");
//		// 303 ���� �ڵ带 ��ȯ
//		response.setStatus(303);
		
		// �ڹٽ�ũ��Ʈ �ڵ带 ����ؼ� - �������� URL�� �ٲ� 4
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().print("<script>alert(\"�α׾ƿ��Ǿ����ϴ�\\n�α��� �������� �̵��մϴ�.\");location.href='/JSPBook/chapter14/sessionLogin.jsp'</script>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
