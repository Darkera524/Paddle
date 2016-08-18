<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show store</title>
</head>
<body>
	<a href="<c:url value="/new_store"/>">Add new store</a>
	<table>
		<tr>
			<th>name</th>
			<th>type</th>
			<th>address</th>
			<th>description</th>
		</tr>
		<tr>
			<td>${store.name }</td>
			<td>${store.type }</td>
			<td>${store.address }</td>
			<td>${store.description }</td>
		</tr>
	</table>
	<p>${error }</p>
</body>
</html>