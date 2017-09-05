 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<!-- Nav Bar starts -->
		<%@ include file="shared/navbar.jsp"%>
		<!-- Nav Bar ends -->

		<!-- Form begins -->
		<div class="row">
			<div class="col-md-6" style="margin-left: 30%">
				<form:form action="productsubmit" method="POST"
					modelAttribute="product" class="form-group" enctype="multipart/form-data">
					
					
					<form:input path="productId" type="hidden" />

					<form:label path="product_name">Product Name:</form:label>
					<form:input path="product_name" type="text" class="form-control" />
					<br>
					<form:label path="company_name">Company Name:</form:label>
					<form:input path="company_name" type="text" class="form-control" />
					<br>
					<form:label path="product_price">Product Price:</form:label>
					<form:input path="product_price" type="text" class="form-control" />
					<br>
					<form:label path="product_description">Product Description:</form:label>
					<form:input path="product_description" type="text"
						class="form-control" />
					<br>
					 
					<form:input path="product_image" type="hidden"   />
					<br>
					<br>
					<form:label path="file">Upload image of product:</form:label>
					<form:input path="file" type="file" class="form-control" />
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
						<th >images</th>
						<th></th>
						<th></th>
					</thead>
					<tbody>
					 
						<c:forEach items="${prdlist}" var="i">
							<tr >
								<td >${i.product_name }</td>
								<td  >${i.product_description}</td>
						 	<td  ><img src="<c:url value="/resource/images/product/${i.product_image}" />" width="100 px" height="100 px"/></td>
						 		
								
								<td  ><a class="btn btn-info" href="/ShopWatch/product/edit/${i.productId}">Edit</a></td>
								<td  ><a class="btn btn-info" href="/ShopWatch/product/delete/${i.productId}">deleted</a></td>
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