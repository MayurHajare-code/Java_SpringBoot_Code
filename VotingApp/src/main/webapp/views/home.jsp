<%@page import="com.example.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
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
.text {
    font-size: 25px;
    color: green;
    text-align: center;
    margin-bottom: 15px;
}
.nav {
    width: 100%;
    padding: 10px 10%;
    display: flex;
    align-items: center;
    justify-content: space-between;
    background-color: rgba(166, 166, 161, 0);
   
}

.li {
    display: inline-block;
    list-style: none;
    margin: 10px 15px;
}

 .a {
    color: black;
    text-decoration: none;
    font-weight: bolder;
    font-size: 17px;
}
.title{
 color: red;
    text-decoration: none;
    font-weight: bolder;
    font-size: 20px;
}


	</style>
</head>
<body class="body">

			<%
			 HttpSession session2 = request.getSession();
		     User userSess = (User) session2.getAttribute("username");
		     %>
		<nav class="nav">
			<ul class="ul">
				<li class="li"><a class="title" href="/home">Home Page</a></li>
			</ul>
			<div>
				<li class="li"><a class="a" href="#">Hello <%= userSess.getUsername()%>!</a></li> 
				<li class="li"><a class="a" href="/logout">logout</a></li>
			</div>
		</nav>
	
	<% String message2 = (String) session.getAttribute("alredy"); %>
    <% if (message2 != null) { %>
         <p class="text"><%= message2 %></p>
    <% } %>
    
	<% String message = (String) session.getAttribute("success"); %>
    <% if (message != null) { %>
        <p class="text"><%= message %></p>
    <% } %>
			
		<div>
			<form action="add_vot" method="post" class="login-form">
			 <h2 class="h2">Vot the Candidate </h2>
				<label class="login-text">Vote a Candidate:</label>
				<br/>
				Candidate-1 : <input type="radio"  name="candidate" value="Candidate-1"/>
				<br/>
				Candidate-2 : <input type="radio"  name="candidate" value="Candidate-2"/>
				<br/>
				Candidate-3 : <input type="radio"  name="candidate" value="Candidate-3"/>
				<br/>
				Candidate-4 : <input type="radio"  name="candidate" value="Candidate-4"/>
				<br/>
				<input type="submit" value="Vote" class="btn">
			</form>
		</div>
		
	
</body>
</html>