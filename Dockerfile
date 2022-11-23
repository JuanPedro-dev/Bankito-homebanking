FROM openjdk:11

COPY target/homebanking-0.0.1-SNAPSHOT.jar homebanking-0.0.1-SNAPSHOT.jar

RUN mvn build

ENTRYPOINT ["java", "-jar", "homebanking-0.0.1-SNAPSHOT.jar"]
