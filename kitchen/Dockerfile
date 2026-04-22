FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/kitchen.jar app.jar
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "app.jar"]