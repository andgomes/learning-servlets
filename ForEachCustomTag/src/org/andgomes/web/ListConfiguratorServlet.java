package org.andgomes.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListConfiguratorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	
		List<String[]> clubList = new ArrayList<>(3);
		
		clubList.add(new String[] {"Chelsea", "Tottenham", "Liverpool"});
		clubList.add(new String[] {"Arsenal", "Manchester City",
				"Manchester United"});
		clubList.add(new String[] {"Everton", "West Brom", "Stoke"});
		
		request.setAttribute("clubs", clubList);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("club-list.jsp");
	
		dispatcher.forward(request, response);
	
	}

}
