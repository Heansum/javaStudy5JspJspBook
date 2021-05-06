package login.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/cookie/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ȸ������ �Ǿ��ִ� ������� ���̵�
		String userId = "user";
		// ȸ������ �Ǿ��ִ� ������� ��й�ȣ
		String userPw = "pw";
		// ȸ������ �Ǿ��ִ� ������� �г���
		String userNickname = "�����";

		// ����ڰ� ������ id
		String id = request.getParameter("id");
		// ����ڰ� ������ pw
		String pw = request.getParameter("pw");
		
		// ȸ������ �Ǿ��ִ� ���̵�� ��й�ȣ��
		// ����ڰ� ����(������) ���̵�� ��й�ȣ�� ���ؼ�
		// ���ٸ�
		
		// 1. ���̵�, ��й�ȣ, �г���(userNickname)�� �����ϴ� ��Ű ����
		// 2. Ŭ���̾�Ʈ�� ��Ű ����
		if(id.equals(userId) && pw.equals(userPw)) {
			Cookie cookie1 = new Cookie("ID",userId);
			Cookie cookie2 = new Cookie("PW",userPw);
			Cookie cookie3 = new Cookie("nickName", userNickname);
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.addCookie(cookie3);
			
			// 3. 200 ���� �ڵ带 ��ȯ
			response.setStatus(200);
		} else {
			// �ٸ��ٸ�
			// 1. 400���� ���� �ڵ带 ��ȯ
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
