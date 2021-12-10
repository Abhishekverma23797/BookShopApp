<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Book</title>
<%@include file="AllCss.jsp"%>

</head>
<%@include file="navbar.jsp"%>
<h3 class="text-center ">All Orders</h3>

<table class="table table-striped table-hover ">
	<thead class="table-dark">
		<tr>
			<th scope="col">OrderId</th>
			<th scope="col">Name</th>
			<th scope="col">Email</th>
			<th scope="col">Address</th>
			<th scope="col">Phone</th>
			<th scope="col">Book Name</th>
			<th scope="col">Author</th>
			<th scope="col">Price</th>
			<th scope="col">Payment type</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th scope="row">1</th>
			<td>Mark</td>
			<td>Otto</td>
			<td>@mdo</td>
			<td>Mark</td>
			<td>Otto</td>
			<td>@mdo</td>
			<td>Mark</td>
			<td>Otto</td>

		</tr>
		<tr>
			<th scope="row">2</th>
			<td>Jacob</td>
			<td>Thornton</td>
			<td>@fat</td>
			<td>Mark</td>
			<td>Otto</td>
			<td>@mdo</td>
			<td>Mark</td>
			<td>Otto</td>
		</tr>
		<tr>
			<th scope="row">3</th>
			<td>Mark</td>
			<td>Otto</td>
			<td>@mdo</td>
			<td>Mark</td>
			<td>Otto</td>
			<td>@mdo</td>
			<td>Mark</td>
			<td>Otto</td>
		</tr>
		<tr>
			<th scope="row">2</th>
			<td>Jacob</td>
			<td>Thornton</td>
			<td>@fat</td>
			<td>Mark</td>
			<td>Otto</td>
			<td>@mdo</td>
			<td>Mark</td>
			<td>Otto</td>
		</tr>
	</tbody>
</table>
<%@include file="footer.jsp"%>
</body>
</html>