<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<body bgcolor="orange">
	<strong>Student List</strong><br>
	<table border="1">
			<tr>
				<td>StudentId</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
			</tr>	
		<c:forEach var="stu" items="${ARLSTUDENTS}">
			<tr>
				<td>${stu.sid}</td>
				<td>${stu.name}</td>
				<td>${stu.email}</td>
				<td>${stu.phone}</td>
			</tr>
		</c:forEach>
	</table>	
	</body>
</html>

