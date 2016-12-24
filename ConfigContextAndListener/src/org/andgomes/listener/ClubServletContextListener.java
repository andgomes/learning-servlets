package org.andgomes.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.andgomes.model.Club;

public class ClubServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
	
		ServletContext context = event.getServletContext();
		
		String clubName = context.getInitParameter("club-name");
		
		Club club = new Club(clubName);
		
		context.setAttribute("club", club);
		
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		// do nothing
	}

}
