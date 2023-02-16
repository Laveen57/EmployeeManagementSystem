<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" >
<link href="style.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" ></script>
<title>Delete Page</title>
</head>
<body>
<div class="row justify-content-center">
	<div class="col-sm-6">
	<div class="card">
			<div class="card-title text-center"><h1>Delete Record Page </h1></div>
	
	<div class="card-body">
	<form class="form-group" action="DeleteEmployee" method="post">
		<input class="form-control" type="text" name="empname" placeholder="Enter Name To Delete">
	<button type="submit" class="btn btn-danger mt-3">Delete</button>
	</form>
	</div>
		</div>
	</div>
</div>
</body>
</html>