<%@ page contentType="text/html"%>

<html>
	<head>
		<title>Player Info</title>
	</head>
	<body>
		<h1>Player Info</h1>
		Player name:
		<%
			String playerName = (String) request.getAttribute("player-name");
			
			out.println(playerName);
		%>
		<br />
		Player club:
		<%
			String playerClub = (String) request.getAttribute("player-club");
			
			out.println(playerClub);
		%>
	</body>
</html>
