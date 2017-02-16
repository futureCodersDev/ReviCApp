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
$scope.hasSubTopics = function(topic){
        return !topic.subtopics.length > 0;
    }
    

$scope.populateTopic=function(subject){
    var thisSubject = "#" + subject;
    $(thisSubject).empty();
    var subjectPos = 0;
    for(var i=0; i<$scope.subjectList.length; i++){
		if($scope.subjectList[i].subjectName==subject){
			subjectPos=i;			
		}
        
    }
	console.log($scope.subjectList[subjectPos].subjectName);
    var topicHasSubTopics = "";
    for(var i=0; i<$scope.subjectList[subjectPos].topics.length; i++){
        if($scope.hasSubTopics($scope.subjectList[subjectPos].topics[i])){
            topicHasSubTopics="disabled";
            
        }
    var listItem = "<li class='dropdown-submenu'><a href='#' >" + $scope.subjectList[subjectPos].topics.topicName + "<span class='caret'></span>" + "</a>" +
        "<ul class='dropdown-menu' id="+$scope.subjectList[subjectPos].topics[i].topicName + " >" + "</ul></li>";
           $(thisSubject).append(listItem);
        }
        

}
	
$scope.populateSubject=function(){
     $("#gcseMenu").empty();
    var subjectHasTopics = " ";
	console.log($scope.subjectList);
    for(var i=0; i<$scope.subjectList.length; i++){
        if($scope.hasTopics($scope.subjectList[i])){
            subjectHasTopics="disabled";
            
        }
    var listItem = "<li class='dropdown-submenu "+ subjectHasTopics+ "'  ><a href='#' data-ng-click=' "+ $scope.populateTopic($scope.subjectList[i].subjectName)+"' >" + $scope.subjectList[i].subjectName + "<span class='caret'></span>" + "</a>" +
        "<ul class='dropdown-menu' id="+$scope.subjectList[i].subjectName + " >" + "</ul></li>";
           $("#gcseMenu").append(listItem);
        }
       }
});

