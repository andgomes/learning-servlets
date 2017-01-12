package org.andgomes.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionConfiguratorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	
		Cookie cookie = new Cookie("username", "andgomes");
		cookie.setMaxAge(5 * 60);
		
		response.addCookie(cookie);	
		
		HttpSession session = request.getSession();
		session.setAttribute("age", "22");
		
		response.sendRedirect("index.html");
		
	}

}
