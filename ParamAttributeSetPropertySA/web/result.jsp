<%@ page contentType="text/html" %>

<html>
	<head>
		<title>Result</title>
	</head>
	<body>
		<jsp:useBean id="player" class="org.andgomes.model.Player" scope="request">
			<jsp:setProperty name="player" property="name" />
			<jsp:setProperty name="player" property="club" />
		</jsp:useBean>
		
		Player name: <jsp:getProperty name="player" property="name" /> <br />
		Club name: <jsp:getProperty name="player" property="club" />
	</body>
</html>
