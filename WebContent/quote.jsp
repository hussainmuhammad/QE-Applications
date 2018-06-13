<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Quote</title>
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
			<span>Get Quote</span>
		</div>
		<div>
			<img src="./img/house.jpeg" alt="house" height="175px" width="250px"/>
			
			<select> 
				<option>Select-Family Home</option>
			</select> &ast;
			<label>Address Line 1</label> &ast; <input type="text"/>
			<label>Address Line 2</label><input type="text"/>
			<label>State</label> &ast; <input type="text"/>
			<label>City</label> &ast; <input type="text"/>
			<label>Zip</label> &ast; <input type="text"/>
			<select> 
				<option>Primary</option>
			</select> &ast;
			<a href="./retrieveQuote.jsp"><input type="submit" value="Continue"/></a>
		</div>
	</section>	
	
	<hr/>
	<span>Copyright &copy; 2018 Homeownerinsurance.com.All Rights Reserved</span>
</body>
</html>