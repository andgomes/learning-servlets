<%@ page contentType="text/html"%>

<html>
	<head>
		<title>Result</title>
	</head>
	<body>
		Is a new session:
		<%
			Boolean isNewSession =
					(Boolean) request.getAttribute("new-session");
			
			out.println(isNewSession);
		%>
	</body>
</html>
