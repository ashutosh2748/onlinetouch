<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="onlineTouch">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript">
			 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
				function hideURLbar(){ window.scrollTo(0,1); } 
		</script>
		
		<!--//for-mobile-apps -->
		<!--Custom Theme files -->
		<link href="../static/styles/public/bootstrap.css" rel="stylesheet" type="text/css"
			media="all" />
		<link href="../static/styles/public/style.css" rel="stylesheet" type="text/css" media="all" />
		<link rel="stylesheet" href="../static/styles/public/flexslider.css" type="text/css"
			media="screen" />
		<!--//Custom Theme files -->
		<!--js-->
		<script src="../static/scripts/public/jquery-1.11.1.min.js"></script>
		<script src="../static/scripts/public/modernizr.custom.js"></script>
		<!--//js-->
		<!--cart-->
		<script src="../static/scripts/public/simpleCart.min.js"></script>
		<!--cart-->
		<!--web-fonts-->
		<link
			href='//fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic'
			rel='stylesheet' type='text/css'>
		<link
			href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic'
			rel='stylesheet' type='text/css'>
		<link href='//fonts.googleapis.com/css?family=Pompiere' rel='stylesheet'
			type='text/css'>
		<link href='//fonts.googleapis.com/css?family=Fascinate'
			rel='stylesheet' type='text/css'>
		<!--web-fonts-->
		<!--animation-effect-->
		<link href="../static/styles/public/animate.min.css" rel="stylesheet">
		<script src="../static/scripts/public/wow.min.js"></script>
		<script>
			new WOW().init();
		</script>
		<!--//animation-effect-->
		<!--start-smooth-scrolling-->
		<script type="text/javascript" src="../static/scripts/public/move-top.js"></script>
		<script type="text/javascript" src="../static/scripts/public/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event) {
					event.preventDefault();
					$('html,body').animate({
						scrollTop : $(this.hash).offset().top
					}, 1000);
				});
			});
		</script>
		<!--//end-smooth-scrolling-->
		

		
		<title>Online Touch</title>
	</head>
	<body>
	<!-- dynamic header, content and footer -->
		<div ng-include="'../template/public/header.html'"></div>
		<div ui-view="content"></div>
		<div ng-include="'../template/public/footer.html'"></div>
	
	
		<!--search jQuery-->
	<script src="../static/scripts/public/main.js"></script>
	<!--//search jQuery-->
	<!--smooth-scrolling-of-move-up-->
	<script type="text/javascript">
		$(document).ready(function() {

			var defaults = {
				containerID : 'toTop', // fading element id
				containerHoverID : 'toTopHover', // fading element hover id
				scrollSpeed : 1200,
				easingType : 'linear'
			};

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!--//smooth-scrolling-of-move-up-->
	<!--Bootstrap core JavaScript
    ================================================== -->
	<!--Placed at the end of the document so the pages load faster -->
	<script src="../static/scripts/public/bootstrap.js"></script>
	
	
	
		<script src="../bower_components/angular/angular.min.js"></script>
		<script
			src="../bower_components/angular-ui-router/release/angular-ui-router.min.js"></script>
			<script src="../bower_components/angular-resource/angular-resource.min.js"></script>
		<script src="../static/scripts/controllers.js"></script>
		<script src="../static/scripts/app.js"></script>
		<script src="../static/scripts/services.js"></script>
	</body>
</html>