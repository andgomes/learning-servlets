package org.twitcha.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.twitcha.model.LoginValidator;

public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginValidator validator = new LoginValidator();
		
		if (validator.isLoginValid(username, password)) {
			
			request.setAttribute("username", username);
			
			RequestDispatcher requestDispatcher =
					request.getRequestDispatcher("homepage.jsp");
			
			requestDispatcher.forward(request, response);
			
		} else {
			response.sendRedirect("login.html");
		}
		
	}
	
}
