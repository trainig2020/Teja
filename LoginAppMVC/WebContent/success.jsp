<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.hcl.servlet.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Login successfull</h3>

<%-- <% User user=(User)request.getAttribute("user"); %>
hello<%=user.getUserName() %>! --%>

<jsp:useBean id="user" class="org.hcl.servlet.dto.User" scope="request"></jsp:useBean>
<jsp:setProperty property="UserName" name="user" value="newUSer"/>
<%-- hello<%=user.getUserName() %>!  --%>
hello<jsp:getProperty property="UserName" name="user"/>
</body>
</html>