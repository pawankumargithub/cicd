FROM openjdk:8-jdk-alpine
COPY target/boot-jenkins-cicd boot-jenkins-cicd
EXPOSE 8888
ENTRYPOINT ["java","-jar","/boot-jenkins-cicd"]