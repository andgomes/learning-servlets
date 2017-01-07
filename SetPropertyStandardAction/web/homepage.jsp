<html>
	<head>
		<title>Homepage</title>
	</head>
	<body>
		<jsp:useBean id="user" class="org.andgomes.model.User" scope="request">
			<jsp:setProperty name="user" property="name" value="Unknown" />
		</jsp:useBean>
		
		Hello, <jsp:getProperty name="user" property="name" />
	</body>
</html>
