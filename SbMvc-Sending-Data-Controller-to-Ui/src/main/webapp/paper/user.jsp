<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table>
		<tr>
			<td>UserId :</td>
			<td>${UserData.userId}</td>
		</tr>

		<tr>
			<td>FirstName :</td>
			<td>${UserData.firstName}</td>
		</tr>

		<tr>
			<td>LastName :</td>
			<td>${UserData.lastName}</td>
		</tr>

		<tr>

			<td>Gender:</td>
			<td>${UserData.gender}</td>
		</tr>

<tr>

			<td>Dob:</td>
			<td>${UserData.dob}</td>
		</tr>
	</table>


</body>
</html>