<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="access" uri="access-functions" %>

<html>
	<head>
		<title>Validation</title>
	</head>
	<body>
		${param.username}, you are the visitor n° ${access:counter()}.
	</body>
</html>
