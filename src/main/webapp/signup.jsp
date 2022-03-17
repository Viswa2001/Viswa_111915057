<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup|Employee</title>
</head>
<body>
<h2>Employee Signup</h2><br>
<form action="Signup" method="post">
        <p>Employee_ID</p> 
        <input type="text" name="id"/>
        <br/>
        <p>Password</p> 
        <input type="password" name="pass"/>
        <br/>
        <p>First Name</p> 
        <input type="text" name="fname"/>
        <br/>
        <p>Last Name</p> 
        <input type="text" name="lname"/>
        <br/>
        <p>Date of Birth</p> 
        <input type="text" name="dob"/>
        <br/>
        <p>Contact</p> 
        <input type="text" name="contact"/>
        <br/><br/><br/>
        <input type="submit"/>
    </form>
</body>
</html>