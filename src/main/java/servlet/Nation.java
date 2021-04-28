package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nation
 */
@WebServlet("/nation")
public class Nation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Nation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nation = request.getParameter("nation");
		
		if(nation.equals("ko")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello_ko.jsp");
			dispatcher.forward(request, response);
		} else if(nation.equals("cn")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello_cn.jsp");
			dispatcher.forward(request, response);
		} else if(nation.equals("ja")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello_ja.jsp");
			dispatcher.forward(request, response);
		} else if(nation.equals("am")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello_am.jsp");
			dispatcher.forward(request, response);
		} else {
			System.out.println("비정상적인 경로를 선택했습니다, 선택지를 선택해주세요");
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
