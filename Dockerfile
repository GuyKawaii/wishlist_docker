FROM openjdk:18-jdk-alpine
ADD target/app.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]