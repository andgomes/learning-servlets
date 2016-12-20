<%@ page contentType="text/html"%>

<html>
	<head>
		<title>Message Page</title>
	</head>
	<body>
		<%
			String message = (String) request.getAttribute("message");
			
			out.println(message);
		%>
	</body>
</html>
