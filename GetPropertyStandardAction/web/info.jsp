<html>
	<head>
		<title>Info</title>
	</head>
	<body>
		<jsp:useBean id="user" class="org.andgomes.model.User" scope="request" />
		Hello, <jsp:getProperty name="user" property="name" />
	</body>
</html>
