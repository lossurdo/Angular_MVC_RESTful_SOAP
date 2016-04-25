angular.module('AppModule', [])

.controller('AppController', ['$scope', '$http', function($scope, $http) {

    $scope.seriados = null;
    $scope.debug = null;

    $scope.listar = function() {
        $http({
            method: 'GET',
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados'            
        }).then(function(response) {
            console.log(response.data);
            $scope.seriados = response.data;
        }, function(response) {
            console.log(response);
        });
    };

    $scope.consultar = function(pk) {
        $http({
            method: 'GET',
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados/' + pk            
        }).then(function(response) {
            console.log(response.data);
            $scope.debug = response.data;
        }, function(response) {
            console.log(response);
        });
    };

}])

;       