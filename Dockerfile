FROM openjdk:11
ADD /target/client1-0.0.1-SNAPSHOT.jar client1.jar
ENTRYPOINT ["java", "-jar", "client1.jar"]