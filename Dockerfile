#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /service/src
COPY pom.xml /service
RUN mvn -f /service/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /service/target/Brokers_Project-0.0.1-SNAPSHOT.jar /usr/local/lib/broker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/broker.jar"]
