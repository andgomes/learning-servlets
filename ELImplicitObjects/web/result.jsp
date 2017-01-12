<%@ page contentType="text/html" %>

<html>
	<head>
		<title>Result</title>
	</head>
	<body>
		Age: ${sessionScope.age} <br />
		Club: ${param.club} <br />
		Number #1: ${paramValues.number[0]} <br />
		Number #2: ${paramValues.number[1]} <br />
		Host: ${header.host} <br />
		Username: ${cookie.username.value} <br />
		E-mail: ${initParam.email}
	</body>
</html>
