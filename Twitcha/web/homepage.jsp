<html>
	<head>
		<title>Homepage</title>
	</head>
	<body>
		<h1>Twitcha Homepage</h1>
		Welcome,
		<%
			String username = (String) request.getAttribute("username");
			
			out.println(username);
		%> <br />
		<form action="twitcha">
			Enter one Twitcha: <br />
			<input type="text" name="twitcha-content" required="required" />
			<br />
			<input type="submit" value="Twitchar" />
		</form>
	</body>
</html>
