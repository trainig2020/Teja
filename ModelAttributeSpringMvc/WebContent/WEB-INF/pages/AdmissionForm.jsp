<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>STUDEN ADMISSION FORM FOR ENGINEERING COURSES</h1>
<h2>${headerMessage}</h2>
<form action="/ModelAttributeSpringMvc/submitAdmissionForm.html" method="post">
Student Name:<input type="text" name="studentName">
Student Hobby:<input type="text" name="studentHobby">
<input type="submit" value="submit">



</form>

</body>
</html>