FROM gradle:8.13-jdk23 as builder
WORKDIR /target
COPY . /target
RUN gradle build

FROM openjdk:23-slim
WORKDIR /
RUN groupadd -r spring && useradd -r -g spring spring
COPY --chown=spring:spring --from=builder /target/app/build/libs/app-0.0.1-SNAPSHOT.jar /app.jar
USER spring:spring
ENTRYPOINT ["java","-jar","/app.jar"]
