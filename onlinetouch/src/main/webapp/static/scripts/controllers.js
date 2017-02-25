'use strict';

angular.module('a',[])

        .controller('ProductController', ['$scope', 'productFactory',
                                  function($scope, productFactory) {

            $scope.tab = 1;
            $scope.filtText = '';
            $scope.showDetails = false;
            $scope.showMenu = false;
            $scope.message = "Loading ...";
            productFactory.getProducts().query(
                function(response) {
                    $scope.products = response;
                    $scope.showProduct = true;
                },
                function(response) {
                    $scope.message = "Error: "+response.status + " " + response.statusText;
                });

            $scope.select = function(setTab) {
                $scope.tab = setTab;

                if (setTab === 2) {
                    $scope.filtText = "electronics";
                }
                else if (setTab === 3) {
                    $scope.filtText = "clothings";
                }
                else if (setTab === 4) {
                    $scope.filtText = "grocerries";
                }
                else {
                    $scope.filtText = "";
                }
            };

            $scope.isSelected = function (checkTab) {
                return ($scope.tab === checkTab);
            };

            $scope.toggleDetails = function() {
                $scope.showDetails = !$scope.showDetails;
            };
        }])

        .controller('ContactController', ['$scope', function($scope) {

            $scope.login = {mychannel:"", firstName:"", lastName:"", agree:false, email:"" };

            var channels = [{value:"tel", label:"Tel."}, {value:"Email",label:"Email"}];

            $scope.channels = channels;
            $scope.invalidChannelSelection = false;

        }])

        .controller('loginController',
              ['$scope', 'loginFactory', function($scope, loginFactory) {

            $scope.sendlogin = function() {

                //console.log($scope.login);

                if ($scope.login.agree && ($scope.login.mychannel == "")) {
                    $scope.invalidChannelSelection = true;
                }
                else {
                    $scope.invalidChannelSelection = false;
                    // using the $resource save method.
                    loginFactory.sendlogin().save($scope.login);

                    $scope.login = {mychannel:"", firstName:"", lastName:"", agree:false, email:"" };
                    $scope.login.mychannel=""; 
                    $scope.loginForm.$setPristine();
                }
            };
        }])

        .controller('productDetailController', ['$scope', '$stateParams',
                     'productFactory', function($scope, $stateParams, productFactory) {

            $scope.message="Loading ...";
            $scope.showproduct = false;
            $scope.product = productFactory.getproducts().get({id:parseInt($stateParams.id,10)})
                        .$promise.then(
                                function(response){
                                    $scope.product = response;
                                    $scope.showproduct = true;
                                },
                                function(response) {
                                    $scope.message = "Error: "+response.status + " " + response.statusText;
                                }
                        );

                    }])


        .controller('productCommentController', ['$scope', 'productFactory',
                                          function($scope,productFactory) {

               $scope.mycomment = {rating:5, comment:"", author:"", date:""};

               $scope.submitComment = function () {
                      $scope.mycomment.date = new Date().toISOString();

                      $scope.product.comments.push($scope.mycomment);

                      productFactory.getproducts().update({id:$scope.product.id},$scope.product);
                      $scope.commentForm.$setPristine();
                      $scope.mycomment = {rating:5, comment:"", author:"", date:""};
                  };

        }])

;

angular.module('b',[])
  .controller('AboutController', ['$scope', '$stateParams', 'corporateFactory', function($scope, $stateParams, corporateFactory) {

      // obtained from the server, and error condition should be handled.
      $scope.showLeaders = false;
      $scope.leadersErrMsg = "Loading ...";
      $scope.leaders = corporateFactory.getLeaders().query(
          function(response) {
              $scope.leaders = response;
              $scope.showLeaders = true;
          },
          function(response) {
              $scope.leadersErrMsg = "Error: "+response.status + " " + response.statusText;
          });


  }])
  
  .controller('registerSigninController', ['$scope','$rootScope','$http','$location', function ($scope,$rootScope, $http, $location) {
	  var authenticate = function(credentials, callback) {

		    var headers = credentials ? {authorization : "Basic "
		        + btoa(credentials.username + ":" + credentials.password)
		    } : {};

		    $http.post('login', {headers : headers}).then(function(response) {
		      if (response.data.name) {
		        $rootScope.authenticated = true;
		        console.log(response.data);
		      } else {
		        $rootScope.authenticated = false;
		      }
		      callback && callback();
		    }, function() {
		      $rootScope.authenticated = false;
		      callback && callback();
		    });

		  }

//		  authenticate();
		  $scope.credentials = {};

		 /* $scope.login = function() {
		      authenticate($scope.credentials, function() {
		    	  console.log("Hi");
		        if ($rootScope.authenticated) {
		          $location.path("/inventory");
		          $scope.error = false;
		        } else {
		          $location.path("/login");
		          $scope.error = true;
		        }
		      });
		  };*/
		  $scope.login = function() {
			    var data = {
			        username: $scope.credentials.username,
			        password: $scope.credentials.password
			    };
			    console.log(data);
			    var successCallBack = function(response){
			    	$location.path("/inventory");
			          $scope.error = false;
			    };

			    var errorCallBack = function(response){
			          $scope.error = true;
			          console.log(response.data);
			    };

			    $http.post('http://localhost:8080/login', data).then(successCallBack, errorCallBack);
			}
  }])

  
 

  .controller('IndexController', ['$scope', function ($scope) {
	  

//        $scope.showproduct = false;
//        $scope.message="Loading ...";
//        $scope.clicked = function(){
//            window.location = "#/register.html";
//      }
       /* $scope.product = productFactory.getproducts().get({id:0})
        .$promise.then(
            function(response){
                $scope.product = response;
                $scope.showproduct = true;
            },
            function(response) {
                $scope.message = "Error: "+response.status + " " + response.statusText;
            }
        );

        // Handle the error condition appropriately.
        $scope.showPromo = false;
        $scope.promoErrMsg = "Loading ...";
        $scope.promoItem = productFactory.getPromotion().get({id:0})
                 .$promise.then(
                     function(response){
                         $scope.promoItem = response;
                         $scope.showPromo = true;
                     },
                     function(response) {
                         $scope.promoErrMsg = "Error: "+response.status + " " + response.statusText;
                     }
         );

         // obtained from the server, and error condition should be handled.
         $scope.showLeader = false;
         $scope.leaderErrMsg = "Loading ...";
          $scope.staffPerson = corporateFactory.getLeaders().get({id:3})
                  .$promise.then(
                      function(response){
                          $scope.staffPerson = response;
                          $scope.showLeader = true;
                      },
                      function(response) {
                          $scope.leaderErrMsg = "Error: "+response.status + " " + response.statusText;
                      }
          );
*/
  }])
;