<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Retrieve Quote</title>
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
			<span>Homeowner Information</span>
		</div>
		<div>
			<img src="./img/house.jpeg" alt="house" height="175px" width="250px"/>
			
			<label>First Name</label> &ast; <input type="text"/>
			<label>Last Name</label> &ast; <input type="text"/>
			<label>Date of Birth</label> &ast; <input type="text"/>
			<label>Are you retired?</label> &ast; <input type="radio"/> Yes <input type="radio"/> No
			<label>Social Security Number</label> &ast; <input type="text"/>
			<label>Email Address</label> &ast; <input type="text"/>
			
			<a href="propertyDetails.jsp"><input type="submit" value="Continue"/></a>
		</div>
	</section>	
	
	<hr/>
	<span>Copyright &copy; 2018 Homeownerinsurance.com.All Rights Reserved</span>
</body>
</html>