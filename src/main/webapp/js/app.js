angular.module('AppModule', [])

.controller('AppController', ['$scope', '$http', function($scope, $http) {

    $scope.seriado;
    $scope.seriados = {
        selecionado: null
    };
    $scope.debug = null;        

    $scope.listar = function() {
        $http({
            method: 'GET',
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados'            
        }).then(function(response) {
            console.log(response.data);
            $scope.seriados.lista = response.data;
        }, function(response) {
            console.log(response);
        });
    };

    $scope.consultar = function() {
        $http({
            method: 'GET',
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados/' + $scope.seriados.selecionado            
        }).then(function(response) {
            console.log(response.data);
            $scope.debug = response.data;
            $scope.seriado = angular.copy(response.data);
        }, function(response) {
            console.log(response);
        });
    };

    $scope.excluir = function() {
        $http({
            method: 'DELETE',
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados/' + $scope.seriados.selecionado            
        }).then(function(response) {
            console.log(response.data);
            $scope.debug = response.data;
            $scope.limpar();
        }, function(response) {
            console.log(response);
        });
    };

    $scope.salvar = function() {
        $http({
            method: 'POST',            
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados',
            data: $scope.seriado
        }).then(function(response) {
            console.log(response.data);
            $scope.debug = response.data;
            $scope.limpar();
        }, function(response) {
            console.log(response);
        });
    };

    $scope.alterar = function() {
        $http({
            method: 'PUT',            
            url:'http://localhost:8080/Angular_MVC_RESTful_SOAP/rest/seriados',
            data: $scope.seriado
        }).then(function(response) {
            console.log(response.data);
            $scope.debug = response.data;
            $scope.limpar();
        }, function(response) {
            console.log(response);
        });
    };

    $scope.limpar = function() {
        $scope.seriado;
        $scope.seriados = {
            selecionado: null
        };
        $scope.debug = null;        
        $scope.listar();
    };
    
}])

;       