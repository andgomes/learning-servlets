<html>
	<head>
		<title>Access Counter</title>
	</head>
	<body>
		
		<%! int counter = 0; %>
		
		<%!
			int getCounter() {
				return ++counter;
			} 
		%>
	
		Access Counter: <%= getCounter() %>
	</body>
</html>
