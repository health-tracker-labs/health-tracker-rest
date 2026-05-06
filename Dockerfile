FROM openjdk:26-rc-jdk-slim
WORKDIR /health-tracker/health-tracker-rest

COPY /build/libs/*.jar health-tracker-rest.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "health-tracker-rest.jar"]