<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>User Authentication</title>
	</head>
	<body>
		<c:if test="${param.username == 'andgomes'}">
			User ${param.username} authorized. <br />
			Premium area.
		</c:if> <br />
		Ordinary area.
	</body>
</html>
