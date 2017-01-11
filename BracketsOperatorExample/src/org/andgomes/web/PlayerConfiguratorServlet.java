package org.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.andgomes.model.Club;
import org.andgomes.model.Player;

public class PlayerConfiguratorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	
		Player player = new Player();
		player.setName("Jay Rodriguez");
		
		Club currentClub = new Club();
		currentClub.setName("Southampton FC");
		
		player.setCurrentClub(currentClub);
		
		Club[] pastClubs = new Club[3];
		
		pastClubs[0] = new Club();
		pastClubs[1] = new Club();
		pastClubs[2] = new Club();
		
		pastClubs[0].setName("Burnley FC");
		pastClubs[1].setName("Stirling Albion FC");
		pastClubs[2].setName("Barnsley FC");
		
		player.setPastClubs(pastClubs);
	
		request.setAttribute("player", player);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("result.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
