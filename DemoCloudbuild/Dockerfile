FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/DemoCloudbuild-0.0.1-SNAPSHOT.jar
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]