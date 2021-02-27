<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Categories</title>
	</head>
	<body>
		<ul>
			<c:forEach var="cat" items="${categories}">
				<li>${cat.id} : ${cat.nom}</li>
			</c:forEach>
		</ul>
	</body>
</html>