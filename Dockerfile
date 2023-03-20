FROM openjdk:8-jdk-alpine
COPY target/boot-jenkins-cicd.jar boot-jenkins-cicd.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/boot-jenkins-cicd.jar"]