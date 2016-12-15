package org.twitcha.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TwitchaServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String twitchaContent = request.getParameter("twitcha-content");
		
		request.setAttribute("twitcha-content", twitchaContent);
		
		RequestDispatcher requestDispatcher =
				request.getRequestDispatcher("twitcher.jsp");
		
		requestDispatcher.forward(request, response);
		
	}

}
