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
		%> <br /> <br />
		<a href="index.html">Fazer outra soma</a>
	</body>
</html>
