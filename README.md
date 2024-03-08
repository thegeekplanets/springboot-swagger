DOCKER COMMANDS

1. docker images

	OUTPUT:
	$ docker images
	REPOSITORY                         TAG       IMAGE ID       CREATED          SIZE
	harikanure007/springboot-swagger   latest    5c3f70a90ae7   21 minutes ago   351MB
	springboot-swagger                 latest    5c3f70a90ae7   21 minutes ago   351MB
	tomcat                             latest    405afe63d576   44 hours ago     455MB
	hello-world                        latest    d2c94e258dcb   10 months ago    13.3kB

2. Create DockerFile inside project directory(Named with DockerFile and without any extension)
	
	FROM openjdk:17-jdk-alpine
	EXPOSE 8080
	ADD target/springboot-swagger-0.0.1-SNAPSHOT.jar springboot-swagger.jar
	ENTRYPOINT ["java","-jar","/springboot-swagger.jar"]

4. Create application jar file by "mvn clean install"
5. docker build -t springboot-swagger:latest .
6. docker run -d -p 8080:8080 harikanure007/springboot-swagger
7. docker stop 843f1a70a9fd
8. docker login -u harikanure007@gmail.com -p XXXX docker.io
9. docker tag springboot-swagger:latest harikanure007/springboot-swagger   -- if not set the tag then we may get access denied error.
10. docker push harikanure007/springboot-swagger
