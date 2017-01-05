<html>
	<head>
		<title>Configuration</title>
	</head>
	<body>
		<%!
			public void jspInit() {
			
				String message = getServletConfig().getInitParameter("message");
				
				ServletContext context = getServletContext();
				
				context.setAttribute("message", message);
			
			}
		%>
		Message Configurated: <%= application.getAttribute("message") %>
	</body>
</html>
