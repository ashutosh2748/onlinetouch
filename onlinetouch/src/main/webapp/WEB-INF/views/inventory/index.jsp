<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="onlineTouchInvenotyManager">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Online Touch Inventory Manger</title>
		<meta name="description" content="">
	    <meta name="author" content="OnlineTouch">
	    <meta name="keyword" content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	    <link rel="shortcut icon" href="../inventorymanager/img/favicon.png">
		
		<!-- Bootstrap core CSS -->
	    <link href="../inventorymanager/css/bootstrap.min.css" rel="stylesheet">
	    <link href="../inventorymanager/css/bootstrap-reset.css" rel="stylesheet">
	    <!--external css-->
	    <link href="../inventorymanager/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
	    <link href="../inventorymanager/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
	    <link rel="stylesheet" href="../inventorymanager/css/owl.carousel.css" type="text/css">
	    <!-- Custom styles for this template -->
	    <link href="../inventorymanager/css/style.css" rel="stylesheet">
	    <link href="../inventorymanager/css/style-responsive.css" rel="stylesheet" />
	
	    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
	    <!--[if lt IE 9]>
	      <script src="../inventorymanager/js/html5shiv.js"></script>
	      <script src="../inventorymanager/js/respond.min.js"></script>
	    <![endif]-->
		
	</head>
	<body>
		
		<section id="container" >
			<div ui-view="header"></div>
			<div ui-view="sidebar"></div>
			<div ui-view="content"></div>
			<div ui-view="footer"></div>
		</section>
	
		<!-- js placed at the end of the document so the pages load faster -->
	    <script src="../inventorymanager/js/jquery.js"></script>
	    <script src="../inventorymanager/js/jquery-1.8.3.min.js"></script>
	    <script src="../inventorymanager/js/bootstrap.min.js"></script>
	    <script class="include" type="text/javascript" src="../inventorymanager/js/jquery.dcjqaccordion.2.7.js"></script>
	    <script src="../inventorymanager/js/jquery.scrollTo.min.js"></script>
	    <script src="../inventorymanager/js/jquery.nicescroll.js" type="text/javascript"></script>
	    <script src="../inventorymanager/js/jquery.sparkline.js" type="text/javascript"></script>
	    <script src="../inventorymanager/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
	    <script src="../inventorymanager/js/owl.carousel.js" ></script>
	    <script src="../inventorymanager/js/jquery.customSelect.min.js" ></script>
	    <script src="../inventorymanager/js/respond.min.js" ></script>
	
	    <!--common script for all pages-->
	    <script src="../inventorymanager/js/common-scripts.js"></script>
	
	    <!--script for this page-->
	    <script src="../inventorymanager/js/sparkline-chart.js"></script>
	    <script src="../inventorymanager/js/easy-pie-chart.js"></script>
	    <script src="../inventorymanager/js/count.js"></script>
	
	  <script>
	
	      //owl carousel
	
	      $(document).ready(function() {
	          $("#owl-demo").owlCarousel({
	              navigation : true,
	              slideSpeed : 300,
	              paginationSpeed : 400,
	              singleItem : true,
				  autoPlay:true
	
	          });
	      });
	
	      //custom select box
	
	      $(function(){
	          $('select.styled').customSelect();
	      });
	
	  </script>
	  
	  
	    <script src="../../bower_components/angular/angular.min.js"></script>
		<script
			src="../../bower_components/angular-ui-router/release/angular-ui-router.min.js"></script>
			<script src="../../bower_components/angular-resource/angular-resource.min.js"></script>
		<script src="../../inventorymanager/myangular/controllers.js"></script>
		<script src="../../inventorymanager/myangular/app.js"></script>
		<script src="../../inventorymanager/myangular/services.js"></script>
	</body>
</html>