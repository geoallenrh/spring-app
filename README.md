# Spring App

To Run the Microservice locally -  

Prerequisites
- Maven
- PostgreSQL
- Browser or Postman

Step 1 - Download the code from github

   ``` git clone https://github.com/SM43/Spring-App.git```

Step 2 - Build the project
  Open the project in any editor like Intellij or Eclipse and build from terminal by executing the following command.  
   
   ```mvn install ```

Step 3 - Launch the Application
  Before launching the Application, edit ```application.properties``` as per your Postgres credentials.
  
  ``` mvn spring-boot:run ```

Note : Running the app``` Users ```table will be created in database and few users will be added by default. Stopping the application will delete the database.
  
Step 4 - Use Curl or Postman to test the REST APIs.
  By default it runs on port 8080.

APIs for PostgreSql usage - 

- Get list of users - ```http://localhost:8080/users/list```

- Add a user - ```http://localhost:8080/users/add/<name>/<city>```
  
- Delete a user - ```http://localhost:8080/users/delete/<id of user>```
  
- Get user count - ```http://localhost:8080/users/count```
