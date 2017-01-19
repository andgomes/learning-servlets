<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=utf-8" %>

<html>
	<head>
		<title>Club List</title>
	</head>
	<body>
		List of the first clubs in Premier League: <br />
		
		<ol>
			<c:forEach var="clubsList" items="${clubs}">
			
				<c:forEach var="club" items="${clubsList}">
					<li>${club}</li>
				</c:forEach>
				
			</c:forEach>
		</ol>
	</body>
</html>
