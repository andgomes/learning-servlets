package com.andgomes.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andgomes.model.Calculator;

public class CalculatorServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int operand1 = Integer.parseInt(request.getParameter("operand1"));
		int operand2 = Integer.parseInt(request.getParameter("operand2"));
		
		int result = Calculator.sum(operand1, operand2);
		
		request.setAttribute("result", result);
		
		RequestDispatcher requestDispatcher =
				request.getRequestDispatcher("result.jsp");
			
		requestDispatcher.forward(request, response);	
			
	}		

}
