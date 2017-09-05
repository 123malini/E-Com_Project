<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="row">
			<div class="col-md-6" style="margin-left: 30%">
				<form:form action="updatesubmit" method="POST"
					modelAttribute="update1" class="form-group">
					 
				
					 
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
					<form:label path="product_image">Product Image:</form:label>
					<form:input path="product_image" type="text" class="form-control" />
					<br>
					<input type="submit" value="SUBMIT">
				</form:form>
			</div>
		</div>
</html>