package ch12.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckFilter implements Filter {

	
	@Override
	public void destroy() {
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("���� ������");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(������ ���ǰ� == null) {
			// loginForm.jsp �� �̵�
			RequestDispatcher dis = request.getRequestDispatcher("/JSPBook/loginForm.jsp");
			dis.forward(request, response);
		}
	}

}