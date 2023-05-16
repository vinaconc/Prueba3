<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>WebLogin</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<input type = "hidden" id = "status" value = "<%= request.getAttribute("status") %>">

	<div class="main">

		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="images/signin.png" alt="sing up image">
						</figure>
						
					</div>

					<div class="signin-form">
						<h2 class="form-title">Sign in</h2>
						<form name="form1" method="post" action="login" class="register-form" onsubmit = "return validavacio()"
							id="login-form">
							<div class="form-group">
								<label for="Rut"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="Rut" id="Rut"
									placeholder="Rut" />
							</div>
							
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="username" id="username"
									placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" />
							</div>
							<div class="form-group">
								
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Log in" />
							</div>
						</form>
						
						
					
					</div>
				</div>
			</div>
		</section>

	</div>
	

<script src="js/validavacio.js">



</script>
	<script src="js/main.js"></script>
		<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
		<script type= "text/javascript">
		
		var status = document.getElementById("status").value;
		if (status == "failed"){
			swal("Sorry", "Wrong RUT, username or passwod", "images/failed.jpg")
		}
		
	
		
		</script>
	 	
</body>
</html>