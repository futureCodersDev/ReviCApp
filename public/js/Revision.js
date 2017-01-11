var app = angular.module("myApp", []);

app.controller("myCtrl", function($scope, $http) {
	console.log("working RevSubject");
    $http.get("/subjectList")
	.then(function(response) {
       $scope.subjectList = response.data.subjList;
    });
    $scope.expandTopic = function(e){
        console.log("expandTopic" + e)
    };
});