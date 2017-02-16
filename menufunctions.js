var app = angular.module("myApp", []);
//controller for navbar
app.controller("navCtrl", function($scope, $http) {
$http.get("https://revi-c-v1.herokuapp.com/subjectList")
	.then(function(response) {
	    console.log(response.data.subjList);
        $scope.subjectList = response.data.subjList;
    
        
    });
    //checking for no topics. Disable menu item if !topics
 $scope.hasTopics = function(subject){
        return !subject.topics.length > 0;
    }    
    
$scope.populateSubject=function(){
     $("#gcseMenu").empty();
    var subjectHasTopics = " ";
    for(var i=0; i<$scope.subjectList.length; i++){
        if($scope.hasTopics($scope.subjectList[i])){
            subjectHasTopics="disabled";
            
        }
    var listItem = "<li class='dropdown-submenu "+ subjectHasTopics+ "'  ><a href='#' >" + $scope.subjectList[i].subjectName + "<span class='caret'></span>" + "</a>" +
        "<ul class='dropdown-menu' id="+$scope.subjectList[i].subjectName + " >" + "</ul></li>";
           $("#gcseMenu").append(listItem);
        }
        }

$scope.populateTopic=function(subject){
    var thisSubject = "#" + subject;
    $(thisSubject).empty();
    
    for(var i=0; i<$scope.subjectList.length; i++){
        
        
    }
    
    for(var i=0; i<$scope.subjectList.length; i++){
        if($scope.hasTopics($scope.subjectList[i])){
            subjectHasTopics="disabled";
            
        }
    var listItem = "<li class='dropdown-submenu "+ subjectHasTopics+ "'  ><a href='#' >" + $scope.subjectList[i].subjectName + "<span class='caret'></span>" + "</a>" +
        "<ul class='dropdown-menu' id="+$scope.subjectList[i].subjectName + " >" + "</ul></li>";
           $("#gcseMenu").append(listItem);
        }
        }

}
});

