'use strict';
//angular.module('myApp')
//.factory('AuthInterceptor', [function() {  
//    return {
//    // Send the Authorization header with each request
//        'request': function(config) {
//            config.headers = config.headers || {};
//            var encodedString = btoa("bill:abc123");
//            config.headers.Authorization = 'Basic '+encodedString;
//           return config;
//        }
//    };
//}]);
var test = angular.module('onlineTouch')
        .constant("baseURL","http://localhost:8080/")
        .service('productFactory', ['$resource', 'baseURL', function($resource,baseURL) {

            this.getProducts = function(){
                return $resource(baseURL+"product/:id",null,  {'update':{method:'PUT' }});
                };
              //promotional products  
            this.getPromotions = function(){
                return $resource(baseURL+"promotions/:id",null,  {'update':{method:'PUT' }});
                };

        }])
;

angular.module('onlineTouch')
        .factory('corporateFactory', ['$resource', 'baseURL', function($resource,baseURL) {

            var corpfac = {};
            corpfac.getLeaders = function(){
                return $resource(baseURL+"leadership/:id",null,  {'update':{method:'PUT' }});
                };

            return corpfac;
    }])

;

angular.module('onlineTouch')
        .factory('feedbackFactory', ['$resource', 'baseURL', function($resource,baseURL) {

            var feedbackfac = {};
            feedbackfac.sendFeedback = function(){
                return $resource(baseURL+"feedback/:id",null,  {'update':{method:'PUT' }});
                };

            return feedbackfac;
    }])

;