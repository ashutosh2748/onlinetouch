'use strict';
angular.module('onlineTouch', ['ui.router', 'ngResource', 'b'])
.config(function($stateProvider, $urlRouterProvider) {
         $stateProvider
        
            // route for the home page
            .state('app', {
                url:'/',
                views: {
//                    'header': {
//                        templateUrl : '../template/public/header.html',
//                    },
                    'content': {
                        templateUrl : '../template/public/content.html',
                        controller  : 'IndexController'
                    },
//                    'footer': {
//                        templateUrl : '../template/public/footer.html',
//                    }
                }

            })
        
            // route for the aboutus page
            .state('app.aboutus', {
                url:'aboutus',
                views: {
                    'content@': {
                        templateUrl : '../WEB-INF/views/aboutus.html',
                        controller  : 'AboutController'                  
                    }
                }
            })
            
            .state('register', {
                views: {
                    'content@': {
                        templateUrl : '../template/public/register.html',
                        controller  : 'registerSigninController'                  
                    }
                }
            })
            
            .state('login', {
            	views:{
            		'content@': {
            			templateUrl: '../template/public/login.html',
            			controller : 'registerSigninController'
            		}
            	}
            })
        
            // route for the contactus page
            .state('app.contactus', {
                url:'contactus',
                views: {
                    'content@': {
                        templateUrl : '../WEB-INF/views/contactus.html',
                        controller  : 'ContactController'                  
                    }
                }
            })

            // route for the menu page
            .state('app.menu', {
                url: 'menu',
                views: {
                    'content@': {
                        templateUrl : '../WEB-INF/views/menu.html',
                        controller  : 'MenuController'
                    }
                }
            })

            // route for the cartsdetail page
            .state('app.productDetails', {
                url: 'menu/:id',
                views: {
                    'content@': {
                        templateUrl : 'views/productDetail.html',
                        controller  : 'ProductController'
                   }
                }
            });
    
        $urlRouterProvider.otherwise('/');
    })
;