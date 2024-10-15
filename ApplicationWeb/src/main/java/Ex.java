import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex implements Servlet {

	@Override
	public void destroy() {

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig Config) {
		return;

	}

	@Override
	public void service(ServletRequest request, ServletResponse Response) throws ServletException, IOException {
		String s = request.getParameter(getServletInfo());
		
	}

}
