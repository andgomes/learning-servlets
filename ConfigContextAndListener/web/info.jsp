<%@ page contentType="text/html" import="org.andgomes.model.*"%>

<html>
	<head>
		<title>Player Info</title>
	</head>
	<body>
		<h1>Player Info</h1>
		Name:
		<%
			Player player = (Player) request.getAttribute("player");
			
			out.println(player.getName());
		%>
		<br />
		Club:
		<%
			Club club = player.getClub();
			
			out.println(club.getName());
		%>
		<br />
		Competition:
		<%
			String competition = (String) request.getAttribute("competition");
			
			out.println(competition);
		%>
	</body>
</html>
