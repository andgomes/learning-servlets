package org.andgomes.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterThree implements Filter {

	private FilterConfig filterConfig;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws ServletException, IOException {
	
		filterConfig.getServletContext().log("FilterThree's doFilter()");
		
		chain.doFilter(request, response);
	
	}
	
	public void destroy() {
		// nothing here
	}

}
