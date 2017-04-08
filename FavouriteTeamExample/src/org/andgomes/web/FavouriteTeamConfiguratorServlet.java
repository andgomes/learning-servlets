package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FavouriteTeamConfiguratorServlet extends HttpServlet {

	private static int TEN_YEARS = 10 * 365 * 24 * 60 * 60;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String favouriteTeam = request.getParameter("favouriteTeam");

		Cookie favouriteTeamCookie = new Cookie("favouriteTeam", favouriteTeam);

		favouriteTeamCookie.setMaxAge(TEN_YEARS);

		response.addCookie(favouriteTeamCookie);

		response.sendRedirect("homepage.jsp");

	}

}
