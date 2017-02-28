package org.andgomes.web;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadPDFServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		
		response.setContentType("application/pdf");
		
		ServletContext context = getServletContext();
		
		try (InputStream fileStream =
				context.getResourceAsStream("/rms-essays.pdf");
			 OutputStream outputStream = response.getOutputStream()) {
		
			int read = 0;
			byte[] bytes = new byte[1024];
		
			while ((read = fileStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			
			outputStream.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	

}
