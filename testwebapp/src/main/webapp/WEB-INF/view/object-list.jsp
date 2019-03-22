<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Hello objects! Here's a list of them all:</h2>



	<br>
	<br>
	<table>
		<tr>
			<th>Item Name</th>
		</tr>

		<c:forEach var="notes" items="${gO}">
			<tr>
				<td>${notes.comments}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
