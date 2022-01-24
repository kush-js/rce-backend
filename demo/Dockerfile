FROM maven:3.8-openjdk-17-slim as BUILDER
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY pom.xml /build
COPY src /build/src

RUN mvn clean package
COPY target/DEMO-${VERSION}.jar target/application.jar

FROM openjdk:17.0.2.-jre-slim
WORKDIR /app/

COPY --from=BUILDER /build/target/application.jar /app
EXPOSE 8080
CMD java -jar /app/application.jar
