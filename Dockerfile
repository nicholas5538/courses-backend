FROM eclipse-temurin:latest
LABEL authors="nicholas5538"
LABEL version="1.0"

WORKDIR /app

COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mnvw", "spring-boot:run"]