<%@ page contentType="text/html" %>

<html>
	<head>
		<title>Welcome</title>
	</head>
	<body>
		<h1>Welcome Page</h1>
		
		<% if (request.getParameter("username").equals("")) { %>
		
			<jsp:forward page="index.jsp">
				<jsp:param name="message" value="Username required" />
			</jsp:forward>
			
		<% } %>	
		
		Welcome, ${param.username}
	</body>
</html>
