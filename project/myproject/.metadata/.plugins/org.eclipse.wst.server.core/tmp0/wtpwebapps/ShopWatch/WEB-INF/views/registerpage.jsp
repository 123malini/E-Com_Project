<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="from" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
          
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"  >
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         
</head>
<body>
<%@ include file="shared/navbar.jsp" %>
<div class="row" >

  		<div class="col-md-6" style="margin-left: 25%; ">
  				<div><p style="color: red; margin-left: 40%; font-size: 24px; text-shadow: 3px 3px 5px grey; ">Register</p></div>

  			<from:form action="usersubmit" modelAttribute="registration" method="post" class="form-group">
  				<div class="form-group">
  					<from:label path="userName">Product Id:</from:label><span style="color: red">*</span>
  					<from:input type="text" name="uname" path="userName" class="form-control" placeholder="Enter Your name" />
  				</div>

  				<div class="form-group">
  					<from:label path="emailId">Product Name:</from:label><span style="color: red">*</span>
  					<from:input type="text" name="uname" path="emailId" class="form-control" placeholder="Enter Your email" />
  				</div>

  				<div class="form-group">
  					<from:label path="password">Product Price:</from:label><span style="color: red">*</span>
  					<from:input type="text" name="uname" path="password" class="form-control" placeholder="Enter Your Passworde" />
  				</div>

  				
  				<div style="margin-left: 30% ">
  					<input type="reset" value="Reset" class="btn" style="margin-right: 10%; padding-right: 25px; padding-left: 25px; ">
  				
  					<input type="submit" value="Sign Up" class="btn" style="  padding-right: 25px; padding-left: 25px;">
  				</div>

  			</from:form>
  			</div>
  	</div>
  	</div>
</body>
</html>