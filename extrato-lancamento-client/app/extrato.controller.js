var app = angular.module("extrato", []);
    app.controller("extratoController", function ($scope, $http){
        $scope.msgErro = true;
        $http.get("http://localhost:8080/extratos").then(function(response) {
            $scope.extratos = response.data;
        });
 
         $scope.pad  = function(str, length){
            const resto = length - String(str).length;
            return '0'.repeat(resto > 0 ? resto : '0') + str;
        } 
        
    });
   