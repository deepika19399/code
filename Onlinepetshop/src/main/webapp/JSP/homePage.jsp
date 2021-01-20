<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Shop</title>
</head>
<body>
	<div align="center">
		<h1>Customer List</h1>
		<h3>
			<a href="registerCustomer">New Customer</a>
		</h3>
		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Action</th>

			<c:forEach var="customer" items="${customerList}">
				<tr>
					<td><c:out value="${customer.name}" /></td>
					<td><c:out value="${customer.email}" /></td>
					<td><c:out value="${customer.address}" /></td>
					<td><c:out value="${customer.phone}" /></td>
					<td><a href="editcustomer?id=<c:out value="${customer.id}"/>">Edit</a>
						<a href="deletecustomer?id=<c:out value="${customer.id}"/>">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<a href="login">Click Here to Login</a>
	</div>

</body>
</body>
</html>