<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body bgcolor="orange">

	<c:set var="a" value="${param.num}" />

	<c:if test="${a%2 == 0}">
    	Given number is Even<br>
	</c:if>
	<c:if test="${a%2 != 0}">
    	Given number is Odd<br>
	</c:if>


	<c:if test="${a%2 eq '0'}">
    	Given number is Even<br>
	</c:if>
	<c:if test="${a%2 ne '0'}">
    	Given number is Odd<br>
	</c:if>
</body>
</html>