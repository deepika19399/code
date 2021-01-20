<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Details</title>
</head>
<body>
	<h3>Pet Detail</h3>
	<c:if test="${!empty flag}">
		<h3><b>Pet Registration successful</b></h3>
	</c:if>
	<div align="center">
		<h1>Pets List</h1>
		<h3>
			<a href="petRegistration">Add Pets</a>
		</h3>
		
		<table border="1">
			<th>PetName</th>
			<th>Age</th>
			<th>PlaceFrom</th>
			<th>Cost</th>
			<th>Status</th>
			<th>Action</th>

			<c:forEach var="pets" items="${petList}">
				<tr>
					<td><c:out value="${pets.petname}" /></td>
					<td><c:out value="${pets.age}" /></td>
					<td><c:out value="${pets.placefrom}" /></td>
					<td><c:out value="${pets.cost}" /></td>
					<td><c:choose>
					<c:when test="${pets.petcount == 0}">
							<a href="/buyPet/${petList.id}"
								style="display: block; width: 115px; height: 20px; background: #4E9CAF; padding: 10px; text-align: center; border-radius: 5px; color: white; font-weight: bold; line-height: 20px; text-decoration: none;"
								class="button">Buy</a>
						</c:when> <c:otherwise>
							<a href=""
								style="display: block; width: 115px; height: 20px; background: #4E9CAF; padding: 10px; text-align: center; border-radius: 5px; color: white; font-weight: bold; line-height: 20px; text-decoration: none;"
								class="button">Sold</a>
						</c:otherwise>
						</c:choose></td>
					<td><a href="editpetDetail?id=<c:out value = "${pets.id}"/>">Edit</a>
						<a href="deleteEmployee?id=<c:out value = "${pets.id}"/>">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<a href="/petshop">Click here for home Page</a>
	</div>


</body>
</html>