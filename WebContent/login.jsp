<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>

<title>Homeowner's Insurance</title>
<link rel="stylesheet" type="text/css" href="styles/styles.css"/>
</head>
<body>

<%
String message = "";

if(request.getAttribute("error") != null) {
	message = (String)request.getAttribute("error");
}
%>

	<div id="container">
	<h1>Homeowner's Insurance</h1>	
	
	<hr/>
	
	</div>
	
	<div>
		<div class="textContainer">
			<p>
				<em>
					Home insurance&#44; often called hazard insurance or homeowner's insurance&#44; is a type of property
					insurance that covers a private residence&#44; such as a condominium or renters' insurance or home
					or multiple unit buildings.
				</em>
			</p>
		
			<p>
				<em>
					It is an insurance policy that combines various personal insurance protections, which can
				    include losses occurring to one's home&#44;	its contents&#44; loss of use (additional living expenses),
				    or loss of other personal possessions of the homeowner&#44; as well as liability insurance for accidents
				    that may happen at home or at the hands of the homeowner within the policy territory. If a home does
				    not meet the underwriting guidelines of a standard homeowners policy the residence could qualify for
				    a limited coverage dwelling policy.
				</em>
			</p>
		</div>
		<div>
			<img src="img/evelyn-paris.jpg" alt="yellow door" height="265px" width="265px"/>
			<form action="/CaseStudy/IndexServlet?action=login" method="POST">
					
					<b>Email</b>
					<input type="text" name="email"/><br/>
					<br/>
					<b>Password</b>
					<input type="text" name="password"/><br/>
					<br/>
					<input type="submit" value="Login"/>
			</form>
			<br/>
			<label>New User?</label> <a href="register.jsp">Register here</a>
		</div>
	</div>
	<br>
	<div>
		<hr/>
		Copyright &copy; 2018 Homeownerinsurance.com. All Rights Reserved	
	</div>
</body>
</html>