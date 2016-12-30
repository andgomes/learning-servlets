package org.andgomes.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieSetterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String username = request.getParameter("username");
		
		Cookie usernameCookie = new Cookie("username", username);
		
		usernameCookie.setMaxAge(2 * 60);
		
		response.addCookie(usernameCookie);
		
		response.sendRedirect("homepage.html");
		
	}

}
