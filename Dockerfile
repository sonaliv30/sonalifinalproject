FROM openjdk:8
ADD target/hulk-app9-showtym-devops-backend-0.0.1-SNAPSHOT.jar hulk-app9-showtym-devops-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","hulk-app9-showtym-devops-backend-0.0.1-SNAPSHOT.jar"]
