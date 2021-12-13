#########################
# the building image
#########################
FROM maven:3.8.1-openjdk-17-slim as build

WORKDIR /workspace/app

COPY pom.xml .
COPY src src

RUN mvn install -DskipTests

#########################
# the running image
#########################
FROM openjdk:17-jdk-alpine3.14

WORKDIR /workspace/app

VOLUME /tmp
COPY --from=build /workspace/app/target/*.jar app.jar
EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java --add-opens=java.base/java.lang=ALL-UNNAMED -jar app.jar"]
