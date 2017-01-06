Building a RESTful Web Service - based on guide to building a simple RESTful web service.
https://spring.io/guides/gs/rest-service/

Adapted to a CORS RESTful web service - based on guide to Enabling Cross Origin Requests for a RESTful Web Service
https://spring.io/guides/gs/rest-service-cors/

Deployed to Heroku local web using guide on getting started with Gradle on Heroku
https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku#introduction

Followed instructions in: Deploying Gradle apps on Heroku
https://devcenter.heroku.com/articles/deploying-gradle-apps-on-heroku
(Needed to add the following line to the Procfile - web: java $JAVA_OPTS -Dserver.port=$PORT -jar build/libs/gs-rest-service-0.1.0.jar)
TODO:change app name to Revision

2/1/2017 - test app with java class returning JSON data and javascript using controller to GET JSON data.  WORKING and hosted at https://revi-c-v1.heroku.com
Can be tested by running HTML/Javascript page on localhost (allowed origin) from RevisionTestJS folder.

TODO:  find way to modify existing app to match Data Model and ORM.  Also, add JUnit tests to code.

Herou App functionality

This is a test app, written as two classes:  Subjects.java and SubjectsController.java.  The Subjects class has the attributes id and content.
The SubjectsController class is the  RESTful API interface and it constructs a new Subjects given the data provided by the API call.
Currently it receives requests from a web page running on a localhost (this is the only domain that has permission to access)
and delivers an ID and content as JSON data. The HTTP request for the data is currently an ajax request to the following
url: "https://revi-c-v1.herokuapp.com/subjects".  By adding parameter data to the request you can change the response to whatever you send.

For example:  url: "https://revi-c-v1.herokuapp.com/subjects?name=Maths" will cause the response to have a content of 'Maths' rather than 'none'.

This is currently being re-written to return a list of topics dependent on the subject it is given.

REQUIREMENTS

Functionality required:
- given a subject, return a list of topics taken from the database (API)
- given a topic, return a list of sub-topics taken from the database (API)
- given a sub-topic, return a list of activities each with an ID, a type and a max score(randomly generated list of three activities)
taken from the database(API)
- given an activity ID and type, return the activity (types of activity will be quiz, past-paper question, video) taken from the database (API)
- given an activity, display and check the  answer (this would happen at the front end - Angular)
- given an instance of the web page running, show user name and progress (taken from local app storage)
- given that all available activities have been completed, display progress status (number of activities, score for each activity)
(this would happen at the front end - Angular)
- build web app into a downloadable app with local data

To achieve the above we need the following as a minimum:

A PostGreSQL database following the data model and populated with data for Maths GCSE Edexcel, Algebra, Linear Equations
A set of APIs for the first three items above
A front end build in Angular with Angular_UI following wireframes in design diagram and with the functionality described in all items above.

