<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>AccessDenied page</title>
	<link href="<c:url value='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css' />" rel="stylesheet" type="text/css"></link>
    <link href="<c:url value='/static/styles/app.css' />" rel="stylesheet" type="text/css"></link>      
</head>
<body>
	Dear <strong>${user}</strong>, You are not authorized to access this page.
	<br/>
	<a href="<c:url value="/" />">Go to home</a> OR <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>