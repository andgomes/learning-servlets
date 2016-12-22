<%@ page contentType="text/html"%>

<html>
	<head>
		<title>Showing message</title>
	</head>
	<body>
		Your message:
		<%
			String message = (String) request.getAttribute("message");
			
			out.println(message);
		%>
	</body>
</html>
