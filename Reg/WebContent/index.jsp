<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 
<h3><%=new java.util.Date() %></h3>
<h1> Welcome to Kurukshetra University Student Registration Portal</h1>
<h2>All Fields are Mandatory</h2>

<img src="Kurukshetra_University_logo.jpg"  width="500" height="600" style="float: right">
<body style="background-color: #E6E6FA; text-align: center">
<form action="Controller">
 <font size="5">
<label>Name</label>  <input type="text" name="name" >

<br>

<br>

<label>Student ID</label> <input type="text" name="sid">
<br>

<br>

<label>college Name</label> <input type="text" name="clg">
<br>

<br>
<label> Total Marks</label> <input type="number" name="marks">
<br>
<br>
<label>Age</label> <input type="number" name="age">
<br>
<br>
<input type="submit">

</font>

</form>


</body>
</html>