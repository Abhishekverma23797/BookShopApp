<%@page import="com.entity.BookDetails"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.BookDAOImpl"%>
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
						<h4 class="text-center">Edit Book</h4>
						<c:if test="${not empty Success}">

							<p class="text-center text-success">${Success}</p>
							<c:remove var="Success" scope="session" />
						</c:if>

						<c:if test="${not empty Faild}">

							<p class="text-center text-danger">${Faild}</p>
							<c:remove var="Faild" scope="session" />
						</c:if>

						<%
						int id = Integer.parseInt(request.getParameter("id"));
						BookDAOImpl dao = new BookDAOImpl(DBConnect.getConn());
						BookDetails b = dao.getBookbyId(id);
						%>
						<form action="../add_books" method="post"
							enctype="multipart/form-data">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Book
									Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="bookname" value="<%=b.getBookName() %>">

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Author
									Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="author" value="<%=b.getAuthor() %>">

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Price</label>
								<input type="number" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									required="required" name="price" value="<%=b.getPrice() %>">

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
									<%
									if ("Active".equals(b.getStatus())) {
									%>
									<option value="Inactive">Inactive</option>
									<%
									} else {
									%>
									<option value="Active">Active</option>
									<%
									}
									%> 



								</select>
							</div>


							<button type="submit" class="btn btn-success">Update</button>
						</form>
					</div>
				</div>

			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>

</body>
</html>
