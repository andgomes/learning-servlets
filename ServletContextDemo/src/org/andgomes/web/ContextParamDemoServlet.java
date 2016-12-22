package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextParamDemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		ServletContext context = getServletContext();
		
		String message = context.getInitParameter("message");
		
		request.setAttribute("message", message);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("show-message.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
