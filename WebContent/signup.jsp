<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
		<link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
		<link rel="stylesheet" href="SignUpAsset/css/style.css">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		
</head>
	<body>
		<div class="wrapper" style="background-image: url('images/bg-registration-form-1.jpg');">
			<div class="inner">
				<div class="image-holder">
					<img src="SignUpAsset/images/Registration.jpg" alt="not found">
				</div>
				
				
				<form action="SignUp" method="post">
		
					<h3>Registration Form</h3>	
				<div class="alert alert-success center" role="alert">
                    <p>${NOTIFICATION}</p>
                </div>
				
					<div class="form-group">
						<input type="text" placeholder="First Name" class="form-control" name="fname">
						<input type="text" placeholder="Last Name" class="form-control" name="lname">
					</div>
					<div class="form-wrapper">
						<input type="text" placeholder="Username" class="form-control" name="username">
						<i class="zmdi zmdi-account"></i>
					</div>
					<div class="form-wrapper">
						<input type="password" placeholder="Password" class="form-control" name="password">
						<i class="zmdi zmdi-lock"></i>
					</div>
					<div class="form-wrapper">
						<input type="password" placeholder="Confirm Password" class="form-control" name="cpassword">
						<i class="zmdi zmdi-lock"></i>
					</div>
					<div class="form-wrapper">
						<input type="text" placeholder="Phone Number" class="form-control" name="phone">
						<i class="zmdi zmdi-lock"></i>
					</div>
					<button>Register
						<i class="zmdi zmdi-arrow-right"></i>
					</button>
				</form>
			</div>
		</div>
		
	</body>
	</html>