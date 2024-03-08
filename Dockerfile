FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/springboot-swagger-0.0.1-SNAPSHOT.jar springboot-swagger.jar
ENTRYPOINT ["java","-jar","/springboot-swagger.jar"]