<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body bgcolor="orange">
	<c:set var="color" value="${param.col}" />

	<c:choose>
		<c:when test="${color eq 'red' or color eq 'RED'}">
			Your favorite color is RED
		</c:when>
	
		<c:when test="${color eq 'green'or color eq 'GREEN'}">
			Your favorite color is GREEN
		</c:when>
	
		<c:when test="${color eq 'blue'or color eq 'BLUE'}">
			Your favorite color is BLUE
		</c:when>
	
		<c:otherwise>
			Unknown	Color
		</c:otherwise>
	</c:choose>
</body>
</html>