package org.andgomes;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		ServletConfig servletConfig = getServletConfig();
		
		String helloParameter = servletConfig.getInitParameter("message");
		
		request.setAttribute("message", helloParameter);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("result.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
