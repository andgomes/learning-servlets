package com.andgomes.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

import com.andgomes.model.ClubExpert;

public class PlayerClubServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
			
		String playerName = request.getParameter("player-name");
		
		ClubExpert clubExpert = new ClubExpert(playerName);
		
		String clubName = clubExpert.getClub();
		
		request.setAttribute("player-name", clubName);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(
				"result.jsp");
				
		requestDispatcher.forward(request, response);		
			
	}	

}
