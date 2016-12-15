<html>
	<head>
		<title>Twitcher</title>
	</head>
	<body>
		<h1>Your Twitcher</h1>
		<%
			String twitcharContent = (String) request.getAttribute("twitcha-content");
			
			out.println(twitcharContent);
		%>
	</body>
</html>
