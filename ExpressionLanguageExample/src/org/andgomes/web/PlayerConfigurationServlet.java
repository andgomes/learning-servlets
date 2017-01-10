package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andgomes.model.Club;
import org.andgomes.model.Player;

public class PlayerConfigurationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	
		Player player = new Player();
		
		player.setName("Daniel Sturridge");
		
		Club club = new Club();
		
		club.setName("Liverpool FC");
		
		player.setClub(club);
		
		request.setAttribute("player", player);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("result.jsp");
	
		dispatcher.forward(request, response);
	
	}

}
