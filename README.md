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