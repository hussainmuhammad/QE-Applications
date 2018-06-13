<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Property Details</title>
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
			<span>Property Details</span>
		</div>
		<div>
			<img src="./img/house.jpeg" alt="house" height="175px" width="250px"/>
			
			<label>What is the market value of your home?</label> &ast; &dollar;<input type="text"/>
			<label>What year was your home originally built?</label> &ast; <input type="text"/>
			<label>Square Footage</label> &ast; <input type="text">sq ft
			<label>Dwelling Style</label> &ast; <select><option>1 story</option></select>
			<label>Roof Material</label> &ast;	<select><option>Concrete</option></select>
			<label>Type of Garage</label> &ast; <select><option>Attached</option></select>
			<label>Number of full baths</label> &ast; <select><option>1</option></select>
			
			<a href="coverageDetails.jsp"></a><input type="submit" value="Continue"/>
		</div>
	</section>	
	
	<hr/>
	<span>Copyright &copy; 2018 Homeownerinsurance.com.All Rights Reserved</span>
</body>
</html>