FROM openjdk:11

ADD ./target/lab2-0.0.1-SNAPSHOT.jar /app/lab2-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "app/lab2-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080