<%@page import="java.util.List"%>
<%@page import="com.DB.DBConnect"%>
<%@page import="com.DAO.BookDAOImpl"%>
<%@page import="com.entity.BookDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
<%@include file="AllCss.jsp"%>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<h3 class="text-center">Hello Admin</h3>

	<table class="table table-striped table-hover">
		<thead class="table-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Image</th>
				<th scope="col">Book Name</th>
				<th scope="col">Author Name</th>
				<th scope="col">Price</th>
				<th scope="col">Book Categories</th>
				<th scope="col">Status</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>

			<%
			BookDAOImpl bookDAOImpl = new BookDAOImpl(DBConnect.getConn());
			List<BookDetails> list = bookDAOImpl.getAllBook();
			for (BookDetails b : list) {
			%>
			<tr>
				<td><%=b.getBookId()%>
				</th>
				<td><img src="../bookimg/<%=b.getPhoto()%>"
					style="wdith: 50px; height: 50px">
				</td>
				<td><%=b.getBookName()%></td>
				<td><%=b.getAuthor()%></td>
				<td><%=b.getPrice()%></td>
				<td><%=b.getBooksCategory()%></td>
				<td><%=b.getStatus()%></td>
				<td><a href="#" class="btn btn-sm btn-secondary">Edit</a> <a
					href="#" class="btn btn-sm btn-danger">Delete</a></td>
			</tr>

			<%
			}
			%>


		</tbody>
	</table>
	<%@include file="footer.jsp"%>
</body>
</html>