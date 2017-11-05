<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body bgcolor="orange">
	
	Print numbers from 1 to 100 using forEach tag<br><br>
	<c:forEach begin="1" end="100" var="x">
	<c:out value="${x}"/>
	</c:forEach>
	<br><br><br><br>
	
	Print numbers from 100 to 200 incrementing every print by 5<br><br>
	<c:forEach begin="100" end="200" var="x" step="5">
	<c:out value="${x}"/>
	</c:forEach>	
	</body>
</html>

