<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<%@page import="java.util.*"%>
<html>
<body bgcolor="wheat">
Using java code to display arraylist
<%
	Object ob = request.getAttribute("ARL");
	if (ob instanceof ArrayList) {
		if (ob != null) {
			ArrayList al = (ArrayList) ob;
			Iterator it = al.iterator();
			while (it.hasNext()) {
				out.println(it.next());
			}
		}
	}
%>
</body>
</html>