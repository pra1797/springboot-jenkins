FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
ADD target/Swaggers-0.0.1-SNAPSHOT.jar spring-jenkins.jar
ENTRYPOINT ["java","-jar","spring-jenkins.jar"]