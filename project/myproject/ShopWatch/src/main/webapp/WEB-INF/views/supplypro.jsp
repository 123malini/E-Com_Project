<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--  <link rel="stylesheet" href="css/bootstrap.min.css">-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
 <h3>Welcome, to Product Page</h3>
       
  <div class="container-fluid">
		<!-- Nav Bar starts -->
		<%@ include file="shared/navbar.jsp"%>
		<!-- Nav Bar ends -->

		<!-- Form begins -->
		<div class="row">
			<div class="col-md-6" style="margin-left: 30%">
				<form:form action="productsubmit" method="POST"
					modelAttribute="product" class="form-group">
					 
					<form:label path="name">Supplier Name:</form:label>
					<form:input path="name" type="text" class="form-control" />
					<br>
					<form:label path="adress">Supplier Adress:</form:label>
					<form:input path="adress" type="text" class="form-control" />
					<br>
					<input type="submit" value="SUBMIT">
				</form:form>
			</div>
		</div>
		<!-- Form ends -->
<div class="row" >
			<div class="col-md-6" style="margin-left: 25%">
			<center><h3>Product Data</h3></center>
				<table class="table table-striped table-hover">
					<thead >
						<th  >Name</th>
						<th >Description</th>
						<th></th>
						<th></th>
					</thead>
					<tbody>
					 
						<c:forEach items="${prdList}" var="i">
							<tr >
								<td >${i.product_name }</td>
								<td  >${i.product_description}</td>
								<td  ><a class="btn btn-info" href="/ShopWatch/product/edit/${i.productId}">Edit</a></td>
								<td  ><a class="btn btn-info" href="">Delete</a></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
				
			</div>
		</div>
		<!-- Footer begins -->
		<%@ include file="shared/footer.jsp"%>
		<!-- Footer ends -->
	</div>
  
  </body>
</html>
</body>
</html>