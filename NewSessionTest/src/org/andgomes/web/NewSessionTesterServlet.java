package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewSessionTesterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		
		if (session.isNew()) {
			request.setAttribute("new-session", new Boolean(true));
		} else {
			request.setAttribute("new-session", new Boolean(false));
		}
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("result.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
