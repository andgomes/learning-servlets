<!DOCTYPE html>

<html>
	<head>
		<title>Result</title>
	</head>
	<body>
		Result:
		<%
			int result = (Integer) request.getAttribute("result");
			out.println(result);
		%>
	</body>
</html>
