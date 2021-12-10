<%@page import="java.sql.Connection"%>
<%@page import="com.DB.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook: Index</title>
<%@include file="All_Component/AllCss.jsp"%>

<style type="text/css">
.back-img {
	background: url("img/bb.jpg");
	height: 80vh;
	width: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}

.card-ho:hover{
 background-color: #fcf7f7
}
</style>
</head>
<body style="background-color: #f7f7f7">
	<%@include file="All_Component/navbar.jsp"%>

	<div class="container-fluid back-img">
		
	</div>
	<%  Connection con =DBConnect.getConn();
		out.println(con);
	%>
<!-- Start Recent book -->
	<div class="container">
		<h3 class="text-center">Recent Book</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 50px; height: 60px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>



		</div>
		<div class="text-center mt-1">
		<a href="" class="btn btn-danger btn-sm text-white">View All</a>
		</div>
	</div>
	<!-- End Recent Book -->
	
	<hr>
	
	<!-- Start New book -->
	<div class="container">
		<h3 class="text-center">New Book</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							<a href="" class="btn btn-success btn-sm mt-1"><i class="fas fa-cart-plus"></i>Add Cart</a>
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>



		</div>
		<div class="text-center mt-1">
		<a href="" class="btn btn-danger btn-sm text-white">View All</a>
		</div>
	</div>
	<!-- End New Book -->
	
	<hr>
	<!-- Start Old book -->
	<div class="container">
		<h3 class="text-center">Old Book</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card card-ho">
					<div class="card-body text-center">
						<img alt="bookimg" src="bookimg/b2.jpg"
							style="width: 150px; height: 200px" class="img-thumblin">
						<p>Android App Development</p>
						<p>Michael Burton</p>
						<p>Categories:New</p>
						<div class="row">
							
							<a href="" class="btn btn-primary	 btn-sm mt-1">View Details</a>
							<a href="" class="btn btn-danger btn-sm mt-1">Price</a>
						</div>
					</div>
				</div>
			</div>



		</div>
		<div class="text-center mt-1">
		<a href="" class="btn btn-danger btn-sm text-white">View All</a>
		</div>
	</div>
	<!-- End Old Book -->
	
	<%@include file="All_Component/footer.jsp" %>
</body>
</html>