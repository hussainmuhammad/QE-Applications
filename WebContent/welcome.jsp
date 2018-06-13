<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome User!</title>
</head>
<body>
	<section>
		<div>
			<h1>Homeowner Insurance</h1>
			
			<a href="./welcome.jsp">Home</a>&nbsp;|
			<a href="./quote.jsp">Get Quote</a>&nbsp;|
			<a href="./retrieveQuote.jsp">Retrieve Quote</a>&nbsp;|
			<a href="#">My Policies</a>&nbsp;|
			<a href="#">Logout</a>
			
		</div>
		<hr />
	</section>		
	<section>
		<div>
			<span>Get Started Page</span>
		</div>
		<div>
			<img src="./img/house.jpeg" alt="house" height="175px" width="250px"/>
			
			<a href="quote.jsp"><input type="button" value="Get a Quote"/></a>    
			<input type="button" value="Retrieve Quote"/>
		</div>
	</section>	
	
	<hr/>
	<span>Copyright &copy; 2018 Homeownerinsurance.com.All Rights Reserved</span>
</body>
</html>