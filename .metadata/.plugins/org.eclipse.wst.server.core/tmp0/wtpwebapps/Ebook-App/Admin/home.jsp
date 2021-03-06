<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style type="text/css">
a:link {
	text-decoration: none;
}
</style>
<title>Admin</title>
<%@include file="AllCss.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>

	<div class="container">

		<div class="row p-4">

			<div class="col-md-3">
				<!-- Add Books -->
				<a href="add_books.jsp">
					<div class="card">
						<div class="card-body text-center">
							<i class="fas fa-plus-square fa-2x text-primary"></i><br>
							<h4>Add Books</h4>
						</div>
				</a>
			</div>

		</div>

		<div class="col-md-3">
			<!-- All Books -->
			<a href="all_books.jsp">
				<div class="card">
					<div class="card-body text-center">
						<i class="fas fa-book-open fa-2x text-warning"></i>
						<h4>All Books</h4>
					</div>
				</div>
			</a>

		</div>

		<div class="col-md-3">
			<!-- Order book -->
			<a href="orders.jsp">
				<div class="card">
					<div class="card-body text-center">
						<i class="fas fa-box-open fa-2x"></i>
						<h4>Order</h4>
					</div>
				</div>
			</a>

		</div>

		<div class="col-md-3">
			<!--Log Out -->
			<div class="card">
				<div class="card-body text-center">
					<i class="fas fa-sign-out-alt fa-2x text-danger"></i>
					<h4>Logout</h4>
				</div>
			</div>

		</div>
	</div>

	</div>

</body>
</html>