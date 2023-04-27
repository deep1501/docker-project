#FROM openjdk:17
#ADD target/docker-project.jar docker-project.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "docker-project.jar"]

FROM openjdk:17
ADD target/*.jar simple-boot-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","simple-boot-project-0.0.1-SNAPSHOT.jar"]
