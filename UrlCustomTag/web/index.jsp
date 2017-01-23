<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Index</title>
	</head>
	<body>
		<c:set var="player" value="Tom Davies" />
		<c:set var="club" value="Everton FC" />
		
		<a href= "<c:url value='/result.jsp'>
			<c:param name='playerName' value='${player}' />
			<c:param name='clubName' value='${club}' />
			</c:url>">Link</a>
	</body>
</html>
