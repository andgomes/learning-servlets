package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FavouriteTeamCheckerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		Cookie[] cookies = request.getCookies();

		if (cookies != null) {

			boolean flag = false;

			for (Cookie cookie : cookies) {

				if (cookie.getName().equals("favouriteTeam")) {
					response.sendRedirect("homepage.jsp");
					flag = true;
				}

			}

			if (!flag) {
				response.sendRedirect("teamSelection.html");
			}

		} else {
			response.sendRedirect("teamSelection.html");
		}

	}

}
