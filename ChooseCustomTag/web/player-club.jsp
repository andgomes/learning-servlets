<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Player Club</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${param['player-name'] == 'Jordan Henderson'}">
				${param["player-name"]} play for Liverpool FC.
			</c:when>
			<c:when test="${param['player-name'] == 'Saido Berahino'}">
				${param["player-name"]} play for West Bromwich.
			</c:when>
			<c:when test="${param['player-name'] == 'Raheem Sterling'}">
				${param["player-name"]} play for Manchester City.
			</c:when>
			<c:otherwise>
				Please, select one player.
			</c:otherwise>
		</c:choose>
		<a href="index.html">Back</a>
	</body>
</html>
