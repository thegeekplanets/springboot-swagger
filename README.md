
# Project Title

This application is implmenting the basic swagger ui features on Restful endpoints. 


## Authors

- [@thegeekplanets](https://www.github.com/thegeekplanets)


## Features

- Implementation of a RESTful API featuring full CRUD capabilities
- Integration of Swagger UI for enhanced API documentation
- Deployment of a Docker image for streamlined application distribution
- Efficient configuration of GitHub Actions for continuous integration and delivery


## Deployment

### Without Docker

1. Install required dependencies
```
    maven clean install
```
2. Run the main class. i.e <b>SpringbootSwaggerApplication.java</b>

### With Docker
To deploy this project run

1. Install the docker application 

2. Pull the latest docker image
```
  docker pull thegeekplanets/springboot-swagger
```
3. Run the docker image
```
  docker run -p 8080:8080 thegeekplanets/springboot-swagger
```


## Demo

Open this link after running the application

http://localhost:8080/swagger-ui/index.html


## Documentation

[Docker commands](https://www.linkedin.com/posts/harikanure_mastering-docker-activity-7250940983041814529-bX1w?utm_source=share&utm_medium=member_desktop)

