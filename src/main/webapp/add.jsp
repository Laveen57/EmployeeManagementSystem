<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" >
<link href="style.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" ></script>
<title>Add Page</title>
</head>
<body>
	<div class="row justify-content-center">
		<div class="col-sm-6">
			<h1> Add New Employee </h1>  
			<br>
			<form class="form-group" action="AddEmployee" method="post">
    			<label  class="form-label" for="name" >Enter Employee Id </label>
    				<input name="emp_id" type="text" class="form-control mb-3" >
    			<label class="form-label" for="name">Enter Employee Name</label>
    				<input name="emp_name" type="text" class="form-control mb-3">
    			<label class="form-label" for="salary">Enter Employee Salary</label>
    				<input name="emp_salary" type="number" class="form-control mb-3">
    			<label class="form-label" for="dept">Enter Employee Department</label>
    				<input name="emp_dept" type="text" class="form-control mb-3">
    			<label  class="form-label" for="hire" >Enter Employee Hire date</label>
    				<input name="emp_hire" type="text" class="form-control mb-3" >
    			<label class="form-label" for="exp" >Enter Employee Experience</label>
    				<input name="emp_exp" type="text" class="form-control mb-3" >
    			<label class="form-label" for="dob">Enter Employee DOB</label>
    				<input name="emp_dob" type="text" class="form-control mb-3" >
    			<label class="form-label" for="adrs">Enter Employee Address</label>
    				<input name="emp_adrs" type="text" class="form-control mb-3">
    			<label class="form-label" for="email" >Enter Employee Email</label>
    				<input name="emp_email" type="email" class="form-control mb-3" >    			
    			<button class="btn btn-primary mb-4" type="submit">Add To Database</button>
    		</form>
			
		</div>
	</div>
</body>
</html>