<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="com.example.pojo.User"%>
<%@page import="java.util.*"%>
<%@page import="com.example.pojo.Voting"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%--   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin report</title>
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
				<li class="li"><a class="title" href="/adminReport">Admin Page</a></li>
			</ul>
			<div>
				<li class="li"><a class="a" href="#">Hello <%= userSess.getUsername()%>!</a></li> 
				<li class="li"><a class="a" href="/logout">logout</a></li>
			</div>
		</nav>
		
		<!-- <h1>admin Report</h1> -->
	
	<div class="login-form">
		<h2 class="h2">Vote the Candidate </h2>
		<table class="table">
		<thead class="thead-dark">
			<tr>
		    	<th>Candidate</th>
		    	<th>count</th>
		    </tr>
		</thead>
    	<tbody>
	    	
		    <tr>
		    	<td>Candidate -1 </td>
		    	<td> 
		    	<% 
		    	 Long c1Count = (Long) request.getAttribute("c1Count");
		        out.println( c1Count);
			    %>
			    </td>
		    </tr>
		    <tr>
		    	<td>Candidate -2 </td>
		    	<td> 
		    	<% 
			        Long c2Count = (Long) request.getAttribute("c2Count");
			        out.println( c2Count);
			    %>
			    </td>
		    </tr>
		    <tr>
		    	<td>Candidate -3 </td>
		    	<td> 
		    	<% 
			        Long c3Count = (Long) request.getAttribute("c3Count");
			        out.println( c3Count);
			    %>
			    </td>
		    </tr>
		    <tr>
		    	<td>Candidate -4 </td>
		    	<td> 
		    	<% 
			        Long c4Count = (Long) request.getAttribute("c4Count");
			        out.println( c4Count);
			    %>
			    </td>
		    </tr>
			
    	</tbody>
	
    </table>
	</div>
	
	
</body>
</html>