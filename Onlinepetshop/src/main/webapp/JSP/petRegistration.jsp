<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Registration</title>
</head>
<body>
<h3>Pet Registration</h3><br>
	<form:form action="addPets" commandName="petDetail" method="post">
		<table>
			<tr>
				<td>Pet Name :</td>
				<td><form:input path="petname" /></td>
			</tr>
			<tr>
				<td>Age :</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>PlaceFrom :</td>
				<td><form:input path="placefrom" /></td>
			</tr>
			<tr>
				<td>Cost :</td>
				<td><form:input path="cost" /></td>
			</tr>
			<tr>
				<td>Pet Count :</td>
				<td><form:input path="petcount" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>