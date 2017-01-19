<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head>
		<title>Club List</title>
	</head>
	<body>
		List of the first clubs in Premier League: <br />
		
		<ul>
			<c:forEach var="club" items="${clubs}" varStatus="loopStatus">
				<li>${loopStatus.count}°: ${club}</li>
			</c:forEach>
		</ul>
	</body>
</html>
