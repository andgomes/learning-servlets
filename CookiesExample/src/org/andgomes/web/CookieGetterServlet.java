package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieGetterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		Cookie[] cookies = request.getCookies();
		
		for (Cookie cookie : cookies) {
			
			if (cookie.getName().equals("username")) {
				
				request.setAttribute("username", cookie.getValue());
				break;
				
			}
		
		}
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("profile.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
