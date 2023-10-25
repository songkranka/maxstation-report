#Deploy With Java 11
FROM openjdk:8u212-jre-slim

RUN apt-get update; apt-get install -y fontconfig libfreetype6 
#RUN mkdir -p /workspace/app/pdf
#RUN chmod 777 /workspace/app/pdf

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /workspace/app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","workspace/app/app.jar"]