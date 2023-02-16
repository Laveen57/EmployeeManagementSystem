<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" >

<title>Register</title>
</head>
<body>
<br><br><br>
	<div class="container">
    <div class="row justify-content-center">
    	<div class="col-md-4">
    	   <div class="card">
    	   <br>
    	   <div class="card-title text-center"><h1>Register Here</h1><br></div>
    		<div class="card-body"><form class="form-group" action="Register" method="post">
    			<label  class="form-label" for="username" >Create Your UserName </label>
    				<input name="uname" type="text" class="form-control mb-3" >
    			<label class="form-label" for="email">Enter Your Email </label>
    				<input name="uemail" type="email" class="form-control mb-3" >
    			<label class="form-label" for="password" >Enter Your Password</label>
    				<input name="pass1" type="password" class="form-control mb-3" >
    			<label class="form-label" for="password2">Confirm Your Password</label>
    				<input name="pass2" type="password" class="form-control mb-3">
    				<div class="d-grid gap-2 col-6 mx-auto">
    			<button class="btn btn-primary mb-4" type="submit">Register</button>
    			</div>
    			
    		</form>
    		<div class="text-center">
    		<a class="ml-4" href="login.jsp">Go to Login </a>
    		</div>
    		</div>
    		</div>
    		<br><br><br>
    		
    	</div>
    </div>
   </div>
	
</body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" ></script>

</html>