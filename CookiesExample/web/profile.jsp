<%@ page contentType="text/html"%>

<html>
	<head>
		<title>Profile</title>
	</head>
	<body>
		Welcome,
		<%
			String username = (String) request.getAttribute("username");
			
			out.println(username);
		%>
	</body>
</html>
