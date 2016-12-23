package org.andgomes.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.andgomes.model.Player;

public class PlayerServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event) {
		
		ServletContext context = event.getServletContext();
		
		String playerName = context.getInitParameter("player-name");
		String playerClub = context.getInitParameter("player-club");
		
		Player player = new Player(playerName, playerClub);
		
		context.setAttribute("player", player);
		
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		// nothing here
	}
	
}
