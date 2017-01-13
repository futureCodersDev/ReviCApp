var app = angular.module("myApp", []);

//controller for menu items on home page
app.controller("menuCtrl", function($scope, $http, $document) {
    //initialising the subject list
    $http.get("/subjectList")
	.then(function(response) {
	    console.log(response.data.subjList);
        $scope.subjectList = response.data.subjList;
    });
    $scope.hasActivities = function(subtopic){
        return !subtopic.activities.length > 0;
    };
    $scope.showProgress = function(subtopic){
        $scope.activities = subtopic.activities;
    };
    $scope.showActivities = function(){
        if($scope.activities != null){
            if($scope.activities.length > 0)
                return true;
        }
        return false;
    }
});