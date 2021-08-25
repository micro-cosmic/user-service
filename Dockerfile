FROM openjdk:8
ADD user-service-1.0-SNAPSHOT.jar repository/user-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","repository/user-service-1.0-SNAPSHOT.jar"]

