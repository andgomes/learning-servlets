<%@ page contentType="text/html" %>

<html>
	<head>
		<title>Index</title>
	</head>
	<body>
		<form action="welcome.jsp" method="GET">
			Username: <br />
			<input type="text" name="username" /> <br />
			<input type="submit" value="Send" />
		</form> <br />
		${param.message}
	</body>
</html>
