'use strict';
angular.module('onlineTouchInvenotyManager', ['ui.router','ngResource', 'inventory'])
.config(function($stateProvider, $urlRouterProvider) {
         $stateProvider
        
            // route for the home page
            .state('app', {
                url:'/',
                views: {
                    'header': {
                        templateUrl : '../../inventorymanager/staticpages/header.html',
                    },
                    'sidebar': {
                        templateUrl : '../../inventorymanager/staticpages/sidebar.html',
                    },
                    'content': {
                        templateUrl : '../../inventorymanager/staticpages/content.html',
                        controller  : 'IndexController'
                    },
                    'footer': {
                        templateUrl : '../../inventorymanager/staticpages/footer.html',
                    }
                }

            });
    
        $urlRouterProvider.otherwise('/');
    })
;