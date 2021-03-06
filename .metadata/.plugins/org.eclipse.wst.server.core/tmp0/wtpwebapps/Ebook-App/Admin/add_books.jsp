<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<%@include file="AllCss.jsp"%>
</head>
<body style="background-color: #f0f2f2">
	<%@include file="navbar.jsp"%>


	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-2">

					<div class="card-body">
						<h4 class="text-center">Add Book</h4>
						<c:if test="${not empty Success}">

							<p class="text-center text-success">${Success}</p>
							<c:remove var="Success" scope="session"/>
						</c:if>

						<c:if test="${not empty Faild}">

							<p class="text-center text-danger">${Faild}</p>
							<c:remove var="Faild" scope="session"/>
						</c:if>
						<form action="../add_books" method="post"
							enctype="multipart/form-data">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Book
									Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="bookname">

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Author
									Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="author">

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Price</label>
								<input type="number" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="price">

							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Book
									Categories</label> <select class="form-select"
									aria-label="Default select example" name="categorie">
									<option selected>--Select--</option>
									<option value="New">New Book</option>
								</select>
							</div>
							<div class="mb-3">
								<label class="form-check-label" for="exampleCheck1">Book
									Status</label> <select class="form-select"
									aria-label="Default select example" name="bstatus">
									<option selected>--Select--</option>
									<option value="Active">Active</option>
									<option value="Inactive">Inactive</option>

								</select>
							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Upload
									Photo</label> <input type="file" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="bimg">

							</div>
							<button type="submit" class="btn btn-primary">Add</button>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>

</body>
</html>