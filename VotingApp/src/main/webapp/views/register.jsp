<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<style>
* {
	margin: 0px;
	padding: 0px;
	box-sizing: border-box;
	font-family: 'Poppins', 'sans-serif';
}

.body {
	background-color: #FFFADD;
}

.login-form {
	background-color: rgb(255, 255, 255);
	padding: 20px;
	text-align: center;
	width: 450px;
	margin-left: auto;
	margin-right: auto;
	margin-top: 100px;
}

.h2 {
	font-size: 40px;
	font-family: 'Times New Roman', Times, serif;
	color: black;
	margin-bottom: 20px;
}

.login-input {
	height: 50px;
	width: 350px;
	font-size: 20px;
	margin: 10px;
	color: #424242;
	border: none;
	border: 1px solid rgb(181, 178, 178);
	font-family: 'Times New Roman', Times, serif;
	border-radius: 5px;
	padding-left: 20px;
}

.login-input::placeholder, .textarea::placeholder {
	font-size: 15px;
	font-weight: 600;
	font-size: 15px;
}

.btn {
	margin: 10px 0px;
	padding: 10px 40px;
	background-color: black;
	border-radius: 30px;
	color: white;
	text-decoration: none;
	cursor: pointer;
}

.login-text {
	font-size: 15px;
	color: rgb(66, 65, 65);
	margin-bottom: 15px;
}

.login-link {
	text-decoration: none;
	color: rgb(94, 36, 156);
	font-family: 'Times New Roman', Times, serif;
	font-weight: bold;
	cursor: pointer;
	font-size: 17px;
}

.login-text {
	font-size: 15px;
	color: rgb(66, 65, 65);
	margin-bottom: 15px;
}
</style>

</head>
<body class="body">
	<div>
		<form action="registration_data" method="post" class="login-form">
			<h2 class="h2">User Registration</h2>


			<input type="text" placeholder="Username" name="username" class="login-input" required>
			<br> 
			<input type="password" placeholder="Password" name="password" class="login-input" required>
			<br> 
			<input type="email" placeholder="Email" name="email" class="login-input" required>
			<br> 
			<input type="text" placeholder="Phone" name="phone" class="login-input" required>
			<br> 
			<label class="login-text">Choose the User Role : </label>
			<br />
			<select name="userRole" class="login-input">
				<option value="#">Choose user role</option>
				<option value="user">User</option>
				<option value="admin">Admin</option>
			</select> 
			<input class="btn" type="submit" value="Register" >

			<p class="login-text">
				If you have an account? <a class="login-link" href="login">
				SignIn Here
				</a>
			</p>
			

		</form>
	</div>
</body>
</html>