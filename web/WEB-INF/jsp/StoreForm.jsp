<%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>storeform</title>
</head>
<body>
	<div id="main_div">
		<form:form commandName="store" action="save_store" method="post">
			<fieldset>
				<legend>New store</legend>
				<p>
					<label for="name">Name:</label>
					<form:input id="name" path="name"/>
				</p>
				<p>
					<label for="type">type:</label>
					<form:select id="type" path="type" items="${types }"/>
				</p>
				<p>
					<label for="address">address:</label>
					<form:input id="address" path="address"/>
				</p>
				<p>
					<label for="description">description:</label>
					<form:input id="description" path="description"/>
				</p>
				<p>
					<input id="submit" type="submit" value="submit"/>
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>