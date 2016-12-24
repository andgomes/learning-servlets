package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andgomes.model.Club;
import org.andgomes.model.Player;

public class PlayerInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	
		String playerName = getServletConfig().getInitParameter("player-name");
		String competition = request.getParameter("competition");
		Club club = (Club) getServletContext().getAttribute("club");
		
		Player player = new Player(playerName, club);
		
		request.setAttribute("player", player);
		request.setAttribute("competition", competition);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("info.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
