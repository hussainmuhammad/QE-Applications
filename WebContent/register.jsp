<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<section>
		<h2>Homeowner Insurance</h2>	
		<hr/>
	</section>
	
	<section>
		<div>
			<span>User Details</span>
			
			<p>Note: Password must be 8 characters with numbers and characters only.</p>
			
			<form action="IndexServlet?action=Registration" method="POST">
					<label>Email&ast; </label><input type="text" name="email" required>
					<label>Password&ast; </label><input type="text" name="password" required>
					<label>Re-enter password&ast; </label><input type="text" name="confPassword" required>
					<input type="submit" value="Register">
			</form>
		</div>
	</section>	
	<hr/>
		<span>Copyright &copy; 2018 Homeownerinsurance.com.All Rights Reserved</span>
</body>
</html>