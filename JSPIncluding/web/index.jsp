<%@ page contentType="text/html" %>

<html>
	<head>
		<title>Index</title>
	</head>
	<body>
		<jsp:include page="header.html" />
		
		It works! <br />
		
		<jsp:include page="footer.jsp">
			<jsp:param name="sponsor" value="FSF" />
		</jsp:include>
	</body>
</html>
