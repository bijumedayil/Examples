<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body bgcolor="orange">
	Displaying arraylist using Using JSTL tags <br>
	<c:forEach var="str" items="${ARL}">
		${str}<br>
	</c:forEach>
</body>
</html>

