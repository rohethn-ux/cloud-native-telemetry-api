# Stage 1: Build and compile the codebase using Maven
FROM maven:3-eclipse-temurin-17 AS builder
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the lightweight production container runtime
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /build/target/cloud-native-telemetry-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
