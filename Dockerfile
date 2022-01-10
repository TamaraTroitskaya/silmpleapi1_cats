FROM maven:3.5.2-jdk-8-alpine

COPY /target/silmpleapi1-1.0.jar myapi.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom", "-jar", "/myapi.jar"]