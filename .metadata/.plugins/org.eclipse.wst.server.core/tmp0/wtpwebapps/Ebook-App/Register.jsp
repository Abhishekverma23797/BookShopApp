<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored = "false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookShop: Register</title>
<%@include file="All_Component/AllCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="All_Component/navbar.jsp"%>


	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-2">

					<div class="card-body">
						<h4 class="text-center">Registration Page</h4>

						<c:if test="${not empty Success }">
							<p class="text-center text-success">${Success}</p>
							<c:remove var="Success" scope="session"/>
						</c:if>

						<c:if test="${not empty Faild }">
							<p class="text-center text-danger">${Faild}</p>
							<c:remove var="Faild" scope="session"/>
						</c:if>
						<form action="register" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Name</label>
								<input type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" required="required" name="name">

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="email">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Phone</label>
								<input type="number" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="phone">
								<div id="emailHelp" class="form-text">We'll never share
									your number with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control"
									id="exampleInputPassword1" required="required" name="password">
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1" name="check"> <label
									class="form-check-label" for="exampleCheck1">Check me
									out</label>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
	<%@include file="All_Component/footer.jsp"%>
</body>
</html>