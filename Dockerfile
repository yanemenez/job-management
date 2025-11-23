WORKDIR /app

COPY pom.xml .

RUN mvn dependency:resolve

COPY . .

RUN mvn clean install

FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080

COPY --from=build /app/target/gestao-vagas-0.0.1-SNAPSHOP.jar /app/app.jar

