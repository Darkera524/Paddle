<%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show store</title>
</head>
<body>
	<div id="main_div">
		<form:form commandName="test" action="updateexecutetest" method="post">
			<fieldset>
				<legend>New test</legend>
				<p>
					<label for="id">Name:</label>
					<form:input id="id" path="id"/>
				</p>
				<p>
					<label for="text">Name:</label>
					<form:input id="text" path="text"/>
				</p>
				<p>
					<input id="submit" type="submit" value="submit"/>
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>