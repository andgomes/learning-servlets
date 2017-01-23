<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Transfer News</title>
	</head>
	<body>
		<c:set var="oldClub" scope="session" value="West Brom" />
		<c:set var="newClub" scope="session" value="Stoke City" />
		
		<c:set target="${player}" property="name" value="Saido Berahino" />
		
		<c:set target="${player}" property="position" value="Striker" />
		
		${player.name}, former ${oldClub} striker play now for ${newClub}.
		
		<c:remove var="oldClub" />
		<c:remove var="newClub" />
	</body>
</html>
