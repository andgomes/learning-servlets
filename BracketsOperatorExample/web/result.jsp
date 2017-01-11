<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head>
		<title>Player Info</title>
	</head>
	<body>
		${player.name}, que atualmente joga no ${player.currentClub.name}, já
		jogous nos clubes ${player.pastClubs[0].name},
		${player.pastClubs[1].name} e ${player.pastClubs[2].name}.
	</body>
</html>
