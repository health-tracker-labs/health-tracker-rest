#build
FROM gradle:8.11.1-jdk23 AS build

ARG APP_HOME=/health-tracker/health-tracker-rest
WORKDIR ${APP_HOME}

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

RUN ./gradlew dependencies --no-daemon

COPY src src

RUN ./gradlew build --no-daemon

#deploy
FROM eclipse-temurin:23-jre

ARG APP_HOME=/health-tracker/health-tracker-rest
ARG JAR_FILE=${APP_HOME}/build/libs/*.jar

WORKDIR ${APP_HOME}
COPY --from=build ${JAR_FILE} health-tracker-rest.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "health-tracker-rest.jar"]