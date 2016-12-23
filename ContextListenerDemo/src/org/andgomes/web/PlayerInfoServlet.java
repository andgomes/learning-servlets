package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andgomes.model.Player;

public class PlayerInfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	
		Player player = (Player) getServletContext().getAttribute("player");
		
		request.setAttribute("player-name", player.getPlayerName());
		request.setAttribute("player-club", player.getPlayerClub());
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("player-info.jsp");
		
		dispatcher.forward(request, response);
	
	}

}
