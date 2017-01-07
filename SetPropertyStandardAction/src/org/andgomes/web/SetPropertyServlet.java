package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andgomes.model.User;

public class SetPropertyServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String[] setUsername = request.getParameterValues("username-setted");
		
		if (setUsername != null) {
		
			String username = request.getParameter("username");
		
			User user = new User();
			user.setName(username);
			
			request.setAttribute("user", user);
		
		}
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("homepage.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
