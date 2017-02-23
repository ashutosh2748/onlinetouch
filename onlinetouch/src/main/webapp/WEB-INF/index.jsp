<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="onlinetouch">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link
			href="<c:url value='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css' />"
			rel="stylesheet"></link>
		
		<link
			href="<c:url value='../bower_components/font-awesome/css/font-awesome.min.css' />"
			rel="stylesheet">
		<link href="<c:url value='../static/styles/bootstrap-social.css'/>"
			rel="stylesheet">
		<link href="<c:url value='../static/styles/app.css' />" rel="stylesheet" />
		<title>Online Touch</title>
	</head>
	<body>
		<div ui-view="header"></div>
		<div ui-view="content"></div>
		<div ui-view="footer"></div>
	
	
		<script src="../bower_components/angular/angular.min.js"></script>
		<script
			src="../bower_components/angular-ui-router/release/angular-ui-router.min.js"></script>
		<script src="../static/scripts/controllers.js"></script>
		<script src="../static/scripts/app.js"></script>
		<script src="../static/scripts/services.js"></script>
	</body>
</html>