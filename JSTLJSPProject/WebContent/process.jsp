<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.hcl.servlet.dto.User" scope="request">
<jsp:setProperty property="userName" name="user" param="userName"/>
</jsp:useBean>
 hello<jsp:getProperty property="userName" name="user"/>
</body>
</html>