FROM openjdk:17-jdk-slim
WORKDIR /student-microservice-teamtwelve
COPY /target/*.jar student-microservice-teamtwelve.jar
COPY /src/main/resources/Wallet_studentdev /student-microservice-teamtwelve/Wallet_studentdev
ENV TNS_ADMIN=/student-microservice-teamtwelve/Wallet_studentdev
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "student-microservice-teamtwelve.jar" ]