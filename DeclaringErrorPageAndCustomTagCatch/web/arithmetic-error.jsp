<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Arithmetic Error</title>
	</head>
	<body>
		A ${pageContext.exception} was caused on the server. <br />
		
		<c:catch var="exceptionThrown">
			<% int x = 1 / 0; %>
		</c:catch>
		
		A ${exceptionThrown} was thrown in this page.
	</body>
</html>
