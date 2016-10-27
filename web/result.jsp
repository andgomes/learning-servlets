<%@ page import="java.util.*" %>

<html>
	<head>
		<title>Clube do Jogador</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
	<body>
		<h1>Clube do Jogador</h1>
		
		<p>
			<%
				String clubName = (String) request.getAttribute("player-name");
				
				out.print("<br />Clube: " + clubName);
			%>
		</p>
	</body>
</html>
