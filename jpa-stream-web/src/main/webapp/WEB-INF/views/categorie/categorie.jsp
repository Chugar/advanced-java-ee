<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<t:layout>
	<jsp:body>
		<ul>
			<c:forEach var="cat" items="${categories}">
				<li>${cat.id} : ${cat.nom}</li>
			</c:forEach>
		</ul>
	</jsp:body>
</t:layout>